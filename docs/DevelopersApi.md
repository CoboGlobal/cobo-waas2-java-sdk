# DevelopersApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiKeyInfo**](DevelopersApi.md#getApiKeyInfo) | **GET** /developers/api_key_info | Get API key information |
| [**listCallbackMessages**](DevelopersApi.md#listCallbackMessages) | **GET** /developers/callback_messages | List all callback messages |
| [**retryCallbackMessage**](DevelopersApi.md#retryCallbackMessage) | **POST** /developers/callback_messages/{message_id}/retry | Retry callback message |


<a id="getApiKeyInfo"></a>
# **getApiKeyInfo**
> GetApiKeyInfo200Response getApiKeyInfo()

Get API key information

This operation retrieves the details of the API key that you are using.

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.DevelopersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    DevelopersApi apiInstance = new DevelopersApi();
    try {
      GetApiKeyInfo200Response result = apiInstance.getApiKeyInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevelopersApi#getApiKeyInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetApiKeyInfo200Response**](GetApiKeyInfo200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The API key information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listCallbackMessages"></a>
# **listCallbackMessages**
> ListCallbackMessages200Response listCallbackMessages(callbackMessageIds, requestIds, transactionIds, walletIds, status, limit, before, after)

List all callback messages

This operation retrieves all the callback messages in your organization.  For more details about how to respond to callback messages, refer to [Callback messages](https://www.cobo.com/developers/v2/guides/webhooks-callbacks/set-up-endpoint#callback-messages). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.DevelopersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    DevelopersApi apiInstance = new DevelopersApi();
    String callbackMessageIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,f47ac10b-58cc-4372-a567-0e02b2c3d479";
    String requestIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,f47ac10b-58cc-4372-a567-0e02b2c3d479";
    String transactionIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,f47ac10b-58cc-4372-a567-0e02b2c3d479";
    String walletIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,f47ac10b-58cc-4372-a567-0e02b2c3d479";
    String status = "Denied";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListCallbackMessages200Response result = apiInstance.listCallbackMessages(callbackMessageIds, requestIds, transactionIds, walletIds, status, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevelopersApi#listCallbackMessages");
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
| **callbackMessageIds** | **String**| A list of callback message IDs, separated by commas. | [optional] |
| **requestIds** | **String**| A list of request IDs, separated by commas. The request ID is provided by you and must be unique within your organization. | [optional] |
| **transactionIds** | **String**| A list of transaction IDs, separated by commas. | [optional] |
| **walletIds** | **String**| A list of wallet IDs, separated by commas. | [optional] |
| **status** | **String**| The callback message status. Possible values include &#x60;Approved&#x60;, &#x60;Denied&#x60;, and &#x60;Failed&#x60;. | [optional] [enum: Denied, Approved, Failed] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListCallbackMessages200Response**](ListCallbackMessages200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about callback messages. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="retryCallbackMessage"></a>
# **retryCallbackMessage**
> RetryCallbackMessage201Response retryCallbackMessage(messageId)

Retry callback message

This operation resends a callback message that failed previously.  If your callback endpoint doesn&#39;t respond as expected, the WaaS service will retry sending the callback message up to 30 times. After that, the callback message status will be &#x60;Failed&#x60;. Use this operation to resend the message. For more details, refer to [Webhooks and Callbacks](https://www.cobo.com/developers/v2/guides/webhooks-callbacks/set-up-endpoint#callback-messages). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.DevelopersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    DevelopersApi apiInstance = new DevelopersApi();
    String messageId = "f47ac10b-58cc-4372-a567-0e02b2c3d479";
    try {
      RetryCallbackMessage201Response result = apiInstance.retryCallbackMessage(messageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevelopersApi#retryCallbackMessage");
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
| **messageId** | **String**| The callback message ID. | |

### Return type

[**RetryCallbackMessage201Response**](RetryCallbackMessage201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

