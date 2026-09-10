# InternalBatchPayoutsApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**internalCreateBatchPayout**](InternalBatchPayoutsApi.md#internalCreateBatchPayout) | **POST** /internal/batch_payouts/payouts | Create batch payout |
| [**internalGetBatchPayout**](InternalBatchPayoutsApi.md#internalGetBatchPayout) | **GET** /internal/batch_payouts/payouts/{payout_id} | Get batch payout |


<a id="internalCreateBatchPayout"></a>
# **internalCreateBatchPayout**
> InternalCreateBatchPayout201Response internalCreateBatchPayout(internalCreateBatchPayoutRequest)

Create batch payout

This operation creates a batch payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBatchPayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBatchPayoutsApi apiInstance = new InternalBatchPayoutsApi();
    InternalCreateBatchPayoutRequest internalCreateBatchPayoutRequest = new InternalCreateBatchPayoutRequest();
    try {
      InternalCreateBatchPayout201Response result = apiInstance.internalCreateBatchPayout(internalCreateBatchPayoutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBatchPayoutsApi#internalCreateBatchPayout");
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
| **internalCreateBatchPayoutRequest** | [**InternalCreateBatchPayoutRequest**](InternalCreateBatchPayoutRequest.md)| The request body to create a batch payout for internal API. | [optional] |

### Return type

[**InternalCreateBatchPayout201Response**](InternalCreateBatchPayout201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Infos of a newly initiated payout. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="internalGetBatchPayout"></a>
# **internalGetBatchPayout**
> BatchPayoutDetail internalGetBatchPayout(payoutId)

Get batch payout

This operation retrieves details of a specific batch payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBatchPayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBatchPayoutsApi apiInstance = new InternalBatchPayoutsApi();
    String payoutId = "e3986401-4aec-480a-973d-e775a4518413";
    try {
      BatchPayoutDetail result = apiInstance.internalGetBatchPayout(payoutId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBatchPayoutsApi#internalGetBatchPayout");
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
| **payoutId** | **String**| The payout ID. | |

### Return type

[**BatchPayoutDetail**](BatchPayoutDetail.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

