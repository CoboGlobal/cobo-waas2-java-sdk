# InternalSwapsApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkSwapWalletAddress**](InternalSwapsApi.md#checkSwapWalletAddress) | **GET** /internal/swaps/check_wallet_address | Check Swap Address |
| [**getSwapLimitsAndLiquidityInternally**](InternalSwapsApi.md#getSwapLimitsAndLiquidityInternally) | **GET** /internal/swaps/limits_and_liquidity | Get Swap Limits and Liquidity |
| [**listSwapReachableTokens**](InternalSwapsApi.md#listSwapReachableTokens) | **GET** /internal/swaps/reachable_tokens | List Swap Reachable Tokens |


<a id="checkSwapWalletAddress"></a>
# **checkSwapWalletAddress**
> CheckSwapWalletAddress200Response checkSwapWalletAddress(chainId, address)

Check Swap Address

This operation checks whether a given address belongs to a swap-related wallet. This is primarily used to identify bridge transactions and distinguish them from regular user transactions. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalSwapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalSwapsApi apiInstance = new InternalSwapsApi();
    String chainId = "ETH";
    String address = "0xd8dA6BF26964aF9D7eEd9e03E53415D37aA96045";
    try {
      CheckSwapWalletAddress200Response result = apiInstance.checkSwapWalletAddress(chainId, address);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalSwapsApi#checkSwapWalletAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chainId** | **String**| The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). | |
| **address** | **String**| The wallet address. | |

### Return type

[**CheckSwapWalletAddress200Response**](CheckSwapWalletAddress200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The wallet address check result has been successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getSwapLimitsAndLiquidityInternally"></a>
# **getSwapLimitsAndLiquidityInternally**
> SwapLimitsAndLiquidity getSwapLimitsAndLiquidityInternally(payTokenId, receiveTokenId, walletSubtype, type)

Get Swap Limits and Liquidity

This operation retrieves the trading limits and available liquidity for a specific swap trading pair. The limits include minimum and maximum amounts for both pay and receive tokens, as well as the available liquidity in both pay token and USD. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalSwapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalSwapsApi apiInstance = new InternalSwapsApi();
    String payTokenId = "ETH";
    String receiveTokenId = "USDT";
    WalletSubtype walletSubtype = WalletSubtype.fromValue("Asset");
    SwapType type = SwapType.fromValue("Bridge");
    try {
      SwapLimitsAndLiquidity result = apiInstance.getSwapLimitsAndLiquidityInternally(payTokenId, receiveTokenId, walletSubtype, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalSwapsApi#getSwapLimitsAndLiquidityInternally");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **payTokenId** | **String**| Unique id of the token to pay. | |
| **receiveTokenId** | **String**| Unique id of the token to receive. | |
| **walletSubtype** | [**WalletSubtype**](.md)| The wallet subtype.  - &#x60;Asset&#x60;: Custodial Wallets (Asset Wallets)  - &#x60;Web3&#x60;: Custodial Wallets (Web3 Wallets)  - &#x60;Main&#x60;: Exchange Wallets (Main Account)  - &#x60;Sub&#x60;: Exchange Wallets (Sub Account)  - &#x60;Org-Controlled&#x60;: MPC Wallets (Organization-Controlled Wallets)  - &#x60;User-Controlled&#x60;: MPC Wallets (User-Controlled Wallets)  - &#x60;Safe{Wallet}&#x60;: Smart Contract Wallets (Safe{Wallet})  | [enum: Asset, Web3, Org-Controlled, User-Controlled, Safe{Wallet}, Main, Sub] |
| **type** | [**SwapType**](.md)|  | [optional] [enum: Bridge, Exchange] |

### Return type

[**SwapLimitsAndLiquidity**](SwapLimitsAndLiquidity.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The swap limits and liquidity information have been successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listSwapReachableTokens"></a>
# **listSwapReachableTokens**
> ListSwapReachableTokens200Response listSwapReachableTokens(tokenId, type, amount)

List Swap Reachable Tokens

This operation retrieves a list of all tokens that can be reached through swap or bridge operations from a specified source token. The reachable tokens are filtered based on the swap type (Exchange or Bridge), amount limits, and organization access control.  This endpoint is useful for determining which destination tokens are available when planning swap or bridge transactions, especially for payment routing scenarios where you need to convert from one token to another. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalSwapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalSwapsApi apiInstance = new InternalSwapsApi();
    String tokenId = "ETH_USDT";
    SwapType type = SwapType.fromValue("Bridge");
    String amount = "1000";
    try {
      ListSwapReachableTokens200Response result = apiInstance.listSwapReachableTokens(tokenId, type, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalSwapsApi#listSwapReachableTokens");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **type** | [**SwapType**](.md)| The type of swap operation to filter by. This parameter is required to determine which brokers and tokens are available. - &#x60;Bridge&#x60;: Cross-chain token transfers (same token, different chains) - &#x60;Exchange&#x60;: Same-chain token swaps (different tokens, same chain)  | [enum: Bridge, Exchange] |
| **amount** | **String**| The amount of the source token to swap or bridge. When provided, the returned list will only include destination tokens that satisfy the minimum and maximum amount limits for this specific amount. If not provided, all reachable tokens will be returned regardless of amount limits.  | [optional] |

### Return type

[**ListSwapReachableTokens200Response**](ListSwapReachableTokens200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of reachable tokens has been successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

