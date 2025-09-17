# TokenizationApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**burnTokenization**](TokenizationApi.md#burnTokenization) | **POST** /tokenization/tokens/{token_id}/burn | Burn tokens |
| [**estimateTokenizationFee**](TokenizationApi.md#estimateTokenizationFee) | **POST** /tokenization/estimate_fee | Estimate tokenization operation fee |
| [**getTokenizationActivity**](TokenizationApi.md#getTokenizationActivity) | **GET** /tokenization/activities/{activity_id} | Get tokenization activity details |
| [**getTokenizationAllowlistActivation**](TokenizationApi.md#getTokenizationAllowlistActivation) | **GET** /tokenization/tokens/{token_id}/allowlist/activation | Get allowlist activation status |
| [**getTokenizationInfo**](TokenizationApi.md#getTokenizationInfo) | **GET** /tokenization/tokens/{token_id} | Get token details |
| [**issueToken**](TokenizationApi.md#issueToken) | **POST** /tokenization/tokens | Issue token |
| [**listIssuedTokens**](TokenizationApi.md#listIssuedTokens) | **GET** /tokenization/tokens | List issued tokens |
| [**listTokenizationActivities**](TokenizationApi.md#listTokenizationActivities) | **GET** /tokenization/activities | List tokenization activities |
| [**listTokenizationAllowlistAddresses**](TokenizationApi.md#listTokenizationAllowlistAddresses) | **GET** /tokenization/tokens/{token_id}/allowlist/addresses | List addresses on allowlist |
| [**listTokenizationBlocklistAddresses**](TokenizationApi.md#listTokenizationBlocklistAddresses) | **GET** /tokenization/tokens/{token_id}/blocklist/addresses | List addresses on blocklist |
| [**listTokenizationHoldings**](TokenizationApi.md#listTokenizationHoldings) | **GET** /tokenization/tokens/{token_id}/holdings | Get token holdings information |
| [**listTokenizationSupportedChains**](TokenizationApi.md#listTokenizationSupportedChains) | **GET** /tokenization/enabled_chains | List supported chains for tokenization |
| [**mintTokenization**](TokenizationApi.md#mintTokenization) | **POST** /tokenization/tokens/{token_id}/mint | Mint tokens |
| [**pauseTokenization**](TokenizationApi.md#pauseTokenization) | **POST** /tokenization/tokens/{token_id}/pause | Pause token contract |
| [**tokenizationContractCall**](TokenizationApi.md#tokenizationContractCall) | **POST** /tokenization/tokens/{token_id}/contract_call | Call token contract |
| [**unpauseTokenization**](TokenizationApi.md#unpauseTokenization) | **POST** /tokenization/tokens/{token_id}/unpause | Unpause token contract |
| [**updateTokenizationAllowlistActivation**](TokenizationApi.md#updateTokenizationAllowlistActivation) | **POST** /tokenization/tokens/{token_id}/allowlist/activation | Activate or deactivate allowlist |
| [**updateTokenizationAllowlistAddresses**](TokenizationApi.md#updateTokenizationAllowlistAddresses) | **POST** /tokenization/tokens/{token_id}/allowlist/addresses | Update addresses on allowlist |
| [**updateTokenizationBlocklistAddresses**](TokenizationApi.md#updateTokenizationBlocklistAddresses) | **POST** /tokenization/tokens/{token_id}/blocklist/addresses | Update addresses on blocklist |


<a id="burnTokenization"></a>
# **burnTokenization**
> TokenizationOperationResponse burnTokenization(tokenId, tokenizationBurnTokenRequest)

Burn tokens

This operation burns tokens from a specified address. Creates a burn transaction that will decrease the token supply. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    TokenizationBurnTokenRequest tokenizationBurnTokenRequest = new TokenizationBurnTokenRequest();
    try {
      TokenizationOperationResponse result = apiInstance.burnTokenization(tokenId, tokenizationBurnTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#burnTokenization");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. | |
| **tokenizationBurnTokenRequest** | [**TokenizationBurnTokenRequest**](TokenizationBurnTokenRequest.md)| The request body for burning tokens. | [optional] |

### Return type

[**TokenizationOperationResponse**](TokenizationOperationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Tokenization operation transaction created successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="estimateTokenizationFee"></a>
# **estimateTokenizationFee**
> EstimatedFee estimateTokenizationFee(tokenizationEstimateFeeRequest)

Estimate tokenization operation fee

This operation estimates the fee required for tokenization operations. For EVM-based chains, this calculates the gas cost for the specified operation. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    TokenizationEstimateFeeRequest tokenizationEstimateFeeRequest = new TokenizationEstimateFeeRequest();
    try {
      EstimatedFee result = apiInstance.estimateTokenizationFee(tokenizationEstimateFeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#estimateTokenizationFee");
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
| **tokenizationEstimateFeeRequest** | [**TokenizationEstimateFeeRequest**](TokenizationEstimateFeeRequest.md)| The request body to estimate tokenization operation fee. | |

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
| **201** | Successfully retrieved the estimated fee for token issuance. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getTokenizationActivity"></a>
# **getTokenizationActivity**
> TokenizationActivityInfo getTokenizationActivity(activityId)

Get tokenization activity details

This operation retrieves the detailed information for a specific tokenization activity by its ID. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    UUID activityId = UUID.fromString("b7c8e9d0-f1a2-3b4c-5d6e-7f8a9b0c1d2e");
    try {
      TokenizationActivityInfo result = apiInstance.getTokenizationActivity(activityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#getTokenizationActivity");
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
| **activityId** | **UUID**| The ID of the activity. | |

### Return type

[**TokenizationActivityInfo**](TokenizationActivityInfo.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved Activity details. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getTokenizationAllowlistActivation"></a>
# **getTokenizationAllowlistActivation**
> GetTokenizationAllowlistActivation200Response getTokenizationAllowlistActivation(tokenId)

Get allowlist activation status

This operation retrieves the allowlist activation status of the token contract. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    try {
      GetTokenizationAllowlistActivation200Response result = apiInstance.getTokenizationAllowlistActivation(tokenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#getTokenizationAllowlistActivation");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. | |

### Return type

[**GetTokenizationAllowlistActivation200Response**](GetTokenizationAllowlistActivation200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the allowlist activation status. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getTokenizationInfo"></a>
# **getTokenizationInfo**
> TokenizationTokenDetailInfo getTokenizationInfo(tokenId)

Get token details

This operation retrieves the detailed information for a specific issued token by its ID. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    try {
      TokenizationTokenDetailInfo result = apiInstance.getTokenizationInfo(tokenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#getTokenizationInfo");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. | |

### Return type

[**TokenizationTokenDetailInfo**](TokenizationTokenDetailInfo.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved token information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="issueToken"></a>
# **issueToken**
> TokenizationOperationResponse issueToken(tokenizationIssuedTokenRequest)

Issue token

This operation issues a new token contract. It supports various blockchain platforms.  For EVM-based chains, this involves issuing a new smart contract from a template. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    TokenizationIssuedTokenRequest tokenizationIssuedTokenRequest = new TokenizationIssuedTokenRequest();
    try {
      TokenizationOperationResponse result = apiInstance.issueToken(tokenizationIssuedTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#issueToken");
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
| **tokenizationIssuedTokenRequest** | [**TokenizationIssuedTokenRequest**](TokenizationIssuedTokenRequest.md)| The request body to issue a new token. | |

### Return type

[**TokenizationOperationResponse**](TokenizationOperationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Tokenization operation transaction created successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listIssuedTokens"></a>
# **listIssuedTokens**
> TokenizationListTokenInfoResponse listIssuedTokens(chainId, tokenId, tokenStandard, status, limit, before, after)

List issued tokens

This operation retrieves a list of tokens issued by the organization. Returns issued token information including total supply, holdings, and token status. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String chainId = "ETH";
    String tokenId = "ETH_USDT";
    TokenizationTokenStandard tokenStandard = TokenizationTokenStandard.fromValue("ERC20");
    TokenizationStatus status = TokenizationStatus.fromValue("Processing");
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      TokenizationListTokenInfoResponse result = apiInstance.listIssuedTokens(chainId, tokenId, tokenStandard, status, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#listIssuedTokens");
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
| **chainId** | **String**| The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). | [optional] |
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). | [optional] |
| **tokenStandard** | [**TokenizationTokenStandard**](.md)| Filter by token standard. | [optional] [enum: ERC20, SPLToken2022] |
| **status** | [**TokenizationStatus**](.md)| Filter by token status. | [optional] [enum: Processing, Active, Failed, Pausing] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| A cursor indicating the position before the current page. This value is generated by Cobo and returned in the response. If you are paginating forward from the beginning, you do not need to provide it on the first request. When paginating backward (to the previous page), you should pass the before value returned from the last response.  | [optional] |
| **after** | **String**| A cursor indicating the position after the current page. This value is generated by Cobo and returned in the response. You do not need to provide it on the first request. When paginating forward (to the next page), you should pass the after value returned from the last response.  | [optional] |

### Return type

[**TokenizationListTokenInfoResponse**](TokenizationListTokenInfoResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with the list of token information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listTokenizationActivities"></a>
# **listTokenizationActivities**
> TokenizationListActivitiesResponse listTokenizationActivities(tokenId, activityType, activityStatus, limit, after, before, direction)

List tokenization activities

This operation retrieves a list of tokenization activities. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    TokenizationOperationType activityType = TokenizationOperationType.fromValue("Issue");
    TokenizationActivityStatus activityStatus = TokenizationActivityStatus.fromValue("Processing");
    Integer limit = 10;
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String direction = "ASC";
    try {
      TokenizationListActivitiesResponse result = apiInstance.listTokenizationActivities(tokenId, activityType, activityStatus, limit, after, before, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#listTokenizationActivities");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). | [optional] |
| **activityType** | [**TokenizationOperationType**](.md)| Filter by tokenization activity type. | [optional] [enum: Issue, Mint, Burn, Pause, Unpause, UpdateAllowlistAddresses, UpdateBlocklistAddresses, ToggleAllowlist, ContractCall] |
| **activityStatus** | [**TokenizationActivityStatus**](.md)| Filter by tokenization activity status. | [optional] [enum: Processing, Success, Failed] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **after** | **String**| A cursor indicating the position after the current page. This value is generated by Cobo and returned in the response. You do not need to provide it on the first request. When paginating forward (to the next page), you should pass the after value returned from the last response.  | [optional] |
| **before** | **String**| A cursor indicating the position before the current page. This value is generated by Cobo and returned in the response. If you are paginating forward from the beginning, you do not need to provide it on the first request. When paginating backward (to the previous page), you should pass the before value returned from the last response.  | [optional] |
| **direction** | **String**| The sort direction. Possible values include:   - &#x60;ASC&#x60;: Sort the results in ascending order.   - &#x60;DESC&#x60;: Sort the results in descending order.  | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**TokenizationListActivitiesResponse**](TokenizationListActivitiesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of tokenization activities. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listTokenizationAllowlistAddresses"></a>
# **listTokenizationAllowlistAddresses**
> TokenizationAllowlistAddressesResponse listTokenizationAllowlistAddresses(tokenId, limit, after, before, direction)

List addresses on allowlist

This operation lists addresses on the allowlist. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    Integer limit = 10;
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String direction = "ASC";
    try {
      TokenizationAllowlistAddressesResponse result = apiInstance.listTokenizationAllowlistAddresses(tokenId, limit, after, before, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#listTokenizationAllowlistAddresses");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. | |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **after** | **String**| A cursor indicating the position after the current page. This value is generated by Cobo and returned in the response. You do not need to provide it on the first request. When paginating forward (to the next page), you should pass the after value returned from the last response.  | [optional] |
| **before** | **String**| A cursor indicating the position before the current page. This value is generated by Cobo and returned in the response. If you are paginating forward from the beginning, you do not need to provide it on the first request. When paginating backward (to the previous page), you should pass the before value returned from the last response.  | [optional] |
| **direction** | **String**| The sort direction. Possible values include:   - &#x60;ASC&#x60;: Sort the results in ascending order.   - &#x60;DESC&#x60;: Sort the results in descending order.  | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**TokenizationAllowlistAddressesResponse**](TokenizationAllowlistAddressesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved addresses on the allowlist. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listTokenizationBlocklistAddresses"></a>
# **listTokenizationBlocklistAddresses**
> ListTokenizationBlocklistAddresses200Response listTokenizationBlocklistAddresses(tokenId, limit, after, before, direction)

List addresses on blocklist

This operation lists addresses on the blocklist. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    Integer limit = 10;
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String direction = "ASC";
    try {
      ListTokenizationBlocklistAddresses200Response result = apiInstance.listTokenizationBlocklistAddresses(tokenId, limit, after, before, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#listTokenizationBlocklistAddresses");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. | |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **after** | **String**| A cursor indicating the position after the current page. This value is generated by Cobo and returned in the response. You do not need to provide it on the first request. When paginating forward (to the next page), you should pass the after value returned from the last response.  | [optional] |
| **before** | **String**| A cursor indicating the position before the current page. This value is generated by Cobo and returned in the response. If you are paginating forward from the beginning, you do not need to provide it on the first request. When paginating backward (to the previous page), you should pass the before value returned from the last response.  | [optional] |
| **direction** | **String**| The sort direction. Possible values include:   - &#x60;ASC&#x60;: Sort the results in ascending order.   - &#x60;DESC&#x60;: Sort the results in descending order.  | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**ListTokenizationBlocklistAddresses200Response**](ListTokenizationBlocklistAddresses200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved addresses on the blocklist. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listTokenizationHoldings"></a>
# **listTokenizationHoldings**
> TokenizationListHoldingsResponse listTokenizationHoldings(tokenId, limit, before, after)

Get token holdings information

This operation retrieves the holdings information for a specific issued token, showing which wallets hold the token and their respective balances. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      TokenizationListHoldingsResponse result = apiInstance.listTokenizationHoldings(tokenId, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#listTokenizationHoldings");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. | |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| A cursor indicating the position before the current page. This value is generated by Cobo and returned in the response. If you are paginating forward from the beginning, you do not need to provide it on the first request. When paginating backward (to the previous page), you should pass the before value returned from the last response.  | [optional] |
| **after** | **String**| A cursor indicating the position after the current page. This value is generated by Cobo and returned in the response. You do not need to provide it on the first request. When paginating forward (to the next page), you should pass the after value returned from the last response.  | [optional] |

### Return type

[**TokenizationListHoldingsResponse**](TokenizationListHoldingsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved token holdings information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listTokenizationSupportedChains"></a>
# **listTokenizationSupportedChains**
> TokenizationListEnabledChainsResponse listTokenizationSupportedChains(limit, after, before)

List supported chains for tokenization

This operation retrieves a list of tokenization supported chains. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    Integer limit = 10;
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    try {
      TokenizationListEnabledChainsResponse result = apiInstance.listTokenizationSupportedChains(limit, after, before);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#listTokenizationSupportedChains");
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
| **after** | **String**| A cursor indicating the position after the current page. This value is generated by Cobo and returned in the response. You do not need to provide it on the first request. When paginating forward (to the next page), you should pass the after value returned from the last response.  | [optional] |
| **before** | **String**| A cursor indicating the position before the current page. This value is generated by Cobo and returned in the response. If you are paginating forward from the beginning, you do not need to provide it on the first request. When paginating backward (to the previous page), you should pass the before value returned from the last response.  | [optional] |

### Return type

[**TokenizationListEnabledChainsResponse**](TokenizationListEnabledChainsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of tokenization supported chains. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="mintTokenization"></a>
# **mintTokenization**
> TokenizationOperationResponse mintTokenization(tokenId, tokenizationMintTokenRequest)

Mint tokens

This operation mints new tokens to a specified address. Creates a mint transaction that will increase the token supply. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    TokenizationMintTokenRequest tokenizationMintTokenRequest = new TokenizationMintTokenRequest();
    try {
      TokenizationOperationResponse result = apiInstance.mintTokenization(tokenId, tokenizationMintTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#mintTokenization");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. | |
| **tokenizationMintTokenRequest** | [**TokenizationMintTokenRequest**](TokenizationMintTokenRequest.md)| The request body for minting tokens. | |

### Return type

[**TokenizationOperationResponse**](TokenizationOperationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Tokenization operation transaction created successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="pauseTokenization"></a>
# **pauseTokenization**
> TokenizationOperationResponse pauseTokenization(tokenId, tokenizationPauseTokenRequest)

Pause token contract

This operation pauses the token contract, temporarily halting token operations and transfers. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    TokenizationPauseTokenRequest tokenizationPauseTokenRequest = new TokenizationPauseTokenRequest();
    try {
      TokenizationOperationResponse result = apiInstance.pauseTokenization(tokenId, tokenizationPauseTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#pauseTokenization");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. | |
| **tokenizationPauseTokenRequest** | [**TokenizationPauseTokenRequest**](TokenizationPauseTokenRequest.md)| The request body for pausing tokens. | [optional] |

### Return type

[**TokenizationOperationResponse**](TokenizationOperationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Tokenization operation transaction created successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="tokenizationContractCall"></a>
# **tokenizationContractCall**
> TokenizationOperationResponse tokenizationContractCall(tokenId, tokenizationContractCallRequest)

Call token contract

This operation performs a contract call on the token contract. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    TokenizationContractCallRequest tokenizationContractCallRequest = new TokenizationContractCallRequest();
    try {
      TokenizationOperationResponse result = apiInstance.tokenizationContractCall(tokenId, tokenizationContractCallRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#tokenizationContractCall");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. | |
| **tokenizationContractCallRequest** | [**TokenizationContractCallRequest**](TokenizationContractCallRequest.md)| The request body for contract call. | [optional] |

### Return type

[**TokenizationOperationResponse**](TokenizationOperationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Tokenization operation transaction created successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="unpauseTokenization"></a>
# **unpauseTokenization**
> TokenizationOperationResponse unpauseTokenization(tokenId, tokenizationUnpauseTokenRequest)

Unpause token contract

This operation unpauses the token contract, resuming token operations and transfers. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    TokenizationUnpauseTokenRequest tokenizationUnpauseTokenRequest = new TokenizationUnpauseTokenRequest();
    try {
      TokenizationOperationResponse result = apiInstance.unpauseTokenization(tokenId, tokenizationUnpauseTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#unpauseTokenization");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. | |
| **tokenizationUnpauseTokenRequest** | [**TokenizationUnpauseTokenRequest**](TokenizationUnpauseTokenRequest.md)| The request body for unpausing tokens. | [optional] |

### Return type

[**TokenizationOperationResponse**](TokenizationOperationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Tokenization operation transaction created successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateTokenizationAllowlistActivation"></a>
# **updateTokenizationAllowlistActivation**
> TokenizationOperationResponse updateTokenizationAllowlistActivation(tokenId, tokenizationAllowlistActivationRequest)

Activate or deactivate allowlist

This operation activates or deactivates the allowlist. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    TokenizationAllowlistActivationRequest tokenizationAllowlistActivationRequest = new TokenizationAllowlistActivationRequest();
    try {
      TokenizationOperationResponse result = apiInstance.updateTokenizationAllowlistActivation(tokenId, tokenizationAllowlistActivationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#updateTokenizationAllowlistActivation");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. | |
| **tokenizationAllowlistActivationRequest** | [**TokenizationAllowlistActivationRequest**](TokenizationAllowlistActivationRequest.md)| The request body for activating or deactivating the allowlist. | [optional] |

### Return type

[**TokenizationOperationResponse**](TokenizationOperationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Tokenization operation transaction created successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateTokenizationAllowlistAddresses"></a>
# **updateTokenizationAllowlistAddresses**
> TokenizationOperationResponse updateTokenizationAllowlistAddresses(tokenId, tokenizationUpdateAllowlistAddressesRequest)

Update addresses on allowlist

This operation updates addresses on the allowlist. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    TokenizationUpdateAllowlistAddressesRequest tokenizationUpdateAllowlistAddressesRequest = new TokenizationUpdateAllowlistAddressesRequest();
    try {
      TokenizationOperationResponse result = apiInstance.updateTokenizationAllowlistAddresses(tokenId, tokenizationUpdateAllowlistAddressesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#updateTokenizationAllowlistAddresses");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. | |
| **tokenizationUpdateAllowlistAddressesRequest** | [**TokenizationUpdateAllowlistAddressesRequest**](TokenizationUpdateAllowlistAddressesRequest.md)| The request body for adding or removing multiple addresses on the allowlist. | [optional] |

### Return type

[**TokenizationOperationResponse**](TokenizationOperationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Tokenization operation transaction created successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateTokenizationBlocklistAddresses"></a>
# **updateTokenizationBlocklistAddresses**
> TokenizationOperationResponse updateTokenizationBlocklistAddresses(tokenId, tokenizationUpdateBlocklistAddressesRequest)

Update addresses on blocklist

This operation updates addresses on the blocklist. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TokenizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TokenizationApi apiInstance = new TokenizationApi();
    String tokenId = "ETH_USDT";
    TokenizationUpdateBlocklistAddressesRequest tokenizationUpdateBlocklistAddressesRequest = new TokenizationUpdateBlocklistAddressesRequest();
    try {
      TokenizationOperationResponse result = apiInstance.updateTokenizationBlocklistAddresses(tokenId, tokenizationUpdateBlocklistAddressesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#updateTokenizationBlocklistAddresses");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. | |
| **tokenizationUpdateBlocklistAddressesRequest** | [**TokenizationUpdateBlocklistAddressesRequest**](TokenizationUpdateBlocklistAddressesRequest.md)| The request body for adding or removing multiple addresses on the blocklist. | [optional] |

### Return type

[**TokenizationOperationResponse**](TokenizationOperationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Tokenization operation transaction created successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

