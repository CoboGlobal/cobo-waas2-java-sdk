# TokenizationApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**burnTokenization**](TokenizationApi.md#burnTokenization) | **POST** /tokenization/tokens/{token_id}/burn | Burn tokens |
| [**estimateTokenizationFee**](TokenizationApi.md#estimateTokenizationFee) | **POST** /tokenization/estimate_fee | Estimate tokenization operation fee |
| [**getTokenizationActivity**](TokenizationApi.md#getTokenizationActivity) | **GET** /tokenization/activities/{activity_id} | Get tokenization activity details |
| [**getTokenizationAllowlistActivation**](TokenizationApi.md#getTokenizationAllowlistActivation) | **GET** /tokenization/tokens/{token_id}/allowlist/activation | Get allowlist activation status |
| [**getTokenizationInfo**](TokenizationApi.md#getTokenizationInfo) | **GET** /tokenization/tokens/{token_id} | Get token details |
| [**issueToken**](TokenizationApi.md#issueToken) | **POST** /tokenization/tokens | Issue a new token |
| [**listIssuedTokens**](TokenizationApi.md#listIssuedTokens) | **GET** /tokenization/tokens | List issued tokens |
| [**listTokenizationActivities**](TokenizationApi.md#listTokenizationActivities) | **GET** /tokenization/activities | List tokenization activities |
| [**listTokenizationAllowlistAddresses**](TokenizationApi.md#listTokenizationAllowlistAddresses) | **GET** /tokenization/tokens/{token_id}/allowlist/addresses | List allowlist addresses |
| [**listTokenizationBlocklistAddresses**](TokenizationApi.md#listTokenizationBlocklistAddresses) | **GET** /tokenization/tokens/{token_id}/blocklist/addresses | List tokenization blocklist addresses |
| [**listTokenizationHoldings**](TokenizationApi.md#listTokenizationHoldings) | **GET** /tokenization/tokens/{token_id}/holdings | Get token holdings information |
| [**listTokenizationSupportedChains**](TokenizationApi.md#listTokenizationSupportedChains) | **GET** /tokenization/enabled_chains | List tokenization supported chains |
| [**mintTokenization**](TokenizationApi.md#mintTokenization) | **POST** /tokenization/tokens/{token_id}/mint | Mint tokens |
| [**pauseTokenization**](TokenizationApi.md#pauseTokenization) | **POST** /tokenization/tokens/{token_id}/pause | Pause tokenization |
| [**tokenizationContractCall**](TokenizationApi.md#tokenizationContractCall) | **POST** /tokenization/tokens/{token_id}/contract_call | Contract call |
| [**unpauseTokenization**](TokenizationApi.md#unpauseTokenization) | **POST** /tokenization/tokens/{token_id}/unpause | Unpause tokenization |
| [**updateAllowlistAddresses**](TokenizationApi.md#updateAllowlistAddresses) | **POST** /tokenization/tokens/{token_id}/allowlist/addresses | Update allowlist addresses |
| [**updateTokenizationAllowlistActivation**](TokenizationApi.md#updateTokenizationAllowlistActivation) | **POST** /tokenization/tokens/{token_id}/allowlist/activation | Update allowlist activation |
| [**updateTokenizationBlocklistAddresses**](TokenizationApi.md#updateTokenizationBlocklistAddresses) | **POST** /tokenization/tokens/{token_id}/blocklist/addresses | Update tokenization blocklist addresses |


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
| **tokenizationBurnTokenRequest** | [**TokenizationBurnTokenRequest**](TokenizationBurnTokenRequest.md)| Request body for burning tokens | [optional] |

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
| **200** | Activity details retrieved successfully |  -  |
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
| **200** | Successful response with the allowlist activation status. |  -  |
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
| **200** | Successfully retrieved token information |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="issueToken"></a>
# **issueToken**
> TokenizationOperationResponse issueToken(tokenizationIssuedTokenRequest)

Issue a new token

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
| **tokenStandard** | [**TokenizationTokenStandard**](.md)| Filter by token standard | [optional] [enum: ERC20] |
| **status** | [**TokenizationStatus**](.md)| Filter by token status | [optional] [enum: Processing, Active, Failed, Pausing] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

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
    TokenizationOperationType activityType = TokenizationOperationType.fromValue("Deploy");
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
| **activityType** | [**TokenizationOperationType**](.md)| Filter by tokenization activity type. | [optional] [enum: Deploy, Issue, Mint, Burn, Pause, Unpause, UpdateAllowlistAddresses, UpdateBlocklistAddresses, ToggleAllowlist, ContractCall] |
| **activityStatus** | [**TokenizationActivityStatus**](.md)| Filter by tokenization activity status. | [optional] [enum: Processing, Success, Failed] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
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
| **200** | List of tokenization activities retrieved successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listTokenizationAllowlistAddresses"></a>
# **listTokenizationAllowlistAddresses**
> TokenizationAllowlistAddressesResponse listTokenizationAllowlistAddresses(tokenId, limit, after, before, direction)

List allowlist addresses

This operation lists the allowlist addresses of the token contract. 

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
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
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
| **200** | Successful response with the list of allowlist addresses. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listTokenizationBlocklistAddresses"></a>
# **listTokenizationBlocklistAddresses**
> ListTokenizationBlocklistAddresses200Response listTokenizationBlocklistAddresses(tokenId, limit, after, before, direction)

List tokenization blocklist addresses

This operation lists the tokenization blocklist addresses. 

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
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
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
| **200** | Successful response with the list of blocklist addresses. |  -  |
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
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

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
| **200** | Successfully retrieved token holdings information |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listTokenizationSupportedChains"></a>
# **listTokenizationSupportedChains**
> TokenizationListEnabledChainsResponse listTokenizationSupportedChains(limit, after, before)

List tokenization supported chains

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
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |

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
| **200** | List of tokenization supported chains retrieved successfully |  -  |
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
| **tokenizationMintTokenRequest** | [**TokenizationMintTokenRequest**](TokenizationMintTokenRequest.md)| The request body for minting tokens | |

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

Pause tokenization

This operation pauses the token contract. Creates a pause transaction that will stop the token contract. 

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
| **tokenizationPauseTokenRequest** | [**TokenizationPauseTokenRequest**](TokenizationPauseTokenRequest.md)| Request body for pausing tokens | [optional] |

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

Contract call

This operation calls a smart contract. 

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
| **tokenizationContractCallRequest** | [**TokenizationContractCallRequest**](TokenizationContractCallRequest.md)| Request body for contract call | [optional] |

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

Unpause tokenization

This operation unpauses the token contract. Creates an unpause transaction that will resume the token contract. 

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
| **tokenizationUnpauseTokenRequest** | [**TokenizationUnpauseTokenRequest**](TokenizationUnpauseTokenRequest.md)| Request body for unpausing tokens | [optional] |

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

<a id="updateAllowlistAddresses"></a>
# **updateAllowlistAddresses**
> TokenizationOperationResponse updateAllowlistAddresses(tokenId, tokenizationUpdateAllowlistAddressesRequest)

Update allowlist addresses

This operation updates the allowlist addresses of the token contract. 

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
      TokenizationOperationResponse result = apiInstance.updateAllowlistAddresses(tokenId, tokenizationUpdateAllowlistAddressesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenizationApi#updateAllowlistAddresses");
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
| **tokenizationUpdateAllowlistAddressesRequest** | [**TokenizationUpdateAllowlistAddressesRequest**](TokenizationUpdateAllowlistAddressesRequest.md)| Request body for managing multiple allowlist addresses (adding or removing). | [optional] |

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

Update allowlist activation

This operation updates the allowlist activation setting of the token contract. 

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
| **tokenizationAllowlistActivationRequest** | [**TokenizationAllowlistActivationRequest**](TokenizationAllowlistActivationRequest.md)| Request body for updating the allowlist activation setting. | [optional] |

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

Update tokenization blocklist addresses

This operation updates the tokenization blocklist addresses. 

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
| **tokenizationUpdateBlocklistAddressesRequest** | [**TokenizationUpdateBlocklistAddressesRequest**](TokenizationUpdateBlocklistAddressesRequest.md)| Request body for managing multiple blocklist addresses (adding or removing). | [optional] |

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

