# AutoSweepApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWalletSweepToAddresses**](AutoSweepApi.md#createWalletSweepToAddresses) | **POST** /auto_sweep/sweep_to_addresses | create wallet sweep to addresses |
| [**listWalletSweepToAddresses**](AutoSweepApi.md#listWalletSweepToAddresses) | **GET** /auto_sweep/sweep_to_addresses | List wallet sweep to addresses |


<a id="createWalletSweepToAddresses"></a>
# **createWalletSweepToAddresses**
> SweepToAddress createWalletSweepToAddresses(createSweepToAddress)

create wallet sweep to addresses

This operation create a new sweep to address for the wallet. The old sweep to address will become invalid. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.AutoSweepApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    AutoSweepApi apiInstance = new AutoSweepApi();
    CreateSweepToAddress createSweepToAddress = new CreateSweepToAddress();
    try {
      SweepToAddress result = apiInstance.createWalletSweepToAddresses(createSweepToAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoSweepApi#createWalletSweepToAddresses");
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
| **createSweepToAddress** | [**CreateSweepToAddress**](CreateSweepToAddress.md)| The request body to generates a new sweep to addresses within a specified wallet. | [optional] |

### Return type

[**SweepToAddress**](SweepToAddress.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully create sweep to addresses |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listWalletSweepToAddresses"></a>
# **listWalletSweepToAddresses**
> ListWalletSweepToAddresses200Response listWalletSweepToAddresses(walletId)

List wallet sweep to addresses

This operation retrieves a list of sweep to addresses within your wallet. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.AutoSweepApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    AutoSweepApi apiInstance = new AutoSweepApi();
    UUID walletId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      ListWalletSweepToAddresses200Response result = apiInstance.listWalletSweepToAddresses(walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoSweepApi#listWalletSweepToAddresses");
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

### Return type

[**ListWalletSweepToAddresses200Response**](ListWalletSweepToAddresses200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully listed sweep to addresses |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

