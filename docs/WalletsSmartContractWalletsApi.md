# WalletsSmartContractWalletsApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listSafeWalletDelegates**](WalletsSmartContractWalletsApi.md#listSafeWalletDelegates) | **POST** /wallets/{wallet_id}/smart_contracts/delegates | List Delegates |


<a id="listSafeWalletDelegates"></a>
# **listSafeWalletDelegates**
> List&lt;CoboSafeDelegate&gt; listSafeWalletDelegates(walletId, safeWalletDelegates)

List Delegates

This operation retrieves all available Delegates of a Safe\\{Wallet\\} for a given transfer or contract call request. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsSmartContractWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsSmartContractWalletsApi apiInstance = new WalletsSmartContractWalletsApi();
    UUID walletId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    SafeWalletDelegates safeWalletDelegates = new SafeWalletDelegates();
    try {
      List<CoboSafeDelegate> result = apiInstance.listSafeWalletDelegates(walletId, safeWalletDelegates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsSmartContractWalletsApi#listSafeWalletDelegates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **safeWalletDelegates** | [**SafeWalletDelegates**](SafeWalletDelegates.md)| The request body to query the Delegates of a Safe{Wallet}. | [optional] |

### Return type

[**List&lt;CoboSafeDelegate&gt;**](CoboSafeDelegate.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Delegates successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

