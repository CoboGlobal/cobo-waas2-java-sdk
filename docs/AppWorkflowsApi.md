# AppWorkflowsApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApprovalRequest**](AppWorkflowsApi.md#createApprovalRequest) | **POST** /app/workflows/approval_requests | Request app workflow approval |
| [**getApprovalRequestById**](AppWorkflowsApi.md#getApprovalRequestById) | **GET** /app/workflows/approval_requests/{approval_id} | Get app workflow approval request by approval id |
| [**listAppWorkflows**](AppWorkflowsApi.md#listAppWorkflows) | **GET** /app/workflows | list app workflows |
| [**listApprovalRequests**](AppWorkflowsApi.md#listApprovalRequests) | **GET** /app/workflows/approval_requests | List app workflow approval requests by operation_id |
| [**revokeApprovalRequest**](AppWorkflowsApi.md#revokeApprovalRequest) | **POST** /app/workflows/approval_requests/{approval_id}/revoke | Revoke an app workflow approval request by request initiator. |


<a id="createApprovalRequest"></a>
# **createApprovalRequest**
> CreateApprovalRequest201Response createApprovalRequest(requestApproval)

Request app workflow approval

This operation is request approval from app workflow with idempotency checks. 

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
| **requestApproval** | [**RequestApproval**](RequestApproval.md)| The request body to app workflow approval. | [optional] |

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

Get app workflow approval request by approval id

This operation is retrieves approval request from app workflow. 

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
| **approvalId** | **UUID**| The approval ID that is used to track a workflow approval request. | |

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
| **200** | The information about an app workflow approval. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listAppWorkflows"></a>
# **listAppWorkflows**
> List&lt;AppWorkflow&gt; listAppWorkflows()

list app workflows

This operation is list app workflows of app. 

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
| **200** | A list of app workflows have been successfully configured. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listApprovalRequests"></a>
# **listApprovalRequests**
> ListApprovalRequests200Response listApprovalRequests(operationId, limit, before, after)

List app workflow approval requests by operation_id

This operation is retrieves list approval requests from app workflow. 

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
| **operationId** | **String**| The operation ID that is used to track a workflow. The operation ID is provided by you and must be unique within your app. | |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

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
| **200** | A list of approval request have been successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="revokeApprovalRequest"></a>
# **revokeApprovalRequest**
> RevokeApprovalRequest201Response revokeApprovalRequest(approvalId, revokeApprovalRequestRequest)

Revoke an app workflow approval request by request initiator.

This operation is revoke approval request from app workflow. 

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
| **approvalId** | **UUID**| The approval ID that is used to track a workflow approval request. | |
| **revokeApprovalRequestRequest** | [**RevokeApprovalRequestRequest**](RevokeApprovalRequestRequest.md)| The revoke request body to app workflow approval. | [optional] |

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

