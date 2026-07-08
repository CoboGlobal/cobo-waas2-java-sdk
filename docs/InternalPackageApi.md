# InternalPackageApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPackageChain**](InternalPackageApi.md#addPackageChain) | **POST** /internal/package/add_package_chain | Add chain to package |


<a id="addPackageChain"></a>
# **addPackageChain**
> AddPackageChainInfo addPackageChain(addPackageChainParams)

Add chain to package

This operation adds a chain to a package. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalPackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalPackageApi apiInstance = new InternalPackageApi();
    AddPackageChainParams addPackageChainParams = new AddPackageChainParams();
    try {
      AddPackageChainInfo result = apiInstance.addPackageChain(addPackageChainParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalPackageApi#addPackageChain");
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
| **addPackageChainParams** | [**AddPackageChainParams**](AddPackageChainParams.md)| The request body to add a chain to a package. | [optional] |

### Return type

[**AddPackageChainInfo**](AddPackageChainInfo.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

