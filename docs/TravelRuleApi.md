# TravelRuleApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelSatoshiTestChallenge**](TravelRuleApi.md#cancelSatoshiTestChallenge) | **POST** /travel_rule/satoshi_test/challenge/cancel | Cancel Satoshi Test challenge |
| [**createSatoshiTestChallenge**](TravelRuleApi.md#createSatoshiTestChallenge) | **POST** /travel_rule/satoshi_test/challenge | Create Satoshi Test challenge |
| [**getAddressVerification**](TravelRuleApi.md#getAddressVerification) | **GET** /travel_rule/address_verifications/{verification_id} | Get address verification |
| [**getSatoshiTestChallenge**](TravelRuleApi.md#getSatoshiTestChallenge) | **GET** /travel_rule/satoshi_test/challenge/status | Get Satoshi Test challenge |
| [**getSignatureChallenge**](TravelRuleApi.md#getSignatureChallenge) | **GET** /travel_rule/signature_challenge | Get self-custody signature challenge |
| [**getTransactionLimitation**](TravelRuleApi.md#getTransactionLimitation) | **GET** /travel_rule/transaction/limitation | Retrieve transaction limitations |
| [**listAddressVerifications**](TravelRuleApi.md#listAddressVerifications) | **GET** /travel_rule/address_verifications | List address verifications |
| [**listSupportedCountries**](TravelRuleApi.md#listSupportedCountries) | **GET** /travel_rule/transaction/countries | List supported countries |
| [**submitDepositTravelRuleInfo**](TravelRuleApi.md#submitDepositTravelRuleInfo) | **POST** /travel_rule/transaction/deposit/travel_rule_info | Submit Travel Rule information for deposits |
| [**submitWithdrawTravelRuleInfo**](TravelRuleApi.md#submitWithdrawTravelRuleInfo) | **POST** /travel_rule/transaction/withdraw/travel_rule_info | Submit Travel Rule information for withdrawals |


<a id="cancelSatoshiTestChallenge"></a>
# **cancelSatoshiTestChallenge**
> SatoshiTestCancelResult cancelSatoshiTestChallenge(cancelSatoshiTestChallengeRequest)

Cancel Satoshi Test challenge

This operation cancels a Satoshi Test challenge that is currently in &#x60;PREPARE&#x60; or &#x60;PENDING&#x60; status. Typical use case: the counterparty decides to switch verification methods before transferring.  Once cancelled, the challenge status becomes &#x60;DELETED&#x60; and the on-chain match will no longer be observed. Challenges already in &#x60;MATCHED&#x60;, &#x60;VERIFIED&#x60;, &#x60;EXPIRED&#x60;, or &#x60;DELETED&#x60; state cannot be cancelled. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    CancelSatoshiTestChallengeRequest cancelSatoshiTestChallengeRequest = new CancelSatoshiTestChallengeRequest();
    try {
      SatoshiTestCancelResult result = apiInstance.cancelSatoshiTestChallenge(cancelSatoshiTestChallengeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#cancelSatoshiTestChallenge");
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
| **cancelSatoshiTestChallengeRequest** | [**CancelSatoshiTestChallengeRequest**](CancelSatoshiTestChallengeRequest.md)|  | [optional] |

### Return type

[**SatoshiTestCancelResult**](SatoshiTestCancelResult.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The challenge has been cancelled. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createSatoshiTestChallenge"></a>
# **createSatoshiTestChallenge**
> SatoshiTestChallenge createSatoshiTestChallenge(createSatoshiTestChallengeRequest)

Create Satoshi Test challenge

This operation creates a Satoshi Test challenge for self-custody address verification. Satoshi Test verifies address ownership by having the counterparty transfer a small, uniquely-generated amount from their wallet to a Cobo-controlled verification address.  A single endpoint covers both flows via the &#x60;action&#x60; parameter: - **Two-step flow** (&#x60;action&#x3D;PREPARE&#x60; then &#x60;action&#x3D;SUBMIT&#x60;): Preview the verification details first, then activate. The 180-minute countdown only starts on &#x60;SUBMIT&#x60;. The server uses &#x60;(chain_id, from_address)&#x60; as the idempotency key, so the second call automatically targets the prepared challenge. For extra safety, pass the &#x60;challenge_id&#x60; returned by &#x60;PREPARE&#x60; in the subsequent &#x60;SUBMIT&#x60; call — it pins the activation to that specific challenge. - **One-shot flow** (&#x60;action&#x3D;SUBMIT&#x60; directly, without &#x60;challenge_id&#x60;): Prepare and submit in a single call. The challenge is created directly in &#x60;PENDING&#x60; state with the countdown started.  If the counterparty address has already been verified, the operation returns HTTP 400 &#x60;ADDRESS_ALREADY_VERIFIED&#x60;. Call [List address verifications](#operation/list_address_verifications) with &#x60;chain_id&#x60;, &#x60;address&#x60;, and &#x60;status&#x3D;VERIFIED&#x60; first to pre-check.  Supported chains: &#x60;BTC&#x60;, &#x60;ETH&#x60;, &#x60;BASE_ETH&#x60;, &#x60;BSC_BNB&#x60;, &#x60;TRON&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    CreateSatoshiTestChallengeRequest createSatoshiTestChallengeRequest = new CreateSatoshiTestChallengeRequest();
    try {
      SatoshiTestChallenge result = apiInstance.createSatoshiTestChallenge(createSatoshiTestChallengeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#createSatoshiTestChallenge");
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
| **createSatoshiTestChallengeRequest** | [**CreateSatoshiTestChallengeRequest**](CreateSatoshiTestChallengeRequest.md)|  | [optional] |

### Return type

[**SatoshiTestChallenge**](SatoshiTestChallenge.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The Satoshi Test challenge was created.  - &#x60;action&#x3D;PREPARE&#x60;: returned challenge has &#x60;status&#x3D;PREPARE&#x60;; the 180-minute countdown is not started yet. - &#x60;action&#x3D;SUBMIT&#x60;: returned challenge has &#x60;status&#x3D;PENDING&#x60;; &#x60;started_at&#x60; and &#x60;expires_at&#x60; are set.  If the counterparty address has already been verified (by signature or a prior Satoshi Test), this operation returns HTTP 400 &#x60;ADDRESS_ALREADY_VERIFIED&#x60; instead — call [List address verifications](#operation/list_address_verifications) with &#x60;chain_id&#x60;, &#x60;address&#x60;, and &#x60;status&#x3D;VERIFIED&#x60; first to pre-check.  |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getAddressVerification"></a>
# **getAddressVerification**
> AddressVerificationDetail getAddressVerification(verificationId)

Get address verification

Retrieve a single self-custody address verification record by its &#x60;verification_id&#x60;, including method-specific provenance:  - &#x60;verification_method&#x3D;SIGNATURE&#x60; → &#x60;signature_detail&#x60; is populated. - &#x60;verification_method&#x3D;SATOSHI_TEST&#x60; → &#x60;satoshi_test_detail&#x60; carries the latest challenge state (&#x60;status&#x60;, &#x60;remaining_seconds&#x60;, &#x60;matched_txid&#x60;).  Use [List address verifications](#operation/list_address_verifications) to discover &#x60;verification_id&#x60; values. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    UUID verificationId = UUID.fromString("fb377ea5-a97a-49b4-955d-23f8fdd5177a");
    try {
      AddressVerificationDetail result = apiInstance.getAddressVerification(verificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#getAddressVerification");
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
| **verificationId** | **UUID**| The unique identifier of the address verification record. | |

### Return type

[**AddressVerificationDetail**](AddressVerificationDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The address verification record. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getSatoshiTestChallenge"></a>
# **getSatoshiTestChallenge**
> SatoshiTestChallenge getSatoshiTestChallenge(challengeId)

Get Satoshi Test challenge

This operation returns the current state of a Satoshi Test challenge — useful for polling after submission. The response contains the challenge &#x60;status&#x60; and &#x60;remaining_seconds&#x60;.  Recommended polling interval: 10–30 seconds. The challenge will transition through &#x60;PENDING&#x60; → &#x60;MATCHED&#x60; → &#x60;VERIFIED&#x60; once the counterparty&#39;s transfer is observed and confirmed on chain. If the challenge is not matched within 180 minutes, the status becomes &#x60;EXPIRED&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    UUID challengeId = UUID.fromString("a1b2c3d4-e5f6-7890-abcd-ef1234567890");
    try {
      SatoshiTestChallenge result = apiInstance.getSatoshiTestChallenge(challengeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#getSatoshiTestChallenge");
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
| **challengeId** | **UUID**| The Satoshi Test challenge ID returned by the &#x60;prepare&#x60; or &#x60;submit&#x60; operation. | |

### Return type

[**SatoshiTestChallenge**](SatoshiTestChallenge.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Satoshi Test challenge information (after submit or for status polling). |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getSignatureChallenge"></a>
# **getSignatureChallenge**
> SignatureChallenge getSignatureChallenge(transactionType, transactionId)

Get self-custody signature challenge

This operation issues a one-time, time-bounded message for a self-custody wallet address to sign, in order to prove wallet ownership. The signature is then submitted via [Submit Travel Rule information for deposits](#operation/submit_deposit_travel_rule_info) or [withdrawals](#operation/submit_withdraw_travel_rule_info).  Use this endpoint when you want to verify the counterparty&#39;s self-custody address via off-chain signature. For address verification via on-chain micro-deposit, use the Satoshi Test endpoints (&#x60;/travel_rule/satoshi_test/...&#x60;) instead.  The challenge is valid for a short window (returned as &#x60;expires_in&#x60;, currently 30 seconds). Calling this endpoint again for the same transaction rotates the challenge — only the latest issued value will verify. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    String transactionType = "DEPOSIT";
    UUID transactionId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
    try {
      SignatureChallenge result = apiInstance.getSignatureChallenge(transactionType, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#getSignatureChallenge");
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
| **transactionType** | **String**| The transaction type. Possible values include:    - &#x60;DEPOSIT&#x60;: A deposit transaction.   - &#x60;WITHDRAW&#x60;: A withdrawal transaction.  | [enum: DEPOSIT, WITHDRAW] |
| **transactionId** | **UUID**| The transaction ID. | |

### Return type

[**SignatureChallenge**](SignatureChallenge.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The signature challenge was issued successfully. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getTransactionLimitation"></a>
# **getTransactionLimitation**
> GetTransactionLimitation200Response getTransactionLimitation(transactionType, transactionId)

Retrieve transaction limitations

&lt;Note&gt;The &#x60;self_custody_wallet_challenge&#x60; field in the response is deprecated. To obtain a signature challenge, call [Get self-custody signature challenge](#operation/get_signature_challenge) instead. This operation itself is not deprecated and continues to return the VASP list, threshold info, connect wallet list, and Satoshi Test support.&lt;/Note&gt;  This operation retrieves Travel Rule requirements and available options for a transaction based on its transaction type and ID.  Use this endpoint before submitting Travel Rule information to understand the requirements and available options for your transaction. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    String transactionType = "DEPOSIT";
    UUID transactionId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
    try {
      GetTransactionLimitation200Response result = apiInstance.getTransactionLimitation(transactionType, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#getTransactionLimitation");
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
| **transactionType** | **String**| The transaction type. Possible values include:    - &#x60;DEPOSIT&#x60;: A deposit transaction.   - &#x60;WITHDRAW&#x60;: A withdrawal transaction.  | [enum: DEPOSIT, WITHDRAW] |
| **transactionId** | **UUID**| The transaction ID. | |

### Return type

[**GetTransactionLimitation200Response**](GetTransactionLimitation200Response.md)

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

<a id="listAddressVerifications"></a>
# **listAddressVerifications**
> ListAddressVerifications200Response listAddressVerifications(status, chainId, address, limit, before, after)

List address verifications

List self-custody address verification records under the current organization with optional filters and cursor-based pagination.  Records are sorted by creation time descending (most recent first). Use &#x60;limit&#x60; plus &#x60;before&#x60; / &#x60;after&#x60; cursors from the previous page&#39;s &#x60;pagination&#x60; block to traverse pages.  Each record&#39;s &#x60;status&#x60; is one of &#x60;PENDING&#x60;, &#x60;VERIFIED&#x60;, or &#x60;FAILED&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    AddressVerificationStatus status = AddressVerificationStatus.fromValue("PENDING");
    String chainId = "ETH";
    String address = "0x1234567890abcdef1234567890abcdef12345678";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListAddressVerifications200Response result = apiInstance.listAddressVerifications(status, chainId, address, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#listAddressVerifications");
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
| **status** | [**AddressVerificationStatus**](.md)| Filter by verification status. Allowed values: - &#x60;PENDING&#x60;: A Satoshi Test challenge is in progress (countdown active or awaiting confirmation). - &#x60;VERIFIED&#x60;: The address ownership has been confirmed (by signature or by a matched Satoshi Test transfer). - &#x60;FAILED&#x60;: The verification attempt did not succeed (Satoshi Test expired without match, or signature verification rejected).  Omit this parameter to return records of all three statuses.  | [optional] [enum: PENDING, VERIFIED, FAILED] |
| **chainId** | **String**| Filter by chain ID (e.g. &#x60;BTC&#x60;, &#x60;ETH&#x60;, &#x60;BASE_ETH&#x60;, &#x60;BSC_BNB&#x60;, &#x60;TRON&#x60;). | [optional] |
| **address** | **String**| Filter by counterparty (self-custody) wallet address. | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| A cursor indicating the position before the current page. This value is generated by Cobo and returned in the response. If you are paginating forward from the beginning, you do not need to provide it on the first request. When paginating backward (to the previous page), you should pass the before value returned from the last response.  | [optional] |
| **after** | **String**| A cursor indicating the position after the current page. This value is generated by Cobo and returned in the response. You do not need to provide it on the first request. When paginating forward (to the next page), you should pass the after value returned from the last response.  | [optional] |

### Return type

[**ListAddressVerifications200Response**](ListAddressVerifications200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of address verification records. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listSupportedCountries"></a>
# **listSupportedCountries**
> List&lt;ListSupportedCountries200ResponseInner&gt; listSupportedCountries()

List supported countries

This operation retrieves a list of supported countries that can be used when submitting Travel Rule information.  Use this endpoint to obtain valid country values for:   - Place of incorporation of a legal entity   - Place of birth of a natural person 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    try {
      List<ListSupportedCountries200ResponseInner> result = apiInstance.listSupportedCountries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#listSupportedCountries");
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

[**List&lt;ListSupportedCountries200ResponseInner&gt;**](ListSupportedCountries200ResponseInner.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of countries supported. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="submitDepositTravelRuleInfo"></a>
# **submitDepositTravelRuleInfo**
> SubmitDepositTravelRuleInfo201Response submitDepositTravelRuleInfo(travelRuleDepositRequest)

Submit Travel Rule information for deposits

This operation submits Travel Rule information for a deposit transaction. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    TravelRuleDepositRequest travelRuleDepositRequest = new TravelRuleDepositRequest();
    try {
      SubmitDepositTravelRuleInfo201Response result = apiInstance.submitDepositTravelRuleInfo(travelRuleDepositRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#submitDepositTravelRuleInfo");
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
| **travelRuleDepositRequest** | [**TravelRuleDepositRequest**](TravelRuleDepositRequest.md)|  | [optional] |

### Return type

[**SubmitDepositTravelRuleInfo201Response**](SubmitDepositTravelRuleInfo201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully submitted the Travel Rule information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="submitWithdrawTravelRuleInfo"></a>
# **submitWithdrawTravelRuleInfo**
> SubmitDepositTravelRuleInfo201Response submitWithdrawTravelRuleInfo(travelRuleWithdrawRequest)

Submit Travel Rule information for withdrawals

This operation submits Travel Rule information for a withdrawal transaction. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    TravelRuleWithdrawRequest travelRuleWithdrawRequest = new TravelRuleWithdrawRequest();
    try {
      SubmitDepositTravelRuleInfo201Response result = apiInstance.submitWithdrawTravelRuleInfo(travelRuleWithdrawRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#submitWithdrawTravelRuleInfo");
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
| **travelRuleWithdrawRequest** | [**TravelRuleWithdrawRequest**](TravelRuleWithdrawRequest.md)|  | [optional] |

### Return type

[**SubmitDepositTravelRuleInfo201Response**](SubmitDepositTravelRuleInfo201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully submitted the Travel Rule information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

