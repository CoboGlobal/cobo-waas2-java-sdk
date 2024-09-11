package com.cobo.waas2.demo;
import com.cobo.waas2.model.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cobo.waas2.CryptoUtils;
import com.cobo.waas2.model.WebhookEvent;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class DemoController {
    //"DEV": "a04ea1d5fa8da71f1dcfccf972b9c4eba0a2d8aba1f6da26f49977b08a0d2718",
    //"PROD": "8d4a482641adb2a34b726f05827dba9a9653e5857469b8749052bf4458a86729",

    // Replace with the corresponding environment's public key
    public static final String pubKey = "a04ea1d5fa8da71f1dcfccf972b9c4eba0a2d8aba1f6da26f49977b08a0d2718";
    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);


    @PostMapping("/webhook")
    public void handleWebhookEvent(
            @RequestBody String rawBody,
            @RequestHeader(value = "BIZ-TIMESTAMP") String bizTimestamp,
            @RequestHeader(value = "BIZ-RESP-SIGNATURE") String bizSignature
    ) throws IOException {
        boolean verified = this.verifySignature(rawBody, bizTimestamp, bizSignature);
        if (!verified) {
            throw new InvalidSignatureException("Invalid signature");
        }
        WebhookEvent event = WebhookEvent.fromJson(rawBody);
        logger.debug(event.toString());
    }

    @PostMapping("/callback")
    public String handleDoubleConfirm(
            @RequestBody String rawBody,
            @RequestHeader(value = "BIZ-TIMESTAMP") String bizTimestamp,
            @RequestHeader(value = "BIZ-RESP-SIGNATURE") String bizSignature
    ) throws IOException {
        boolean verified = this.verifySignature(rawBody, bizTimestamp, bizSignature);
        if (!verified) {
            throw new InvalidSignatureException("Invalid signature");
        }
        Transaction tx = Transaction.fromJson(rawBody);
        logger.debug(tx.toString());
        // Add your check policy here
        return "ok"; // return "deny";
    }

    private boolean verifySignature(String rawBody, String timestamp, String signature) {
        return CryptoUtils.verifySignature(rawBody+"|"+timestamp, pubKey, signature);
    }


    private static class InvalidSignatureException extends RuntimeException {
        public InvalidSignatureException(String message) {
            super(message);
        }
    }

    @ExceptionHandler(InvalidSignatureException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String handleInvalidSignatureException(InvalidSignatureException ex) {
        logger.error("Invalid signature: {}", ex.getMessage());
        return ex.getMessage();
    }
}
