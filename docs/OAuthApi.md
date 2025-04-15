# OAuthApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getToken**](OAuthApi.md#getToken) | **GET** /oauth/token | Get Org Access Token |
| [**refreshToken**](OAuthApi.md#refreshToken) | **POST** /oauth/token | Refresh Org Access Token |


<a id="getToken"></a>
# **getToken**
> GetToken2XXResponse getToken(clientId, orgId, grantType)

Get Org Access Token

&lt;Note&gt;This operation is only applicable to Cobo Portal App developers. To call this operation, you need to use the Cobo OAuth authentication method that requires an app key.&lt;/Note&gt; This operation allows Cobo Portal Apps to get an Org Access Token and a Refresh Token with a specified client ID, organization ID, and grant type.   Access tokens allow the app to signal to the WaaS service that it has received permission to access specific resources of the app user&#39;s [organization](https://manuals.cobo.com/en/portal/organization/introduction). Once the app has been granted permission by the organization&#39;s admin, it can use this operation to obtain both an Org Access Token and a Refresh Token.  For security purposes, Org Access Tokens expire after a certain period. Once they expire, the app needs to call [Refresh token](https://www.cobo.com/developers/v2/api-references/oauth/refresh-org-access-token) to get a new Org Access Token and a new Refresh Token. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.OAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    OAuthApi apiInstance = new OAuthApi();
    String clientId = "pvSwS8iFrfK0oZrB0ugG54XPDOLEv0Ij";
    String orgId = "e3986401-4aec-480a-973d-e775a4518413";
    String grantType = "org_implicit";
    try {
      GetToken2XXResponse result = apiInstance.getToken(clientId, orgId, grantType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApi#getToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| The client ID, a unique identifier to distinguish Cobo Portal Apps. You can get the client ID by retrieving the manifest file after publishing the app. | |
| **orgId** | **String**| Organization ID, a unique identifier to distinguish different organizations. You can get the organization ID from the callback message sent to the URL that was configured in the manifest file. | |
| **grantType** | **String**| The OAuth grant type. Set the value as &#x60;org_implicit&#x60;. | |

### Return type

[**GetToken2XXResponse**](GetToken2XXResponse.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | The request was successful. |  -  |
| **4XX** | Unauthorized. Please provide valid credentials. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="refreshToken"></a>
# **refreshToken**
> RefreshToken2XXResponse refreshToken(refreshTokenRequest)

Refresh Org Access Token

&lt;Note&gt;This operation is only applicable to Cobo Portal Apps developers. To call this operation, you need to use the Cobo OAuth authentication method that requires an app key.&lt;/Note&gt; This operation allows Cobo Portal Apps to obtain a new Org Access Token with a specified client ID, grant type and a Refresh Token.   For security purposes, Org Access Tokens expire after a certain period. Once they expire, the app needs to call this operation to get a new Org Access Token and a new Refresh Token. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.OAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    OAuthApi apiInstance = new OAuthApi();
    RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest();
    try {
      RefreshToken2XXResponse result = apiInstance.refreshToken(refreshTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApi#refreshToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **refreshTokenRequest** | [**RefreshTokenRequest**](RefreshTokenRequest.md)| The request body for refreshing an Org Access Token. | |

### Return type

[**RefreshToken2XXResponse**](RefreshToken2XXResponse.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | The request was successful. |  -  |
| **4XX** | Unauthorized. Please provide valid credentials. |  -  |
| **5XX** | Internal server error. |  -  |

