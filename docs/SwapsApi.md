# SwapsApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSwapActivity**](SwapsApi.md#createSwapActivity) | **POST** /swaps/swap | Create swap activity |
| [**estimateSwapFee**](SwapsApi.md#estimateSwapFee) | **POST** /swaps/estimate_fee | Estimate swap fee |
| [**getSwapActivity**](SwapsApi.md#getSwapActivity) | **GET** /swaps/activities/{activity_id} | Get swap activity |
| [**getSwapQuote**](SwapsApi.md#getSwapQuote) | **GET** /swaps/quote | Get swap quote |
| [**listSwapActivities**](SwapsApi.md#listSwapActivities) | **GET** /swaps/activities | List swap activities |
| [**listSwapEnabledTokens**](SwapsApi.md#listSwapEnabledTokens) | **GET** /swaps/enabled_tokens | List enabled tokens for swap |


<a id="createSwapActivity"></a>
# **createSwapActivity**
> SwapActivityDetail createSwapActivity(createSwapActivityRequest)

Create swap activity

This operation creates a swap activity. A swap activity can be either a bridge (cross-chain transfer) or an exchange (token-to-token swap on the same chain). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.SwapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    SwapsApi apiInstance = new SwapsApi();
    CreateSwapActivityRequest createSwapActivityRequest = new CreateSwapActivityRequest();
    try {
      SwapActivityDetail result = apiInstance.createSwapActivity(createSwapActivityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SwapsApi#createSwapActivity");
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
| **createSwapActivityRequest** | [**CreateSwapActivityRequest**](CreateSwapActivityRequest.md)| The request body for creating a swap activity. | |

### Return type

[**SwapActivityDetail**](SwapActivityDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The swap activity details successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="estimateSwapFee"></a>
# **estimateSwapFee**
> EstimatedFee estimateSwapFee(swapEstimateFee)

Estimate swap fee

This operation estimates the network fee of a swap activity. You can use this operation to estimate the network fee before initiating swap activities from MPC Wallets or Web3 Wallets.  It requires a valid &#x60;wallet_id&#x60; and &#x60;quote_id&#x60;, so you need to [get a swap quote](https://www.cobo.com/developers/v2/api-references/swaps/get-swap-quote) first. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.SwapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    SwapsApi apiInstance = new SwapsApi();
    SwapEstimateFee swapEstimateFee = new SwapEstimateFee();
    try {
      EstimatedFee result = apiInstance.estimateSwapFee(swapEstimateFee);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SwapsApi#estimateSwapFee");
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
| **swapEstimateFee** | [**SwapEstimateFee**](SwapEstimateFee.md)| The request body for estimating the network fee of a swap activity. | |

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
| **201** | The estimated service fee for swap activity successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getSwapActivity"></a>
# **getSwapActivity**
> SwapActivityDetail getSwapActivity(activityId)

Get swap activity

This operation retrieves detailed information about a specified swap activity. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.SwapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    SwapsApi apiInstance = new SwapsApi();
    String activityId = "f47ac10b-58cc-4372-a567-0e02b2c3d479";
    try {
      SwapActivityDetail result = apiInstance.getSwapActivity(activityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SwapsApi#getSwapActivity");
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
| **activityId** | **String**| The unique identifier of the swap activity. | |

### Return type

[**SwapActivityDetail**](SwapActivityDetail.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The swap activity details successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getSwapQuote"></a>
# **getSwapQuote**
> SwapQuote getSwapQuote(walletId, payTokenId, receiveTokenId, payAmount, receiveAmount)

Get swap quote

This operation retrieves the current market exchange rate and estimated service fee. You need to provide &#x60;wallet_id&#x60;, &#x60;pay_token_id&#x60;, and &#x60;receive_token_id&#x60;, along with either &#x60;pay_amount&#x60; or &#x60;receive_amount&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.SwapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    SwapsApi apiInstance = new SwapsApi();
    UUID walletId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    String payTokenId = "ETH";
    String receiveTokenId = "USDT";
    String payAmount = "1.5";
    String receiveAmount = "2000";
    try {
      SwapQuote result = apiInstance.getSwapQuote(walletId, payTokenId, receiveTokenId, payAmount, receiveAmount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SwapsApi#getSwapQuote");
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
| **walletId** | **UUID**| The wallet ID. | |
| **payTokenId** | **String**| The ID of the token to pay. | |
| **receiveTokenId** | **String**| The ID of the token to receive. | |
| **payAmount** | **String**| The amount of the token to pay. | [optional] |
| **receiveAmount** | **String**| The amount of the token to receive. | [optional] |

### Return type

[**SwapQuote**](SwapQuote.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The swap quote successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listSwapActivities"></a>
# **listSwapActivities**
> ListSwapActivities200Response listSwapActivities(type, status, minUpdatedTimestamp, maxUpdatedTimestamp, initiator, limit, before, after, sortBy, direction)

List swap activities

This operation retrieves a list of swap activities. You can filter the results by swap type, status, initiator, and time range. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.SwapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    SwapsApi apiInstance = new SwapsApi();
    SwapType type = SwapType.fromValue("Bridge");
    SwapActivityStatus status = SwapActivityStatus.fromValue("Success");
    Long minUpdatedTimestamp = 1635744000000L;
    Long maxUpdatedTimestamp = 1635744000000L;
    String initiator = "steve@example.com";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String sortBy = "created_timestamp";
    String direction = "ASC";
    try {
      ListSwapActivities200Response result = apiInstance.listSwapActivities(type, status, minUpdatedTimestamp, maxUpdatedTimestamp, initiator, limit, before, after, sortBy, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SwapsApi#listSwapActivities");
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
| **type** | [**SwapType**](.md)|  | [optional] [enum: Bridge, Exchange] |
| **status** | [**SwapActivityStatus**](.md)|  | [optional] [enum: Success, Processing, Failed] |
| **minUpdatedTimestamp** | **Long**| The start time of the query. All swap activities updated after the specified time will be retrieved. The time is in Unix timestamp format, measured in milliseconds. | [optional] |
| **maxUpdatedTimestamp** | **Long**| The end time of the query. All swap activities updated before the specified time will be retrieved. The time is in Unix timestamp format, measured in milliseconds. | [optional] |
| **initiator** | **String**| The initiator of the swap activity. It is optional when creating the activity and defaults to your API key if not specified. | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| A cursor indicating the position before the current page. This value is generated by Cobo and returned in the response. If you are paginating forward from the beginning, you do not need to provide it on the first request. When paginating backward (to the previous page), you should pass the before value returned from the last response.  | [optional] |
| **after** | **String**| A cursor indicating the position after the current page. This value is generated by Cobo and returned in the response. You do not need to provide it on the first request. When paginating forward (to the next page), you should pass the after value returned from the last response.  | [optional] |
| **sortBy** | **String**| The field to sort the results by.   Possible values include: - &#x60;created_timestamp&#x60;: Sort by the time when the data was created. - &#x60;updated_timestamp&#x60;: Sort by the time when the data was last updated.  | [optional] [enum: created_timestamp, updated_timestamp] |
| **direction** | **String**| The sort direction. Possible values include:   - &#x60;ASC&#x60;: Sort the results in ascending order.   - &#x60;DESC&#x60;: Sort the results in descending order.  | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**ListSwapActivities200Response**](ListSwapActivities200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of swap activities successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listSwapEnabledTokens"></a>
# **listSwapEnabledTokens**
> ListSwapEnabledTokens200Response listSwapEnabledTokens(type, assetId, chainId, limit, before, after)

List enabled tokens for swap

This operation retrieves a list of tokens that are enabled for the swap feature. You can filter the results by swap type, asset ID, and chain ID. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.SwapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    SwapsApi apiInstance = new SwapsApi();
    SwapType type = SwapType.fromValue("Bridge");
    String assetId = "USDT";
    String chainId = "ETH";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListSwapEnabledTokens200Response result = apiInstance.listSwapEnabledTokens(type, assetId, chainId, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SwapsApi#listSwapEnabledTokens");
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
| **type** | [**SwapType**](.md)|  | [optional] [enum: Bridge, Exchange] |
| **assetId** | **String**| (This concept applies to Exchange Wallets only) The asset ID. An asset ID is the unique identifier of the asset held within your linked exchange account. | [optional] |
| **chainId** | **String**| The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| A cursor indicating the position before the current page. This value is generated by Cobo and returned in the response. If you are paginating forward from the beginning, you do not need to provide it on the first request. When paginating backward (to the previous page), you should pass the before value returned from the last response.  | [optional] |
| **after** | **String**| A cursor indicating the position after the current page. This value is generated by Cobo and returned in the response. You do not need to provide it on the first request. When paginating forward (to the next page), you should pass the after value returned from the last response.  | [optional] |

### Return type

[**ListSwapEnabledTokens200Response**](ListSwapEnabledTokens200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of enabled tokens successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

