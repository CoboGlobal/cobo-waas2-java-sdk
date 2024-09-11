# DevelopersWebhooksApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhookEndpoint**](DevelopersWebhooksApi.md#createWebhookEndpoint) | **POST** /webhooks/endpoints | Register webhook endpoint |
| [**getWebhookEndpointById**](DevelopersWebhooksApi.md#getWebhookEndpointById) | **GET** /webhooks/endpoints/{endpoint_id} | Get webhook endpoint information |
| [**getWebhookEventById**](DevelopersWebhooksApi.md#getWebhookEventById) | **GET** /webhooks/endpoints/{endpoint_id}/events/{event_id} | Retrieve event information |
| [**listWebhookEndpoints**](DevelopersWebhooksApi.md#listWebhookEndpoints) | **GET** /webhooks/endpoints | List webhook endpoints |
| [**listWebhookEventDefinitions**](DevelopersWebhooksApi.md#listWebhookEventDefinitions) | **GET** /webhooks/events/definitions | Get webhook event types |
| [**listWebhookEventLogs**](DevelopersWebhooksApi.md#listWebhookEventLogs) | **GET** /webhooks/endpoints/{endpoint_id}/events/{event_id}/logs | List webhook event logs |
| [**listWebhookEvents**](DevelopersWebhooksApi.md#listWebhookEvents) | **GET** /webhooks/endpoints/{endpoint_id}/events | List all webhook events |
| [**retryWebhookEventById**](DevelopersWebhooksApi.md#retryWebhookEventById) | **POST** /webhooks/endpoints/{endpoint_id}/events/{event_id}/retry | Retry event |
| [**updateWebhookEndpointById**](DevelopersWebhooksApi.md#updateWebhookEndpointById) | **PUT** /webhooks/endpoints/{endpoint_id} | Update webhook endpoint |


<a id="createWebhookEndpoint"></a>
# **createWebhookEndpoint**
> WebhookEndpoint createWebhookEndpoint(createWebhookEndpointRequest)

Register webhook endpoint

This operation registers a new webhook endpoint for your organization.

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.DevelopersWebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    DevelopersWebhooksApi apiInstance = new DevelopersWebhooksApi();
    CreateWebhookEndpointRequest createWebhookEndpointRequest = new CreateWebhookEndpointRequest();
    try {
      WebhookEndpoint result = apiInstance.createWebhookEndpoint(createWebhookEndpointRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevelopersWebhooksApi#createWebhookEndpoint");
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
| **createWebhookEndpointRequest** | [**CreateWebhookEndpointRequest**](CreateWebhookEndpointRequest.md)| The request body to register a webhook endpoint. | [optional] |

### Return type

[**WebhookEndpoint**](WebhookEndpoint.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getWebhookEndpointById"></a>
# **getWebhookEndpointById**
> WebhookEndpoint getWebhookEndpointById(endpointId)

Get webhook endpoint information

This operation retrieves the information of a specified webhook endpoint.

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.DevelopersWebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    DevelopersWebhooksApi apiInstance = new DevelopersWebhooksApi();
    UUID endpointId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      WebhookEndpoint result = apiInstance.getWebhookEndpointById(endpointId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevelopersWebhooksApi#getWebhookEndpointById");
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
| **endpointId** | **UUID**| The webhook endpoint ID. You can retrieve a list of webhook endpoint IDs by calling [List webhook endpoints](/v2/api-references/developers--webhooks/list-webhook-endpoints). | |

### Return type

[**WebhookEndpoint**](WebhookEndpoint.md)

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

<a id="getWebhookEventById"></a>
# **getWebhookEventById**
> WebhookEvent getWebhookEventById(eventId, endpointId)

Retrieve event information

This operation retrieves the information of a webhook event by the event ID. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.DevelopersWebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    DevelopersWebhooksApi apiInstance = new DevelopersWebhooksApi();
    UUID eventId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    UUID endpointId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      WebhookEvent result = apiInstance.getWebhookEventById(eventId, endpointId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevelopersWebhooksApi#getWebhookEventById");
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
| **eventId** | **UUID**| The event ID. You can obtain a list of event IDs by calling [List all events](/v2/api-references/developers--webhooks/list-all-events). | |
| **endpointId** | **UUID**| The webhook endpoint ID. You can retrieve a list of webhook endpoint IDs by calling [List webhook endpoints](/v2/api-references/developers--webhooks/list-webhook-endpoints). | |

### Return type

[**WebhookEvent**](WebhookEvent.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webhook event information is successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listWebhookEndpoints"></a>
# **listWebhookEndpoints**
> ListWebhookEndpoints200Response listWebhookEndpoints(status, eventType, limit, before, after)

List webhook endpoints

This operation retrieves the information of all webhook endpoints registered under your organization. You can filter the result by endpoint status and the subscribed event type.

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.DevelopersWebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    DevelopersWebhooksApi apiInstance = new DevelopersWebhooksApi();
    WebhookEndpointStatus status = WebhookEndpointStatus.fromValue("STATUS_ACTIVE");
    WebhookEventType eventType = WebhookEventType.fromValue("wallets.transaction.created");
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListWebhookEndpoints200Response result = apiInstance.listWebhookEndpoints(status, eventType, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevelopersWebhooksApi#listWebhookEndpoints");
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
| **status** | [**WebhookEndpointStatus**](.md)|  | [optional] [enum: STATUS_ACTIVE, STATUS_INACTIVE, STATUS_PENDING_ACTIVE, STATUS_PENDING_INACTIVE, STATUS_PENDING_UPDATE, STATUS_REJECT_ACTIVE] |
| **eventType** | [**WebhookEventType**](.md)|  | [optional] [enum: wallets.transaction.created, wallets.transaction.updated, wallets.transaction.failed, wallets.transaction.succeeded, wallets.mpc.tss_request.created, wallets.mpc.tss_request.updated, wallets.mpc.tss_request.failed, wallets.mpc.tss_request.succeeded] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| An object ID that serves as a starting point for retrieving data in reverse chronological order. For example, if you specify &#x60;before&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;, the request will retrieve a list of data objects that end before the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;. You can set this parameter to the value of &#x60;pagination.before&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  - If you set &#x60;before&#x60; to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| An object ID that acts as a starting point for retrieving data in chronological order. For example, if you specify &#x60;after&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;, the request will retrieve a list of data objects that start after the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;. You can set this parameter to the value of &#x60;pagination.after&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListWebhookEndpoints200Response**](ListWebhookEndpoints200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully listed of webhook endpoints |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listWebhookEventDefinitions"></a>
# **listWebhookEventDefinitions**
> List&lt;ListWebhookEventDefinitions200ResponseInner&gt; listWebhookEventDefinitions()

Get webhook event types

This operation retrieves all supported webhook event types.

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.DevelopersWebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    DevelopersWebhooksApi apiInstance = new DevelopersWebhooksApi();
    try {
      List<ListWebhookEventDefinitions200ResponseInner> result = apiInstance.listWebhookEventDefinitions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevelopersWebhooksApi#listWebhookEventDefinitions");
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

[**List&lt;ListWebhookEventDefinitions200ResponseInner&gt;**](ListWebhookEventDefinitions200ResponseInner.md)

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

<a id="listWebhookEventLogs"></a>
# **listWebhookEventLogs**
> ListWebhookEventLogs200Response listWebhookEventLogs(eventId, endpointId, limit, before, after)

List webhook event logs

This operation retrieves a list of webhook event logs by event ID. Each retry will generate a separate event log. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.DevelopersWebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    DevelopersWebhooksApi apiInstance = new DevelopersWebhooksApi();
    UUID eventId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    UUID endpointId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListWebhookEventLogs200Response result = apiInstance.listWebhookEventLogs(eventId, endpointId, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevelopersWebhooksApi#listWebhookEventLogs");
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
| **eventId** | **UUID**| The event ID. You can obtain a list of event IDs by calling [List all events](/v2/api-references/developers--webhooks/list-all-events). | |
| **endpointId** | **UUID**| The webhook endpoint ID. You can retrieve a list of webhook endpoint IDs by calling [List webhook endpoints](/v2/api-references/developers--webhooks/list-webhook-endpoints). | |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| An object ID that serves as a starting point for retrieving data in reverse chronological order. For example, if you specify &#x60;before&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;, the request will retrieve a list of data objects that end before the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;. You can set this parameter to the value of &#x60;pagination.before&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  - If you set &#x60;before&#x60; to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| An object ID that acts as a starting point for retrieving data in chronological order. For example, if you specify &#x60;after&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;, the request will retrieve a list of data objects that start after the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;. You can set this parameter to the value of &#x60;pagination.after&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListWebhookEventLogs200Response**](ListWebhookEventLogs200Response.md)

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

<a id="listWebhookEvents"></a>
# **listWebhookEvents**
> ListWebhookEvents200Response listWebhookEvents(endpointId, status, type, limit, before, after)

List all webhook events

This operation retrieves a list of webhook events that have occurred within the last 30 days.  &lt;Note&gt;The request will only return webhook events that have occurred to the wallets associated with your current API key. For example, if the current API key is only associated with Custodial Wallets, any webhook events that have occurred to an MPC Wallet will not be retrieved with the current API key.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.DevelopersWebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    DevelopersWebhooksApi apiInstance = new DevelopersWebhooksApi();
    UUID endpointId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    WebhookEventStatus status = WebhookEventStatus.fromValue("Success");
    WebhookEventType type = WebhookEventType.fromValue("wallets.transaction.created");
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListWebhookEvents200Response result = apiInstance.listWebhookEvents(endpointId, status, type, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevelopersWebhooksApi#listWebhookEvents");
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
| **endpointId** | **UUID**| The webhook endpoint ID. You can retrieve a list of webhook endpoint IDs by calling [List webhook endpoints](/v2/api-references/developers--webhooks/list-webhook-endpoints). | |
| **status** | [**WebhookEventStatus**](.md)|  | [optional] [enum: Success, Retrying, Failed] |
| **type** | [**WebhookEventType**](.md)|  | [optional] [enum: wallets.transaction.created, wallets.transaction.updated, wallets.transaction.failed, wallets.transaction.succeeded, wallets.mpc.tss_request.created, wallets.mpc.tss_request.updated, wallets.mpc.tss_request.failed, wallets.mpc.tss_request.succeeded] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| An object ID that serves as a starting point for retrieving data in reverse chronological order. For example, if you specify &#x60;before&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;, the request will retrieve a list of data objects that end before the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;. You can set this parameter to the value of &#x60;pagination.before&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  - If you set &#x60;before&#x60; to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| An object ID that acts as a starting point for retrieving data in chronological order. For example, if you specify &#x60;after&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;, the request will retrieve a list of data objects that start after the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;. You can set this parameter to the value of &#x60;pagination.after&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListWebhookEvents200Response**](ListWebhookEvents200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of webhook events has been successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="retryWebhookEventById"></a>
# **retryWebhookEventById**
> RetryWebhookEventById201Response retryWebhookEventById(eventId, endpointId)

Retry event

This operation retries delivering a webhook event with the specified event ID. You can only retry delivering a webhook event in the &#x60;Retrying&#x60; or &#x60;Failed&#x60; status. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.DevelopersWebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    DevelopersWebhooksApi apiInstance = new DevelopersWebhooksApi();
    UUID eventId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    UUID endpointId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      RetryWebhookEventById201Response result = apiInstance.retryWebhookEventById(eventId, endpointId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevelopersWebhooksApi#retryWebhookEventById");
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
| **eventId** | **UUID**| The event ID. You can obtain a list of event IDs by calling [List all events](/v2/api-references/developers--webhooks/list-all-events). | |
| **endpointId** | **UUID**| The webhook endpoint ID. You can retrieve a list of webhook endpoint IDs by calling [List webhook endpoints](/v2/api-references/developers--webhooks/list-webhook-endpoints). | |

### Return type

[**RetryWebhookEventById201Response**](RetryWebhookEventById201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateWebhookEndpointById"></a>
# **updateWebhookEndpointById**
> WebhookEndpoint updateWebhookEndpointById(endpointId, updateWebhookEndpointByIdRequest)

Update webhook endpoint

This operation updates the information of a specified webhook endpoint.

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.DevelopersWebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    DevelopersWebhooksApi apiInstance = new DevelopersWebhooksApi();
    UUID endpointId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    UpdateWebhookEndpointByIdRequest updateWebhookEndpointByIdRequest = new UpdateWebhookEndpointByIdRequest();
    try {
      WebhookEndpoint result = apiInstance.updateWebhookEndpointById(endpointId, updateWebhookEndpointByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevelopersWebhooksApi#updateWebhookEndpointById");
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
| **endpointId** | **UUID**| The webhook endpoint ID. You can retrieve a list of webhook endpoint IDs by calling [List webhook endpoints](/v2/api-references/developers--webhooks/list-webhook-endpoints). | |
| **updateWebhookEndpointByIdRequest** | [**UpdateWebhookEndpointByIdRequest**](UpdateWebhookEndpointByIdRequest.md)| The request body to update a webhook endpoint. | [optional] |

### Return type

[**WebhookEndpoint**](WebhookEndpoint.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update webhook endpoint successfully. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

