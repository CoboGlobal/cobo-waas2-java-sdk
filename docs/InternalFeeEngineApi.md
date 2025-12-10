# InternalFeeEngineApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCommissionFee**](InternalFeeEngineApi.md#getCommissionFee) | **GET** /internal/commission_fee | Get commission fee |


<a id="getCommissionFee"></a>
# **getCommissionFee**
> List&lt;CommissionFeeDetail&gt; getCommissionFee(requestId, businessTypeId, amount, chainId, tokenId, walletId, walletType, requestType, strategyContext)

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
    Map<String, Object> strategyContext = null;
    try {
      List<CommissionFeeDetail> result = apiInstance.getCommissionFee(requestId, businessTypeId, amount, chainId, tokenId, walletId, walletType, requestType, strategyContext);
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
| **strategyContext** | [**Map&lt;String, Object&gt;**](Object.md)| Strategy context parameters.  | [optional] |

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

