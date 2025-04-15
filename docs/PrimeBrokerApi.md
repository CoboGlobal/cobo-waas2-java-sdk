# PrimeBrokerApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeGuardPubkey**](PrimeBrokerApi.md#changeGuardPubkey) | **PUT** /prime_broker/user/{user_id}/guard_pubkey | Change Guard pubkey binding |
| [**createGuardPubkey**](PrimeBrokerApi.md#createGuardPubkey) | **POST** /prime_broker/user/{user_id}/guard_pubkey | Create Guard pubkey binding |
| [**createPrimeBrokerAddress**](PrimeBrokerApi.md#createPrimeBrokerAddress) | **POST** /prime_broker/user/{user_id}/addresses | Bind addresses to a broker user |
| [**deleteGuardPubkey**](PrimeBrokerApi.md#deleteGuardPubkey) | **POST** /prime_broker/user/{user_id}/guard_pubkey/delete | Delete Guard pubkey binding |
| [**queryApprovalStatement**](PrimeBrokerApi.md#queryApprovalStatement) | **GET** /prime_broker/approval_statement/{statement_id} | Query approval statement |
| [**queryGuardPubkey**](PrimeBrokerApi.md#queryGuardPubkey) | **GET** /prime_broker/user/{user_id}/guard_pubkey | Query a Guard pubkey |


<a id="changeGuardPubkey"></a>
# **changeGuardPubkey**
> ChangeGuardPubkey200Response changeGuardPubkey(userId)

Change Guard pubkey binding

This operation updates an existing binding to associate a broker user ID with a new Cobo Guard public key. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PrimeBrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PrimeBrokerApi apiInstance = new PrimeBrokerApi();
    String userId = "168108513539918";
    try {
      ChangeGuardPubkey200Response result = apiInstance.changeGuardPubkey(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimeBrokerApi#changeGuardPubkey");
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
| **userId** | **String**| The user ID. | |

### Return type

[**ChangeGuardPubkey200Response**](ChangeGuardPubkey200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="createGuardPubkey"></a>
# **createGuardPubkey**
> ChangeGuardPubkey200Response createGuardPubkey(userId)

Create Guard pubkey binding

This operation creates a binding between a broker user ID and a Cobo Guard public key. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PrimeBrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PrimeBrokerApi apiInstance = new PrimeBrokerApi();
    String userId = "168108513539918";
    try {
      ChangeGuardPubkey200Response result = apiInstance.createGuardPubkey(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimeBrokerApi#createGuardPubkey");
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
| **userId** | **String**| The user ID. | |

### Return type

[**ChangeGuardPubkey200Response**](ChangeGuardPubkey200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="createPrimeBrokerAddress"></a>
# **createPrimeBrokerAddress**
> CreatePrimeBrokerAddress201Response createPrimeBrokerAddress(userId, createPrimeBrokerAddressRequest)

Bind addresses to a broker user

This operation binds addresses to a broker user. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PrimeBrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PrimeBrokerApi apiInstance = new PrimeBrokerApi();
    String userId = "168108513539918";
    CreatePrimeBrokerAddressRequest createPrimeBrokerAddressRequest = new CreatePrimeBrokerAddressRequest();
    try {
      CreatePrimeBrokerAddress201Response result = apiInstance.createPrimeBrokerAddress(userId, createPrimeBrokerAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimeBrokerApi#createPrimeBrokerAddress");
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
| **userId** | **String**| The user ID. | |
| **createPrimeBrokerAddressRequest** | [**CreatePrimeBrokerAddressRequest**](CreatePrimeBrokerAddressRequest.md)| The request body to bind addresses to a broker user. | [optional] |

### Return type

[**CreatePrimeBrokerAddress201Response**](CreatePrimeBrokerAddress201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="deleteGuardPubkey"></a>
# **deleteGuardPubkey**
> DeleteGuardPubkey201Response deleteGuardPubkey(userId)

Delete Guard pubkey binding

This operation deletes a binding between a broker user ID and a Cobo Guard public key. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PrimeBrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PrimeBrokerApi apiInstance = new PrimeBrokerApi();
    String userId = "168108513539918";
    try {
      DeleteGuardPubkey201Response result = apiInstance.deleteGuardPubkey(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimeBrokerApi#deleteGuardPubkey");
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
| **userId** | **String**| The user ID. | |

### Return type

[**DeleteGuardPubkey201Response**](DeleteGuardPubkey201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="queryApprovalStatement"></a>
# **queryApprovalStatement**
> QueryApprovalStatement200Response queryApprovalStatement(statementId)

Query approval statement

This operation queries an approval statement. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PrimeBrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PrimeBrokerApi apiInstance = new PrimeBrokerApi();
    String statementId = "168108513539918";
    try {
      QueryApprovalStatement200Response result = apiInstance.queryApprovalStatement(statementId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimeBrokerApi#queryApprovalStatement");
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
| **statementId** | **String**| The approval statement ID. | |

### Return type

[**QueryApprovalStatement200Response**](QueryApprovalStatement200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="queryGuardPubkey"></a>
# **queryGuardPubkey**
> QueryGuardPubkey200Response queryGuardPubkey(userId)

Query a Guard pubkey

This operation retrieves the current Cobo Guard public key binding details for a broker user. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PrimeBrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PrimeBrokerApi apiInstance = new PrimeBrokerApi();
    String userId = "168108513539918";
    try {
      QueryGuardPubkey200Response result = apiInstance.queryGuardPubkey(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimeBrokerApi#queryGuardPubkey");
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
| **userId** | **String**| The user ID. | |

### Return type

[**QueryGuardPubkey200Response**](QueryGuardPubkey200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

