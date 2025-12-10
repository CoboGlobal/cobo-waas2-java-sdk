# PaymentApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchGetExchangeRates**](PaymentApi.md#batchGetExchangeRates) | **GET** /payments/exchange_rates | Batch get exchange rates |
| [**cancelRefundById**](PaymentApi.md#cancelRefundById) | **PUT** /payments/refunds/{refund_id}/cancel | Cancel refund order |
| [**createBankAccount**](PaymentApi.md#createBankAccount) | **POST** /payments/bank_accounts | Create bank account |
| [**createBatchAllocation**](PaymentApi.md#createBatchAllocation) | **POST** /payments/batch_allocations | Create batch allocation |
| [**createCounterparty**](PaymentApi.md#createCounterparty) | **POST** /payments/counterparty | Create counterparty |
| [**createCounterpartyWalletAddress**](PaymentApi.md#createCounterpartyWalletAddress) | **POST** /payments/counterparty/wallet_address | Create counterparty wallet address |
| [**createCryptoAddress**](PaymentApi.md#createCryptoAddress) | **POST** /payments/crypto_addresses | Create crypto address |
| [**createDestination**](PaymentApi.md#createDestination) | **POST** /payments/destination | Create destination |
| [**createDestinationBankAccount**](PaymentApi.md#createDestinationBankAccount) | **POST** /payments/destination/bank_account | Create destination bank account |
| [**createDestinationWalletAddress**](PaymentApi.md#createDestinationWalletAddress) | **POST** /payments/destination/wallet_address | Create destination wallet address |
| [**createForcedSweepRequest**](PaymentApi.md#createForcedSweepRequest) | **POST** /payments/force_sweep_requests | Create force sweep request |
| [**createMerchant**](PaymentApi.md#createMerchant) | **POST** /payments/merchants | Create merchant |
| [**createOrderLink**](PaymentApi.md#createOrderLink) | **POST** /payments/links/orders | Create order link |
| [**createPaymentOrder**](PaymentApi.md#createPaymentOrder) | **POST** /payments/orders | Create pay-in order |
| [**createPayout**](PaymentApi.md#createPayout) | **POST** /payments/payouts | Create payout |
| [**createRefund**](PaymentApi.md#createRefund) | **POST** /payments/refunds | Create refund order |
| [**createRefundLink**](PaymentApi.md#createRefundLink) | **POST** /payments/links/refunds | Create refund link |
| [**createReport**](PaymentApi.md#createReport) | **POST** /payments/reports | Create report |
| [**createSettlementRequest**](PaymentApi.md#createSettlementRequest) | **POST** /payments/settlement_requests | Create settlement request |
| [**createSubscriptionAction**](PaymentApi.md#createSubscriptionAction) | **POST** /payments/subscription_actions | Create a subscription action |
| [**createSubscriptionPlan**](PaymentApi.md#createSubscriptionPlan) | **POST** /payments/subscription_plans | Create subscription plan |
| [**deleteCounterparty**](PaymentApi.md#deleteCounterparty) | **PUT** /payments/counterparty/{counterparty_id}/delete | Delete counterparty |
| [**deleteCounterpartyWalletAddress**](PaymentApi.md#deleteCounterpartyWalletAddress) | **PUT** /payments/counterparty/wallet_address/{wallet_address_id}/delete | Delete counterparty wallet address |
| [**deleteCryptoAddress**](PaymentApi.md#deleteCryptoAddress) | **POST** /payments/crypto_addresses/{crypto_address_id}/delete | Delete crypto address |
| [**deleteDestination**](PaymentApi.md#deleteDestination) | **PUT** /payments/destination/{destination_id}/delete | Delete destination |
| [**deleteDestinationBankAccount**](PaymentApi.md#deleteDestinationBankAccount) | **PUT** /payments/destination/bank_account/{bank_account_id}/delete | Delete destination bank account |
| [**deleteDestinationWalletAddress**](PaymentApi.md#deleteDestinationWalletAddress) | **PUT** /payments/destination/wallet_address/{wallet_address_id}/delete | Delete destination wallet address |
| [**enableDestinationWhitelist**](PaymentApi.md#enableDestinationWhitelist) | **POST** /payments/destination/enable_whitelist | Enable or disable destination whitelist |
| [**getAvailableAllocationAmount**](PaymentApi.md#getAvailableAllocationAmount) | **GET** /payments/allocation_amount | Get available allocation amount |
| [**getBatchAllocationById**](PaymentApi.md#getBatchAllocationById) | **GET** /payments/batch_allocations/{batch_allocation_id} | Get batch allocation by id |
| [**getCounterpartyDetailById**](PaymentApi.md#getCounterpartyDetailById) | **GET** /payments/counterparty/{counterparty_id}/detail | Get counterparty information |
| [**getDestinationBankAccountDetailById**](PaymentApi.md#getDestinationBankAccountDetailById) | **GET** /payments/destination/bank_account/{bank_account_id}/detail | Get destination bank account information |
| [**getDestinationDetailById**](PaymentApi.md#getDestinationDetailById) | **GET** /payments/destination/{destination_id}/detail | Get destination information |
| [**getExchangeRate**](PaymentApi.md#getExchangeRate) | **GET** /payments/exchange_rates/{token_id}/{currency} | Get exchange rate |
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
| [**listAllocations**](PaymentApi.md#listAllocations) | **GET** /payments/allocation_records | List all allocations |
| [**listBankAccounts**](PaymentApi.md#listBankAccounts) | **GET** /payments/bank_accounts | List all bank accounts |
| [**listBatchAllocations**](PaymentApi.md#listBatchAllocations) | **GET** /payments/batch_allocations | List all batch allocations |
| [**listCounterparties**](PaymentApi.md#listCounterparties) | **GET** /payments/counterparty | List all counterparties |
| [**listCounterpartyWalletAddress**](PaymentApi.md#listCounterpartyWalletAddress) | **GET** /payments/counterparty/wallet_address | List counterparty wallet addresses |
| [**listCryptoAddresses**](PaymentApi.md#listCryptoAddresses) | **GET** /payments/crypto_addresses | List crypto addresses |
| [**listDestinationBankAccounts**](PaymentApi.md#listDestinationBankAccounts) | **GET** /payments/destination/bank_account | List destination bank accounts |
| [**listDestinationWalletAddresses**](PaymentApi.md#listDestinationWalletAddresses) | **GET** /payments/destination/wallet_address | List destination wallet addresses |
| [**listDestinations**](PaymentApi.md#listDestinations) | **GET** /payments/destination | List all destinations |
| [**listForcedSweepRequests**](PaymentApi.md#listForcedSweepRequests) | **GET** /payments/force_sweep_requests | List force sweep requests |
| [**listMerchantBalances**](PaymentApi.md#listMerchantBalances) | **GET** /payments/balance/merchants | List merchant balances |
| [**listMerchants**](PaymentApi.md#listMerchants) | **GET** /payments/merchants | List all merchants |
| [**listPaymentOrders**](PaymentApi.md#listPaymentOrders) | **GET** /payments/orders | List all pay-in orders |
| [**listPaymentSupportedTokens**](PaymentApi.md#listPaymentSupportedTokens) | **GET** /payments/supported_tokens | List all supported tokens |
| [**listPaymentWalletBalances**](PaymentApi.md#listPaymentWalletBalances) | **GET** /payments/balance/payment_wallets | List payment wallet balances |
| [**listPayoutItems**](PaymentApi.md#listPayoutItems) | **GET** /payments/payout_items | List all payout items |
| [**listPayouts**](PaymentApi.md#listPayouts) | **GET** /payments/payouts | List all payouts |
| [**listSettlementDetails**](PaymentApi.md#listSettlementDetails) | **GET** /payments/settlement_details | List all settlement details |
| [**listSettlementRequests**](PaymentApi.md#listSettlementRequests) | **GET** /payments/settlement_requests | List all settlement requests |
| [**listSubscriptionActions**](PaymentApi.md#listSubscriptionActions) | **GET** /payments/subscription_actions | List subscription actions |
| [**listSubscriptionPlans**](PaymentApi.md#listSubscriptionPlans) | **GET** /payments/subscription_plans | List subscription plans |
| [**listSubscriptions**](PaymentApi.md#listSubscriptions) | **GET** /payments/subscriptions | List subscriptions |
| [**listTopUpPayerAccounts**](PaymentApi.md#listTopUpPayerAccounts) | **GET** /payments/topup/payer_accounts | List top-up payer accounts |
| [**listTopUpPayers**](PaymentApi.md#listTopUpPayers) | **GET** /payments/topup/payers | List top-up payers |
| [**paymentEstimateFee**](PaymentApi.md#paymentEstimateFee) | **POST** /payments/estimate_fee | Payment estimate fee |
| [**queryDestinationWhitelistEnabled**](PaymentApi.md#queryDestinationWhitelistEnabled) | **GET** /payments/destination/enable_whitelist | Query destination whitelist enabled status |
| [**updateBankAccountById**](PaymentApi.md#updateBankAccountById) | **PUT** /payments/bank_accounts/{bank_account_id} | Update bank account |
| [**updateCounterpartyById**](PaymentApi.md#updateCounterpartyById) | **PUT** /payments/counterparty/{counterparty_id}/update | Update counterparty |
| [**updateDestinationBankAccountById**](PaymentApi.md#updateDestinationBankAccountById) | **PUT** /payments/destination/bank_account/{bank_account_id}/update | Update destination bank account |
| [**updateDestinationById**](PaymentApi.md#updateDestinationById) | **PUT** /payments/destination/{destination_id}/update | Update destination |
| [**updateMerchantById**](PaymentApi.md#updateMerchantById) | **PUT** /payments/merchants/{merchant_id} | Update merchant |
| [**updatePaymentOrder**](PaymentApi.md#updatePaymentOrder) | **PUT** /payments/orders/{order_id} | Update pay-in order |
| [**updateRefundById**](PaymentApi.md#updateRefundById) | **PUT** /payments/refunds/{refund_id} | Update refund order information |
| [**updateTopUpAddress**](PaymentApi.md#updateTopUpAddress) | **PUT** /payments/topup/address | Update top-up address |


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

<a id="createBankAccount"></a>
# **createBankAccount**
> BankAccount createBankAccount(createBankAccountRequest)

Create bank account

This operation registers a bank account for payment settlement.  Upon successful registration, the bank account details can be retrieved using the assigned bank account ID. 

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
    CreateBankAccountRequest createBankAccountRequest = new CreateBankAccountRequest();
    try {
      BankAccount result = apiInstance.createBankAccount(createBankAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createBankAccount");
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
| **createBankAccountRequest** | [**CreateBankAccountRequest**](CreateBankAccountRequest.md)| The request body to register a bank account. | [optional] |

### Return type

[**BankAccount**](BankAccount.md)

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

<a id="createCounterpartyWalletAddress"></a>
# **createCounterpartyWalletAddress**
> WalletAddress createCounterpartyWalletAddress(createCounterpartyWalletAddressRequest)

Create counterparty wallet address

This operation creates a counterparty wallet address. 

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
    CreateCounterpartyWalletAddressRequest createCounterpartyWalletAddressRequest = new CreateCounterpartyWalletAddressRequest();
    try {
      WalletAddress result = apiInstance.createCounterpartyWalletAddress(createCounterpartyWalletAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createCounterpartyWalletAddress");
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
| **createCounterpartyWalletAddressRequest** | [**CreateCounterpartyWalletAddressRequest**](CreateCounterpartyWalletAddressRequest.md)| The request body to create a counterparty wallet address. | [optional] |

### Return type

[**WalletAddress**](WalletAddress.md)

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

<a id="createDestinationBankAccount"></a>
# **createDestinationBankAccount**
> DestinationBankAccount createDestinationBankAccount(createDestinationBankAccountRequest)

Create destination bank account

This operation creates a destination bank account. 

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
    CreateDestinationBankAccountRequest createDestinationBankAccountRequest = new CreateDestinationBankAccountRequest();
    try {
      DestinationBankAccount result = apiInstance.createDestinationBankAccount(createDestinationBankAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createDestinationBankAccount");
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
| **createDestinationBankAccountRequest** | [**CreateDestinationBankAccountRequest**](CreateDestinationBankAccountRequest.md)| The request body to create a destination bank account. | [optional] |

### Return type

[**DestinationBankAccount**](DestinationBankAccount.md)

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

<a id="createDestinationWalletAddress"></a>
# **createDestinationWalletAddress**
> WalletAddress createDestinationWalletAddress(createDestinationWalletAddressRequest)

Create destination wallet address

This operation creates a destination wallet address. 

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
    CreateDestinationWalletAddressRequest createDestinationWalletAddressRequest = new CreateDestinationWalletAddressRequest();
    try {
      WalletAddress result = apiInstance.createDestinationWalletAddress(createDestinationWalletAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createDestinationWalletAddress");
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
| **createDestinationWalletAddressRequest** | [**CreateDestinationWalletAddressRequest**](CreateDestinationWalletAddressRequest.md)| The request body to create a destination wallet address. | [optional] |

### Return type

[**WalletAddress**](WalletAddress.md)

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

This operation creates a payout to withdraw available balances.   You can include multiple merchants and cryptocurrencies in a single payout record. 

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

This operation creates reports. 

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

<a id="createSettlementRequest"></a>
# **createSettlementRequest**
> Settlement createSettlementRequest(createSettlementRequestRequest)

Create settlement request

This operation creates a settlement request to withdraw available balances.   You can include multiple merchants and cryptocurrencies in a single settlement request. 

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

<a id="deleteCounterparty"></a>
# **deleteCounterparty**
> DeleteCounterparty200Response deleteCounterparty(counterpartyId)

Delete counterparty

This operation deletes a counterparty. 

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
      DeleteCounterparty200Response result = apiInstance.deleteCounterparty(counterpartyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#deleteCounterparty");
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

[**DeleteCounterparty200Response**](DeleteCounterparty200Response.md)

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

<a id="deleteCounterpartyWalletAddress"></a>
# **deleteCounterpartyWalletAddress**
> DeleteCounterpartyWalletAddress200Response deleteCounterpartyWalletAddress(walletAddressId)

Delete counterparty wallet address

This operation deletes a counterparty wallet address. 

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
    String walletAddressId = "445bac57-7428-4d25-bce1-b3cd017f47a1";
    try {
      DeleteCounterpartyWalletAddress200Response result = apiInstance.deleteCounterpartyWalletAddress(walletAddressId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#deleteCounterpartyWalletAddress");
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
| **walletAddressId** | **String**| The wallet address ID. | |

### Return type

[**DeleteCounterpartyWalletAddress200Response**](DeleteCounterpartyWalletAddress200Response.md)

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

<a id="deleteDestination"></a>
# **deleteDestination**
> DeleteDestination200Response deleteDestination(destinationId)

Delete destination

This operation deletes a destination. 

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
      DeleteDestination200Response result = apiInstance.deleteDestination(destinationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#deleteDestination");
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

[**DeleteDestination200Response**](DeleteDestination200Response.md)

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

<a id="deleteDestinationBankAccount"></a>
# **deleteDestinationBankAccount**
> DeleteDestinationBankAccount200Response deleteDestinationBankAccount(bankAccountId)

Delete destination bank account

This operation deletes a destination bank account. 

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
    UUID bankAccountId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      DeleteDestinationBankAccount200Response result = apiInstance.deleteDestinationBankAccount(bankAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#deleteDestinationBankAccount");
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
| **bankAccountId** | **UUID**| The bank account ID. | |

### Return type

[**DeleteDestinationBankAccount200Response**](DeleteDestinationBankAccount200Response.md)

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

<a id="deleteDestinationWalletAddress"></a>
# **deleteDestinationWalletAddress**
> DeleteDestinationWalletAddress200Response deleteDestinationWalletAddress(walletAddressId)

Delete destination wallet address

This operation deletes a destination wallet address. 

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
    String walletAddressId = "445bac57-7428-4d25-bce1-b3cd017f47a1";
    try {
      DeleteDestinationWalletAddress200Response result = apiInstance.deleteDestinationWalletAddress(walletAddressId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#deleteDestinationWalletAddress");
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
| **walletAddressId** | **String**| The wallet address ID. | |

### Return type

[**DeleteDestinationWalletAddress200Response**](DeleteDestinationWalletAddress200Response.md)

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

<a id="enableDestinationWhitelist"></a>
# **enableDestinationWhitelist**
> QueryDestinationWhitelistEnabled200Response enableDestinationWhitelist(enableDestinationWhitelistRequest)

Enable or disable destination whitelist

This operation enables or disables the whitelist for a destination. 

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
    EnableDestinationWhitelistRequest enableDestinationWhitelistRequest = new EnableDestinationWhitelistRequest();
    try {
      QueryDestinationWhitelistEnabled200Response result = apiInstance.enableDestinationWhitelist(enableDestinationWhitelistRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#enableDestinationWhitelist");
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
| **enableDestinationWhitelistRequest** | [**EnableDestinationWhitelistRequest**](EnableDestinationWhitelistRequest.md)| The request body to enable or disable the destination whitelist. | [optional] |

### Return type

[**QueryDestinationWhitelistEnabled200Response**](QueryDestinationWhitelistEnabled200Response.md)

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

<a id="getAvailableAllocationAmount"></a>
# **getAvailableAllocationAmount**
> PaymentAllocationAmount getAvailableAllocationAmount(sourceType, tokenId, fromMerchantId, toMerchantId)

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
    PaymentSourceType sourceType = PaymentSourceType.fromValue("Merchant");
    String tokenId = "ETH_USDT";
    String fromMerchantId = "M1001";
    String toMerchantId = "M1001";
    try {
      PaymentAllocationAmount result = apiInstance.getAvailableAllocationAmount(sourceType, tokenId, fromMerchantId, toMerchantId);
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
| **sourceType** | [**PaymentSourceType**](.md)| SourceType defines the allocation logic used in the payment flow: - &#x60;Merchant&#x60; - &#x60;Psp&#x60;  | [enum: Merchant, Psp] |
| **tokenId** | **String**| The token ID, which identifies the cryptocurrency. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  | |
| **fromMerchantId** | **String**| The merchant ID. | [optional] |
| **toMerchantId** | **String**| The merchant ID. | [optional] |

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

<a id="getCounterpartyDetailById"></a>
# **getCounterpartyDetailById**
> CounterpartyDetail getCounterpartyDetailById(counterpartyId)

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
      CounterpartyDetail result = apiInstance.getCounterpartyDetailById(counterpartyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getCounterpartyDetailById");
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

<a id="getDestinationBankAccountDetailById"></a>
# **getDestinationBankAccountDetailById**
> DestinationBankAccountDetail getDestinationBankAccountDetailById(bankAccountId)

Get destination bank account information

This operation retrieves the detailed information about a specified destination bank account. 

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
    UUID bankAccountId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      DestinationBankAccountDetail result = apiInstance.getDestinationBankAccountDetailById(bankAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getDestinationBankAccountDetailById");
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
| **bankAccountId** | **UUID**| The bank account ID. | |

### Return type

[**DestinationBankAccountDetail**](DestinationBankAccountDetail.md)

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

<a id="getDestinationDetailById"></a>
# **getDestinationDetailById**
> DestinationDetail getDestinationDetailById(destinationId)

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
      DestinationDetail result = apiInstance.getDestinationDetailById(destinationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getDestinationDetailById");
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
    ReportStatus reportStatus = ReportStatus.fromValue("Completed");
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
| **reportType** | [**ReportType**](.md)| ReportType defines the type of the report: - &#x60;Order&#x60;: Summary of all merchants&#39; order. - &#x60;OrderTransaction&#x60;: Transaction summary of all merchants&#39; orders. - &#x60;TopUpTransaction&#x60;: Transaction summary of all top ups. - &#x60;PayinWeeklyStatement&#x60;: Weekly report of all payins (including order-in and top up). - &#x60;PayinDailyStatement&#x60;: Daily report of all payins (including order-in and top up). - &#x60;CryptoPayout&#x60;: Transaction summary of all crypto settlements. - &#x60;OffRamp&#x60;: Transaction summary of all off ramp settlements. - &#x60;Refund&#x60;: Transaction summary of all refunds. - &#x60;PayoutWeeklyStatement&#x60;: Weekly report of all payouts (including crypto settlements, off ramp settlements and refund). - &#x60;PayoutDailyStatement&#x60;: Daily report of all payouts (including crypto settlements, off ramp settlements and refund). - &#x60;PayinCommissionFee&#x60;: Commission fee summary of all payins. - &#x60;PayoutCommissionFee&#x60;: Commission fee summary of all payouts. - &#x60;BalanceChange&#x60;: Balance change summary of all merchants. - &#x60;Summary&#x60;: Summary of all payins, payouts and commission fees.  | [optional] [enum: Order, OrderTransaction, TopUpTransaction, PayinWeeklyStatement, PayinDailyStatement, CryptoPayout, OffRamp, Refund, PayoutWeeklyStatement, PayoutDailyStatement, PayinCommissionFee, PayoutCommissionFee, BalanceChange, Summary] |
| **reportStatus** | [**ReportStatus**](.md)| ReportStatus defines the status of the report: - &#x60;Completed&#x60;: The report has been completed. - &#x60;Failed&#x60;: The report has failed. - &#x60;Expired&#x60;: The report is expired.  | [optional] [enum: Completed, Failed, Expired] |

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

This operation retrieves the information of a specific settlement request. 

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

<a id="listAllocations"></a>
# **listAllocations**
> ListAllocations200Response listAllocations(limit, before, after, sourceType, merchantIds, tokenId, batchAllocationId)

List all allocations

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
    PaymentSourceType sourceType = PaymentSourceType.fromValue("Merchant");
    String merchantIds = "M1001,M1002,M1003";
    String tokenId = "ETH_USDT";
    String batchAllocationId = "5b0ed293-f728-40b4-b1f6-86b88cd51384";
    try {
      ListAllocations200Response result = apiInstance.listAllocations(limit, before, after, sourceType, merchantIds, tokenId, batchAllocationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listAllocations");
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
| **sourceType** | [**PaymentSourceType**](.md)| SourceType defines the allocation logic used in the payment flow: - &#x60;Merchant&#x60; - &#x60;Psp&#x60;  | [optional] [enum: Merchant, Psp] |
| **merchantIds** | **String**| A list of merchant IDs to query. | [optional] |
| **tokenId** | **String**| The token ID, which identifies the cryptocurrency. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  | [optional] |
| **batchAllocationId** | **String**| The batch allocation ID. | [optional] |

### Return type

[**ListAllocations200Response**](ListAllocations200Response.md)

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

<a id="listBankAccounts"></a>
# **listBankAccounts**
> List&lt;BankAccount&gt; listBankAccounts()

List all bank accounts

This operation retrieves the information of all bank accounts registered. 

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
      List<BankAccount> result = apiInstance.listBankAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listBankAccounts");
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

[**List&lt;BankAccount&gt;**](BankAccount.md)

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

<a id="listCounterpartyWalletAddress"></a>
# **listCounterpartyWalletAddress**
> ListCounterpartyWalletAddress200Response listCounterpartyWalletAddress(limit, before, after, counterpartyId, chainIds, walletAddress)

List counterparty wallet addresses

This operation retrieves the information of counterparty wallet addresses. 

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
    String counterpartyId = "5b0ed293-f728-40b4-b1f6-86b88cd51384";
    String chainIds = "BTC,ETH";
    String walletAddress = "0x1234567890abcdef...";
    try {
      ListCounterpartyWalletAddress200Response result = apiInstance.listCounterpartyWalletAddress(limit, before, after, counterpartyId, chainIds, walletAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listCounterpartyWalletAddress");
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
| **counterpartyId** | **String**| The counterparty ID. | [optional] |
| **chainIds** | **String**| The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). | [optional] |
| **walletAddress** | **String**| The wallet address. | [optional] |

### Return type

[**ListCounterpartyWalletAddress200Response**](ListCounterpartyWalletAddress200Response.md)

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

<a id="listDestinationBankAccounts"></a>
# **listDestinationBankAccounts**
> ListDestinationBankAccounts200Response listDestinationBankAccounts(limit, before, after, keyword, destinationId, bankAccountStatus)

List destination bank accounts

This operation retrieves the information of destination bank accounts. 

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
    String destinationId = "46beeab4-6a8e-476e-bc69-99b89aacbc6f";
    BankAccountStatus bankAccountStatus = BankAccountStatus.fromValue("Pending");
    try {
      ListDestinationBankAccounts200Response result = apiInstance.listDestinationBankAccounts(limit, before, after, keyword, destinationId, bankAccountStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listDestinationBankAccounts");
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
| **destinationId** | **String**| The destination ID. | [optional] |
| **bankAccountStatus** | [**BankAccountStatus**](.md)| BankAccountStatus defines the status of the bank account: - &#x60;Pending&#x60;: The bank account is pending verification by Cobo. - &#x60;Approved&#x60;: The bank account has been approved by Cobo. - &#x60;Rejected&#x60;: The bank account has been rejected by Cobo.  | [optional] [enum: Pending, Approved, Rejected] |

### Return type

[**ListDestinationBankAccounts200Response**](ListDestinationBankAccounts200Response.md)

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

<a id="listDestinationWalletAddresses"></a>
# **listDestinationWalletAddresses**
> ListDestinationWalletAddresses200Response listDestinationWalletAddresses(limit, before, after, destinationId, chainIds, walletAddress)

List destination wallet addresses

This operation retrieves the information of destination wallet addresses. 

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
    String destinationId = "46beeab4-6a8e-476e-bc69-99b89aacbc6f";
    String chainIds = "BTC,ETH";
    String walletAddress = "0x1234567890abcdef...";
    try {
      ListDestinationWalletAddresses200Response result = apiInstance.listDestinationWalletAddresses(limit, before, after, destinationId, chainIds, walletAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listDestinationWalletAddresses");
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
| **destinationId** | **String**| The destination ID. | [optional] |
| **chainIds** | **String**| The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). | [optional] |
| **walletAddress** | **String**| The wallet address. | [optional] |

### Return type

[**ListDestinationWalletAddresses200Response**](ListDestinationWalletAddresses200Response.md)

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
> ListMerchantBalances200Response listMerchantBalances(tokenId, merchantIds, acquiringType)

List merchant balances

This operation retrieves the information of merchant balances. 

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
    String merchantIds = "M1001,M1002,M1003";
    AcquiringType acquiringType = AcquiringType.fromValue("Order");
    try {
      ListMerchantBalances200Response result = apiInstance.listMerchantBalances(tokenId, merchantIds, acquiringType);
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
| **tokenId** | **String**| The token ID, which identifies the cryptocurrency. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  | |
| **merchantIds** | **String**| A list of merchant IDs to query. | [optional] |
| **acquiringType** | [**AcquiringType**](.md)| AcquiringType defines the acquisition logic used in the payment flow: - &#x60;Order&#x60;: Each order is created with a specific amount and associated payment request. Funds are settled on a per-order basis. - &#x60;TopUp&#x60;: Recharge-style flow where funds are topped up to a payer balance or account. Useful for flexible or usage-based payment models.  | [optional] [enum: Order, TopUp, Subscription] |

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

List all supported tokens

This operation retrieves the information of all supported tokens. 

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

<a id="listPayoutItems"></a>
# **listPayoutItems**
> ListPayoutItems200Response listPayoutItems(limit, before, after, merchantId, statuses)

List all payout items

This operation retrieves the information of all payout items. You can filter the result by merchant ID or status. 

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
      ListPayoutItems200Response result = apiInstance.listPayoutItems(limit, before, after, merchantId, statuses);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#listPayoutItems");
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

[**ListPayoutItems200Response**](ListPayoutItems200Response.md)

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

This operation retrieves the information of all settlement details. You can filter the result by merchant ID or status. 

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

This operation retrieves the information of all settlement requests. 

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

This operation retrieves the information of all payers. You can filter the result by merchant ID and payer_id. 

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

<a id="queryDestinationWhitelistEnabled"></a>
# **queryDestinationWhitelistEnabled**
> QueryDestinationWhitelistEnabled200Response queryDestinationWhitelistEnabled()

Query destination whitelist enabled status

This operation retrieves the information of whether the destination whitelist is enabled. 

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
      QueryDestinationWhitelistEnabled200Response result = apiInstance.queryDestinationWhitelistEnabled();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#queryDestinationWhitelistEnabled");
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

[**QueryDestinationWhitelistEnabled200Response**](QueryDestinationWhitelistEnabled200Response.md)

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

<a id="updateBankAccountById"></a>
# **updateBankAccountById**
> BankAccount updateBankAccountById(bankAccountId, updateBankAccountByIdRequest)

Update bank account

This operation updates the information of an existing bank account. 

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
    UUID bankAccountId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    UpdateBankAccountByIdRequest updateBankAccountByIdRequest = new UpdateBankAccountByIdRequest();
    try {
      BankAccount result = apiInstance.updateBankAccountById(bankAccountId, updateBankAccountByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#updateBankAccountById");
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
| **bankAccountId** | **UUID**| The bank account ID. | |
| **updateBankAccountByIdRequest** | [**UpdateBankAccountByIdRequest**](UpdateBankAccountByIdRequest.md)| The request body for updating an existing bank account. | [optional] |

### Return type

[**BankAccount**](BankAccount.md)

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

<a id="updateCounterpartyById"></a>
# **updateCounterpartyById**
> Counterparty updateCounterpartyById(counterpartyId, updateCounterpartyByIdRequest)

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
    UpdateCounterpartyByIdRequest updateCounterpartyByIdRequest = new UpdateCounterpartyByIdRequest();
    try {
      Counterparty result = apiInstance.updateCounterpartyById(counterpartyId, updateCounterpartyByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#updateCounterpartyById");
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
| **updateCounterpartyByIdRequest** | [**UpdateCounterpartyByIdRequest**](UpdateCounterpartyByIdRequest.md)| The request body to update a counterparty. | [optional] |

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

<a id="updateDestinationBankAccountById"></a>
# **updateDestinationBankAccountById**
> DestinationBankAccount updateDestinationBankAccountById(bankAccountId, updateDestinationBankAccount)

Update destination bank account

This operation updates the information of a specified destination bank account. 

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
    UUID bankAccountId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    UpdateDestinationBankAccount updateDestinationBankAccount = new UpdateDestinationBankAccount();
    try {
      DestinationBankAccount result = apiInstance.updateDestinationBankAccountById(bankAccountId, updateDestinationBankAccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#updateDestinationBankAccountById");
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
| **bankAccountId** | **UUID**| The bank account ID. | |
| **updateDestinationBankAccount** | [**UpdateDestinationBankAccount**](UpdateDestinationBankAccount.md)| The request body to update a destination bank account. | [optional] |

### Return type

[**DestinationBankAccount**](DestinationBankAccount.md)

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

<a id="updateDestinationById"></a>
# **updateDestinationById**
> Destination updateDestinationById(destinationId, updateDestinationByIdRequest)

Update destination

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
    UpdateDestinationByIdRequest updateDestinationByIdRequest = new UpdateDestinationByIdRequest();
    try {
      Destination result = apiInstance.updateDestinationById(destinationId, updateDestinationByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#updateDestinationById");
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
| **updateDestinationByIdRequest** | [**UpdateDestinationByIdRequest**](UpdateDestinationByIdRequest.md)| The request body to create a destination. | [optional] |

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

