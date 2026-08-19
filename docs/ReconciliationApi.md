# ReconciliationApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getReconciliationLedger**](ReconciliationApi.md#getReconciliationLedger) | **GET** /recon/ledger | Get reconciliation ledger |
| [**listReconciliationStatements**](ReconciliationApi.md#listReconciliationStatements) | **GET** /recon/statements | List reconciliation daily statements |


<a id="getReconciliationLedger"></a>
# **getReconciliationLedger**
> GetReconciliationLedger200Response getReconciliationLedger(transactionIds)

Get reconciliation ledger

This operation retrieves the post-transaction balance (running balance) for the specified transactions, used for stablecoin deposit and withdrawal reconciliation.  You need to provide the transaction IDs in &#x60;transaction_ids&#x60;. Each returned entry includes the signed amount and the resulting balance of the address after the transaction, expressed in the token&#39;s main unit.  &lt;Note&gt;This operation is available to selected customers only. To request access, please contact Cobo.&lt;/Note&gt;  &lt;Note&gt;This operation is applicable to MPC Wallets and Custodial Web3 Wallets only, and covers stablecoins only. To ensure accurate reconciliation results, do not use the contract call and message signing features. Currently, only stablecoins on the Ethereum and TRON chains are supported.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.ReconciliationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    ReconciliationApi apiInstance = new ReconciliationApi();
    String transactionIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,557918d2-632a-4fe1-932f-315711f05fe3";
    try {
      GetReconciliationLedger200Response result = apiInstance.getReconciliationLedger(transactionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationApi#getReconciliationLedger");
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
| **transactionIds** | **String**| A list of transaction IDs, separated by comma. You can specify 1 to 100 transaction IDs. | |

### Return type

[**GetReconciliationLedger200Response**](GetReconciliationLedger200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The reconciliation ledger entries (post-transaction balances). |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listReconciliationStatements"></a>
# **listReconciliationStatements**
> ListReconciliationStatements200Response listReconciliationStatements(startDate, endDate, walletIds, tokenIds, limit, before, after)

List reconciliation daily statements

This operation retrieves daily reconciliation statements within a date range. Each statement contains the opening balance, total deposits, total withdrawals, and closing balance for a business date, wallet, and token.  You need to specify the date range with &#x60;start_date&#x60; and &#x60;end_date&#x60;. You can filter the results by wallets and tokens, and paginate the query results. All amounts are expressed in the token&#39;s main unit.  &lt;Note&gt;This operation is available to selected customers only. To request access, please contact Cobo.&lt;/Note&gt;  &lt;Note&gt;This operation is applicable to MPC Wallets and Custodial Web3 Wallets only, and covers stablecoins only. To ensure accurate reconciliation results, do not use the contract call and message signing features. Currently, only stablecoins on the Ethereum and TRON chains are supported.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.ReconciliationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    ReconciliationApi apiInstance = new ReconciliationApi();
    LocalDate startDate = LocalDate.parse("2026-07-01");
    LocalDate endDate = LocalDate.parse("2026-07-28");
    String walletIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,1ddca562-8434-41c9-8809-d437bad9c868";
    String tokenIds = "ETH_USDT,ETH_USDC";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListReconciliationStatements200Response result = apiInstance.listReconciliationStatements(startDate, endDate, walletIds, tokenIds, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationApi#listReconciliationStatements");
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
| **startDate** | **LocalDate**| The start date of the reconciliation period (inclusive), in YYYY-MM-DD format (UTC). The range between &#x60;start_date&#x60; and &#x60;end_date&#x60; must not exceed 366 days. | |
| **endDate** | **LocalDate**| The end date of the reconciliation period (inclusive), in YYYY-MM-DD format (UTC). The range between &#x60;start_date&#x60; and &#x60;end_date&#x60; must not exceed 366 days. | |
| **walletIds** | **String**| A list of wallet IDs, separated by comma. | [optional] |
| **tokenIds** | **String**| A list of token IDs, separated by comma. The token ID is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| A cursor indicating the position before the current page. This value is generated by Cobo and returned in the response. If you are paginating forward from the beginning, you do not need to provide it on the first request. When paginating backward (to the previous page), you should pass the before value returned from the last response.  | [optional] |
| **after** | **String**| A cursor indicating the position after the current page. This value is generated by Cobo and returned in the response. You do not need to provide it on the first request. When paginating forward (to the next page), you should pass the after value returned from the last response.  | [optional] |

### Return type

[**ListReconciliationStatements200Response**](ListReconciliationStatements200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The daily reconciliation statements. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

