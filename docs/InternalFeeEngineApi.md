# InternalFeeEngineApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTxTokens**](InternalFeeEngineApi.md#addTxTokens) | **POST** /internal/fee_engine/add_tx_tokens | Add FeeEngine Tx Tokens |
| [**batchGetCommissionFee**](InternalFeeEngineApi.md#batchGetCommissionFee) | **POST** /internal/fee_engine/batch_commission_fee | Batch get commission fee |
| [**getCommissionFee**](InternalFeeEngineApi.md#getCommissionFee) | **GET** /internal/fee_engine/commission_fee | Get commission fee |
| [**getFeeEngine**](InternalFeeEngineApi.md#getFeeEngine) | **GET** /internal/fee_engine | Get FeeEngine |
| [**updateFeeEngine**](InternalFeeEngineApi.md#updateFeeEngine) | **POST** /internal/fee_engine/update | Update FeeEngine |


<a id="addTxTokens"></a>
# **addTxTokens**
> AddTxTokens201Response addTxTokens(addTxTokensRequest)

Add FeeEngine Tx Tokens

Add fee engine tx tokens. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeEngineApi apiInstance = new InternalFeeEngineApi();
    AddTxTokensRequest addTxTokensRequest = new AddTxTokensRequest();
    try {
      AddTxTokens201Response result = apiInstance.addTxTokens(addTxTokensRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeEngineApi#addTxTokens");
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
| **addTxTokensRequest** | [**AddTxTokensRequest**](AddTxTokensRequest.md)| The request body to update fee engine tx tokens | |

### Return type

[**AddTxTokens201Response**](AddTxTokens201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully updated fee engine tx tokens |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="batchGetCommissionFee"></a>
# **batchGetCommissionFee**
> List&lt;BatchCommissionFeeResult&gt; batchGetCommissionFee(batchCommissionFeeRequest)

Batch get commission fee

This operation retrieves commission fees in batch. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeEngineApi apiInstance = new InternalFeeEngineApi();
    BatchCommissionFeeRequest batchCommissionFeeRequest = new BatchCommissionFeeRequest();
    try {
      List<BatchCommissionFeeResult> result = apiInstance.batchGetCommissionFee(batchCommissionFeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeEngineApi#batchGetCommissionFee");
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
| **batchCommissionFeeRequest** | [**BatchCommissionFeeRequest**](BatchCommissionFeeRequest.md)| Request body to query commission fees in batch | |

### Return type

[**List&lt;BatchCommissionFeeResult&gt;**](BatchCommissionFeeResult.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getCommissionFee"></a>
# **getCommissionFee**
> List&lt;CommissionFeeDetail&gt; getCommissionFee(requestId, businessTypeId, amount, chainId, tokenId, walletId, walletType, requestType, txCount)

Get commission fee

This operation retrieves commission fee. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeEngineApi apiInstance = new InternalFeeEngineApi();
    String requestId = "requestId_example";
    Long businessTypeId = 56L;
    Long amount = 56L;
    String chainId = "chainId_example";
    String tokenId = "tokenId_example";
    String walletId = "walletId_example";
    Integer walletType = 56;
    TransactionRequestTypeParams requestType = TransactionRequestTypeParams.fromValue("-999");
    Integer txCount = 56;
    try {
      List<CommissionFeeDetail> result = apiInstance.getCommissionFee(requestId, businessTypeId, amount, chainId, tokenId, walletId, walletType, requestType, txCount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeEngineApi#getCommissionFee");
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
| **requestId** | **String**| Unique request identifier | |
| **businessTypeId** | **Long**|  | [optional] |
| **amount** | **Long**| Transaction amount in smallest unit | [optional] |
| **chainId** | **String**| Blockchain chain ID | [optional] |
| **tokenId** | **String**| Token ID | [optional] |
| **walletId** | **String**| Wallet ID | [optional] |
| **walletType** | **Integer**| Wallet type | [optional] |
| **requestType** | [**TransactionRequestTypeParams**](.md)|  | [optional] [enum: -999, 100, 101, 102, 103, 104, 105, 106, 107, 108, 200, 201, 202, 203, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 400, 500, 501, 502, 503, 504, 600, 700, 801, 802, 803, 804, 805, 806, 807, 808, 809, 810, 811, 900, 901, 902, 903, 1000, 1100, 1101, 1200] |
| **txCount** | **Integer**| transaction count | [optional] |

### Return type

[**List&lt;CommissionFeeDetail&gt;**](CommissionFeeDetail.md)

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

<a id="getFeeEngine"></a>
# **getFeeEngine**
> FeeEngineDetail getFeeEngine(businessType)

Get FeeEngine

Get fee engine configuration by org_id and business_type. org_id and business_type uniquely identify a fee engine. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeEngineApi apiInstance = new InternalFeeEngineApi();
    Integer businessType = 56;
    try {
      FeeEngineDetail result = apiInstance.getFeeEngine(businessType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeEngineApi#getFeeEngine");
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
| **businessType** | **Integer**| Fee engine business type | |

### Return type

[**FeeEngineDetail**](FeeEngineDetail.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of fee engine |  -  |
| **404** | Requested resources not found. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateFeeEngine"></a>
# **updateFeeEngine**
> FeeEngineDetail updateFeeEngine(feeEngineUpdate)

Update FeeEngine

Update fee engine configuration. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeEngineApi apiInstance = new InternalFeeEngineApi();
    FeeEngineUpdate feeEngineUpdate = new FeeEngineUpdate();
    try {
      FeeEngineDetail result = apiInstance.updateFeeEngine(feeEngineUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeEngineApi#updateFeeEngine");
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
| **feeEngineUpdate** | [**FeeEngineUpdate**](FeeEngineUpdate.md)| Request body to update a fee engine | |

### Return type

[**FeeEngineDetail**](FeeEngineDetail.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful retrieval of fee engine |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

