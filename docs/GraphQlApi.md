# GraphQlApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**executeGraphql**](GraphQlApi.md#executeGraphql) | **POST** /graphql | Execute a GraphQL query or mutation |


<a id="executeGraphql"></a>
# **executeGraphql**
> GraphQLResponse executeGraphql(graphQLRequest)

Execute a GraphQL query or mutation

This endpoint executes a GraphQL query or mutation. The request body must include a valid GraphQL query string. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.GraphQlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    GraphQlApi apiInstance = new GraphQlApi();
    GraphQLRequest graphQLRequest = new GraphQLRequest();
    try {
      GraphQLResponse result = apiInstance.executeGraphql(graphQLRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GraphQlApi#executeGraphql");
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
| **graphQLRequest** | [**GraphQLRequest**](GraphQLRequest.md)| The request body to generate addresses within a specified wallet. | [optional] |

### Return type

[**GraphQLResponse**](GraphQLResponse.md)

### Authorization

[CoboNonce](../README.md#CoboNonce), [OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth), [CoboSignature](../README.md#CoboSignature)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A staking activity has been successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

