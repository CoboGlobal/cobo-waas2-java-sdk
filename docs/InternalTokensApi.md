# InternalTokensApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**setSupportToken**](InternalTokensApi.md#setSupportToken) | **POST** /internal/tokens/set_support_token | Set support token |


<a id="setSupportToken"></a>
# **setSupportToken**
> SetSupportTokenResponse setSupportToken(setSupportTokenParams)

Set support token

This operation sets a supported token for specified payment organizations. You need to specify the token ID, organization IDs, and wallet type. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalTokensApi apiInstance = new InternalTokensApi();
    SetSupportTokenParams setSupportTokenParams = new SetSupportTokenParams();
    try {
      SetSupportTokenResponse result = apiInstance.setSupportToken(setSupportTokenParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalTokensApi#setSupportToken");
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
| **setSupportTokenParams** | [**SetSupportTokenParams**](SetSupportTokenParams.md)| Request body to set a supported token for specified organizations. | |

### Return type

[**SetSupportTokenResponse**](SetSupportTokenResponse.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The response for setting a supported token for specified organizations. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

