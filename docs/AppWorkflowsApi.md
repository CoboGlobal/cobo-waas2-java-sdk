# AppWorkflowsApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApprovalRequest**](AppWorkflowsApi.md#createApprovalRequest) | **POST** /app/workflows/approval_requests | Request workflow approval |
| [**getApprovalRequestById**](AppWorkflowsApi.md#getApprovalRequestById) | **GET** /app/workflows/approval_requests/{approval_id} | Get approval request details |
| [**listAppWorkflows**](AppWorkflowsApi.md#listAppWorkflows) | **GET** /app/workflows | List app workflows |
| [**listApprovalRequests**](AppWorkflowsApi.md#listApprovalRequests) | **GET** /app/workflows/approval_requests | List approval requests |
| [**revokeApprovalRequest**](AppWorkflowsApi.md#revokeApprovalRequest) | **POST** /app/workflows/approval_requests/{approval_id}/revoke | Revoke approval request |


<a id="createApprovalRequest"></a>
# **createApprovalRequest**
> CreateApprovalRequest201Response createApprovalRequest(requestApproval)

Request workflow approval

This operation triggers a specified workflow and generates a new approval request.  &lt;Note&gt;To use the approval workflow operations, you must use the Cobo OAuth authentication method ([Org Access Token](https://www.cobo.com/developers/v2/apps/org-access-tokens)).&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.AppWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    AppWorkflowsApi apiInstance = new AppWorkflowsApi();
    RequestApproval requestApproval = new RequestApproval();
    try {
      CreateApprovalRequest201Response result = apiInstance.createApprovalRequest(requestApproval);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppWorkflowsApi#createApprovalRequest");
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
| **requestApproval** | [**RequestApproval**](RequestApproval.md)| The request body to request workflow approval. | [optional] |

### Return type

[**CreateApprovalRequest201Response**](CreateApprovalRequest201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request workflow approval was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getApprovalRequestById"></a>
# **getApprovalRequestById**
> ApprovalRequestDetail getApprovalRequestById(approvalId)

Get approval request details

This operation retrieves the details of a specific approval request.  &lt;Note&gt;To use the approval workflow operations, you must use the Cobo OAuth authentication method ([Org Access Token](https://www.cobo.com/developers/v2/apps/org-access-tokens)).&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.AppWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    AppWorkflowsApi apiInstance = new AppWorkflowsApi();
    UUID approvalId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      ApprovalRequestDetail result = apiInstance.getApprovalRequestById(approvalId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppWorkflowsApi#getApprovalRequestById");
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
| **approvalId** | **UUID**| The system-generated unique ID of the approval request. | |

### Return type

[**ApprovalRequestDetail**](ApprovalRequestDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about an approval request. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listAppWorkflows"></a>
# **listAppWorkflows**
> List&lt;AppWorkflow&gt; listAppWorkflows()

List app workflows

This operation retrieves all approval workflows of an Cobo Portal App. &lt;Note&gt;You need to [configure approval workflow](https://www.cobo.com/developers/v2/apps/configure-workflow) in the app Manifest file first.&lt;/Note&gt; &lt;Note&gt;To use the approval workflow operations, you must use the Cobo OAuth authentication method ([Org Access Token](https://www.cobo.com/developers/v2/apps/org-access-tokens)).&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.AppWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    AppWorkflowsApi apiInstance = new AppWorkflowsApi();
    try {
      List<AppWorkflow> result = apiInstance.listAppWorkflows();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppWorkflowsApi#listAppWorkflows");
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

[**List&lt;AppWorkflow&gt;**](AppWorkflow.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of approval workflows successfully retrieved |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listApprovalRequests"></a>
# **listApprovalRequests**
> ListApprovalRequests200Response listApprovalRequests(operationId, limit, before, after)

List approval requests

This operation retrieves a list of approval requests.  &lt;Note&gt;To use the approval workflow operations, you must use the Cobo OAuth authentication method ([Org Access Token](https://www.cobo.com/developers/v2/apps/org-access-tokens)).&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.AppWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    AppWorkflowsApi apiInstance = new AppWorkflowsApi();
    String operationId = "f47ac10b-58cc-4372-a567-0e02b2c3d479";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListApprovalRequests200Response result = apiInstance.listApprovalRequests(operationId, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppWorkflowsApi#listApprovalRequests");
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
| **operationId** | **String**| The unique ID of the approval workflow. | |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| A cursor indicating the position before the current page. This value is generated by Cobo and returned in the response. If you are paginating forward from the beginning, you do not need to provide it on the first request. When paginating backward (to the previous page), you should pass the before value returned from the last response.  | [optional] |
| **after** | **String**| A cursor indicating the position after the current page. This value is generated by Cobo and returned in the response. You do not need to provide it on the first request. When paginating forward (to the next page), you should pass the after value returned from the last response.  | [optional] |

### Return type

[**ListApprovalRequests200Response**](ListApprovalRequests200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of approval requests have been successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="revokeApprovalRequest"></a>
# **revokeApprovalRequest**
> RevokeApprovalRequest201Response revokeApprovalRequest(approvalId, revokeApprovalRequestRequest)

Revoke approval request

This operation revokes a pending approval request.  &lt;Note&gt;To use the approval workflow operations, you must use the Cobo OAuth authentication method ([Org Access Token](https://www.cobo.com/developers/v2/apps/org-access-tokens)).&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.AppWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    AppWorkflowsApi apiInstance = new AppWorkflowsApi();
    UUID approvalId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    RevokeApprovalRequestRequest revokeApprovalRequestRequest = new RevokeApprovalRequestRequest();
    try {
      RevokeApprovalRequest201Response result = apiInstance.revokeApprovalRequest(approvalId, revokeApprovalRequestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppWorkflowsApi#revokeApprovalRequest");
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
| **approvalId** | **UUID**| The system-generated unique ID of the approval request. | |
| **revokeApprovalRequestRequest** | [**RevokeApprovalRequestRequest**](RevokeApprovalRequestRequest.md)| The request body to revoke an approval request. | [optional] |

### Return type

[**RevokeApprovalRequest201Response**](RevokeApprovalRequest201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request workflow approval was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

