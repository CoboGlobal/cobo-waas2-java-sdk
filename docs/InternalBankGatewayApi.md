# InternalBankGatewayApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bankPayoutCancel**](InternalBankGatewayApi.md#bankPayoutCancel) | **POST** /internal/bank_gateway/payouts/{payout_id}/cancel | Cancel a payout |
| [**bankPayoutRetry**](InternalBankGatewayApi.md#bankPayoutRetry) | **POST** /internal/bank_gateway/payouts/{payout_id}/retry | Retry a payout |
| [**createBankPayout**](InternalBankGatewayApi.md#createBankPayout) | **POST** /internal/bank_gateway/payouts | Create a payout |
| [**createThirdPartyMerchant**](InternalBankGatewayApi.md#createThirdPartyMerchant) | **POST** /internal/bank_gateway/third_party/merchant | Create third-party merchant |
| [**createThirdPartyPayee**](InternalBankGatewayApi.md#createThirdPartyPayee) | **POST** /internal/bank_gateway/third_party/payee | Create third-party payee |
| [**createVirtualAccount**](InternalBankGatewayApi.md#createVirtualAccount) | **POST** /internal/bank_gateway/va | Create a virtual account |
| [**deleteThirdPartyPayee**](InternalBankGatewayApi.md#deleteThirdPartyPayee) | **DELETE** /internal/bank_gateway/third_party/payee/{cobo_payee_id} | Delete third-party payee |
| [**getBankAccountBalance**](InternalBankGatewayApi.md#getBankAccountBalance) | **GET** /internal/bank_gateway/balance | Get bank account balance |
| [**getBankPayoutDetail**](InternalBankGatewayApi.md#getBankPayoutDetail) | **GET** /internal/bank_gateway/payouts/{payout_id} | Get payout details |
| [**getDepositDetail**](InternalBankGatewayApi.md#getDepositDetail) | **GET** /internal/bank_gateway/deposits/detail | Get deposit detail |
| [**getThirdPartyMerchant**](InternalBankGatewayApi.md#getThirdPartyMerchant) | **GET** /internal/bank_gateway/third_party/merchant/{cobo_merchant_id} | Get third-party merchant |
| [**getThirdPartyPayee**](InternalBankGatewayApi.md#getThirdPartyPayee) | **GET** /internal/bank_gateway/third_party/payee/{cobo_payee_id} | Get third-party payee |
| [**getVirtualAccountDetail**](InternalBankGatewayApi.md#getVirtualAccountDetail) | **GET** /internal/bank_gateway/va/detail | Get virtual account detail |
| [**listBankAwaitingSignaturePayouts**](InternalBankGatewayApi.md#listBankAwaitingSignaturePayouts) | **GET** /internal/bank_gateway/payouts/awaiting_signature | Get awaiting signature payouts |
| [**listBankPayouts**](InternalBankGatewayApi.md#listBankPayouts) | **GET** /internal/bank_gateway/payouts | List payouts |
| [**listBankReturnedPayouts**](InternalBankGatewayApi.md#listBankReturnedPayouts) | **GET** /internal/bank_gateway/payouts/returned | Get returned payouts |
| [**listBankTransactions**](InternalBankGatewayApi.md#listBankTransactions) | **GET** /internal/bank_gateway/transactions | Get payouts list |
| [**listDeposits**](InternalBankGatewayApi.md#listDeposits) | **GET** /internal/bank_gateway/deposits | List deposit |
| [**listVirtualAccounts**](InternalBankGatewayApi.md#listVirtualAccounts) | **GET** /internal/bank_gateway/va | List virtual accounts |
| [**submitBankPayoutSignature**](InternalBankGatewayApi.md#submitBankPayoutSignature) | **POST** /internal/bank_gateway/payouts/{payout_id}/signature | Submit a payout signature |


<a id="bankPayoutCancel"></a>
# **bankPayoutCancel**
> BankPayout bankPayoutCancel(payoutId)

Cancel a payout

This operation cancel a payout operation if possible. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    String payoutId = "payout_123456";
    try {
      BankPayout result = apiInstance.bankPayoutCancel(payoutId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#bankPayoutCancel");
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

[**BankPayout**](BankPayout.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully retrieved the payout details |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="bankPayoutRetry"></a>
# **bankPayoutRetry**
> Object bankPayoutRetry(payoutId)

Retry a payout

This operation allows the signer to retry a payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    String payoutId = "payout_123456";
    try {
      Object result = apiInstance.bankPayoutRetry(payoutId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#bankPayoutRetry");
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

**Object**

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully retried the payout |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createBankPayout"></a>
# **createBankPayout**
> CreateBankPayout201Response createBankPayout(createBankPayoutRequest)

Create a payout

This operation creates a payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    CreateBankPayoutRequest createBankPayoutRequest = new CreateBankPayoutRequest();
    try {
      CreateBankPayout201Response result = apiInstance.createBankPayout(createBankPayoutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#createBankPayout");
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
| **createBankPayoutRequest** | [**CreateBankPayoutRequest**](CreateBankPayoutRequest.md)| The request body to create a payout | [optional] |

### Return type

[**CreateBankPayout201Response**](CreateBankPayout201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a payout |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createThirdPartyMerchant"></a>
# **createThirdPartyMerchant**
> CreateThirdPartyMerchant201Response createThirdPartyMerchant(createThirdPartyMerchantRequest)

Create third-party merchant

This operation creates a third-party merchant. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    CreateThirdPartyMerchantRequest createThirdPartyMerchantRequest = new CreateThirdPartyMerchantRequest();
    try {
      CreateThirdPartyMerchant201Response result = apiInstance.createThirdPartyMerchant(createThirdPartyMerchantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#createThirdPartyMerchant");
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
| **createThirdPartyMerchantRequest** | [**CreateThirdPartyMerchantRequest**](CreateThirdPartyMerchantRequest.md)| The request body to create a third-party merchant.  Provide either &#x60;company_info&#x60; or &#x60;individual_info&#x60;: - &#x60;company_info&#x60;: Required for company merchants. - &#x60;individual_info&#x60;: Required for individual merchants.  | [optional] |

### Return type

[**CreateThirdPartyMerchant201Response**](CreateThirdPartyMerchant201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a third-party merchant |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createThirdPartyPayee"></a>
# **createThirdPartyPayee**
> CreateThirdPartyPayee201Response createThirdPartyPayee(createThirdPartyPayeeRequest)

Create third-party payee

This operation creates a third-party payee.  For USD company bank accounts, required fields depend on &#x60;payment_method&#x60;:  **SWIFT** (supported in HK, TW, MY, PH, ID, VN, TH, SG): &#x60;company_name&#x60;, &#x60;bank_name&#x60;, &#x60;account_number&#x60;, &#x60;swift_code&#x60;, &#x60;account_name&#x60;, &#x60;street_address&#x60;, &#x60;city&#x60;, &#x60;post_code&#x60;, &#x60;province&#x60;, &#x60;country&#x60;, and &#x60;contract_document_url&#x60;.  **Local HK** (&#x60;payment_method&#x60; &#x3D; &#x60;Local&#x60;, HK only): &#x60;company_name&#x60;, &#x60;bank_name&#x60;, &#x60;account_number&#x60;, &#x60;swift_code&#x60;, &#x60;branch_code&#x60;, &#x60;account_name&#x60;, &#x60;street_address&#x60;, &#x60;country&#x60;, and &#x60;contract_document_url&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    CreateThirdPartyPayeeRequest createThirdPartyPayeeRequest = new CreateThirdPartyPayeeRequest();
    try {
      CreateThirdPartyPayee201Response result = apiInstance.createThirdPartyPayee(createThirdPartyPayeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#createThirdPartyPayee");
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
| **createThirdPartyPayeeRequest** | [**CreateThirdPartyPayeeRequest**](CreateThirdPartyPayeeRequest.md)| The request body to create a third-party payee.  For USD company bank accounts in HK, TW, MY, PH, ID, VN, TH, and SG: - When &#x60;payment_method&#x60; is &#x60;Swift&#x60;, &#x60;city&#x60;, &#x60;province&#x60;, and &#x60;post_code&#x60; are required in &#x60;beneficiary_detail&#x60;. - When &#x60;payment_method&#x60; is &#x60;Local&#x60; with USD, only HK is supported.  | [optional] |

### Return type

[**CreateThirdPartyPayee201Response**](CreateThirdPartyPayee201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a third-party payee |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createVirtualAccount"></a>
# **createVirtualAccount**
> CreateVirtualAccount201Response createVirtualAccount(createVirtualAccountRequest)

Create a virtual account

This operation creates a virtual account. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    CreateVirtualAccountRequest createVirtualAccountRequest = new CreateVirtualAccountRequest();
    try {
      CreateVirtualAccount201Response result = apiInstance.createVirtualAccount(createVirtualAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#createVirtualAccount");
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
| **createVirtualAccountRequest** | [**CreateVirtualAccountRequest**](CreateVirtualAccountRequest.md)| The request body to create a virtual account | [optional] |

### Return type

[**CreateVirtualAccount201Response**](CreateVirtualAccount201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create virtual account result |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="deleteThirdPartyPayee"></a>
# **deleteThirdPartyPayee**
> DeleteThirdPartyPayee200Response deleteThirdPartyPayee(coboPayeeId)

Delete third-party payee

This operation deletes a specified third-party payee. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    String coboPayeeId = "payee_123456";
    try {
      DeleteThirdPartyPayee200Response result = apiInstance.deleteThirdPartyPayee(coboPayeeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#deleteThirdPartyPayee");
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
| **coboPayeeId** | **String**| The Cobo payee ID. | |

### Return type

[**DeleteThirdPartyPayee200Response**](DeleteThirdPartyPayee200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted a third-party payee |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getBankAccountBalance"></a>
# **getBankAccountBalance**
> List&lt;GetBankAccountBalance200ResponseInner&gt; getBankAccountBalance(bankProvider, accountNo)

Get bank account balance

This operation retrieves the balance of a specified bank account. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    BankProvider bankProvider = BankProvider.fromValue("SGB");
    String accountNo = "1234567890";
    try {
      List<GetBankAccountBalance200ResponseInner> result = apiInstance.getBankAccountBalance(bankProvider, accountNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#getBankAccountBalance");
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
| **bankProvider** | [**BankProvider**](.md)| The bank provider. | [enum: SGB, PYVIO] |
| **accountNo** | **String**| The account number. | |

### Return type

[**List&lt;GetBankAccountBalance200ResponseInner&gt;**](GetBankAccountBalance200ResponseInner.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the balance details |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getBankPayoutDetail"></a>
# **getBankPayoutDetail**
> BankPayout getBankPayoutDetail(payoutId)

Get payout details

This operation retrieves the detailed information about a specified payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    String payoutId = "payout_123456";
    try {
      BankPayout result = apiInstance.getBankPayoutDetail(payoutId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#getBankPayoutDetail");
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

[**BankPayout**](BankPayout.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the payout details |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getDepositDetail"></a>
# **getDepositDetail**
> BankDeposit getDepositDetail(bankProvider, accountNo, transactionId)

Get deposit detail

This operation retrieves detailed information about a specified deposit. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    BankProvider bankProvider = BankProvider.fromValue("SGB");
    String accountNo = "1234567890";
    String transactionId = "1234567890";
    try {
      BankDeposit result = apiInstance.getDepositDetail(bankProvider, accountNo, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#getDepositDetail");
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
| **bankProvider** | [**BankProvider**](.md)| The bank provider. | [enum: SGB, PYVIO] |
| **accountNo** | **String**| The account number. | |
| **transactionId** | **String**| The transaction id. | |

### Return type

[**BankDeposit**](BankDeposit.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the deposit details |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getThirdPartyMerchant"></a>
# **getThirdPartyMerchant**
> ThirdPartyMerchantInfo getThirdPartyMerchant(coboMerchantId)

Get third-party merchant

This operation retrieves detailed information about a specified third-party merchant. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    String coboMerchantId = "merchant_123456";
    try {
      ThirdPartyMerchantInfo result = apiInstance.getThirdPartyMerchant(coboMerchantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#getThirdPartyMerchant");
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
| **coboMerchantId** | **String**| The Cobo merchant ID. | |

### Return type

[**ThirdPartyMerchantInfo**](ThirdPartyMerchantInfo.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Third-party merchant information |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getThirdPartyPayee"></a>
# **getThirdPartyPayee**
> ThirdPartyPayeeInfo getThirdPartyPayee(coboPayeeId)

Get third-party payee

This operation retrieves detailed information about a specified third-party payee. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    String coboPayeeId = "payee_123456";
    try {
      ThirdPartyPayeeInfo result = apiInstance.getThirdPartyPayee(coboPayeeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#getThirdPartyPayee");
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
| **coboPayeeId** | **String**| The Cobo payee ID. | |

### Return type

[**ThirdPartyPayeeInfo**](ThirdPartyPayeeInfo.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Third-party payee information |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getVirtualAccountDetail"></a>
# **getVirtualAccountDetail**
> BankVirtualAccount getVirtualAccountDetail(bankProvider, masterAccountNo, accountNo)

Get virtual account detail

This operation retrieves detailed information about a specified virtual account. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    BankProvider bankProvider = BankProvider.fromValue("SGB");
    String masterAccountNo = "1234567890";
    String accountNo = "1234567890";
    try {
      BankVirtualAccount result = apiInstance.getVirtualAccountDetail(bankProvider, masterAccountNo, accountNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#getVirtualAccountDetail");
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
| **bankProvider** | [**BankProvider**](.md)| The bank provider. | [enum: SGB, PYVIO] |
| **masterAccountNo** | **String**| The account number. | |
| **accountNo** | **String**| The account number. | |

### Return type

[**BankVirtualAccount**](BankVirtualAccount.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the virtual account details |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listBankAwaitingSignaturePayouts"></a>
# **listBankAwaitingSignaturePayouts**
> List&lt;ListBankAwaitingSignaturePayouts200ResponseInner&gt; listBankAwaitingSignaturePayouts()

Get awaiting signature payouts

This operation retrieves the list of payouts that are awaiting signature. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    try {
      List<ListBankAwaitingSignaturePayouts200ResponseInner> result = apiInstance.listBankAwaitingSignaturePayouts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#listBankAwaitingSignaturePayouts");
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

[**List&lt;ListBankAwaitingSignaturePayouts200ResponseInner&gt;**](ListBankAwaitingSignaturePayouts200ResponseInner.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of requests awaiting signature |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listBankPayouts"></a>
# **listBankPayouts**
> ListBankPayouts200Response listBankPayouts(limit, before, after, requestId)

List payouts

This operation retrieves the list of payouts. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String requestId = "123e4567-e89b-12d3-a456-426614174004";
    try {
      ListBankPayouts200Response result = apiInstance.listBankPayouts(limit, before, after, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#listBankPayouts");
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
| **requestId** | **String**| The request ID of the payout. | [optional] |

### Return type

[**ListBankPayouts200Response**](ListBankPayouts200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of payouts |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listBankReturnedPayouts"></a>
# **listBankReturnedPayouts**
> ListBankReturnedPayouts200Response listBankReturnedPayouts()

Get returned payouts

This operation retrieves the list of payouts that are returned. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    try {
      ListBankReturnedPayouts200Response result = apiInstance.listBankReturnedPayouts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#listBankReturnedPayouts");
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

[**ListBankReturnedPayouts200Response**](ListBankReturnedPayouts200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of returned payouts |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listBankTransactions"></a>
# **listBankTransactions**
> ListBankPayouts200Response listBankTransactions(bankProvider, accountNo, limit, before, after, currency, startTime, endTime, status, transferType)

Get payouts list

This operation retrieves the list of transactions. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    BankProvider bankProvider = BankProvider.fromValue("SGB");
    String accountNo = "1234567890";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String currency = "USD";
    String startTime = "1744689600";
    String endTime = "1744689600";
    BankPayoutStatus status = BankPayoutStatus.fromValue("Created");
    BankTransferType transferType = BankTransferType.fromValue("Payin");
    try {
      ListBankPayouts200Response result = apiInstance.listBankTransactions(bankProvider, accountNo, limit, before, after, currency, startTime, endTime, status, transferType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#listBankTransactions");
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
| **bankProvider** | [**BankProvider**](.md)| The bank provider. | [enum: SGB, PYVIO] |
| **accountNo** | **String**| The account number. | |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |
| **currency** | **String**| The currency. | [optional] |
| **startTime** | **String**| The start time. | [optional] |
| **endTime** | **String**| The end time. | [optional] |
| **status** | [**BankPayoutStatus**](.md)| The status of the payout. | [optional] [enum: Created, PendingRiskCheck, RiskRejected, PendingApproval, Approved, Signing, BankSent, BankProcessing, Success, Failed, RefundProcessing, Refunded] |
| **transferType** | [**BankTransferType**](.md)| The transfer type of the transaction. | [optional] [enum: Payin, Payout] |

### Return type

[**ListBankPayouts200Response**](ListBankPayouts200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of payouts |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listDeposits"></a>
# **listDeposits**
> ListDeposits200Response listDeposits(bankProvider, accountNo, limit, before, after, currency, startTime, endTime)

List deposit

This operation retrieves the list of deposits. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    BankProvider bankProvider = BankProvider.fromValue("SGB");
    String accountNo = "1234567890";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String currency = "USD";
    String startTime = "1744689600";
    String endTime = "1744689600";
    try {
      ListDeposits200Response result = apiInstance.listDeposits(bankProvider, accountNo, limit, before, after, currency, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#listDeposits");
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
| **bankProvider** | [**BankProvider**](.md)| The bank provider. | [enum: SGB, PYVIO] |
| **accountNo** | **String**| The account number. | |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |
| **currency** | **String**| The currency. | [optional] |
| **startTime** | **String**| The start time. | [optional] |
| **endTime** | **String**| The end time. | [optional] |

### Return type

[**ListDeposits200Response**](ListDeposits200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of deposits |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listVirtualAccounts"></a>
# **listVirtualAccounts**
> List&lt;BankVirtualAccount&gt; listVirtualAccounts(bankProvider, masterAccountNo, currency, vaStatus, accountNos)

List virtual accounts

This operation retrieves the list of virtual accounts. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    BankProvider bankProvider = BankProvider.fromValue("SGB");
    String masterAccountNo = "1234567890";
    String currency = "USD";
    BankVirtualAccountStatus vaStatus = BankVirtualAccountStatus.fromValue("Pending");
    String accountNos = "79406200000001,79406200000002";
    try {
      List<BankVirtualAccount> result = apiInstance.listVirtualAccounts(bankProvider, masterAccountNo, currency, vaStatus, accountNos);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#listVirtualAccounts");
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
| **bankProvider** | [**BankProvider**](.md)| The bank provider. | [enum: SGB, PYVIO] |
| **masterAccountNo** | **String**| The account number. | |
| **currency** | **String**| The currency. | [optional] |
| **vaStatus** | [**BankVirtualAccountStatus**](.md)| The status of the virtual account. | [optional] [enum: Pending, Active, Closed, Blocked] |
| **accountNos** | **String**| A list of account numbers, separated by comma. | [optional] |

### Return type

[**List&lt;BankVirtualAccount&gt;**](BankVirtualAccount.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of virtual account |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="submitBankPayoutSignature"></a>
# **submitBankPayoutSignature**
> Object submitBankPayoutSignature(payoutId, submitBankPayoutSignatureRequest)

Submit a payout signature

This operation allows the signer to submit the signature for a payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    String payoutId = "payout_123456";
    SubmitBankPayoutSignatureRequest submitBankPayoutSignatureRequest = new SubmitBankPayoutSignatureRequest();
    try {
      Object result = apiInstance.submitBankPayoutSignature(payoutId, submitBankPayoutSignatureRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#submitBankPayoutSignature");
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
| **submitBankPayoutSignatureRequest** | [**SubmitBankPayoutSignatureRequest**](SubmitBankPayoutSignatureRequest.md)| The request body to submit payout signature | [optional] |

### Return type

**Object**

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully submitted the payout signature |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

