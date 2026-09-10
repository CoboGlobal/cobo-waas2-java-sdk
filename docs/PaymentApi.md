# PaymentApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchGetExchangeRates**](PaymentApi.md#batchGetExchangeRates) | **GET** /payments/exchange_rates | Batch get exchange rates |
| [**cancelRefundById**](PaymentApi.md#cancelRefundById) | **PUT** /payments/refunds/{refund_id}/cancel | Cancel refund order |
| [**createBankWithdrawal**](PaymentApi.md#createBankWithdrawal) | **POST** /payments/bank_withdrawals | Create bank withdrawal |
| [**createBatchAllocation**](PaymentApi.md#createBatchAllocation) | **POST** /payments/batch_allocations | Create batch allocation |
| [**createBulkSend**](PaymentApi.md#createBulkSend) | **POST** /payments/bulk_sends | Create bulk send |
| [**createCounterparty**](PaymentApi.md#createCounterparty) | **POST** /payments/counterparty | Create counterparty |
| [**createCounterpartyEntry**](PaymentApi.md#createCounterpartyEntry) | **POST** /payments/counterparty_entry | Create counterparty entry |
| [**createCryptoAddress**](PaymentApi.md#createCryptoAddress) | **POST** /payments/crypto_addresses | Create crypto address |
| [**createDestination**](PaymentApi.md#createDestination) | **POST** /payments/destination | Create destination |
| [**createDestinationEntry**](PaymentApi.md#createDestinationEntry) | **POST** /payments/destination_entry | Create destination entry |
| [**createForcedSweepRequest**](PaymentApi.md#createForcedSweepRequest) | **POST** /payments/force_sweep_requests | Create force sweep request |
| [**createMerchant**](PaymentApi.md#createMerchant) | **POST** /payments/merchants | Create merchant |
| [**createOrderLink**](PaymentApi.md#createOrderLink) | **POST** /payments/links/orders | Create order link |
| [**createPaymentOrder**](PaymentApi.md#createPaymentOrder) | **POST** /payments/orders | Create pay-in order |
| [**createPayout**](PaymentApi.md#createPayout) | **POST** /payments/payouts | Create payout |
| [**createRefund**](PaymentApi.md#createRefund) | **POST** /payments/refunds | Create refund order |
| [**createRefundLink**](PaymentApi.md#createRefundLink) | **POST** /payments/links/refunds | Create refund link |
| [**createReport**](PaymentApi.md#createReport) | **POST** /payments/reports | Create report |
| [**createSdkLink**](PaymentApi.md#createSdkLink) | **POST** /payments/links/sdk | Create SDK link |
| [**createSettlementRequest**](PaymentApi.md#createSettlementRequest) | **POST** /payments/settlement_requests | Create settlement request |
| [**createSubscriptionAction**](PaymentApi.md#createSubscriptionAction) | **POST** /payments/subscription_actions | Create a subscription action |
| [**createSubscriptionPlan**](PaymentApi.md#createSubscriptionPlan) | **POST** /payments/subscription_plans | Create subscription plan |
| [**createTopUpAddresses**](PaymentApi.md#createTopUpAddresses) | **POST** /payments/topup/address | Batch create top-up addresses |
| [**deleteCounterpartyById**](PaymentApi.md#deleteCounterpartyById) | **DELETE** /payments/counterparty/{counterparty_id} | Delete counterparty |
| [**deleteCounterpartyEntry**](PaymentApi.md#deleteCounterpartyEntry) | **DELETE** /payments/counterparty_entry/{counterparty_entry_id} | Delete counterparty entry |
| [**deleteCryptoAddress**](PaymentApi.md#deleteCryptoAddress) | **POST** /payments/crypto_addresses/{crypto_address_id}/delete | Delete crypto address |
| [**deleteDestinationById**](PaymentApi.md#deleteDestinationById) | **DELETE** /payments/destination/{destination_id} | Delete destination |
| [**deleteDestinationEntry**](PaymentApi.md#deleteDestinationEntry) | **DELETE** /payments/destination_entry/{destination_entry_id} | Delete destination entry |
| [**downloadReport**](PaymentApi.md#downloadReport) | **POST** /payments/reports/download | Download report |
| [**getAvailableAllocationAmount**](PaymentApi.md#getAvailableAllocationAmount) | **GET** /payments/allocation_amount | Get available allocation amount |
| [**getBankWithdrawalById**](PaymentApi.md#getBankWithdrawalById) | **GET** /payments/bank_withdrawals/{bank_withdrawal_id} | Get bank withdrawal information |
| [**getBatchAllocationById**](PaymentApi.md#getBatchAllocationById) | **GET** /payments/batch_allocations/{batch_allocation_id} | Get batch allocation by id |
| [**getBulkSendById**](PaymentApi.md#getBulkSendById) | **GET** /payments/bulk_sends/{bulk_send_id} | Get bulk send information |
| [**getCounterparty**](PaymentApi.md#getCounterparty) | **GET** /payments/counterparty/{counterparty_id} | Get counterparty information |
| [**getCounterpartyEntry**](PaymentApi.md#getCounterpartyEntry) | **GET** /payments/counterparty_entry/{counterparty_entry_id} | Get counterparty entry information |
| [**getDestination**](PaymentApi.md#getDestination) | **GET** /payments/destination/{destination_id} | Get destination information |
| [**getDestinationEntry**](PaymentApi.md#getDestinationEntry) | **GET** /payments/destination_entry/{destination_entry_id} | Get destination entry information |
| [**getExchangeRate**](PaymentApi.md#getExchangeRate) | **GET** /payments/exchange_rates/{token_id}/{currency} | Get exchange rate |
| [**getMerchantKyc**](PaymentApi.md#getMerchantKyc) | **GET** /payments/merchants/{merchant_id}/kyc | Get merchant KYC |
| [**getPaymentBankAccountBalance**](PaymentApi.md#getPaymentBankAccountBalance) | **GET** /payments/balance/bank_accounts/{bank_account_id} | Get bank account balance |
| [**getPaymentOrderDetailById**](PaymentApi.md#getPaymentOrderDetailById) | **GET** /payments/orders/{order_id} | Get pay-in order information |
| [**getPayoutById**](PaymentApi.md#getPayoutById) | **GET** /payments/payouts/{payout_id} | Get payout information |
| [**getPspBalance**](PaymentApi.md#getPspBalance) | **GET** /payments/balance/psp | Get psp balance |
| [**getRefundDetailById**](PaymentApi.md#getRefundDetailById) | **GET** /payments/refunds/{refund_id} | Get refund order information |
| [**getRefunds**](PaymentApi.md#getRefunds) | **GET** /payments/refunds | List all refund orders |
| [**getReports**](PaymentApi.md#getReports) | **GET** /payments/reports | List all reports |
| [**getSettlementById**](PaymentApi.md#getSettlementById) | **GET** /payments/settlement_requests/{settlement_request_id} | Get settlement request information |
| [**getSettlementInfoByIds**](PaymentApi.md#getSettlementInfoByIds) | **GET** /payments/settlement_info | Get withdrawable balances |
| [**getSubscriptionActionById**](PaymentApi.md#getSubscriptionActionById) | **GET** /payments/subscription_actions/{action_id} | Get subscription action by id |
| [**getSubscriptionById**](PaymentApi.md#getSubscriptionById) | **GET** /payments/subscriptions/{subscription_id} | Get subscription by id |
| [**getSubscriptionPlanById**](PaymentApi.md#getSubscriptionPlanById) | **GET** /payments/subscription_plans/{plan_id} | Get subscription plan by id |
| [**getTopUpAddress**](PaymentApi.md#getTopUpAddress) | **GET** /payments/topup/address | Get top-up address |
| [**listAllocationItems**](PaymentApi.md#listAllocationItems) | **GET** /payments/allocation_items | List all allocation items |
| [**listBalanceChanges**](PaymentApi.md#listBalanceChanges) | **GET** /payments/balance_changes | List balance changes |
| [**listBankWithdrawals**](PaymentApi.md#listBankWithdrawals) | **GET** /payments/bank_withdrawals | List bank withdrawals |
| [**listBatchAllocations**](PaymentApi.md#listBatchAllocations) | **GET** /payments/batch_allocations | List all batch allocations |
| [**listBulkSendItems**](PaymentApi.md#listBulkSendItems) | **GET** /payments/bulk_sends/{bulk_send_id}/items | List bulk send items |
| [**listBulkSends**](PaymentApi.md#listBulkSends) | **GET** /payments/bulk_sends | List bulk sends |
| [**listCounterparties**](PaymentApi.md#listCounterparties) | **GET** /payments/counterparty | List all counterparties |
| [**listCounterpartyEntries**](PaymentApi.md#listCounterpartyEntries) | **GET** /payments/counterparty_entry | List counterparty entries |
| [**listCryptoAddresses**](PaymentApi.md#listCryptoAddresses) | **GET** /payments/crypto_addresses | List crypto addresses |
| [**listDestinationEntries**](PaymentApi.md#listDestinationEntries) | **GET** /payments/destination_entry | List destination entries |
| [**listDestinations**](PaymentApi.md#listDestinations) | **GET** /payments/destination | List all destinations |
| [**listForcedSweepRequests**](PaymentApi.md#listForcedSweepRequests) | **GET** /payments/force_sweep_requests | List force sweep requests |
| [**listMerchantBalances**](PaymentApi.md#listMerchantBalances) | **GET** /payments/balance/merchants | List merchant balances |
| [**listMerchants**](PaymentApi.md#listMerchants) | **GET** /payments/merchants | List all merchants |
| [**listPayerTransactions**](PaymentApi.md#listPayerTransactions) | **GET** /payments/topup/payers/transactions | List payer transactions |
| [**listPaymentOrders**](PaymentApi.md#listPaymentOrders) | **GET** /payments/orders | List all pay-in orders |
| [**listPaymentSupportedTokens**](PaymentApi.md#listPaymentSupportedTokens) | **GET** /payments/supported_tokens | List supported tokens |
| [**listPaymentWalletBalances**](PaymentApi.md#listPaymentWalletBalances) | **GET** /payments/balance/payment_wallets | List payment wallet balances |
| [**listPayouts**](PaymentApi.md#listPayouts) | **GET** /payments/payouts | List all payouts |
| [**listSettlementDetails**](PaymentApi.md#listSettlementDetails) | **GET** /payments/settlement_details | List all settlement details |
| [**listSettlementRequests**](PaymentApi.md#listSettlementRequests) | **GET** /payments/settlement_requests | List all settlement requests |
| [**listSubscriptionActions**](PaymentApi.md#listSubscriptionActions) | **GET** /payments/subscription_actions | List subscription actions |
| [**listSubscriptionPlans**](PaymentApi.md#listSubscriptionPlans) | **GET** /payments/subscription_plans | List subscription plans |
| [**listSubscriptions**](PaymentApi.md#listSubscriptions) | **GET** /payments/subscriptions | List subscriptions |
| [**listTopUpPayerAccounts**](PaymentApi.md#listTopUpPayerAccounts) | **GET** /payments/topup/payer_accounts | List top-up payer accounts |
| [**listTopUpPayers**](PaymentApi.md#listTopUpPayers) | **GET** /payments/topup/payers | List top-up payers |
| [**paymentEstimateFee**](PaymentApi.md#paymentEstimateFee) | **POST** /payments/estimate_fee | Payment estimate fee |
| [**submitMerchantKyc**](PaymentApi.md#submitMerchantKyc) | **POST** /payments/merchants/{merchant_id}/kyc | Submit merchant KYC |
| [**triggerTestPaymentsWebhookEvent**](PaymentApi.md#triggerTestPaymentsWebhookEvent) | **POST** /payments/webhooks/trigger | Trigger test webhook event |
| [**updateCounterparty**](PaymentApi.md#updateCounterparty) | **PUT** /payments/counterparty/{counterparty_id} | Update counterparty |
| [**updateDestination**](PaymentApi.md#updateDestination) | **PUT** /payments/destination/{destination_id} | Update destination information |
| [**updateDestinationEntry**](PaymentApi.md#updateDestinationEntry) | **PUT** /payments/destination_entry/{destination_entry_id} | Update destination entry |
| [**updateMerchantById**](PaymentApi.md#updateMerchantById) | **PUT** /payments/merchants/{merchant_id} | Update merchant |
| [**updatePaymentOrder**](PaymentApi.md#updatePaymentOrder) | **PUT** /payments/orders/{order_id} | Update pay-in order |
| [**updateRefundById**](PaymentApi.md#updateRefundById) | **PUT** /payments/refunds/{refund_id} | Update refund order information |
| [**updateTopUpAddress**](PaymentApi.md#updateTopUpAddress) | **PUT** /payments/topup/address | Update top-up address |
| [**uploadPaymentFile**](PaymentApi.md#uploadPaymentFile) | **POST** /payments/files | Upload file |
| [**uploadPaymentFileV2**](PaymentApi.md#uploadPaymentFileV2) | **POST** /payments/files_v2 | Upload file v2 |


<a id="batchGetExchangeRates"></a>
# **batchGetExchangeRates**
> List&lt;ExchangeRate&gt; batchGetExchangeRates(tokenIds, currencies)

Batch get exchange rates

This operation retrieves the current exchange rates between a specified currency and a list of token IDs. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String tokenIds = "ETH_USDT,ETH_USDC,BTC_USDT";
    String currencies = "USD";
    try {
      List<ExchangeRate> result = apiInstance.batchGetExchangeRates(tokenIds, currencies);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#batchGetExchangeRates");
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
| **tokenIds** | **String**| A list of token IDs, separated by comma. The token ID is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens).  | |
| **currencies** | **String**| List of the fiat currencies, separated by comma. Currently, only &#x60;USD&#x60; is supported.  | |

### Return type

[**List&lt;ExchangeRate&gt;**](ExchangeRate.md)

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

<a id="cancelRefundById"></a>
# **cancelRefundById**
> Refund cancelRefundById(refundId)

Cancel refund order

This operation cancels a specified refund order. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String refundId = "R20250304-M1001-1001";
    try {
      Refund result = apiInstance.cancelRefundById(refundId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#cancelRefundById");
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
| **refundId** | **String**| The refund order ID. | |

### Return type

[**Refund**](Refund.md)

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

<a id="createBankWithdrawal"></a>
# **createBankWithdrawal**
> PaymentBankWithdrawal createBankWithdrawal(createBankWithdrawalRequest)

Create bank withdrawal

This operation creates a bank withdrawal from a virtual account to a target bank account. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateBankWithdrawalRequest createBankWithdrawalRequest = new CreateBankWithdrawalRequest();
    try {
      PaymentBankWithdrawal result = apiInstance.createBankWithdrawal(createBankWithdrawalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createBankWithdrawal");
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
| **createBankWithdrawalRequest** | [**CreateBankWithdrawalRequest**](CreateBankWithdrawalRequest.md)| The request body to create a bank withdrawal. | [optional] |

### Return type

[**PaymentBankWithdrawal**](PaymentBankWithdrawal.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The bank withdrawal was successfully created. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createBatchAllocation"></a>
# **createBatchAllocation**
> BatchAllocation createBatchAllocation(createBatchAllocationRequest)

Create batch allocation

This operation creates a batch allocation to withdraw available balances.   You can include multiple merchants and cryptocurrencies in a single batch allocation. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateBatchAllocationRequest createBatchAllocationRequest = new CreateBatchAllocationRequest();
    try {
      BatchAllocation result = apiInstance.createBatchAllocation(createBatchAllocationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createBatchAllocation");
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
| **createBatchAllocationRequest** | [**CreateBatchAllocationRequest**](CreateBatchAllocationRequest.md)| The request body to create a settlement request. | [optional] |

### Return type

[**BatchAllocation**](BatchAllocation.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The allocation request was successfully created. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createBulkSend"></a>
# **createBulkSend**
> PaymentBulkSend createBulkSend(createBulkSendRequest)

Create bulk send

This operation creates a bulk send to transfer funds to multiple recipients in a single request. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateBulkSendRequest createBulkSendRequest = new CreateBulkSendRequest();
    try {
      PaymentBulkSend result = apiInstance.createBulkSend(createBulkSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createBulkSend");
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
| **createBulkSendRequest** | [**CreateBulkSendRequest**](CreateBulkSendRequest.md)| The request body to create a bulk send. | [optional] |

### Return type

[**PaymentBulkSend**](PaymentBulkSend.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The bulk send was successfully created. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createCounterparty"></a>
# **createCounterparty**
> CounterpartyDetail createCounterparty(createCounterpartyRequest)

Create counterparty

This operation creates a counterparty. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateCounterpartyRequest createCounterpartyRequest = new CreateCounterpartyRequest();
    try {
      CounterpartyDetail result = apiInstance.createCounterparty(createCounterpartyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createCounterparty");
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
| **createCounterpartyRequest** | [**CreateCounterpartyRequest**](CreateCounterpartyRequest.md)| The request body to create a counterparty. | [optional] |

### Return type

[**CounterpartyDetail**](CounterpartyDetail.md)

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

<a id="createCounterpartyEntry"></a>
# **createCounterpartyEntry**
> CreateCounterpartyEntry201Response createCounterpartyEntry(createCounterpartyEntryRequest)

Create counterparty entry

This operation creates a counterparty entry. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateCounterpartyEntryRequest createCounterpartyEntryRequest = new CreateCounterpartyEntryRequest();
    try {
      CreateCounterpartyEntry201Response result = apiInstance.createCounterpartyEntry(createCounterpartyEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createCounterpartyEntry");
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
| **createCounterpartyEntryRequest** | [**CreateCounterpartyEntryRequest**](CreateCounterpartyEntryRequest.md)| The request body to create counterparty entries. | [optional] |

### Return type

[**CreateCounterpartyEntry201Response**](CreateCounterpartyEntry201Response.md)

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

<a id="createCryptoAddress"></a>
# **createCryptoAddress**
> CryptoAddress createCryptoAddress(createCryptoAddressRequest)

Create crypto address

Create a new cryptocurrency address for receiving payouts or transfers.  The address must match the specified &#x60;token_id&#x60;&#39;s blockchain.  Optionally, a label can be provided to help categorize the address internally. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateCryptoAddressRequest createCryptoAddressRequest = new CreateCryptoAddressRequest();
    try {
      CryptoAddress result = apiInstance.createCryptoAddress(createCryptoAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createCryptoAddress");
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
| **createCryptoAddressRequest** | [**CreateCryptoAddressRequest**](CreateCryptoAddressRequest.md)| The request body to create a crypto address. | [optional] |

### Return type

[**CryptoAddress**](CryptoAddress.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Crypto address created successfully. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createDestination"></a>
# **createDestination**
> DestinationDetail createDestination(createDestinationRequest)

Create destination

This operation creates a destination. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateDestinationRequest createDestinationRequest = new CreateDestinationRequest();
    try {
      DestinationDetail result = apiInstance.createDestination(createDestinationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createDestination");
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
| **createDestinationRequest** | [**CreateDestinationRequest**](CreateDestinationRequest.md)| The request body to create a destination. | [optional] |

### Return type

[**DestinationDetail**](DestinationDetail.md)

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

<a id="createDestinationEntry"></a>
# **createDestinationEntry**
> CreateDestinationEntry201Response createDestinationEntry(createDestinationEntryRequest)

Create destination entry

This operation creates a destination entry, either an address or a bank account. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateDestinationEntryRequest createDestinationEntryRequest = new CreateDestinationEntryRequest();
    try {
      CreateDestinationEntry201Response result = apiInstance.createDestinationEntry(createDestinationEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createDestinationEntry");
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
| **createDestinationEntryRequest** | [**CreateDestinationEntryRequest**](CreateDestinationEntryRequest.md)| The request body to create destination entries. | [optional] |

### Return type

[**CreateDestinationEntry201Response**](CreateDestinationEntry201Response.md)

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

<a id="createForcedSweepRequest"></a>
# **createForcedSweepRequest**
> ForcedSweep createForcedSweepRequest(forcedSweepRequest)

Create force sweep request

This operation creates a force sweep request to settle or refund available balances.  

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    ForcedSweepRequest forcedSweepRequest = new ForcedSweepRequest();
    try {
      ForcedSweep result = apiInstance.createForcedSweepRequest(forcedSweepRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createForcedSweepRequest");
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
| **forcedSweepRequest** | [**ForcedSweepRequest**](ForcedSweepRequest.md)| The request body to force sweep. | [optional] |

### Return type

[**ForcedSweep**](ForcedSweep.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Force sweep request created successfully. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createMerchant"></a>
# **createMerchant**
> Merchant createMerchant(createMerchantRequest)

Create merchant

This operation creates a merchant and links it to a specified wallet. Payments to the merchant will be deposited into the linked wallet.  Upon successful creation, a merchant ID is generated and returned along with the merchant&#39;s information. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateMerchantRequest createMerchantRequest = new CreateMerchantRequest();
    try {
      Merchant result = apiInstance.createMerchant(createMerchantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createMerchant");
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
| **createMerchantRequest** | [**CreateMerchantRequest**](CreateMerchantRequest.md)| The request body to create a merchant. | [optional] |

### Return type

[**Merchant**](Merchant.md)

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

<a id="createOrderLink"></a>
# **createOrderLink**
> Link createOrderLink(createOrderLinkRequest)

Create order link

This operation creates a payment link of a pay-in order. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateOrderLinkRequest createOrderLinkRequest = new CreateOrderLinkRequest();
    try {
      Link result = apiInstance.createOrderLink(createOrderLinkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createOrderLink");
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
| **createOrderLinkRequest** | [**CreateOrderLinkRequest**](CreateOrderLinkRequest.md)| The request body to create a payment link of a pay-in order. | [optional] |

### Return type

[**Link**](Link.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Infos of a newly initiated payment link. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createPaymentOrder"></a>
# **createPaymentOrder**
> Order createPaymentOrder(createPaymentOrderRequest)

Create pay-in order

This operation creates a pay-in order. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreatePaymentOrderRequest createPaymentOrderRequest = new CreatePaymentOrderRequest();
    try {
      Order result = apiInstance.createPaymentOrder(createPaymentOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createPaymentOrder");
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
| **createPaymentOrderRequest** | [**CreatePaymentOrderRequest**](CreatePaymentOrderRequest.md)| The request body to create a pay-in order. | [optional] |

### Return type

[**Order**](Order.md)

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

<a id="createPayout"></a>
# **createPayout**
> PaymentPayout createPayout(createPayoutRequest)

Create payout

This operation creates a payout to withdraw available balances. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreatePayoutRequest createPayoutRequest = new CreatePayoutRequest();
    try {
      PaymentPayout result = apiInstance.createPayout(createPayoutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createPayout");
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
| **createPayoutRequest** | [**CreatePayoutRequest**](CreatePayoutRequest.md)| The request body to create a payout. | [optional] |

### Return type

[**PaymentPayout**](PaymentPayout.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The create payout was successfully created. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createRefund"></a>
# **createRefund**
> Refund createRefund(createRefundRequest)

Create refund order

This operation creates a refund order to return cryptocurrency to a specified address.   When creating a refund order, you can optionally link it to an existing pay-in order for tracking and reconciliation purposes. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateRefundRequest createRefundRequest = new CreateRefundRequest();
    try {
      Refund result = apiInstance.createRefund(createRefundRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createRefund");
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
| **createRefundRequest** | [**CreateRefundRequest**](CreateRefundRequest.md)| The request body to create a refund order. | [optional] |

### Return type

[**Refund**](Refund.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Refund transaction created successfully. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createRefundLink"></a>
# **createRefundLink**
> Link createRefundLink(createRefundLinkRequest)

Create refund link

This operation creates a payment link for a refund. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateRefundLinkRequest createRefundLinkRequest = new CreateRefundLinkRequest();
    try {
      Link result = apiInstance.createRefundLink(createRefundLinkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createRefundLink");
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
| **createRefundLinkRequest** | [**CreateRefundLinkRequest**](CreateRefundLinkRequest.md)| The request body to create a payment link for a refund. | [optional] |

### Return type

[**Link**](Link.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Infos of a newly initiated payment link. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createReport"></a>
# **createReport**
> Report createReport(createReportRequest)

Create report

This operation creates reports. The response does not guarantee a download URL. To retrieve a temporary download URL for a completed report, call download report operation. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateReportRequest createReportRequest = new CreateReportRequest();
    try {
      Report result = apiInstance.createReport(createReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createReport");
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
| **createReportRequest** | [**CreateReportRequest**](CreateReportRequest.md)| The request body to create payment reports. | [optional] |

### Return type

[**Report**](Report.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Payment report created successfully. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createSdkLink"></a>
# **createSdkLink**
> Link createSdkLink()

Create SDK link

This operation creates a payment link for use with the front-end SDK integration.  The returned URL and token can be used to initialize the Cobo payment SDK in your front-end application.  For more information, see [Cobo Payment Guide](https://www.cobo.com/payments/en/guides/overview). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    try {
      Link result = apiInstance.createSdkLink();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createSdkLink");
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

[**Link**](Link.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Infos of a newly initiated payment link. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createSettlementRequest"></a>
# **createSettlementRequest**
> Settlement createSettlementRequest(createSettlementRequestRequest)

Create settlement request

&lt;Note&gt;This operation has been deprecated. Please use [Create payout](https://www.cobo.com/payments/en/api-references/payment/create-payout) instead.&lt;/Note&gt;  You can include multiple merchants and cryptocurrencies in a single settlement request. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateSettlementRequestRequest createSettlementRequestRequest = new CreateSettlementRequestRequest();
    try {
      Settlement result = apiInstance.createSettlementRequest(createSettlementRequestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createSettlementRequest");
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
| **createSettlementRequestRequest** | [**CreateSettlementRequestRequest**](CreateSettlementRequestRequest.md)| The request body to create a settlement request. | [optional] |

### Return type

[**Settlement**](Settlement.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The settlement request was successfully created. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createSubscriptionAction"></a>
# **createSubscriptionAction**
> PaymentSubscriptionAction createSubscriptionAction(paymentCreateSubscriptionAction)

Create a subscription action

This operation creates a subscription action. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    PaymentCreateSubscriptionAction paymentCreateSubscriptionAction = new PaymentCreateSubscriptionAction();
    try {
      PaymentSubscriptionAction result = apiInstance.createSubscriptionAction(paymentCreateSubscriptionAction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createSubscriptionAction");
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
| **paymentCreateSubscriptionAction** | [**PaymentCreateSubscriptionAction**](PaymentCreateSubscriptionAction.md)| The request body to create subscription action. | [optional] |

### Return type

[**PaymentSubscriptionAction**](PaymentSubscriptionAction.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request body to create subscription plan. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createSubscriptionPlan"></a>
# **createSubscriptionPlan**
> PaymentSubscriptionPlan createSubscriptionPlan(paymentCreateSubscriptionPlan)

Create subscription plan

This operation creates a subscription plan. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    PaymentCreateSubscriptionPlan paymentCreateSubscriptionPlan = new PaymentCreateSubscriptionPlan();
    try {
      PaymentSubscriptionPlan result = apiInstance.createSubscriptionPlan(paymentCreateSubscriptionPlan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createSubscriptionPlan");
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
| **paymentCreateSubscriptionPlan** | [**PaymentCreateSubscriptionPlan**](PaymentCreateSubscriptionPlan.md)| The request body to create subscription plan. | [optional] |

### Return type

[**PaymentSubscriptionPlan**](PaymentSubscriptionPlan.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request body to create subscription plan. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createTopUpAddresses"></a>
# **createTopUpAddresses**
> CreateTopUpAddresses201Response createTopUpAddresses(createTopUpAddresses)

Batch create top-up addresses

Batch create the top-up address for payer list under a specific merchant and token. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    CreateTopUpAddresses createTopUpAddresses = new CreateTopUpAddresses();
    try {
      CreateTopUpAddresses201Response result = apiInstance.createTopUpAddresses(createTopUpAddresses);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createTopUpAddresses");
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
| **createTopUpAddresses** | [**CreateTopUpAddresses**](CreateTopUpAddresses.md)| The request body of the create top-up addresses operation. | [optional] |

### Return type

[**CreateTopUpAddresses201Response**](CreateTopUpAddresses201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The information about created top-up addresses. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="deleteCounterpartyById"></a>
# **deleteCounterpartyById**
> DeleteCounterpartyById200Response deleteCounterpartyById(counterpartyId)

Delete counterparty

This operation deletes a counterparty. Note that this operation will delete all the items under the counterparty. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String counterpartyId = "5b0ed293-f728-40b4-b1f6-86b88cd51384";
    try {
      DeleteCounterpartyById200Response result = apiInstance.deleteCounterpartyById(counterpartyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#deleteCounterpartyById");
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
| **counterpartyId** | **String**| The counterparty ID. | |

### Return type

[**DeleteCounterpartyById200Response**](DeleteCounterpartyById200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="deleteCounterpartyEntry"></a>
# **deleteCounterpartyEntry**
> DeleteCounterpartyEntry200Response deleteCounterpartyEntry(counterpartyEntryId, counterpartyId, entryType)

Delete counterparty entry

This operation deletes a counterparty entry. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String counterpartyEntryId = "123e4567-e89b-12d3-a456-426614174003";
    String counterpartyId = "5b0ed293-f728-40b4-b1f6-86b88cd51384";
    EntryType entryType = EntryType.fromValue("Address");
    try {
      DeleteCounterpartyEntry200Response result = apiInstance.deleteCounterpartyEntry(counterpartyEntryId, counterpartyId, entryType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#deleteCounterpartyEntry");
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
| **counterpartyEntryId** | **String**| The counterparty entry id, eg, counterparty_wallet_address_id. | |
| **counterpartyId** | **String**| The counterparty ID. | |
| **entryType** | [**EntryType**](.md)| EntryType defines the type of the counterparty entry: - &#x60;Address&#x60;: The counterparty entry is an address. - &#x60;BankAccount&#x60;: The counterparty entry is a bank account.  | [optional] [enum: Address, BankAccount] |

### Return type

[**DeleteCounterpartyEntry200Response**](DeleteCounterpartyEntry200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="deleteCryptoAddress"></a>
# **deleteCryptoAddress**
> DeleteCryptoAddress201Response deleteCryptoAddress(cryptoAddressId)

Delete crypto address

This operation deletes a crypto address. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String cryptoAddressId = "addr_ethusdt_20250506T123456_ab12cd";
    try {
      DeleteCryptoAddress201Response result = apiInstance.deleteCryptoAddress(cryptoAddressId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#deleteCryptoAddress");
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
| **cryptoAddressId** | **String**| The crypto address ID. | |

### Return type

[**DeleteCryptoAddress201Response**](DeleteCryptoAddress201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="deleteDestinationById"></a>
# **deleteDestinationById**
> DeleteDestinationById200Response deleteDestinationById(destinationId)

Delete destination

This operation deletes a destination. Note that this operation will delete all the items under the destination, including bank accounts and addresses. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String destinationId = "46beeab4-6a8e-476e-bc69-99b89aacbc6f";
    try {
      DeleteDestinationById200Response result = apiInstance.deleteDestinationById(destinationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#deleteDestinationById");
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
| **destinationId** | **String**| The destination ID. | |

### Return type

[**DeleteDestinationById200Response**](DeleteDestinationById200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="deleteDestinationEntry"></a>
# **deleteDestinationEntry**
> DeleteDestinationEntry200Response deleteDestinationEntry(destinationEntryId, destinationId, entryType)

Delete destination entry

This operation deletes a destination entry. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String destinationEntryId = "123e4567-e89b-12d3-a456-426614174003";
    String destinationId = "46beeab4-6a8e-476e-bc69-99b89aacbc6f";
    EntryType entryType = EntryType.fromValue("Address");
    try {
      DeleteDestinationEntry200Response result = apiInstance.deleteDestinationEntry(destinationEntryId, destinationId, entryType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#deleteDestinationEntry");
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
| **destinationEntryId** | **String**| The destination entry id, eg, destination_wallet_address_id or destination_bank_account_id. | |
| **destinationId** | **String**| The destination ID. | |
| **entryType** | [**EntryType**](.md)| EntryType defines the type of the counterparty entry: - &#x60;Address&#x60;: The counterparty entry is an address. - &#x60;BankAccount&#x60;: The counterparty entry is a bank account.  | [enum: Address, BankAccount] |

### Return type

[**DeleteDestinationEntry200Response**](DeleteDestinationEntry200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="downloadReport"></a>
# **downloadReport**
> ReportDownloadResponse downloadReport(downloadReportRequest)

Download report

This operation retrieves a temporary download URL for a completed payment report. Endpoint: &#x60;POST https://api.dev.cobo.com/v2/payments/reports/download&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    DownloadReportRequest downloadReportRequest = new DownloadReportRequest();
    try {
      ReportDownloadResponse result = apiInstance.downloadReport(downloadReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#downloadReport");
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
| **downloadReportRequest** | [**DownloadReportRequest**](DownloadReportRequest.md)| The request body to download a payment report. | |

### Return type

[**ReportDownloadResponse**](ReportDownloadResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment report download URL retrieved successfully. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getAvailableAllocationAmount"></a>
# **getAvailableAllocationAmount**
> PaymentAllocationAmount getAvailableAllocationAmount(tokenId, sourceAccount, destinationAccount)

Get available allocation amount

This operation retrieves the information of available allocation amount. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String tokenId = "ETH_USDT";
    String sourceAccount = "sourceAccount_example";
    String destinationAccount = "destinationAccount_example";
    try {
      PaymentAllocationAmount result = apiInstance.getAvailableAllocationAmount(tokenId, sourceAccount, destinationAccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getAvailableAllocationAmount");
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
| **tokenId** | **String**| The token ID, which identifies the cryptocurrency. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  | |
| **sourceAccount** | **String**|  | |
| **destinationAccount** | **String**|  | |

### Return type

[**PaymentAllocationAmount**](PaymentAllocationAmount.md)

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

<a id="getBankWithdrawalById"></a>
# **getBankWithdrawalById**
> PaymentBankWithdrawalDetail getBankWithdrawalById(bankWithdrawalId)

Get bank withdrawal information

This operation retrieves the information of a specific bank withdrawal. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String bankWithdrawalId = "123e4567-e89b-12d3-a456-426614174000";
    try {
      PaymentBankWithdrawalDetail result = apiInstance.getBankWithdrawalById(bankWithdrawalId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getBankWithdrawalById");
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
| **bankWithdrawalId** | **String**| The bank withdrawal ID. | |

### Return type

[**PaymentBankWithdrawalDetail**](PaymentBankWithdrawalDetail.md)

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

<a id="getBatchAllocationById"></a>
# **getBatchAllocationById**
> BatchAllocationDetail getBatchAllocationById(batchAllocationId)

Get batch allocation by id

This operation retrieves the information of a batch allocation. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String batchAllocationId = "5b0ed293-f728-40b4-b1f6-86b88cd51384";
    try {
      BatchAllocationDetail result = apiInstance.getBatchAllocationById(batchAllocationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getBatchAllocationById");
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
| **batchAllocationId** | **String**| The batch allocation ID. | |

### Return type

[**BatchAllocationDetail**](BatchAllocationDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The details of a batch allocation detail. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getBulkSendById"></a>
# **getBulkSendById**
> PaymentBulkSend getBulkSendById(bulkSendId)

Get bulk send information

This operation retrieves the information of a specific bulk send. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String bulkSendId = "123e4567-e89b-12d3-a456-426614174003";
    try {
      PaymentBulkSend result = apiInstance.getBulkSendById(bulkSendId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getBulkSendById");
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
| **bulkSendId** | **String**| The bulk send ID. | |

### Return type

[**PaymentBulkSend**](PaymentBulkSend.md)

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

<a id="getCounterparty"></a>
# **getCounterparty**
> CounterpartyDetail getCounterparty(counterpartyId)

Get counterparty information

This operation retrieves the detailed information about a specified counterparty. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String counterpartyId = "5b0ed293-f728-40b4-b1f6-86b88cd51384";
    try {
      CounterpartyDetail result = apiInstance.getCounterparty(counterpartyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getCounterparty");
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
| **counterpartyId** | **String**| The counterparty ID. | |

### Return type

[**CounterpartyDetail**](CounterpartyDetail.md)

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

<a id="getCounterpartyEntry"></a>
# **getCounterpartyEntry**
> GetCounterpartyEntry200Response getCounterpartyEntry(counterpartyEntryId, entryType)

Get counterparty entry information

This operation retrieves the detailed information about a specified counterparty entry. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String counterpartyEntryId = "123e4567-e89b-12d3-a456-426614174003";
    EntryType entryType = EntryType.fromValue("Address");
    try {
      GetCounterpartyEntry200Response result = apiInstance.getCounterpartyEntry(counterpartyEntryId, entryType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getCounterpartyEntry");
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
| **counterpartyEntryId** | **String**| The counterparty entry id, eg, counterparty_wallet_address_id. | |
| **entryType** | [**EntryType**](.md)| EntryType defines the type of the counterparty entry: - &#x60;Address&#x60;: The counterparty entry is an address. - &#x60;BankAccount&#x60;: The counterparty entry is a bank account.  | [optional] [enum: Address, BankAccount] |

### Return type

[**GetCounterpartyEntry200Response**](GetCounterpartyEntry200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="getDestination"></a>
# **getDestination**
> DestinationDetail getDestination(destinationId)

Get destination information

This operation retrieves the detailed information about a specified destination. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String destinationId = "46beeab4-6a8e-476e-bc69-99b89aacbc6f";
    try {
      DestinationDetail result = apiInstance.getDestination(destinationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getDestination");
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
| **destinationId** | **String**| The destination ID. | |

### Return type

[**DestinationDetail**](DestinationDetail.md)

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

<a id="getDestinationEntry"></a>
# **getDestinationEntry**
> GetDestinationEntry200Response getDestinationEntry(destinationEntryId, entryType)

Get destination entry information

This operation retrieves the detailed information about a specified destination entry. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String destinationEntryId = "123e4567-e89b-12d3-a456-426614174003";
    EntryType entryType = EntryType.fromValue("Address");
    try {
      GetDestinationEntry200Response result = apiInstance.getDestinationEntry(destinationEntryId, entryType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getDestinationEntry");
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
| **destinationEntryId** | **String**| The destination entry id, eg, destination_wallet_address_id or destination_bank_account_id. | |
| **entryType** | [**EntryType**](.md)| EntryType defines the type of the counterparty entry: - &#x60;Address&#x60;: The counterparty entry is an address. - &#x60;BankAccount&#x60;: The counterparty entry is a bank account.  | [enum: Address, BankAccount] |

### Return type

[**GetDestinationEntry200Response**](GetDestinationEntry200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="getExchangeRate"></a>
# **getExchangeRate**
> GetExchangeRate200Response getExchangeRate(tokenId, currency)

Get exchange rate

This operation retrieves the current exchange rate between a specified currency pair. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String tokenId = "ETH_USDT";
    String currency = "USD";
    try {
      GetExchangeRate200Response result = apiInstance.getExchangeRate(tokenId, currency);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getExchangeRate");
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
| **tokenId** | **String**| The token ID, which identifies the cryptocurrency. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  | |
| **currency** | **String**| The fiat currency. Currently, only &#x60;USD&#x60; is supported. | [default to USD] |

### Return type

[**GetExchangeRate200Response**](GetExchangeRate200Response.md)

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

<a id="getMerchantKyc"></a>
# **getMerchantKyc**
> MerchantKycSubmission getMerchantKyc(merchantId)

Get merchant KYC

This operation retrieves the KYC submission for a specified merchant.  The merchant ID can be retrieved by calling [List all merchants](https://www.cobo.com/developers/v2/api-references/payment/list-all-merchants). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String merchantId = "M1001";
    try {
      MerchantKycSubmission result = apiInstance.getMerchantKyc(merchantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getMerchantKyc");
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
| **merchantId** | **String**| The merchant ID. | |

### Return type

[**MerchantKycSubmission**](MerchantKycSubmission.md)

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

<a id="getPaymentBankAccountBalance"></a>
# **getPaymentBankAccountBalance**
> PaymentBankAccountBalance getPaymentBankAccountBalance(bankAccountId)

Get bank account balance

This operation retrieves the balance of a destination bank account, only available for bank accounts with tag &#x60;VA&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    UUID bankAccountId = UUID.fromString("123e4567-e89b-12d3-a456-426614174003");
    try {
      PaymentBankAccountBalance result = apiInstance.getPaymentBankAccountBalance(bankAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getPaymentBankAccountBalance");
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
| **bankAccountId** | **UUID**| The destination bank account ID. | |

### Return type

[**PaymentBankAccountBalance**](PaymentBankAccountBalance.md)

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

<a id="getPaymentOrderDetailById"></a>
# **getPaymentOrderDetailById**
> Order getPaymentOrderDetailById(orderId)

Get pay-in order information

This operation retrieves details of a specific pay-in order. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String orderId = "O20250304-M1001-1001";
    try {
      Order result = apiInstance.getPaymentOrderDetailById(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getPaymentOrderDetailById");
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
| **orderId** | **String**| The pay-in order ID. | |

### Return type

[**Order**](Order.md)

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

<a id="getPayoutById"></a>
# **getPayoutById**
> PaymentPayoutDetail getPayoutById(payoutId)

Get payout information

This operation retrieves the information of a specific payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String payoutId = "aff0e1cb-15b2-4e1f-9b9d-a9133715986f";
    try {
      PaymentPayoutDetail result = apiInstance.getPayoutById(payoutId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getPayoutById");
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

[**PaymentPayoutDetail**](PaymentPayoutDetail.md)

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

<a id="getPspBalance"></a>
# **getPspBalance**
> PspBalance getPspBalance(tokenId)

Get psp balance

This operation retrieves the information of psp balance. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String tokenId = "ETH_USDT";
    try {
      PspBalance result = apiInstance.getPspBalance(tokenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getPspBalance");
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
| **tokenId** | **String**| The token ID, which identifies the cryptocurrency. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  | |

### Return type

[**PspBalance**](PspBalance.md)

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

<a id="getRefundDetailById"></a>
# **getRefundDetailById**
> Refund getRefundDetailById(refundId)

Get refund order information

This operation retrieves the detailed information about a specified refund order. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String refundId = "R20250304-M1001-1001";
    try {
      Refund result = apiInstance.getRefundDetailById(refundId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getRefundDetailById");
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
| **refundId** | **String**| The refund order ID. | |

### Return type

[**Refund**](Refund.md)

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

<a id="getRefunds"></a>
# **getRefunds**
> GetRefunds200Response getRefunds(limit, before, after, merchantId, requestId, statuses)

List all refund orders

This operation retrieves the information of all refund orders. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String merchantId = "M1001";
    String requestId = "random_request_id";
    String statuses = "Pending,Processing";
    try {
      GetRefunds200Response result = apiInstance.getRefunds(limit, before, after, merchantId, requestId, statuses);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getRefunds");
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
| **merchantId** | **String**| The merchant ID. | [optional] |
| **requestId** | **String**| The request ID. | [optional] |
| **statuses** | **String**| A list of  statuses of order, refund or settle request. | [optional] |

### Return type

[**GetRefunds200Response**](GetRefunds200Response.md)

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

<a id="getReports"></a>
# **getReports**
> GetReports200Response getReports(limit, before, after, reportType, reportStatus)

List all reports

This operation retrieves the information of all reports. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    ReportType reportType = ReportType.fromValue("Order");
    ReportStatus reportStatus = ReportStatus.fromValue("Processing");
    try {
      GetReports200Response result = apiInstance.getReports(limit, before, after, reportType, reportStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getReports");
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
| **reportType** | [**ReportType**](.md)| ReportType defines the type of the report: - &#x60;Order&#x60;: Summary of all merchants&#39; order. - &#x60;OrderTransaction&#x60;: Transaction summary of all merchants&#39; orders. - &#x60;TopUpTransaction&#x60;: Transaction summary of all top ups. - &#x60;PayinWeeklyStatement&#x60;: Weekly report of all payins (including order-in and top up). - &#x60;PayinDailyStatement&#x60;: Daily report of all payins (including order-in and top up). - &#x60;CryptoPayout&#x60;: Transaction summary of all crypto settlements. - &#x60;OffRamp&#x60;: Transaction summary of all off ramp settlements. - &#x60;Refund&#x60;: Transaction summary of all refunds. - &#x60;PayoutWeeklyStatement&#x60;: Weekly report of all payouts (including crypto settlements, off ramp settlements and refund). - &#x60;PayoutDailyStatement&#x60;: Daily report of all payouts (including crypto settlements, off ramp settlements and refund). - &#x60;PayinCommissionFee&#x60;: Commission fee summary of all payins. - &#x60;PayoutCommissionFee&#x60;: Commission fee summary of all payouts. - &#x60;BalanceChange&#x60;: Balance change summary of all merchants. - &#x60;Summary&#x60;: Summary of all payins, payouts and commission fees.  | [optional] [enum: Order, OrderTransaction, TopUpTransaction, PayinWeeklyStatement, PayinDailyStatement, CryptoPayout, OffRamp, Refund, PayoutWeeklyStatement, PayoutDailyStatement, PayinCommissionFee, PayoutCommissionFee, BalanceChange, Summary, BulkSend] |
| **reportStatus** | [**ReportStatus**](.md)| ReportStatus defines the status of the report: - &#x60;Completed&#x60;: The report has been completed. - &#x60;Failed&#x60;: The report has failed. - &#x60;Expired&#x60;: The report is expired.  | [optional] [enum: Processing, Completed, Failed] |

### Return type

[**GetReports200Response**](GetReports200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of payment reports. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getSettlementById"></a>
# **getSettlementById**
> Settlement getSettlementById(settlementRequestId)

Get settlement request information

&lt;Note&gt;This operation has been deprecated. Please use [Get payout information](https://www.cobo.com/payments/en/api-references/payment/get-payout-detail) instead.&lt;/Note&gt;  This operation retrieves the information of a specific settlement request. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String settlementRequestId = "S20250304-1001";
    try {
      Settlement result = apiInstance.getSettlementById(settlementRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getSettlementById");
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
| **settlementRequestId** | **String**| The settlement request ID. | |

### Return type

[**Settlement**](Settlement.md)

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

<a id="getSettlementInfoByIds"></a>
# **getSettlementInfoByIds**
> GetSettlementInfoByIds200Response getSettlementInfoByIds(merchantIds, currency, acquiringType)

Get withdrawable balances

This operation retrieves the current withdrawable balances of specified merchants or the developer. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String merchantIds = "M1001,M1002,M1003";
    String currency = "USD";
    AcquiringType acquiringType = AcquiringType.fromValue("Order");
    try {
      GetSettlementInfoByIds200Response result = apiInstance.getSettlementInfoByIds(merchantIds, currency, acquiringType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getSettlementInfoByIds");
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
| **merchantIds** | **String**| A list of merchant IDs to query. | [optional] |
| **currency** | **String**| The currency for the operation. Currently, only &#x60;USD&#x60; is supported. | [optional] [default to USD] |
| **acquiringType** | [**AcquiringType**](.md)| AcquiringType defines the acquisition logic used in the payment flow: - &#x60;Order&#x60;: Each order is created with a specific amount and associated payment request. Funds are settled on a per-order basis. - &#x60;TopUp&#x60;: Recharge-style flow where funds are topped up to a payer balance or account. Useful for flexible or usage-based payment models.  | [optional] [enum: Order, TopUp, Subscription] |

### Return type

[**GetSettlementInfoByIds200Response**](GetSettlementInfoByIds200Response.md)

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

<a id="getSubscriptionActionById"></a>
# **getSubscriptionActionById**
> PaymentSubscriptionActionDetail getSubscriptionActionById(actionId)

Get subscription action by id

This operation retrieves the information of subscription plan detail. You can filter the result by action_id. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String actionId = "123e457-e89b-12d3-a456-426614174004";
    try {
      PaymentSubscriptionActionDetail result = apiInstance.getSubscriptionActionById(actionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getSubscriptionActionById");
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
| **actionId** | **String**| A unique identifier subscription action. | |

### Return type

[**PaymentSubscriptionActionDetail**](PaymentSubscriptionActionDetail.md)

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

<a id="getSubscriptionById"></a>
# **getSubscriptionById**
> PaymentSubscriptionDetail getSubscriptionById(subscriptionId)

Get subscription by id

This operation retrieves the information of subscription detail. You can filter the result by subscription_id. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String subscriptionId = "123e457-e89b-12d3-a456-426614174004";
    try {
      PaymentSubscriptionDetail result = apiInstance.getSubscriptionById(subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getSubscriptionById");
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
| **subscriptionId** | **String**| A unique identifier subscription. | |

### Return type

[**PaymentSubscriptionDetail**](PaymentSubscriptionDetail.md)

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

<a id="getSubscriptionPlanById"></a>
# **getSubscriptionPlanById**
> PaymentSubscriptionPlanDetail getSubscriptionPlanById(planId, tokenId)

Get subscription plan by id

This operation retrieves the information of subscription plan detail. You can filter the result by subscription_id. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String planId = "123e457-e89b-12d3-a456-426614174004";
    String tokenId = "ETH_USDT";
    try {
      PaymentSubscriptionPlanDetail result = apiInstance.getSubscriptionPlanById(planId, tokenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getSubscriptionPlanById");
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
| **planId** | **String**| A unique identifier subscription. | |
| **tokenId** | **String**| The token ID, which identifies the cryptocurrency. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  | |

### Return type

[**PaymentSubscriptionPlanDetail**](PaymentSubscriptionPlanDetail.md)

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

<a id="getTopUpAddress"></a>
# **getTopUpAddress**
> TopUpAddress getTopUpAddress(tokenId, customPayerId, merchantId)

Get top-up address

Get a top-up address for certain payer under merchant. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String tokenId = "ETH_USDT";
    String customPayerId = "payer_0001";
    String merchantId = "M1001";
    try {
      TopUpAddress result = apiInstance.getTopUpAddress(tokenId, customPayerId, merchantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getTopUpAddress");
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
| **tokenId** | **String**| The token ID, which identifies the cryptocurrency. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  | |
| **customPayerId** | **String**| Unique customer identifier on the merchant side, used to allocate a dedicated top-up address  | |
| **merchantId** | **String**| The merchant ID. | [optional] |

### Return type

[**TopUpAddress**](TopUpAddress.md)

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

<a id="listAllocationItems"></a>
# **listAllocationItems**
> ListAllocationItems200Response listAllocationItems(limit, before, after, sourceAccount, destinationAccount, tokenId, batchAllocationId)

List all allocation items

This operation retrieves the information of all allocations. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String sourceAccount = "sourceAccount_example";
    String destinationAccount = "destinationAccount_example";
    String tokenId = "ETH_USDT";
    String batchAllocationId = "5b0ed293-f728-40b4-b1f6-86b88cd51384";
    try {
      ListAllocationItems200Response result = apiInstance.listAllocationItems(limit, before, after, sourceAccount, destinationAccount, tokenId, batchAllocationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listAllocationItems");
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
| **sourceAccount** | **String**|  | [optional] |
| **destinationAccount** | **String**|  | [optional] |
| **tokenId** | **String**| The token ID, which identifies the cryptocurrency. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  | [optional] |
| **batchAllocationId** | **String**| The batch allocation ID. | [optional] |

### Return type

[**ListAllocationItems200Response**](ListAllocationItems200Response.md)

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

<a id="listBalanceChanges"></a>
# **listBalanceChanges**
> PaymentBalanceChangeResponse listBalanceChanges(sourceAccount, limit, before, after, tokenId, flowDirection, minCreatedTimestamp, maxCreatedTimestamp, sourceType, sourceId)

List balance changes

This operation retrieves balance changes for the specified source account. Each balance change includes the source information, token ID, changed amount, account balances before and after the change, flow direction, and creation time.  You need to specify &#x60;source_account&#x60;. Currently, use &#x60;developer&#x60; as the source account. You can use pagination parameters to control the response size, and filter balance changes by &#x60;token_id&#x60;, &#x60;flow_direction&#x60;, &#x60;min_created_timestamp&#x60;, &#x60;max_created_timestamp&#x60;, &#x60;source_type&#x60;, or &#x60;source_id&#x60;.  &lt;Note&gt;When specifying &#x60;source_id&#x60;, you must also specify &#x60;source_type&#x60;.&lt;/Note&gt;  For more information, see [Cobo Payments Guide](https://www.cobo.com/payments/en/guides/overview). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String sourceAccount = "developer";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String tokenId = "ETH_USDT";
    PaymentBalanceFlowDirection flowDirection = PaymentBalanceFlowDirection.fromValue("in");
    Long minCreatedTimestamp = 1744689600L;
    Long maxCreatedTimestamp = 1744776000L;
    PaymentBalanceChangeSourceType sourceType = PaymentBalanceChangeSourceType.fromValue("Init");
    String sourceId = "po_1234567890";
    try {
      PaymentBalanceChangeResponse result = apiInstance.listBalanceChanges(sourceAccount, limit, before, after, tokenId, flowDirection, minCreatedTimestamp, maxCreatedTimestamp, sourceType, sourceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listBalanceChanges");
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
| **sourceAccount** | **String**| The source account for which to retrieve balance changes. Currently, use &#x60;developer&#x60;. | |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |
| **tokenId** | **String**| The token ID used to filter balance changes. For a complete list of supported tokens, see [Cobo Payments Guide](https://www.cobo.com/payments/en/guides/overview).  | [optional] |
| **flowDirection** | [**PaymentBalanceFlowDirection**](.md)| The direction of the balance change relative to the source account. Possible values include: - &#x60;in&#x60;: Funds flow into the source account. - &#x60;out&#x60;: Funds flow out of the source account.  | [optional] [enum: in, out] |
| **minCreatedTimestamp** | **Long**| The minimum creation time of balance changes, represented as a UNIX timestamp in seconds. Balance changes created on or after this time are returned. | [optional] |
| **maxCreatedTimestamp** | **Long**| The maximum creation time of balance changes, represented as a UNIX timestamp in seconds. Balance changes created on or before this time are returned. | [optional] |
| **sourceType** | [**PaymentBalanceChangeSourceType**](.md)| The source type used to filter balance changes. Possible values include: - &#x60;Init&#x60;: Balance change caused by initialization. - &#x60;OrderIn&#x60;: Balance change from an order-in payment. - &#x60;LatePayment&#x60;: Balance change from a late payment. - &#x60;TopUp&#x60;: Balance change from a top-up. - &#x60;UnexceptedIn&#x60;: Balance change from an unexpected incoming payment. - &#x60;RefundOut&#x60;: Balance change from a refund payout. - &#x60;Payout&#x60;: Balance change from a payout. - &#x60;UnexceptedOut&#x60;: Balance change from an unexpected outgoing payment. - &#x60;Allocation&#x60;: Balance change from an allocation. - &#x60;SettlementNetwork&#x60;: Balance change from the settlement network. - &#x60;BulkSend&#x60;: Balance change from a bulk send.  &lt;Note&gt;When specifying &#x60;source_id&#x60;, you must also specify &#x60;source_type&#x60;.&lt;/Note&gt;  | [optional] [enum: Init, OrderIn, LatePayment, TopUp, UnexceptedIn, RefundOut, Payout, UnexceptedOut, Allocation, SettlementNetwork, BulkSend] |
| **sourceId** | **String**| The source ID used to filter balance changes.  &lt;Note&gt;When specifying &#x60;source_id&#x60;, you must also specify &#x60;source_type&#x60;.&lt;/Note&gt;  | [optional] |

### Return type

[**PaymentBalanceChangeResponse**](PaymentBalanceChangeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. The response contains balance changes and pagination information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listBankWithdrawals"></a>
# **listBankWithdrawals**
> ListBankWithdrawals200Response listBankWithdrawals(limit, before, after, requestId, status)

List bank withdrawals

This operation retrieves the list of bank withdrawals. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String requestId = "random_request_id";
    PaymentBankWithdrawalStatus status = PaymentBankWithdrawalStatus.fromValue("Pending");
    try {
      ListBankWithdrawals200Response result = apiInstance.listBankWithdrawals(limit, before, after, requestId, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listBankWithdrawals");
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
| **requestId** | **String**| The request ID. | [optional] |
| **status** | [**PaymentBankWithdrawalStatus**](.md)| Filter by bank withdrawal status. | [optional] [enum: Pending, Processing, Completed, Failed] |

### Return type

[**ListBankWithdrawals200Response**](ListBankWithdrawals200Response.md)

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

<a id="listBatchAllocations"></a>
# **listBatchAllocations**
> ListBatchAllocations200Response listBatchAllocations(limit, before, after, requestId)

List all batch allocations

This operation retrieves the information of all batch allocations. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String requestId = "random_request_id";
    try {
      ListBatchAllocations200Response result = apiInstance.listBatchAllocations(limit, before, after, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listBatchAllocations");
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
| **requestId** | **String**| The request ID. | [optional] |

### Return type

[**ListBatchAllocations200Response**](ListBatchAllocations200Response.md)

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

<a id="listBulkSendItems"></a>
# **listBulkSendItems**
> ListBulkSendItems200Response listBulkSendItems(bulkSendId, limit, before, after)

List bulk send items

This operation retrieves the list of items for a specific bulk send. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String bulkSendId = "123e4567-e89b-12d3-a456-426614174003";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListBulkSendItems200Response result = apiInstance.listBulkSendItems(bulkSendId, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listBulkSendItems");
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
| **bulkSendId** | **String**| The bulk send ID. | |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListBulkSendItems200Response**](ListBulkSendItems200Response.md)

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

<a id="listBulkSends"></a>
# **listBulkSends**
> ListBulkSends200Response listBulkSends(limit, before, after, requestId)

List bulk sends

This operation retrieves the list of bulk sends. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String requestId = "random_request_id";
    try {
      ListBulkSends200Response result = apiInstance.listBulkSends(limit, before, after, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listBulkSends");
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
| **requestId** | **String**| The request ID. | [optional] |

### Return type

[**ListBulkSends200Response**](ListBulkSends200Response.md)

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

<a id="listCounterparties"></a>
# **listCounterparties**
> ListCounterparties200Response listCounterparties(limit, before, after, keyword, counterpartyType, country)

List all counterparties

This operation retrieves the information of all counterparties.   You can filter the results by using a keyword for fuzzy search on counterparty names. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String keyword = "keyword";
    CounterpartyType counterpartyType = CounterpartyType.fromValue("Individual");
    String country = "USA";
    try {
      ListCounterparties200Response result = apiInstance.listCounterparties(limit, before, after, keyword, counterpartyType, country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listCounterparties");
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
| **keyword** | **String**| A search term used for fuzzy matching of merchant names. | [optional] |
| **counterpartyType** | [**CounterpartyType**](.md)| CounterpartyType defines the type of the counterparty: - &#x60;Individual&#x60;: The counterparty is an individual. - &#x60;Organization&#x60;: The counterparty is an organization.  | [optional] [enum: Individual, Organization] |
| **country** | **String**| The country of the destination, in ISO 3166-1 alpha-3 format. | [optional] |

### Return type

[**ListCounterparties200Response**](ListCounterparties200Response.md)

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

<a id="listCounterpartyEntries"></a>
# **listCounterpartyEntries**
> ListCounterpartyEntries200Response listCounterpartyEntries(limit, before, after, entryType, counterpartyId, chainIds, walletAddress)

List counterparty entries

This operation retrieves the information of counterparty entries. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    EntryType entryType = EntryType.fromValue("Address");
    String counterpartyId = "5b0ed293-f728-40b4-b1f6-86b88cd51384";
    String chainIds = "BTC,ETH";
    String walletAddress = "0x1234567890abcdef...";
    try {
      ListCounterpartyEntries200Response result = apiInstance.listCounterpartyEntries(limit, before, after, entryType, counterpartyId, chainIds, walletAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listCounterpartyEntries");
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
| **entryType** | [**EntryType**](.md)| EntryType defines the type of the counterparty entry: - &#x60;Address&#x60;: The counterparty entry is an address. - &#x60;BankAccount&#x60;: The counterparty entry is a bank account.  | [optional] [enum: Address, BankAccount] |
| **counterpartyId** | **String**| The counterparty ID. | [optional] |
| **chainIds** | **String**| The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). | [optional] |
| **walletAddress** | **String**| The wallet address. | [optional] |

### Return type

[**ListCounterpartyEntries200Response**](ListCounterpartyEntries200Response.md)

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

<a id="listCryptoAddresses"></a>
# **listCryptoAddresses**
> List&lt;CryptoAddress&gt; listCryptoAddresses(tokenId)

List crypto addresses

Retrieve a list of cryptocurrency addresses previously created for a given &#x60;token_id&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String tokenId = "ETH_USDT";
    try {
      List<CryptoAddress> result = apiInstance.listCryptoAddresses(tokenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listCryptoAddresses");
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
| **tokenId** | **String**| The token ID, which identifies the cryptocurrency. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  | [optional] |

### Return type

[**List&lt;CryptoAddress&gt;**](CryptoAddress.md)

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

<a id="listDestinationEntries"></a>
# **listDestinationEntries**
> ListDestinationEntries200Response listDestinationEntries(entryType, limit, before, after, destinationId, chainIds, walletAddress, keyword, bankAccountStatus, bankAccountTag)

List destination entries

This operation retrieves the information of destination entries. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    EntryType entryType = EntryType.fromValue("Address");
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String destinationId = "46beeab4-6a8e-476e-bc69-99b89aacbc6f";
    String chainIds = "BTC,ETH";
    String walletAddress = "0x1234567890abcdef...";
    String keyword = "keyword";
    BankAccountStatus bankAccountStatus = BankAccountStatus.fromValue("Pending");
    DestinationBankAccountTag bankAccountTag = DestinationBankAccountTag.fromValue("VA");
    try {
      ListDestinationEntries200Response result = apiInstance.listDestinationEntries(entryType, limit, before, after, destinationId, chainIds, walletAddress, keyword, bankAccountStatus, bankAccountTag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listDestinationEntries");
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
| **entryType** | [**EntryType**](.md)| EntryType defines the type of the counterparty entry: - &#x60;Address&#x60;: The counterparty entry is an address. - &#x60;BankAccount&#x60;: The counterparty entry is a bank account.  | [enum: Address, BankAccount] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |
| **destinationId** | **String**| The destination ID. | [optional] |
| **chainIds** | **String**| The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). | [optional] |
| **walletAddress** | **String**| The wallet address. | [optional] |
| **keyword** | **String**| A search term used for fuzzy matching of merchant names. | [optional] |
| **bankAccountStatus** | [**BankAccountStatus**](.md)| BankAccountStatus defines the status of the bank account: - &#x60;Pending&#x60;: The bank account is pending verification by Cobo. - &#x60;Approved&#x60;: The bank account has been approved by Cobo. - &#x60;Rejected&#x60;: The bank account has been rejected by Cobo.  | [optional] [enum: Pending, Approved, Rejected] |
| **bankAccountTag** | [**DestinationBankAccountTag**](.md)| Filter destination bank accounts by tag.  | [optional] [enum: VA] |

### Return type

[**ListDestinationEntries200Response**](ListDestinationEntries200Response.md)

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

<a id="listDestinations"></a>
# **listDestinations**
> ListDestinations200Response listDestinations(limit, before, after, keyword, destinationType, country, merchantIds)

List all destinations

This operation retrieves the information of all destinations.   You can filter the results by using a keyword for fuzzy search on destination names. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String keyword = "keyword";
    DestinationType destinationType = DestinationType.fromValue("Individual");
    String country = "USA";
    String merchantIds = "M1001,M1002,M1003";
    try {
      ListDestinations200Response result = apiInstance.listDestinations(limit, before, after, keyword, destinationType, country, merchantIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listDestinations");
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
| **keyword** | **String**| A search term used for fuzzy matching of merchant names. | [optional] |
| **destinationType** | [**DestinationType**](.md)| DestinationType defines the type of the destination: - &#x60;Individual&#x60;: The destination is an individual. - &#x60;Organization&#x60;: The destination is an organization.  | [optional] [enum: Individual, Organization] |
| **country** | **String**| The country of the destination, in ISO 3166-1 alpha-3 format. | [optional] |
| **merchantIds** | **String**| A list of merchant IDs to query. | [optional] |

### Return type

[**ListDestinations200Response**](ListDestinations200Response.md)

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

<a id="listForcedSweepRequests"></a>
# **listForcedSweepRequests**
> ListForcedSweepRequests200Response listForcedSweepRequests(limit, before, after, requestId)

List force sweep requests

This operation retrieves the information of force_sweep requests. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String requestId = "random_request_id";
    try {
      ListForcedSweepRequests200Response result = apiInstance.listForcedSweepRequests(limit, before, after, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listForcedSweepRequests");
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
| **requestId** | **String**| The request ID. | [optional] |

### Return type

[**ListForcedSweepRequests200Response**](ListForcedSweepRequests200Response.md)

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

<a id="listMerchantBalances"></a>
# **listMerchantBalances**
> ListMerchantBalances200Response listMerchantBalances(merchantIds, tokenId, acquiringType)

List merchant balances

This operation retrieves merchant balance information.  You need to specify at least one of &#x60;merchant_ids&#x60; or &#x60;token_id&#x60; to filter the results.  &lt;Note&gt;Do not pass &#x60;acquiring_type&#x60; for this operation.&lt;/Note&gt;  For more information, refer to [Cobo Payments Guide](https://www.cobo.com/payments/en/guides/overview). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String merchantIds = "M1001,M1002,M1003";
    String tokenId = "ETH_USDT";
    AcquiringType acquiringType = AcquiringType.fromValue("Order");
    try {
      ListMerchantBalances200Response result = apiInstance.listMerchantBalances(merchantIds, tokenId, acquiringType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listMerchantBalances");
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
| **merchantIds** | **String**| The comma-separated list of merchant IDs to filter by.  At least one of &#x60;merchant_ids&#x60; or &#x60;token_id&#x60; must be provided.  For more information about merchants, refer to [Cobo Payments Guide](https://www.cobo.com/payments/en/guides/overview).  | [optional] |
| **tokenId** | **String**| The token ID that identifies the cryptocurrency.  At least one of &#x60;merchant_ids&#x60; or &#x60;token_id&#x60; must be provided.  For a complete list of supported tokens, refer to [Cobo Payments Guide](https://www.cobo.com/payments/en/guides/overview).  | [optional] |
| **acquiringType** | [**AcquiringType**](.md)| This parameter has been deprecated | [optional] [enum: Order, TopUp, Subscription] |

### Return type

[**ListMerchantBalances200Response**](ListMerchantBalances200Response.md)

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

<a id="listMerchants"></a>
# **listMerchants**
> ListMerchants200Response listMerchants(limit, before, after, keyword, walletId, walletSetup)

List all merchants

This operation retrieves the information of all merchants.   You can filter the results by using a keyword for fuzzy search on merchant names or by specifying a wallet ID. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String keyword = "keyword";
    UUID walletId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    WalletSetup walletSetup = WalletSetup.fromValue("Default");
    try {
      ListMerchants200Response result = apiInstance.listMerchants(limit, before, after, keyword, walletId, walletSetup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listMerchants");
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
| **keyword** | **String**| A search term used for fuzzy matching of merchant names. | [optional] |
| **walletId** | **UUID**| The wallet ID. | [optional] |
| **walletSetup** | [**WalletSetup**](.md)| WalletSetup defines the type of funds used in the merchant account, either \&quot;Shared\&quot; or \&quot;Separate\&quot; is allowed when creating a merchant: - &#x60;Default&#x60;: Wallet of psp owned default merchant. - &#x60;Shared&#x60;: Shared wallet of non-psp owned merchants. - &#x60;Separate&#x60;: Separate wallet of non-psp owned merchants.  | [optional] [enum: Default, Shared, Separate] |

### Return type

[**ListMerchants200Response**](ListMerchants200Response.md)

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

<a id="listPayerTransactions"></a>
# **listPayerTransactions**
> ListPayerTransactions200Response listPayerTransactions(customPayerId, limit, before, after, merchantId, tokenId, transactionHashes, transactionIds)

List payer transactions

This operation retrieves on-chain transactions related to a specific top-up payer.  You need to specify &#x60;custom_payer_id&#x60;, which is the merchant-defined customer identifier used when creating top-up addresses.  &lt;Note&gt;This operation is applicable to the top-up scenario only.&lt;/Note&gt;  For more information, see [Cobo Payments Guide](https://www.cobo.com/payments/en/guides/overview). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String customPayerId = "payer_0001";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String merchantId = "M1001";
    String tokenId = "ETH_USDT";
    String transactionHashes = "239861be9a4afe080c359b7fe4a1d035945ec46256b1a0f44d1267c71de8ec28";
    String transactionIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,557918d2-632a-4fe1-932f-315711f05fe3";
    try {
      ListPayerTransactions200Response result = apiInstance.listPayerTransactions(customPayerId, limit, before, after, merchantId, tokenId, transactionHashes, transactionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listPayerTransactions");
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
| **customPayerId** | **String**| Unique customer identifier on the merchant side, used to allocate a dedicated top-up address  | |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |
| **merchantId** | **String**| The merchant ID. | [optional] |
| **tokenId** | **String**| The token ID, which identifies the cryptocurrency. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  | [optional] |
| **transactionHashes** | **String**| A list of transaction hashes, separated by comma. | [optional] |
| **transactionIds** | **String**| A list of transaction IDs, separated by comma. | [optional] |

### Return type

[**ListPayerTransactions200Response**](ListPayerTransactions200Response.md)

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

<a id="listPaymentOrders"></a>
# **listPaymentOrders**
> ListPaymentOrders200Response listPaymentOrders(limit, before, after, merchantId, pspOrderId, statuses)

List all pay-in orders

This operation retrieves the information of all pay-in orders. You can filter the result by merchant ID. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String merchantId = "M1001";
    String pspOrderId = "P20240201001";
    String statuses = "Pending,Processing";
    try {
      ListPaymentOrders200Response result = apiInstance.listPaymentOrders(limit, before, after, merchantId, pspOrderId, statuses);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listPaymentOrders");
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
| **merchantId** | **String**| The merchant ID. | [optional] |
| **pspOrderId** | **String**| The PSP order ID. | [optional] |
| **statuses** | **String**| A list of  statuses of order, refund or settle request. | [optional] |

### Return type

[**ListPaymentOrders200Response**](ListPaymentOrders200Response.md)

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

<a id="listPaymentSupportedTokens"></a>
# **listPaymentSupportedTokens**
> List&lt;SupportedToken&gt; listPaymentSupportedTokens()

List supported tokens

This operation retrieves all tokens supported by Cobo Payments.  Use this operation to get token details such as token ID, symbol, decimal precision, contract address, chain information, confirmation threshold, and deposit threshold before creating payment orders.  For more information about Cobo Payments, see [Cobo Payments Overview](https://www.cobo.com/payments/en/guides/overview). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    try {
      List<SupportedToken> result = apiInstance.listPaymentSupportedTokens();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listPaymentSupportedTokens");
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

[**List&lt;SupportedToken&gt;**](SupportedToken.md)

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

<a id="listPaymentWalletBalances"></a>
# **listPaymentWalletBalances**
> ListPaymentWalletBalances200Response listPaymentWalletBalances(tokenId, walletIds)

List payment wallet balances

This operation retrieves the information of payment wallet balances. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String tokenId = "ETH_USDT";
    String walletIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,f47ac10b-58cc-4372-a567-0e02b2c3d472";
    try {
      ListPaymentWalletBalances200Response result = apiInstance.listPaymentWalletBalances(tokenId, walletIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listPaymentWalletBalances");
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
| **tokenId** | **String**| The token ID, which identifies the cryptocurrency. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  | |
| **walletIds** | **String**| A list of wallet IDs to query. | [optional] |

### Return type

[**ListPaymentWalletBalances200Response**](ListPaymentWalletBalances200Response.md)

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

<a id="listPayouts"></a>
# **listPayouts**
> ListPayouts200Response listPayouts(limit, before, after, requestId)

List all payouts

This operation retrieves the information of all payouts. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String requestId = "random_request_id";
    try {
      ListPayouts200Response result = apiInstance.listPayouts(limit, before, after, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listPayouts");
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
| **requestId** | **String**| The request ID. | [optional] |

### Return type

[**ListPayouts200Response**](ListPayouts200Response.md)

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

<a id="listSettlementDetails"></a>
# **listSettlementDetails**
> ListSettlementDetails200Response listSettlementDetails(limit, before, after, merchantId, statuses)

List all settlement details

&lt;Note&gt;This operation has been deprecated.  This operation retrieves the information of all settlement details. You can filter the result by merchant ID or status. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String merchantId = "M1001";
    String statuses = "Pending,Processing";
    try {
      ListSettlementDetails200Response result = apiInstance.listSettlementDetails(limit, before, after, merchantId, statuses);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listSettlementDetails");
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
| **merchantId** | **String**| The merchant ID. | [optional] |
| **statuses** | **String**| A list of  statuses of order, refund or settle request. | [optional] |

### Return type

[**ListSettlementDetails200Response**](ListSettlementDetails200Response.md)

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

<a id="listSettlementRequests"></a>
# **listSettlementRequests**
> ListSettlementRequests200Response listSettlementRequests(limit, before, after, requestId)

List all settlement requests

&lt;Note&gt;This operation has been deprecated. Please use [List payout](https://www.cobo.com/payments/en/api-references/payment/list-all-payouts) instead.&lt;/Note&gt;  This operation retrieves the information of all settlement requests. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String requestId = "random_request_id";
    try {
      ListSettlementRequests200Response result = apiInstance.listSettlementRequests(limit, before, after, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listSettlementRequests");
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
| **requestId** | **String**| The request ID. | [optional] |

### Return type

[**ListSettlementRequests200Response**](ListSettlementRequests200Response.md)

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

<a id="listSubscriptionActions"></a>
# **listSubscriptionActions**
> ListSubscriptionActions200Response listSubscriptionActions(limit, before, after, planId, merchantId, subscriptionId, requestId, actionType)

List subscription actions

This operation retrieves the information of subscription actions. You can filter the result by plan id. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String planId = "123e457-e89b-12d3-a456-426614174004";
    String merchantId = "M1001";
    String subscriptionId = "123e457-e89b-12d3-a456-426614174004";
    String requestId = "random_request_id";
    PaymentSubscriptionActionType actionType = PaymentSubscriptionActionType.fromValue("Create");
    try {
      ListSubscriptionActions200Response result = apiInstance.listSubscriptionActions(limit, before, after, planId, merchantId, subscriptionId, requestId, actionType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listSubscriptionActions");
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
| **planId** | **String**| A unique identifier plan. | [optional] |
| **merchantId** | **String**| The merchant ID. | [optional] |
| **subscriptionId** | **String**| A unique identifier subscription. | [optional] |
| **requestId** | **String**| The request ID. | [optional] |
| **actionType** | [**PaymentSubscriptionActionType**](.md)|  | [optional] [enum: Create, Approve, Subscribe, SubscribeAndCharge, Charge, Cancel, DeveloperPause, DeveloperUnpause, ExtendPeriod, Upgrade, Downgrade, UpdateTokenId] |

### Return type

[**ListSubscriptionActions200Response**](ListSubscriptionActions200Response.md)

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

<a id="listSubscriptionPlans"></a>
# **listSubscriptionPlans**
> ListSubscriptionPlans200Response listSubscriptionPlans(limit, before, after, developerPlanId)

List subscription plans

This operation retrieves the information of subscription plans. You can filter the result by developer plan id. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String developerPlanId = "123e457-e89b-12d3-a456-426614174004";
    try {
      ListSubscriptionPlans200Response result = apiInstance.listSubscriptionPlans(limit, before, after, developerPlanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listSubscriptionPlans");
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
| **developerPlanId** | **String**| A unique identifier assigned by the developer to track and identify individual subscription plan in their system. | [optional] |

### Return type

[**ListSubscriptionPlans200Response**](ListSubscriptionPlans200Response.md)

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

<a id="listSubscriptions"></a>
# **listSubscriptions**
> ListSubscriptions200Response listSubscriptions(limit, before, after, planId, merchantId, actionId)

List subscriptions

This operation retrieves the information of subscriptions. You can filter the result by plan id. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String planId = "123e457-e89b-12d3-a456-426614174004";
    String merchantId = "M1001";
    String actionId = "123e457-e89b-12d3-a456-426614174004";
    try {
      ListSubscriptions200Response result = apiInstance.listSubscriptions(limit, before, after, planId, merchantId, actionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listSubscriptions");
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
| **planId** | **String**| A unique identifier plan. | [optional] |
| **merchantId** | **String**| The merchant ID. | [optional] |
| **actionId** | **String**| A unique identifier subscription action. | [optional] |

### Return type

[**ListSubscriptions200Response**](ListSubscriptions200Response.md)

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

<a id="listTopUpPayerAccounts"></a>
# **listTopUpPayerAccounts**
> ListTopUpPayerAccounts200Response listTopUpPayerAccounts(limit, before, after, merchantId, payerId)

List top-up payer accounts

This operation retrieves the accounts of all payers. You can filter the result by merchant ID and payer_id. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String merchantId = "M1001";
    String payerId = "P20250619T0310056d7aa";
    try {
      ListTopUpPayerAccounts200Response result = apiInstance.listTopUpPayerAccounts(limit, before, after, merchantId, payerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listTopUpPayerAccounts");
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
| **merchantId** | **String**| The merchant ID. | [optional] |
| **payerId** | **String**| Unique payer identifier on the Cobo side, auto-generated by the system. | [optional] |

### Return type

[**ListTopUpPayerAccounts200Response**](ListTopUpPayerAccounts200Response.md)

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

<a id="listTopUpPayers"></a>
# **listTopUpPayers**
> ListTopUpPayers200Response listTopUpPayers(limit, before, after, merchantId, payerId)

List top-up payers

This operation retrieves the information of all payers. You can filter the result by merchant ID and payer_id.  &lt;Note&gt;The &#x60;transactions&#x60; field in the response returns up to the latest 200 transactions only. This field will be removed in a future version. To paginate through payer transactions, use [List payer transactions](https://www.cobo.com/payments/en/guides/overview).&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String merchantId = "M1001";
    String payerId = "P20250619T0310056d7aa";
    try {
      ListTopUpPayers200Response result = apiInstance.listTopUpPayers(limit, before, after, merchantId, payerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listTopUpPayers");
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
| **merchantId** | **String**| The merchant ID. | [optional] |
| **payerId** | **String**| Unique payer identifier on the Cobo side, auto-generated by the system. | [optional] |

### Return type

[**ListTopUpPayers200Response**](ListTopUpPayers200Response.md)

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

<a id="paymentEstimateFee"></a>
# **paymentEstimateFee**
> PaymentEstimateFee201Response paymentEstimateFee(paymentEstimateFeeRequest)

Payment estimate fee

This operation to payment estimate fee. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    PaymentEstimateFeeRequest paymentEstimateFeeRequest = new PaymentEstimateFeeRequest();
    try {
      PaymentEstimateFee201Response result = apiInstance.paymentEstimateFee(paymentEstimateFeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#paymentEstimateFee");
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
| **paymentEstimateFeeRequest** | [**PaymentEstimateFeeRequest**](PaymentEstimateFeeRequest.md)| The request body to create a estimated fee request. | [optional] |

### Return type

[**PaymentEstimateFee201Response**](PaymentEstimateFee201Response.md)

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

<a id="submitMerchantKyc"></a>
# **submitMerchantKyc**
> MerchantKycInfo submitMerchantKyc(merchantId, submitMerchantKyc)

Submit merchant KYC

This operation submits KYC information for a specified merchant.  You need to provide the merchant type, country, and industry. Provide either &#x60;company_info&#x60; or &#x60;individual_info&#x60;: - &#x60;company_info&#x60;: Required for company merchants. - &#x60;individual_info&#x60;: Required for individual merchants.  The merchant ID can be retrieved by calling [List all merchants](https://www.cobo.com/developers/v2/api-references/payment/list-all-merchants).  &lt;Note&gt;If the merchant KYC status is &#x60;Disabled&#x60;, this operation cannot be used to resubmit KYC information.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String merchantId = "M1001";
    SubmitMerchantKyc submitMerchantKyc = new SubmitMerchantKyc();
    try {
      MerchantKycInfo result = apiInstance.submitMerchantKyc(merchantId, submitMerchantKyc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#submitMerchantKyc");
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
| **merchantId** | **String**| The merchant ID. | |
| **submitMerchantKyc** | [**SubmitMerchantKyc**](SubmitMerchantKyc.md)| The request body to submit merchant KYC information.  Provide either &#x60;company_info&#x60; or &#x60;individual_info&#x60;: - &#x60;company_info&#x60;: Required for company merchants. - &#x60;individual_info&#x60;: Required for individual merchants.  | [optional] |

### Return type

[**MerchantKycInfo**](MerchantKycInfo.md)

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

<a id="triggerTestPaymentsWebhookEvent"></a>
# **triggerTestPaymentsWebhookEvent**
> TriggerTestPaymentWebhookEventResponse triggerTestPaymentsWebhookEvent(triggerTestPaymentsWebhookEventRequest)

Trigger test webhook event

This operation tests the functionality of your Payments webhook endpoint by triggering a test webhook event. The test event is sent to all endpoints you have registered on Cobo Portal.  You need to specify the event type. By default, the payload contains dummy data with no impact on your real business transactions or activities. You can optionally provide the &#x60;override_data&#x60; property to customize the payload.  For more information about Payments webhooks, see [Cobo Payments Guide](https://www.cobo.com/payments/en/guides/overview). For webhook event types and payload structure, refer to [List all webhook events](https://www.cobo.com/developers/v2/api-references/developers--webhooks/list-all-webhook-events). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    TriggerTestPaymentsWebhookEventRequest triggerTestPaymentsWebhookEventRequest = new TriggerTestPaymentsWebhookEventRequest();
    try {
      TriggerTestPaymentWebhookEventResponse result = apiInstance.triggerTestPaymentsWebhookEvent(triggerTestPaymentsWebhookEventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#triggerTestPaymentsWebhookEvent");
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
| **triggerTestPaymentsWebhookEventRequest** | [**TriggerTestPaymentsWebhookEventRequest**](TriggerTestPaymentsWebhookEventRequest.md)| The request body used to trigger a test Payments webhook event.  You need to specify the event type. You can optionally include the &#x60;override_data&#x60; property to customize the payload. The provided fields must match the webhook event data structure for the specified event type.  | [optional] |

### Return type

[**TriggerTestPaymentWebhookEventResponse**](TriggerTestPaymentWebhookEventResponse.md)

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

<a id="updateCounterparty"></a>
# **updateCounterparty**
> Counterparty updateCounterparty(counterpartyId, updateCounterpartyRequest)

Update counterparty

This operation updates the information of a specified counterparty. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String counterpartyId = "5b0ed293-f728-40b4-b1f6-86b88cd51384";
    UpdateCounterpartyRequest updateCounterpartyRequest = new UpdateCounterpartyRequest();
    try {
      Counterparty result = apiInstance.updateCounterparty(counterpartyId, updateCounterpartyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#updateCounterparty");
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
| **counterpartyId** | **String**| The counterparty ID. | |
| **updateCounterpartyRequest** | [**UpdateCounterpartyRequest**](UpdateCounterpartyRequest.md)| The request body to update a counterparty. | [optional] |

### Return type

[**Counterparty**](Counterparty.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateDestination"></a>
# **updateDestination**
> Destination updateDestination(destinationId, updateDestinationRequest)

Update destination information

This operation updates the information of a specified destination. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String destinationId = "46beeab4-6a8e-476e-bc69-99b89aacbc6f";
    UpdateDestinationRequest updateDestinationRequest = new UpdateDestinationRequest();
    try {
      Destination result = apiInstance.updateDestination(destinationId, updateDestinationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#updateDestination");
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
| **destinationId** | **String**| The destination ID. | |
| **updateDestinationRequest** | [**UpdateDestinationRequest**](UpdateDestinationRequest.md)| The request body to update a destination. | [optional] |

### Return type

[**Destination**](Destination.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateDestinationEntry"></a>
# **updateDestinationEntry**
> UpdateDestinationEntry200Response updateDestinationEntry(destinationEntryId, updateDestinationEntryRequest)

Update destination entry

This operation updates the information of a specified destination entry. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String destinationEntryId = "123e4567-e89b-12d3-a456-426614174003";
    UpdateDestinationEntryRequest updateDestinationEntryRequest = new UpdateDestinationEntryRequest();
    try {
      UpdateDestinationEntry200Response result = apiInstance.updateDestinationEntry(destinationEntryId, updateDestinationEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#updateDestinationEntry");
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
| **destinationEntryId** | **String**| The destination entry id, eg, destination_wallet_address_id or destination_bank_account_id. | |
| **updateDestinationEntryRequest** | [**UpdateDestinationEntryRequest**](UpdateDestinationEntryRequest.md)| The request body to update a destination entry. | [optional] |

### Return type

[**UpdateDestinationEntry200Response**](UpdateDestinationEntry200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateMerchantById"></a>
# **updateMerchantById**
> Merchant updateMerchantById(merchantId, updateMerchantByIdRequest)

Update merchant

This operation updates the information of an existing merchant. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String merchantId = "M1001";
    UpdateMerchantByIdRequest updateMerchantByIdRequest = new UpdateMerchantByIdRequest();
    try {
      Merchant result = apiInstance.updateMerchantById(merchantId, updateMerchantByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#updateMerchantById");
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
| **merchantId** | **String**| The merchant ID. | |
| **updateMerchantByIdRequest** | [**UpdateMerchantByIdRequest**](UpdateMerchantByIdRequest.md)| The request body to update a merchant. | [optional] |

### Return type

[**Merchant**](Merchant.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updatePaymentOrder"></a>
# **updatePaymentOrder**
> Order updatePaymentOrder(orderId, updatePaymentOrderRequest)

Update pay-in order

This operation updates a pay-in order. Use this operation to expire a pay-in order that is no longer needed. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String orderId = "O20250304-M1001-1001";
    UpdatePaymentOrderRequest updatePaymentOrderRequest = new UpdatePaymentOrderRequest();
    try {
      Order result = apiInstance.updatePaymentOrder(orderId, updatePaymentOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#updatePaymentOrder");
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
| **orderId** | **String**| The pay-in order ID. | |
| **updatePaymentOrderRequest** | [**UpdatePaymentOrderRequest**](UpdatePaymentOrderRequest.md)| The request body to update a pay-in order. | [optional] |

### Return type

[**Order**](Order.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateRefundById"></a>
# **updateRefundById**
> Refund updateRefundById(refundId, updateRefundByIdRequest)

Update refund order information

This operation updates a specified refund order. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    String refundId = "R20250304-M1001-1001";
    UpdateRefundByIdRequest updateRefundByIdRequest = new UpdateRefundByIdRequest();
    try {
      Refund result = apiInstance.updateRefundById(refundId, updateRefundByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#updateRefundById");
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
| **refundId** | **String**| The refund order ID. | |
| **updateRefundByIdRequest** | [**UpdateRefundByIdRequest**](UpdateRefundByIdRequest.md)| The request body to update a refund order. | [optional] |

### Return type

[**Refund**](Refund.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateTopUpAddress"></a>
# **updateTopUpAddress**
> TopUpAddress updateTopUpAddress(updateTopUpAddress)

Update top-up address

Update the top-up address for a payer under a specific merchant and token. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    UpdateTopUpAddress updateTopUpAddress = new UpdateTopUpAddress();
    try {
      TopUpAddress result = apiInstance.updateTopUpAddress(updateTopUpAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#updateTopUpAddress");
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
| **updateTopUpAddress** | [**UpdateTopUpAddress**](UpdateTopUpAddress.md)| The request body to update top up address. | [optional] |

### Return type

[**TopUpAddress**](TopUpAddress.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Top-up address updated successfully. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="uploadPaymentFile"></a>
# **uploadPaymentFile**
> PaymentUploadedFile uploadPaymentFile(_file)

Upload file

&lt;Note&gt;This operation has been deprecated. Please use [Upload file v2](https://www.cobo.com/developers/v2/api-references/payment/upload-file-v2) instead.&lt;/Note&gt;  This operation uploads a file for payment-related use cases, such as merchant KYC attachments.  You need to specify the file to upload. After a successful upload, use the returned AWS file link in &#x60;file_id&#x60; when calling [Submit merchant KYC](https://www.cobo.com/developers/v2/api-references/payment/submit-merchant-kyc). The returned file link expires at the time specified by &#x60;expired_timestamp&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    File _file = new File("/path/to/file");
    try {
      PaymentUploadedFile result = apiInstance.uploadPaymentFile(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#uploadPaymentFile");
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
| **_file** | **File**| The file to upload. | |

### Return type

[**PaymentUploadedFile**](PaymentUploadedFile.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="uploadPaymentFileV2"></a>
# **uploadPaymentFileV2**
> PaymentUploadedFile uploadPaymentFileV2(paymentUploadFileV2)

Upload file v2

This operation uploads a file for payment-related use cases, such as merchant KYC attachments.  You need to encode the file content in Base64 and include it in the JSON request body together with the original file name. After a successful upload, use the returned AWS file link in &#x60;file_id&#x60; when calling [Submit merchant KYC](https://www.cobo.com/developers/v2/api-references/payment/submit-merchant-kyc). The returned file link expires at the time specified by &#x60;expired_timestamp&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PaymentApi apiInstance = new PaymentApi();
    PaymentUploadFileV2 paymentUploadFileV2 = new PaymentUploadFileV2();
    try {
      PaymentUploadedFile result = apiInstance.uploadPaymentFileV2(paymentUploadFileV2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#uploadPaymentFileV2");
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
| **paymentUploadFileV2** | [**PaymentUploadFileV2**](PaymentUploadFileV2.md)| The request body to upload a file. | [optional] |

### Return type

[**PaymentUploadedFile**](PaymentUploadedFile.md)

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

