# TransactionsApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**broadcastSignedTransactions**](TransactionsApi.md#broadcastSignedTransactions) | **POST** /transactions/broadcast | Broadcast signed transactions |
| [**cancelTransactionById**](TransactionsApi.md#cancelTransactionById) | **POST** /transactions/{transaction_id}/cancel | Cancel transaction |
| [**checkLoopTransfers**](TransactionsApi.md#checkLoopTransfers) | **GET** /transactions/check_loop_transfers | Check Cobo Loop transfers |
| [**createContractCallTransaction**](TransactionsApi.md#createContractCallTransaction) | **POST** /transactions/contract_call | Call smart contract |
| [**createMessageSignTransaction**](TransactionsApi.md#createMessageSignTransaction) | **POST** /transactions/message_sign | Sign message |
| [**createTransferTransaction**](TransactionsApi.md#createTransferTransaction) | **POST** /transactions/transfer | Transfer token |
| [**dropTransactionById**](TransactionsApi.md#dropTransactionById) | **POST** /transactions/{transaction_id}/drop | Drop transaction |
| [**estimateFee**](TransactionsApi.md#estimateFee) | **POST** /transactions/estimate_fee | Estimate transaction fee |
| [**getTransactionApprovalDetail**](TransactionsApi.md#getTransactionApprovalDetail) | **GET** /transactions/{transaction_id}/approval_detail | Get transaction approval details |
| [**getTransactionById**](TransactionsApi.md#getTransactionById) | **GET** /transactions/{transaction_id} | Get transaction information |
| [**listApprovalDetails**](TransactionsApi.md#listApprovalDetails) | **GET** /transactions/approval/details | List transaction approval details |
| [**listTransactionApprovalDetails**](TransactionsApi.md#listTransactionApprovalDetails) | **GET** /transactions/approval_details | List transaction approval details |
| [**listTransactionTemplates**](TransactionsApi.md#listTransactionTemplates) | **GET** /transactions/templates | list transaction templates |
| [**listTransactions**](TransactionsApi.md#listTransactions) | **GET** /transactions | List all transactions |
| [**resendTransactionById**](TransactionsApi.md#resendTransactionById) | **POST** /transactions/{transaction_id}/resend | Resend transaction |
| [**signAndBroadcastTransactionById**](TransactionsApi.md#signAndBroadcastTransactionById) | **POST** /transactions/{transaction_id}/sign_and_broadcast | Sign and broadcast transaction |
| [**speedupTransactionById**](TransactionsApi.md#speedupTransactionById) | **POST** /transactions/{transaction_id}/speedup | Speed up transaction |


<a id="broadcastSignedTransactions"></a>
# **broadcastSignedTransactions**
> List&lt;BroadcastSignedTransactions201ResponseInner&gt; broadcastSignedTransactions(broadcastSignedTransactionsRequest)

Broadcast signed transactions

&lt;Note&gt;This operation is only applicable to the staking scenarios.&lt;/Note&gt; This operation broadcasts a list of signed transactions.   If you set &#x60;auto_broadcast&#x60; to &#x60;false&#x60; when [creating a staking activity](https://www.cobo.com/developers/v2/api-references/staking/create-stake-activity), the transaction will not be submitted to the blockchain automatically after being signed. In such cases, you can call this operation to broadcast the transaction to the blockchain.  A transaction can only be broadcast if its status is &#x60;Broadcasting&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    BroadcastSignedTransactionsRequest broadcastSignedTransactionsRequest = new BroadcastSignedTransactionsRequest();
    try {
      List<BroadcastSignedTransactions201ResponseInner> result = apiInstance.broadcastSignedTransactions(broadcastSignedTransactionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#broadcastSignedTransactions");
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
| **broadcastSignedTransactionsRequest** | [**BroadcastSignedTransactionsRequest**](BroadcastSignedTransactionsRequest.md)| The request body to broadcast a list of signed transactions. | [optional] |

### Return type

[**List&lt;BroadcastSignedTransactions201ResponseInner&gt;**](BroadcastSignedTransactions201ResponseInner.md)

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

<a id="cancelTransactionById"></a>
# **cancelTransactionById**
> CreateTransferTransaction201Response cancelTransactionById(transactionId)

Cancel transaction

This operation cancels a specified transaction. Canceling a transaction stops it while it is still pending. For more information, see [Cancel a transaction](https://www.cobo.com/developers/v2/guides/transactions/manage-transactions#cancel-a-transaction).  &lt;Note&gt;This operation only applies to transactions from MPC Wallets and Smart Contract Wallets.&lt;/Note&gt;  A transaction can be cancelled if its status is either of the following: - &#x60;Submitted&#x60; - &#x60;PendingScreening&#x60; - &#x60;PendingAuthorization&#x60; - &#x60;PendingSignature&#x60; (excluding the &#x60;SystemProcessingOngoing&#x60; and &#x60;SignatureVerificationSuccess&#x60; sub-statuses) 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      CreateTransferTransaction201Response result = apiInstance.cancelTransactionById(transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#cancelTransactionById");
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

### Return type

[**CreateTransferTransaction201Response**](CreateTransferTransaction201Response.md)

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

<a id="checkLoopTransfers"></a>
# **checkLoopTransfers**
> List&lt;CheckLoopTransfers200ResponseInner&gt; checkLoopTransfers(tokenId, sourceWalletId, destinationAddresses)

Check Cobo Loop transfers

This operation verifies if the transactions from a given source wallet to a list of given destinations can be executed as Cobo Loop transfers.   For more information about Cobo Loop, see [Cobo Loop&#39;s product manuals](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    String tokenId = "ETH_USDT";
    UUID sourceWalletId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    String destinationAddresses = "0xd8dA6BF26964aF9D7eEd9e03E53415D37aA96045,0x4838B106FCe9647Bdf1E7877BF73cE8B0BAD5f97";
    try {
      List<CheckLoopTransfers200ResponseInner> result = apiInstance.checkLoopTransfers(tokenId, sourceWalletId, destinationAddresses);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#checkLoopTransfers");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). | |
| **sourceWalletId** | **UUID**| The wallet ID of the transaction source. | |
| **destinationAddresses** | **String**| A list of destination addresses, separated by comma. | |

### Return type

[**List&lt;CheckLoopTransfers200ResponseInner&gt;**](CheckLoopTransfers200ResponseInner.md)

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

<a id="createContractCallTransaction"></a>
# **createContractCallTransaction**
> CreateTransferTransaction201Response createContractCallTransaction(contractCallParams)

Call smart contract

This operation creates a transaction to interact with a smart contract on the blockchain.  You need to provide details such as the source address, destination address, and the calldata. You can specify the fee-related properties to limit the transaction fee. A transaction request for tracking is returned upon successful operation.  &lt;Note&gt;Currently, this operation only applies to the transactions from MPC Wallets or Smart Contract Wallets on the blockchains that have a similar architecture to Ethereum.&lt;/Note&gt;  &lt;Info&gt;If you initiate a transaction from a Smart Contract Wallet, a relevant transaction will be triggered from the Delegate to the Cobo Safe&#39;s address of the Smart Contract Wallet, with a transfer amount of &lt;code&gt;0&lt;/code&gt;.&lt;/Info&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    ContractCallParams contractCallParams = new ContractCallParams();
    try {
      CreateTransferTransaction201Response result = apiInstance.createContractCallTransaction(contractCallParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#createContractCallTransaction");
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
| **contractCallParams** | [**ContractCallParams**](ContractCallParams.md)| The request body for making a contract call. | [optional] |

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

<a id="createMessageSignTransaction"></a>
# **createMessageSignTransaction**
> CreateTransferTransaction201Response createMessageSignTransaction(messageSignParams)

Sign message

This operation creates a transaction to sign the provided message using cryptographic techniques.  In some scenarios, you want to sign a message for identity authentication or transaction approval. You need to provide details such as the source address, destination address, and the message to be signed. A transaction request for tracking is returned upon successful operation.  You can get the signature result by calling [Get transaction information](https://www.cobo.com/developers/v2/api-references/transactions/get-transaction-information).   &lt;Note&gt;This operation only applies to transactions from MPC Wallets.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    MessageSignParams messageSignParams = new MessageSignParams();
    try {
      CreateTransferTransaction201Response result = apiInstance.createMessageSignTransaction(messageSignParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#createMessageSignTransaction");
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
| **messageSignParams** | [**MessageSignParams**](MessageSignParams.md)| The request body to create a message signing transaction | [optional] |

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

<a id="createTransferTransaction"></a>
# **createTransferTransaction**
> CreateTransferTransaction201Response createTransferTransaction(transferParams)

Transfer token

The operation transfers your assets from a wallet created on Cobo Portal to another address.  You need to specify details such as the sender address and recipient address, token ID, and the amount to transfer. You can specify the fee-related properties to limit the transaction fee. A transaction request for tracking is returned upon successful operation.  &lt;Note&gt;If you make transfers from Custodial Wallets (Asset Wallets) and Exchange Wallets, do not set the fee-related properties, as they will not take effects.&lt;/Note&gt;  &lt;Note&gt;You can transfer tokens to multiple addresses only if you use MPC Wallets as the transaction source. To do this, you should use the &lt;code&gt;utxo_outputs&lt;/code&gt; property to specify the destination addresses.&lt;/Note&gt;  &lt;Info&gt;If you initiate a transaction from a Smart Contract Wallet, a relevant transaction will be triggered from the Delegate to the Cobo Safe&#39;s address of the Smart Contract Wallet, with a transfer amount of &lt;code&gt;0&lt;/code&gt;.&lt;/Info&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    TransferParams transferParams = new TransferParams();
    try {
      CreateTransferTransaction201Response result = apiInstance.createTransferTransaction(transferParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#createTransferTransaction");
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
| **transferParams** | [**TransferParams**](TransferParams.md)| The request body to create a transfer transaction | [optional] |

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

<a id="dropTransactionById"></a>
# **dropTransactionById**
> CreateTransferTransaction201Response dropTransactionById(transactionId, transactionRbf)

Drop transaction

This operation drops a specified transaction. Dropping a transaction leverages RBF to replace the original transaction with a version that effectively cancels it. For more details about dropping a transaction, refer to [Drop a transaction](https://www.cobo.com/developers/v2/guides/transactions/manage-transactions#drop-a-transaction).  A transaction can be sped up only if its status is &#x60;Broadcasting&#x60;.  &lt;Note&gt;This operation only applies to transactions from MPC Wallets and Smart Contract Wallets. It does not apply to transactions on the following chains: VET, TRON, TVET, SOL, and TON.&lt;/Note&gt;  You can use the &#x60;address&#x60; or &#x60;included_utxos&#x60; properties in the request body to specify the address or UTXOs that will cover the transaction fee. Generally, the transaction fee is paid by the original transaction&#39;s source. If that source&#39;s balance is insufficient, the specified address or UTXOs can be used to cover the fee. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    TransactionRbf transactionRbf = new TransactionRbf();
    try {
      CreateTransferTransaction201Response result = apiInstance.dropTransactionById(transactionId, transactionRbf);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#dropTransactionById");
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
| **transactionRbf** | [**TransactionRbf**](TransactionRbf.md)| The request body to drop or to speed up transactions | [optional] |

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

<a id="estimateFee"></a>
# **estimateFee**
> EstimatedFee estimateFee(estimateFeeParams)

Estimate transaction fee

This operation estimates the transaction fee of a token transfer or a contract call based on the fee model that the chain uses, considering factors such as network congestion and transaction complexity.  You need to specify the transaction information, including the request ID, request type, source address, destination address, token ID (only applicable to token transfers), and chain ID (only applicable to contract calls).  The response can contain different properties based on the transaction fee model used by the chain. For the legacy, EIP-1559, and UTXO fee models, Cobo also supports three different transaction speed levels: slow, recommended, and fast. For more information about estimating transaction fees, refer to [Estimate transaction fee](https://www.cobo.com/developers/v2/guides/transactions/estimate-fees). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    EstimateFeeParams estimateFeeParams = new EstimateFeeParams();
    try {
      EstimatedFee result = apiInstance.estimateFee(estimateFeeParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#estimateFee");
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
| **estimateFeeParams** | [**EstimateFeeParams**](EstimateFeeParams.md)| The request body to estimate the transaction fee of a token transfer or a contract call. | [optional] |

### Return type

[**EstimatedFee**](EstimatedFee.md)

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

<a id="getTransactionApprovalDetail"></a>
# **getTransactionApprovalDetail**
> TransactionApprovalDetail getTransactionApprovalDetail(transactionId)

Get transaction approval details

This operation retrieves detailed approval information about a specified transaction. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      TransactionApprovalDetail result = apiInstance.getTransactionApprovalDetail(transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getTransactionApprovalDetail");
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

### Return type

[**TransactionApprovalDetail**](TransactionApprovalDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about a transaction approval detail. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getTransactionById"></a>
# **getTransactionById**
> TransactionDetail getTransactionById(transactionId)

Get transaction information

This operation retrieves detailed information about a specified transaction, such as the transaction status, source address, destination address, and timestamp. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      TransactionDetail result = apiInstance.getTransactionById(transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getTransactionById");
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

### Return type

[**TransactionDetail**](TransactionDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about a transaction. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listApprovalDetails"></a>
# **listApprovalDetails**
> List&lt;ApprovalDetail&gt; listApprovalDetails(transactionIds, coboIds, requestIds)

List transaction approval details

This operation retrieves detailed approval information for a specified transaction. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    String transactionIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,557918d2-632a-4fe1-932f-315711f05fe3";
    String coboIds = "20231213122855000000000000000000,20231213122955000000000000000000";
    String requestIds = "web_send_by_user_327_1610444045047,web_send_by_user_327_1610444045048";
    try {
      List<ApprovalDetail> result = apiInstance.listApprovalDetails(transactionIds, coboIds, requestIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#listApprovalDetails");
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
| **transactionIds** | **String**| A list of transaction IDs, separated by comma. | [optional] |
| **coboIds** | **String**| A list of Cobo IDs, separated by comma. A Cobo ID can be used to track a transaction. | [optional] |
| **requestIds** | **String**| A list of request IDs, separated by comma. | [optional] |

### Return type

[**List&lt;ApprovalDetail&gt;**](ApprovalDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about transaction approval detail. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listTransactionApprovalDetails"></a>
# **listTransactionApprovalDetails**
> ListTransactionApprovalDetails200Response listTransactionApprovalDetails(transactionIds, coboIds)

List transaction approval details

This operation retrieves detailed approval information for all transactions. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    String transactionIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,557918d2-632a-4fe1-932f-315711f05fe3";
    String coboIds = "20231213122855000000000000000000,20231213122955000000000000000000";
    try {
      ListTransactionApprovalDetails200Response result = apiInstance.listTransactionApprovalDetails(transactionIds, coboIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#listTransactionApprovalDetails");
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
| **transactionIds** | **String**| A list of transaction IDs, separated by comma. | [optional] |
| **coboIds** | **String**| A list of Cobo IDs, separated by comma. A Cobo ID can be used to track a transaction. | [optional] |

### Return type

[**ListTransactionApprovalDetails200Response**](ListTransactionApprovalDetails200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about transaction approval detail. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listTransactionTemplates"></a>
# **listTransactionTemplates**
> List&lt;ApprovalTemplate&gt; listTransactionTemplates(templateKey, templateVersion)

list transaction templates

This operation retrieves transaction templates based on the specified transaction type and template version. The response includes a list of templates that can be used for creating transactions approval message. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    String templateKey = "withdrawal";
    String templateVersion = "1.0.0";
    try {
      List<ApprovalTemplate> result = apiInstance.listTransactionTemplates(templateKey, templateVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#listTransactionTemplates");
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
| **templateKey** | **String**| The key of the transaction template to be used for creating a transaction approval message.  | |
| **templateVersion** | **String**| The version of the template used for the transaction approval. | [optional] |

### Return type

[**List&lt;ApprovalTemplate&gt;**](ApprovalTemplate.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing a list of transaction approval templates. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listTransactions"></a>
# **listTransactions**
> ListTransactions200Response listTransactions(requestId, coboIds, transactionIds, transactionHashes, types, statuses, walletIds, chainIds, tokenIds, assetIds, vaultId, walletType, walletSubtype, projectId, minCreatedTimestamp, maxCreatedTimestamp, limit, before, after, direction)

List all transactions

This operation retrieves all the transactions under your organization.  You can filter the results by request ID, Cobo ID, transaction ID, transaction hash, type, status, and timestamps. You can also paginate and sort your query results. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    String requestId = "web_send_by_user_327_1610444045047";
    String coboIds = "20231213122855000000000000000000,20231213122955000000000000000000";
    String transactionIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,557918d2-632a-4fe1-932f-315711f05fe3";
    String transactionHashes = "239861be9a4afe080c359b7fe4a1d035945ec46256b1a0f44d1267c71de8ec28";
    String types = "Deposit,Withdrawal";
    String statuses = "Completed,Failed";
    String walletIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,1ddca562-8434-41c9-8809-d437bad9c868";
    String chainIds = "BTC,ETH";
    String tokenIds = "ETH_USDT,ETH_USDC";
    String assetIds = "USDT,USDC";
    UUID vaultId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    WalletType walletType = WalletType.fromValue("Custodial");
    WalletSubtype walletSubtype = WalletSubtype.fromValue("Asset");
    UUID projectId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    Long minCreatedTimestamp = 1635744000000L;
    Long maxCreatedTimestamp = 1635744000000L;
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String direction = "ASC";
    try {
      ListTransactions200Response result = apiInstance.listTransactions(requestId, coboIds, transactionIds, transactionHashes, types, statuses, walletIds, chainIds, tokenIds, assetIds, vaultId, walletType, walletSubtype, projectId, minCreatedTimestamp, maxCreatedTimestamp, limit, before, after, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#listTransactions");
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
| **requestId** | **String**| The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. | [optional] |
| **coboIds** | **String**| A list of Cobo IDs, separated by comma. A Cobo ID can be used to track a transaction. | [optional] |
| **transactionIds** | **String**| A list of transaction IDs, separated by comma. | [optional] |
| **transactionHashes** | **String**| A list of transaction hashes, separated by comma. | [optional] |
| **types** | **String**| A list of transaction types, separated by comma. Possible values include:    - &#x60;Deposit&#x60;: A deposit transaction.   - &#x60;Withdrawal&#x60;: A withdrawal transaction.   - &#x60;ContractCall&#x60;: A transaction that interacts with a smart contract.   - &#x60;MessageSign&#x60;: A transaction that signs a message.    - &#x60;ExternalSafeTx&#x60;: A transaction to a Smart Contract Wallet (Safe{Wallet}) that requires one or multiple signatures to be executed.   - &#x60;Stake&#x60;: A transaction that creates a staking request.   - &#x60;Unstake&#x60;: A transaction that creates a unstaking request.  | [optional] |
| **statuses** | **String**| A list of transaction statuses, separated by comma. Possible values include:    - &#x60;Submitted&#x60;: The transaction is submitted.   - &#x60;PendingScreening&#x60;: The transaction is pending screening by Risk Control.    - &#x60;PendingAuthorization&#x60;: The transaction is pending approvals.   - &#x60;PendingSignature&#x60;: The transaction is pending signature.    - &#x60;Broadcasting&#x60;: The transaction is being broadcast.   - &#x60;Confirming&#x60;: The transaction is waiting for the required number of confirmations.   - &#x60;Completed&#x60;: The transaction is completed.   - &#x60;Failed&#x60;: The transaction failed.   - &#x60;Rejected&#x60;: The transaction is rejected.   - &#x60;Pending&#x60;: The transaction is waiting to be included in the next block of the blockchain.  | [optional] |
| **walletIds** | **String**| A list of wallet IDs, separated by comma. | [optional] |
| **chainIds** | **String**| A list of chain IDs, separated by comma. The chain ID is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). | [optional] |
| **tokenIds** | **String**| A list of token IDs, separated by comma. The token ID is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). | [optional] |
| **assetIds** | **String**| (This concept applies to Exchange Wallets only) A list of asset IDs, separated by comma. An asset ID is the unique identifier of the asset held within your linked exchange account. | [optional] |
| **vaultId** | **UUID**| The vault ID, which you can retrieve by calling [List all vaults](https://www.cobo.com/developers/v2/api-references/wallets--mpc-wallets/list-all-vaults). | [optional] |
| **walletType** | [**WalletType**](.md)| The wallet type.  - &#x60;Custodial&#x60;: [Custodial Wallets](https://manuals.cobo.com/en/portal/custodial-wallets/introduction)  - &#x60;MPC&#x60;: [MPC Wallets](https://manuals.cobo.com/en/portal/mpc-wallets/introduction)  - &#x60;SmartContract&#x60;: [Smart Contract Wallets](https://manuals.cobo.com/en/portal/smart-contract-wallets/introduction)  - &#x60;Exchange&#x60;: [Exchange Wallets](https://manuals.cobo.com/en/portal/exchange-wallets/introduction)  | [optional] [enum: Custodial, MPC, SmartContract, Exchange] |
| **walletSubtype** | [**WalletSubtype**](.md)| The wallet subtype.  - &#x60;Asset&#x60;: Custodial Wallets (Asset Wallets)  - &#x60;Web3&#x60;: Custodial Wallets (Web3 Wallets)  - &#x60;Main&#x60;: Exchange Wallets (Main Account)  - &#x60;Sub&#x60;: Exchange Wallets (Sub Account)  - &#x60;Org-Controlled&#x60;: MPC Wallets (Organization-Controlled Wallets)  - &#x60;User-Controlled&#x60;: MPC Wallets (User-Controlled Wallets)  - &#x60;Safe{Wallet}&#x60;: Smart Contract Wallets (Safe{Wallet})  | [optional] [enum: Asset, Web3, Org-Controlled, User-Controlled, Safe{Wallet}, Main, Sub] |
| **projectId** | **UUID**| The project ID, which you can retrieve by calling [List all projects](https://www.cobo.com/developers/v2/api-references/wallets--mpc-wallets/list-all-projects).  | [optional] |
| **minCreatedTimestamp** | **Long**| The time when the transaction was created, in Unix timestamp format, measured in milliseconds. You can use this parameter to filter transactions created on or after the specified time. | [optional] |
| **maxCreatedTimestamp** | **Long**| The time when the transaction was created, in Unix timestamp format, measured in milliseconds. You can use this parameter to filter transactions created on or before the specified time. | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |
| **direction** | **String**| The sort direction. Possible values include:   - &#x60;ASC&#x60;: Sort the results in ascending order.   - &#x60;DESC&#x60;: Sort the results in descending order.  | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**ListTransactions200Response**](ListTransactions200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about the transactions. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="resendTransactionById"></a>
# **resendTransactionById**
> CreateTransferTransaction201Response resendTransactionById(transactionId, transactionResend)

Resend transaction

This operation resends a specified transaction. Resending a transaction means retrying a previously failed transaction. For more details about resending a transaction, see [Resend a transaction](https://www.cobo.com/developers/v2/guides/transactions/manage-transactions#resend-a-transaction).  A transaction can be resent if its status is &#x60;failed&#x60;.  &lt;Note&gt;This operation only applies to transactions from MPC Wallets in the SOL token.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    TransactionResend transactionResend = new TransactionResend();
    try {
      CreateTransferTransaction201Response result = apiInstance.resendTransactionById(transactionId, transactionResend);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#resendTransactionById");
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
| **transactionResend** | [**TransactionResend**](TransactionResend.md)| The request body to resend transactions | [optional] |

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

<a id="signAndBroadcastTransactionById"></a>
# **signAndBroadcastTransactionById**
> CreateTransferTransaction201Response signAndBroadcastTransactionById(transactionId)

Sign and broadcast transaction

This operation signs and broadcasts a specified transaction.  To call this operation, the following conditions must be met: - The &#x60;transaction_process_type&#x60; of the transaction must be set to &#x60;BuildOnly&#x60; when you call the [Transfer token](https://www.cobo.com/developers/v2/api-references/transactions/transfer-token) or [Call smart contract](https://www.cobo.com/developers/v2/api-references/transactions/call-smart-contract) operation.   - The transaction status must be &#x60;Built&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      CreateTransferTransaction201Response result = apiInstance.signAndBroadcastTransactionById(transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#signAndBroadcastTransactionById");
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

### Return type

[**CreateTransferTransaction201Response**](CreateTransferTransaction201Response.md)

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

<a id="speedupTransactionById"></a>
# **speedupTransactionById**
> CreateTransferTransaction201Response speedupTransactionById(transactionId, transactionRbf)

Speed up transaction

This operation accelerates a specified transaction. Speeding up a transaction will trigger a Replace-By-Fee (RBF) transaction which is a new version of the original transaction. For more details about speeding up a transaction, refer to [Speed up a transaction](https://www.cobo.com/developers/v2/guides/transactions/manage-transactions#speed-up-a-transaction).  You can use the &#x60;address&#x60; or &#x60;included_utxos&#x60; properties in the request body to specify the address or UTXOs that will cover the transaction fee. Generally, the transaction fee is paid by the original transaction&#39;s source. If that source&#39;s balance is insufficient, the specified address or UTXOs can be used to cover the fee.  A transaction can be sped up only if its status is &#x60;Broadcasting&#x60;.  &lt;Note&gt;This operation only applies to transactions from MPC Wallets and Smart Contract Wallets. It does not apply to transactions on the following chains: VET, TRON, TVET, SOL, and TON.&lt;/Note&gt;  &lt;Info&gt;If you speed up a transaction from a Smart Contract Wallet, two RBF transactions will be triggered, one for the transaction from the Smart Contract Wallet, and the other for the transaction from the Delegate.&lt;/Info&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TransactionsApi apiInstance = new TransactionsApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    TransactionRbf transactionRbf = new TransactionRbf();
    try {
      CreateTransferTransaction201Response result = apiInstance.speedupTransactionById(transactionId, transactionRbf);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#speedupTransactionById");
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
| **transactionRbf** | [**TransactionRbf**](TransactionRbf.md)| The request body to drop or to speed up transactions | [optional] |

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

