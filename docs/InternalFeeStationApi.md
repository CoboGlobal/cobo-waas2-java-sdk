# InternalFeeStationApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCoboPaidToken**](InternalFeeStationApi.md#addCoboPaidToken) | **POST** /internal/fee_station/add_cobo_paid_token | Append Cobo-paid tokens |
| [**chargeCommissionFee**](InternalFeeStationApi.md#chargeCommissionFee) | **POST** /internal/fee_station/charge_commission_fee | Charge commission fee |
| [**getCommissionFeeByRequestId**](InternalFeeStationApi.md#getCommissionFeeByRequestId) | **GET** /internal/fee_station/commission_fee | Get commission fee by request ID |
| [**getFeeStationDetail**](InternalFeeStationApi.md#getFeeStationDetail) | **GET** /internal/fee_station | Get FeeStation Detail |
| [**getFeeStationSystemConf**](InternalFeeStationApi.md#getFeeStationSystemConf) | **GET** /internal/fee_station/system_conf | Get FeeStation System Config |
| [**listFeeStationUnifiedTransactions**](InternalFeeStationApi.md#listFeeStationUnifiedTransactions) | **GET** /internal/fee_station/unified_transactions | List fee station unified transactions |
| [**refundCommissionFee**](InternalFeeStationApi.md#refundCommissionFee) | **POST** /internal/fee_station/refund_commission_fee | Refund commission fee |
| [**updateFeeStationConfig**](InternalFeeStationApi.md#updateFeeStationConfig) | **POST** /internal/fee_station/update_conf | Update FeeStation |


<a id="addCoboPaidToken"></a>
# **addCoboPaidToken**
> addCoboPaidToken(addCoboPaidTokenRequest)

Append Cobo-paid tokens

This operation appends one or more tokens to the organization&#39;s Cobo-paid token list in the Fee Station configuration.  Each token ID provided in the request must be supported by the gas station configuration. Tokens already present in the configuration are ignored. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeStationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeStationApi apiInstance = new InternalFeeStationApi();
    AddCoboPaidTokenRequest addCoboPaidTokenRequest = new AddCoboPaidTokenRequest();
    try {
      apiInstance.addCoboPaidToken(addCoboPaidTokenRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeStationApi#addCoboPaidToken");
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
| **addCoboPaidTokenRequest** | [**AddCoboPaidTokenRequest**](AddCoboPaidTokenRequest.md)| The request body to append Cobo-paid tokens to the organization&#39;s Fee Station configuration. | [optional] |

### Return type

null (empty response body)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="chargeCommissionFee"></a>
# **chargeCommissionFee**
> ChargeCommissionFee201Response chargeCommissionFee(chargeCommissionFeeRequest)

Charge commission fee

This operation charge commission fee. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeStationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeStationApi apiInstance = new InternalFeeStationApi();
    ChargeCommissionFeeRequest chargeCommissionFeeRequest = new ChargeCommissionFeeRequest();
    try {
      ChargeCommissionFee201Response result = apiInstance.chargeCommissionFee(chargeCommissionFeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeStationApi#chargeCommissionFee");
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
| **chargeCommissionFeeRequest** | [**ChargeCommissionFeeRequest**](ChargeCommissionFeeRequest.md)| The request body to charge commission fee | [optional] |

### Return type

[**ChargeCommissionFee201Response**](ChargeCommissionFee201Response.md)

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

<a id="getCommissionFeeByRequestId"></a>
# **getCommissionFeeByRequestId**
> CommissionFeeDetail getCommissionFeeByRequestId(requestId)

Get commission fee by request ID

This operation retrieves the commission fee detail by the commission fee request ID used when charging the commission fee. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeStationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeStationApi apiInstance = new InternalFeeStationApi();
    String requestId = "commission_fee_request_1234567890";
    try {
      CommissionFeeDetail result = apiInstance.getCommissionFeeByRequestId(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeStationApi#getCommissionFeeByRequestId");
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
| **requestId** | **String**| The commission fee request ID used when charging the commission fee. | |

### Return type

[**CommissionFeeDetail**](CommissionFeeDetail.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The commission fee detail. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getFeeStationDetail"></a>
# **getFeeStationDetail**
> FeeStationDetail getFeeStationDetail()

Get FeeStation Detail

This operation get fee station detail. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeStationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeStationApi apiInstance = new InternalFeeStationApi();
    try {
      FeeStationDetail result = apiInstance.getFeeStationDetail();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeStationApi#getFeeStationDetail");
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

[**FeeStationDetail**](FeeStationDetail.md)

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

<a id="getFeeStationSystemConf"></a>
# **getFeeStationSystemConf**
> FeeStationSystemConf getFeeStationSystemConf()

Get FeeStation System Config

This operation get fee station detail. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeStationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeStationApi apiInstance = new InternalFeeStationApi();
    try {
      FeeStationSystemConf result = apiInstance.getFeeStationSystemConf();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeStationApi#getFeeStationSystemConf");
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

[**FeeStationSystemConf**](FeeStationSystemConf.md)

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

<a id="listFeeStationUnifiedTransactions"></a>
# **listFeeStationUnifiedTransactions**
> ListFeeStationUnifiedTransactions200Response listFeeStationUnifiedTransactions(type, subtypes, transactionId, startAt, endAt, before, after, limit)

List fee station unified transactions

This operation retrieves all Fee Station unified transactions under your organization.  You can filter the results by transaction id, type, subtypes, and tx_time. Results are paginated using cursor-based pagination. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeStationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeStationApi apiInstance = new InternalFeeStationApi();
    Integer type = 1;
    String subtypes = "1,3";
    String transactionId = "f47ac10b-58cc-4372-a567-0e02b2c3d479";
    String startAt = "1700000000";
    String endAt = "1700100000";
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    Integer limit = 10;
    try {
      ListFeeStationUnifiedTransactions200Response result = apiInstance.listFeeStationUnifiedTransactions(type, subtypes, transactionId, startAt, endAt, before, after, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeStationApi#listFeeStationUnifiedTransactions");
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
| **type** | **Integer**| The unified transaction type. Possible values include:   - &#x60;1&#x60;: Deposit transaction.   - &#x60;2&#x60;: Payment transaction.  | [optional] |
| **subtypes** | **String**| A list of unified transaction subtypes, separated by comma. See the &#x60;FeeStationUnifiedTransactionSubtype&#x60; schema for the list of valid values.  | [optional] |
| **transactionId** | **String**| The unique identifier of a unified transaction. Use this to look up a specific transaction. | [optional] |
| **startAt** | **String**| Filter unified transactions whose tx_time is on or after the given Unix timestamp (in seconds). | [optional] |
| **endAt** | **String**| Filter unified transactions whose tx_time is before the given Unix timestamp (in seconds). | [optional] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |

### Return type

[**ListFeeStationUnifiedTransactions200Response**](ListFeeStationUnifiedTransactions200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about the fee station unified transactions. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="refundCommissionFee"></a>
# **refundCommissionFee**
> RefundCommissionFee201Response refundCommissionFee(refundCommissionFeeRequest)

Refund commission fee

This operation refund commission fee. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeStationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeStationApi apiInstance = new InternalFeeStationApi();
    RefundCommissionFeeRequest refundCommissionFeeRequest = new RefundCommissionFeeRequest();
    try {
      RefundCommissionFee201Response result = apiInstance.refundCommissionFee(refundCommissionFeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeStationApi#refundCommissionFee");
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
| **refundCommissionFeeRequest** | [**RefundCommissionFeeRequest**](RefundCommissionFeeRequest.md)| This request supports partial refunds. The refunded amount is accumulated across multiple requests and must not exceed the originally charged amount.  | [optional] |

### Return type

[**RefundCommissionFee201Response**](RefundCommissionFee201Response.md)

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

<a id="updateFeeStationConfig"></a>
# **updateFeeStationConfig**
> updateFeeStationConfig(updateFeeStationConfigRequest)

Update FeeStation

This operation to update fee station config. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeStationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeStationApi apiInstance = new InternalFeeStationApi();
    UpdateFeeStationConfigRequest updateFeeStationConfigRequest = new UpdateFeeStationConfigRequest();
    try {
      apiInstance.updateFeeStationConfig(updateFeeStationConfigRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeStationApi#updateFeeStationConfig");
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
| **updateFeeStationConfigRequest** | [**UpdateFeeStationConfigRequest**](UpdateFeeStationConfigRequest.md)| The request body to update fee station settings | [optional] |

### Return type

null (empty response body)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

