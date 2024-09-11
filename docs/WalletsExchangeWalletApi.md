# WalletsExchangeWalletApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAssetBalancesForExchangeWallet**](WalletsExchangeWalletApi.md#listAssetBalancesForExchangeWallet) | **GET** /wallets/{wallet_id}/exchanges/assets | List asset balances |
| [**listExchanges**](WalletsExchangeWalletApi.md#listExchanges) | **GET** /wallets/exchanges | List supported exchanges |
| [**listSupportedAssetsForExchange**](WalletsExchangeWalletApi.md#listSupportedAssetsForExchange) | **GET** /wallets/exchanges/{exchange_id}/assets | List supported assets |
| [**listSupportedChainsForExchange**](WalletsExchangeWalletApi.md#listSupportedChainsForExchange) | **GET** /wallets/exchanges/{exchange_id}/assets/{asset_id}/chains | List supported chains |


<a id="listAssetBalancesForExchangeWallet"></a>
# **listAssetBalancesForExchangeWallet**
> ListAssetBalancesForExchangeWallet200Response listAssetBalancesForExchangeWallet(walletId, tradingAccountTypes, assetIds, limit, before, after)

List asset balances

This operation retrieves the asset balances in a specified Exchange Wallet. You can filter the results by trading account type or asset ID. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsExchangeWalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsExchangeWalletApi apiInstance = new WalletsExchangeWalletApi();
    UUID walletId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    String tradingAccountTypes = "Trading,Funding";
    String assetIds = "USDT,USDC";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListAssetBalancesForExchangeWallet200Response result = apiInstance.listAssetBalancesForExchangeWallet(walletId, tradingAccountTypes, assetIds, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsExchangeWalletApi#listAssetBalancesForExchangeWallet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **tradingAccountTypes** | **String**| A list of trading account types, separated by comma. You can get the the supported trading account types of an exchange by calling [List supported exchanges](/v2/api-references/wallets--exchange-wallet/list-supported-exchanges). | [optional] |
| **assetIds** | **String**| (This concept applies to Exchange Wallets only) A list of asset IDs, separated by comma. An asset ID is the unique identifier of the asset held within your linked exchange account. | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| An object ID that serves as a starting point for retrieving data in reverse chronological order. For example, if you specify &#x60;before&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;, the request will retrieve a list of data objects that end before the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;. You can set this parameter to the value of &#x60;pagination.before&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  - If you set &#x60;before&#x60; to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| An object ID that acts as a starting point for retrieving data in chronological order. For example, if you specify &#x60;after&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;, the request will retrieve a list of data objects that start after the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;. You can set this parameter to the value of &#x60;pagination.after&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListAssetBalancesForExchangeWallet200Response**](ListAssetBalancesForExchangeWallet200Response.md)

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

<a id="listExchanges"></a>
# **listExchanges**
> List&lt;ListExchanges200ResponseInner&gt; listExchanges()

List supported exchanges

This operation retrieves the information about the exchanges supported by Cobo&#39;s Exchange Wallets, including exchange IDs and trading account types.

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsExchangeWalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsExchangeWalletApi apiInstance = new WalletsExchangeWalletApi();
    try {
      List<ListExchanges200ResponseInner> result = apiInstance.listExchanges();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsExchangeWalletApi#listExchanges");
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

[**List&lt;ListExchanges200ResponseInner&gt;**](ListExchanges200ResponseInner.md)

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

<a id="listSupportedAssetsForExchange"></a>
# **listSupportedAssetsForExchange**
> ListSupportedAssetsForExchange200Response listSupportedAssetsForExchange(exchangeId, limit, before, after)

List supported assets

This operation retrieves all the assets supported by a specified exchange.

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsExchangeWalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsExchangeWalletApi apiInstance = new WalletsExchangeWalletApi();
    ExchangeId exchangeId = ExchangeId.fromValue("binance");
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListSupportedAssetsForExchange200Response result = apiInstance.listSupportedAssetsForExchange(exchangeId, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsExchangeWalletApi#listSupportedAssetsForExchange");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **exchangeId** | [**ExchangeId**](.md)| The ID of the exchange. Possible values include:   - &#x60;binance&#x60;: Binance.   - &#x60;okx&#x60;: OKX.   - &#x60;deribit&#x60;: Deribit.   - &#x60;bybit&#x60;: Bybit.   - &#x60;gate&#x60;: Gate.io   - &#x60;bitget&#x60;: Bitget  | [enum: binance, okx, deribit, bybit, gate, bitget] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| An object ID that serves as a starting point for retrieving data in reverse chronological order. For example, if you specify &#x60;before&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;, the request will retrieve a list of data objects that end before the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;. You can set this parameter to the value of &#x60;pagination.before&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  - If you set &#x60;before&#x60; to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| An object ID that acts as a starting point for retrieving data in chronological order. For example, if you specify &#x60;after&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;, the request will retrieve a list of data objects that start after the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;. You can set this parameter to the value of &#x60;pagination.after&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListSupportedAssetsForExchange200Response**](ListSupportedAssetsForExchange200Response.md)

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

<a id="listSupportedChainsForExchange"></a>
# **listSupportedChainsForExchange**
> List&lt;ChainInfo&gt; listSupportedChainsForExchange(exchangeId, assetId)

List supported chains

This operation retrieves all the chains supported by a specified exchange for a given asset.   You can use this operation to confirm whether you can transfer an asset from or to your Exchange Wallet when using a specific chain. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsExchangeWalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsExchangeWalletApi apiInstance = new WalletsExchangeWalletApi();
    ExchangeId exchangeId = ExchangeId.fromValue("binance");
    String assetId = "USDT";
    try {
      List<ChainInfo> result = apiInstance.listSupportedChainsForExchange(exchangeId, assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsExchangeWalletApi#listSupportedChainsForExchange");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **exchangeId** | [**ExchangeId**](.md)| The ID of the exchange. Possible values include:   - &#x60;binance&#x60;: Binance.   - &#x60;okx&#x60;: OKX.   - &#x60;deribit&#x60;: Deribit.   - &#x60;bybit&#x60;: Bybit.   - &#x60;gate&#x60;: Gate.io   - &#x60;bitget&#x60;: Bitget  | [enum: binance, okx, deribit, bybit, gate, bitget] |
| **assetId** | **String**| (This concept applies to Exchange Wallets only) The asset ID. An asset ID is the unique identifier of the asset held within your linked exchange account. You can get the ID of the assets supported by an exchanges by calling [List supported assets](/v2/api-references/wallets--exchange-wallet/list-supported-assets). | |

### Return type

[**List&lt;ChainInfo&gt;**](ChainInfo.md)

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

