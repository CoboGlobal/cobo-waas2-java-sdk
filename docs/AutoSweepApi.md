# AutoSweepApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAutoSweepTask**](AutoSweepApi.md#createAutoSweepTask) | **POST** /auto_sweep/tasks | Create auto-sweep task |
| [**createWalletSweepToAddresses**](AutoSweepApi.md#createWalletSweepToAddresses) | **POST** /auto_sweep/sweep_to_addresses | create sweep-to address |
| [**getAutoSweepTaskById**](AutoSweepApi.md#getAutoSweepTaskById) | **GET** /auto_sweep/tasks/{task_id} | Get auto-sweep task details |
| [**listAutoSweepTask**](AutoSweepApi.md#listAutoSweepTask) | **GET** /auto_sweep/tasks | List auto-sweep tasks |
| [**listWalletSweepToAddresses**](AutoSweepApi.md#listWalletSweepToAddresses) | **GET** /auto_sweep/sweep_to_addresses | List sweep-to addresses |


<a id="createAutoSweepTask"></a>
# **createAutoSweepTask**
> AutoSweepTask createAutoSweepTask(createAutoSweepTask)

Create auto-sweep task

This operation creates an auto-sweep task for the specified wallet and token. The task triggers transactions to sweep the full balance of the specified token to the configured sweep-to address. 

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
    CreateAutoSweepTask createAutoSweepTask = new CreateAutoSweepTask();
    try {
      AutoSweepTask result = apiInstance.createAutoSweepTask(createAutoSweepTask);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoSweepApi#createAutoSweepTask");
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
| **createAutoSweepTask** | [**CreateAutoSweepTask**](CreateAutoSweepTask.md)| The request body to create an auto-sweep task. | [optional] |

### Return type

[**AutoSweepTask**](AutoSweepTask.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created auto-sweep task. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createWalletSweepToAddresses"></a>
# **createWalletSweepToAddresses**
> SweepToAddress createWalletSweepToAddresses(createSweepToAddress)

create sweep-to address

This operation creates a new sweep-to address for the specified wallet. The previously sweep-to address for the same token becomes invalid once the new one is created.  Use this operation to change the sweep-to address when your setup changes, you switch networks, or the current address is compromised or tainted by suspicious funds. You can withdraw any remaining balances from the old sweep-to addresses to the new address or another designated destination.  &lt;Note&gt;Sweep-to addresses are only applicable to MPC Wallets and Web3 Wallets with the auto-sweep feature enabled.&lt;/Note&gt; 

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
| **createSweepToAddress** | [**CreateSweepToAddress**](CreateSweepToAddress.md)| The request body to generates a new sweep-to address within a specified wallet. | [optional] |

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

<a id="getAutoSweepTaskById"></a>
# **getAutoSweepTaskById**
> AutoSweepTask getAutoSweepTaskById(taskId)

Get auto-sweep task details

This operation retrieves detailed information about a specified auto-sweep task. 

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
    UUID taskId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      AutoSweepTask result = apiInstance.getAutoSweepTaskById(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoSweepApi#getAutoSweepTaskById");
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
| **taskId** | **UUID**| The auto sweep task ID. | |

### Return type

[**AutoSweepTask**](AutoSweepTask.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information about a auto-sweep task. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listAutoSweepTask"></a>
# **listAutoSweepTask**
> ListAutoSweepTask200Response listAutoSweepTask(walletId, tokenId, taskIds, minCreatedTimestamp, maxCreatedTimestamp, limit, before, after, direction)

List auto-sweep tasks

This operation retrieves a list of auto-sweep tasks for the specified wallet. You can filter the results by token ID, task IDs, or a created-time range. 

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
    String tokenId = "ETH_USDT";
    String taskIds = "f47ac10b-58cc-4372-a567-0e02b2c3d479,1ddca562-8434-41c9-8809-d437bad9c868";
    Long minCreatedTimestamp = 1635744000000L;
    Long maxCreatedTimestamp = 1635744000000L;
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String direction = "ASC";
    try {
      ListAutoSweepTask200Response result = apiInstance.listAutoSweepTask(walletId, tokenId, taskIds, minCreatedTimestamp, maxCreatedTimestamp, limit, before, after, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoSweepApi#listAutoSweepTask");
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
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). | [optional] |
| **taskIds** | **String**| A list of auto-sweep task IDs, separated by comma. | [optional] |
| **minCreatedTimestamp** | **Long**| The time when the transaction was created, in Unix timestamp format, measured in milliseconds. You can use this parameter to filter transactions created on or after the specified time.  If not provided, the default value is 90 days before the current time. This default value is subject to change.  | [optional] |
| **maxCreatedTimestamp** | **Long**| The time when the transaction was created, in Unix timestamp format, measured in milliseconds. You can use this parameter to filter transactions created on or before the specified time.  If not provided, the default value is the current time. This default value is subject to change.  | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| A cursor indicating the position before the current page. This value is generated by Cobo and returned in the response. If you are paginating forward from the beginning, you do not need to provide it on the first request. When paginating backward (to the previous page), you should pass the before value returned from the last response.  | [optional] |
| **after** | **String**| A cursor indicating the position after the current page. This value is generated by Cobo and returned in the response. You do not need to provide it on the first request. When paginating forward (to the next page), you should pass the after value returned from the last response.  | [optional] |
| **direction** | **String**| The sort direction. Possible values include:   - &#x60;ASC&#x60;: Sort the results in ascending order.   - &#x60;DESC&#x60;: Sort the results in descending order.  | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**ListAutoSweepTask200Response**](ListAutoSweepTask200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved auto-sweep tasks |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listWalletSweepToAddresses"></a>
# **listWalletSweepToAddresses**
> ListWalletSweepToAddresses200Response listWalletSweepToAddresses(walletId)

List sweep-to addresses

This operation retrieves a list of sweep-to addresses within your wallet. &lt;Note&gt;Sweep-to addresses are only applicable to MPC Wallets and Web3 Wallets with the auto-sweep feature enabled.&lt;/Note&gt; 

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
| **200** | Successfully retrieved sweep-to addresses |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

