# InternalWebhooksApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhookEvent**](InternalWebhooksApi.md#createWebhookEvent) | **POST** /internal/webhook_event | Create webhook event |


<a id="createWebhookEvent"></a>
# **createWebhookEvent**
> CreateWebhookEventInfo createWebhookEvent(createWebhookEventParams)

Create webhook event

This operation creates a webhook event. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalWebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalWebhooksApi apiInstance = new InternalWebhooksApi();
    CreateWebhookEventParams createWebhookEventParams = new CreateWebhookEventParams();
    try {
      CreateWebhookEventInfo result = apiInstance.createWebhookEvent(createWebhookEventParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalWebhooksApi#createWebhookEvent");
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
| **createWebhookEventParams** | [**CreateWebhookEventParams**](CreateWebhookEventParams.md)| The request body to create a webhook event | [optional] |

### Return type

[**CreateWebhookEventInfo**](CreateWebhookEventInfo.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

