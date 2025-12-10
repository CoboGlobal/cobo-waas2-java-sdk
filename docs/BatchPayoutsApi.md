# BatchPayoutsApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelBatchPayout**](BatchPayoutsApi.md#cancelBatchPayout) | **POST** /batch_payouts/payouts/{payout_id}/cancel | Cancel batch payout |
| [**createBatchPayout**](BatchPayoutsApi.md#createBatchPayout) | **POST** /batch_payouts/payouts | Create batch payout |
| [**dropBatchPayout**](BatchPayoutsApi.md#dropBatchPayout) | **POST** /batch_payouts/payouts/{payout_id}/drop | Drop batch payout |
| [**estimateBatchPayoutFee**](BatchPayoutsApi.md#estimateBatchPayoutFee) | **POST** /batch_payouts/estimate_fee | Estimate batch payout fee |
| [**getBatchPayout**](BatchPayoutsApi.md#getBatchPayout) | **GET** /batch_payouts/payouts/{payout_id} | Get batch payout |
| [**listBatchPayouts**](BatchPayoutsApi.md#listBatchPayouts) | **GET** /batch_payouts/payouts | List batch payouts |
| [**revokeBatchPayout**](BatchPayoutsApi.md#revokeBatchPayout) | **POST** /batch_payouts/payouts/{payout_id}/revoke | Revoke batch payout |
| [**speedUpBatchPayout**](BatchPayoutsApi.md#speedUpBatchPayout) | **POST** /batch_payouts/payouts/{payout_id}/speedup | Speed up batch payout |


<a id="cancelBatchPayout"></a>
# **cancelBatchPayout**
> PayoutDetail cancelBatchPayout(payoutId, cancelPayoutBody)

Cancel batch payout

This operation cancels a batch payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.BatchPayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    BatchPayoutsApi apiInstance = new BatchPayoutsApi();
    String payoutId = "e3986401-4aec-480a-973d-e775a4518413";
    CancelPayoutBody cancelPayoutBody = new CancelPayoutBody();
    try {
      PayoutDetail result = apiInstance.cancelBatchPayout(payoutId, cancelPayoutBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchPayoutsApi#cancelBatchPayout");
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
| **cancelPayoutBody** | [**CancelPayoutBody**](CancelPayoutBody.md)| The request body to cancel a batch payout. | [optional] |

### Return type

[**PayoutDetail**](PayoutDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createBatchPayout"></a>
# **createBatchPayout**
> CreateBatchPayout201Response createBatchPayout(createBatchPayoutRequest)

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
import com.cobo.waas2.api.BatchPayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    BatchPayoutsApi apiInstance = new BatchPayoutsApi();
    CreateBatchPayoutRequest createBatchPayoutRequest = new CreateBatchPayoutRequest();
    try {
      CreateBatchPayout201Response result = apiInstance.createBatchPayout(createBatchPayoutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchPayoutsApi#createBatchPayout");
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
| **createBatchPayoutRequest** | [**CreateBatchPayoutRequest**](CreateBatchPayoutRequest.md)| The request body to create a batch payout. | [optional] |

### Return type

[**CreateBatchPayout201Response**](CreateBatchPayout201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Infos of a newly initiated payout. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="dropBatchPayout"></a>
# **dropBatchPayout**
> PayoutDetail dropBatchPayout(payoutId, payoutRbfBody)

Drop batch payout

This operation drops a batch payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.BatchPayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    BatchPayoutsApi apiInstance = new BatchPayoutsApi();
    String payoutId = "e3986401-4aec-480a-973d-e775a4518413";
    PayoutRbfBody payoutRbfBody = new PayoutRbfBody();
    try {
      PayoutDetail result = apiInstance.dropBatchPayout(payoutId, payoutRbfBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchPayoutsApi#dropBatchPayout");
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
| **payoutRbfBody** | [**PayoutRbfBody**](PayoutRbfBody.md)| The request body to speed up or drop a batch payout. | [optional] |

### Return type

[**PayoutDetail**](PayoutDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="estimateBatchPayoutFee"></a>
# **estimateBatchPayoutFee**
> List&lt;PayoutEstimatedFee&gt; estimateBatchPayoutFee(estimateBatchPayoutFeeRequest)

Estimate batch payout fee

This operation estimates the fee of a batch payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.BatchPayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    BatchPayoutsApi apiInstance = new BatchPayoutsApi();
    EstimateBatchPayoutFeeRequest estimateBatchPayoutFeeRequest = new EstimateBatchPayoutFeeRequest();
    try {
      List<PayoutEstimatedFee> result = apiInstance.estimateBatchPayoutFee(estimateBatchPayoutFeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchPayoutsApi#estimateBatchPayoutFee");
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
| **estimateBatchPayoutFeeRequest** | [**EstimateBatchPayoutFeeRequest**](EstimateBatchPayoutFeeRequest.md)| The request body to estimate the fee of a batch payout. | [optional] |

### Return type

[**List&lt;PayoutEstimatedFee&gt;**](PayoutEstimatedFee.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getBatchPayout"></a>
# **getBatchPayout**
> PayoutDetail getBatchPayout(payoutId)

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
import com.cobo.waas2.api.BatchPayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    BatchPayoutsApi apiInstance = new BatchPayoutsApi();
    String payoutId = "e3986401-4aec-480a-973d-e775a4518413";
    try {
      PayoutDetail result = apiInstance.getBatchPayout(payoutId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchPayoutsApi#getBatchPayout");
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

[**PayoutDetail**](PayoutDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listBatchPayouts"></a>
# **listBatchPayouts**
> ListBatchPayouts200Response listBatchPayouts(limit, before, after)

List batch payouts

This operation retrieves the information of all batch payouts. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.BatchPayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    BatchPayoutsApi apiInstance = new BatchPayoutsApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListBatchPayouts200Response result = apiInstance.listBatchPayouts(limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchPayoutsApi#listBatchPayouts");
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
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListBatchPayouts200Response**](ListBatchPayouts200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="revokeBatchPayout"></a>
# **revokeBatchPayout**
> PayoutDetail revokeBatchPayout(payoutId)

Revoke batch payout

This operation revokes a batch payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.BatchPayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    BatchPayoutsApi apiInstance = new BatchPayoutsApi();
    String payoutId = "e3986401-4aec-480a-973d-e775a4518413";
    try {
      PayoutDetail result = apiInstance.revokeBatchPayout(payoutId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchPayoutsApi#revokeBatchPayout");
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

[**PayoutDetail**](PayoutDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="speedUpBatchPayout"></a>
# **speedUpBatchPayout**
> PayoutDetail speedUpBatchPayout(payoutId, payoutRbfBody)

Speed up batch payout

This operation speeds up a batch payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.BatchPayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    BatchPayoutsApi apiInstance = new BatchPayoutsApi();
    String payoutId = "e3986401-4aec-480a-973d-e775a4518413";
    PayoutRbfBody payoutRbfBody = new PayoutRbfBody();
    try {
      PayoutDetail result = apiInstance.speedUpBatchPayout(payoutId, payoutRbfBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchPayoutsApi#speedUpBatchPayout");
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
| **payoutRbfBody** | [**PayoutRbfBody**](PayoutRbfBody.md)| The request body to speed up or drop a batch payout. | [optional] |

### Return type

[**PayoutDetail**](PayoutDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

