package com.cobo.waas2.auth;

import com.cobo.waas2.CryptoUtils;
import okhttp3.*;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import static com.cobo.waas2.CryptoUtils.*;

/**
 * A request interceptor that injects the API Key Header into requests, and signs messages, whenever required.
 */
public class AuthenticationInterceptor implements Interceptor {

    //private final String privateKey;

    private final Signer signer;

    private final boolean debug;

    public AuthenticationInterceptor(String privateKey, boolean debug) {
        this(privateKey,debug, "ED25519");
    }

    public AuthenticationInterceptor(String privateKey, boolean debug, String keyType) {
        this.debug = debug;
        if (keyType.equals("ED25519")) {
            this.signer = new LocalEd25519Signer(privateKey);
        } else if (keyType.equals("SECP256K1")) {
            this.signer = new LocalSecp256k1Signer(privateKey);
        } else {
            throw new IllegalArgumentException("Invalid keyType "+ keyType);
        }
    }

    public AuthenticationInterceptor(Signer signer, boolean debug) {
        this.signer = signer;
        this.debug = debug;
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request original = chain.request();
        Request.Builder newRequestBuilder = original.newBuilder();

        Request newRequest = addHeader(original, newRequestBuilder);
        Response response = chain.proceed(newRequest);

        // Proxy errors (e.g. nginx) may lack signature headers since the
        // request never reaches the business server.
        Set<Integer> proxyErrorCodes = new HashSet<>(Arrays.asList(414, 429, 502, 503));
        if (proxyErrorCodes.contains(response.code())) {
            return response;
        }

        String ts = response.header("BIZ_TIMESTAMP");
        String respSignature = response.header("BIZ_RESP_SIGNATURE");
        String responseBody = response.body() == null ? "null" : response.body().string();
        String coboPubKey = getCoboPubkey(original);
        if (debug) {
            System.out.println("response <<<<<<<<");
            System.out.println("responseBody:" + responseBody);
        }
        boolean verifyResult = CryptoUtils.verifySignature(responseBody + "|" + ts, coboPubKey, respSignature);
        if (!verifyResult) throw new RuntimeException("response verify failed");
        MediaType mediaType = response.body().contentType();
        return response.newBuilder()
                .body(ResponseBody.create(mediaType, responseBody))
                .build();
    }

    @NotNull
    private static String getCoboPubkey(Request original) {
        String hostUrl = original.url().host();
        String coboPubKey;
        if (hostUrl.equals("api.sandbox.cobo.com")) {
            coboPubKey= "893d8a6112ae22429a7453599256391d7928e16870ecab888ee3ce65febada08";
        } else if (hostUrl.equals("api.dev.cobo.com")) {
            coboPubKey= "a04ea1d5fa8da71f1dcfccf972b9c4eba0a2d8aba1f6da26f49977b08a0d2718";
        } else if(hostUrl.equals("api.cobo.com")) {
            coboPubKey = "8d4a482641adb2a34b726f05827dba9a9653e5857469b8749052bf4458a86729";
        } else {
            throw new RuntimeException("Invalid host " + hostUrl);
        }
        return coboPubKey;
    }

    private Request addHeader(Request original, Request.Builder newRequestBuilder) throws UnsupportedEncodingException {
        String method = original.method();
        String path = pathSegmentsToString(original.url().pathSegments());
        String body = "";
        String queryParams = "";
        HttpUrl url = original.url();
        StringBuilder sb = new StringBuilder();
        Set<String> names = url.queryParameterNames();
        for (String name : names) {
            String value = url.queryParameter(name);
            if (value != null) {
            sb.append(name).append("=").append(URLEncoder.encode(value, "UTF-8")).append("&");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        queryParams = sb.toString();

        Buffer buffer = new Buffer();
        try {
            if (original.body() != null) {
                original.body().writeTo(buffer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        body = buffer.readUtf8();

        long currentTime = System.currentTimeMillis();
        String nonce = String.valueOf(currentTime);
        //(method.upper(), path, timestamp, urlencode(params), body_str)
        String content = method + "|" + path + "|" + nonce + "|" + queryParams + "|" +body;
        String sig = signer.sign(content);
        newRequestBuilder.removeHeader("BIZ-API-KEY");
        newRequestBuilder.removeHeader("BIZ-API-NONCE");
        newRequestBuilder.removeHeader("BIZ-API-SIGNATURE");
        newRequestBuilder.addHeader("BIZ-API-KEY", signer.getPublicKey())
                .addHeader("BIZ-API-NONCE", nonce)
                .addHeader("BIZ-API-SIGNATURE", sig);

        // Build new request after adding the necessary authentication information
        Request request = newRequestBuilder.build();
        if (debug) {
            System.out.println("request >>>>>>>>");
            System.out.println(request.method() + "\n" + request.url() + "\n" + "content:" + content + "\nsig:" + sig + "\nnonce:" + nonce);
        }
        return request;
    }

    String pathSegmentsToString(List<String> pathSegments) {
        StringBuilder out = new StringBuilder();
        for (String pathSegment : pathSegments) {
            out.append('/');
            out.append(pathSegment);
        }
        return out.toString();
    }
}