# InternalTransactionsApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInternalMessageSignTransaction**](InternalTransactionsApi.md#createInternalMessageSignTransaction) | **POST** /internal/transactions/message_sign | Sign message |
| [**createInternalTransferTransaction**](InternalTransactionsApi.md#createInternalTransferTransaction) | **POST** /internal/transactions/transfer | Transfer token |
| [**speedupInternalTransactionById**](InternalTransactionsApi.md#speedupInternalTransactionById) | **POST** /internal/transactions/{transaction_id}/speedup | Speed up transaction |


<a id="createInternalMessageSignTransaction"></a>
# **createInternalMessageSignTransaction**
> CreateTransferTransaction201Response createInternalMessageSignTransaction(internalMessageSignParams)

Sign message

This operation creates a transaction to sign the provided message using cryptographic techniques.  You need to provide details such as the source address, destination address, and the message to be signed. A transaction request for tracking is returned upon successful operation.  &lt;Note&gt;This operation only applies to transactions from MPC Wallets.&lt;/Note&gt;  &lt;Info&gt; This API is intended for internal use only and supports all message signing formats including raw message signing. &lt;/Info&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalTransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalTransactionsApi apiInstance = new InternalTransactionsApi();
    InternalMessageSignParams internalMessageSignParams = new InternalMessageSignParams();
    try {
      CreateTransferTransaction201Response result = apiInstance.createInternalMessageSignTransaction(internalMessageSignParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalTransactionsApi#createInternalMessageSignTransaction");
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
| **internalMessageSignParams** | [**InternalMessageSignParams**](InternalMessageSignParams.md)| The request body to create a message signing transaction | [optional] |

### Return type

[**CreateTransferTransaction201Response**](CreateTransferTransaction201Response.md)

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

<a id="createInternalTransferTransaction"></a>
# **createInternalTransferTransaction**
> CreateTransferTransaction201Response createInternalTransferTransaction(internalTransferParams)

Transfer token

The operation transfers your assets from a wallet created on Cobo Portal to another address. You need to specify details such as the sender address and recipient address, token ID, and the amount to transfer. You can specify the fee-related properties to limit the transaction fee. A transaction request for tracking is returned upon successful operation.  &lt;Note&gt;If you make transfers from Custodial Wallets (Asset Wallets) and Exchange Wallets, do not set the fee-related properties, as they will not take effects.&lt;/Note&gt;  &lt;Note&gt;You can transfer tokens to multiple addresses only if you use MPC Wallets as the transaction source. To do this, you should use the &lt;code&gt;utxo_outputs&lt;/code&gt; property to specify the destination addresses.&lt;/Note&gt;  &lt;Info&gt; This API is intended for internal use only and is different from the public developer transfer API. It allows specifying internal transaction classification fields such as &lt;code&gt;cobo_category&lt;/code&gt;, which is used to identify the business category of a transaction for internal processing, accounting, and reconciliation purposes. &lt;/Info&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalTransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalTransactionsApi apiInstance = new InternalTransactionsApi();
    InternalTransferParams internalTransferParams = new InternalTransferParams();
    try {
      CreateTransferTransaction201Response result = apiInstance.createInternalTransferTransaction(internalTransferParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalTransactionsApi#createInternalTransferTransaction");
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
| **internalTransferParams** | [**InternalTransferParams**](InternalTransferParams.md)| The request body to create a transfer transaction | [optional] |

### Return type

[**CreateTransferTransaction201Response**](CreateTransferTransaction201Response.md)

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

<a id="speedupInternalTransactionById"></a>
# **speedupInternalTransactionById**
> CreateTransferTransaction201Response speedupInternalTransactionById(transactionId, internalTransactionRbf)

Speed up transaction

This operation accelerates a specified transaction. Speeding up a transaction will trigger a Replace-By-Fee (RBF) transaction which is a new version of the original transaction. For more details about speeding up a transaction, refer to [Speed up a transaction](https://www.cobo.com/developers/v2/guides/transactions/manage-transactions#speed-up-a-transaction).  You can use the &#x60;address&#x60; or &#x60;included_utxos&#x60; properties in the request body to specify the address or UTXOs that will cover the transaction fee. Generally, the transaction fee is paid by the original transaction&#39;s source. If that source&#39;s balance is insufficient, the specified address or UTXOs can be used to cover the fee.  A transaction can be sped up only if its status is &#x60;Broadcasting&#x60;.  &lt;Note&gt;This operation only applies to transactions from MPC Wallets. It does not apply to transactions on the following chains: VET, TRON, TVET, SOL, and TON.&lt;/Note&gt;  &lt;Info&gt; This API is intended for internal use only and is different from the public developer speed up API. It allows specifying internal transaction classification fields such as &lt;code&gt;cobo_category&lt;/code&gt;, which is used to identify the business category of a transaction for internal processing, accounting, and reconciliation purposes. &lt;/Info&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalTransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalTransactionsApi apiInstance = new InternalTransactionsApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    InternalTransactionRbf internalTransactionRbf = new InternalTransactionRbf();
    try {
      CreateTransferTransaction201Response result = apiInstance.speedupInternalTransactionById(transactionId, internalTransactionRbf);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalTransactionsApi#speedupInternalTransactionById");
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
| **transactionId** | **UUID**| The transaction ID. | |
| **internalTransactionRbf** | [**InternalTransactionRbf**](InternalTransactionRbf.md)| The request body to speed up transactions | [optional] |

### Return type

[**CreateTransferTransaction201Response**](CreateTransferTransaction201Response.md)

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

