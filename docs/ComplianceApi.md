# ComplianceApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDispositionStatus**](ComplianceApi.md#getDispositionStatus) | **GET** /compliance/funds/disposition | Get disposition status |
| [**getKytScreeningStatus**](ComplianceApi.md#getKytScreeningStatus) | **GET** /compliance/kyt/screenings/status | Get KYT screening status |
| [**isolateFunds**](ComplianceApi.md#isolateFunds) | **POST** /compliance/funds/disposition/isolate | Isolate funds |
| [**refundFunds**](ComplianceApi.md#refundFunds) | **POST** /compliance/funds/disposition/refund | Refund funds |
| [**submitKytManualReview**](ComplianceApi.md#submitKytManualReview) | **POST** /compliance/kyt/screenings/manual_review | Submit KYT manual review result |
| [**submitKytScreeningDecisions**](ComplianceApi.md#submitKytScreeningDecisions) | **POST** /compliance/kyt/screenings/decisions | Submit KYT screening decision |
| [**unfreezeFunds**](ComplianceApi.md#unfreezeFunds) | **POST** /compliance/funds/disposition/unfreeze | Unfreeze frozen funds |


<a id="getDispositionStatus"></a>
# **getDispositionStatus**
> DispositionQueryResponse getDispositionStatus(transactionId)

Get disposition status

This operation retrieves the current status of a disposition request for a specific transaction.  You can use this endpoint to check the status of any disposition operation (Refund, Isolate, or Unfreeze)  that has been initiated for a transaction. The response includes the disposition type, current status,  and the disposition transaction ID if applicable.  &lt;Note&gt;Use this endpoint to monitor the progress of disposition operations and verify their completion.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    ComplianceApi apiInstance = new ComplianceApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      DispositionQueryResponse result = apiInstance.getDispositionStatus(transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getDispositionStatus");
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
| **transactionId** | **UUID**| The unique identifier (UUID) of the transaction to retrieve KYT screening status information for. | |

### Return type

[**DispositionQueryResponse**](DispositionQueryResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved disposition information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getKytScreeningStatus"></a>
# **getKytScreeningStatus**
> KytScreeningsTransaction getKytScreeningStatus(transactionId)

Get KYT screening status

This operation retrieves the current KYT (Know Your Transaction) screening status, including review status and fund disposition status, for a specific transaction.  Use this endpoint to monitor the real-time screening progress for transactions processed through the KYT compliance system.  &lt;Note&gt;This endpoint provides comprehensive compliance monitoring capabilities to help maintain AML (Anti-Money Laundering) regulatory compliance and audit trail requirements.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    ComplianceApi apiInstance = new ComplianceApi();
    UUID transactionId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      KytScreeningsTransaction result = apiInstance.getKytScreeningStatus(transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getKytScreeningStatus");
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
| **transactionId** | **UUID**| The unique identifier (UUID) of the transaction to retrieve KYT screening status information for. | |

### Return type

[**KytScreeningsTransaction**](KytScreeningsTransaction.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved KYT screening information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="isolateFunds"></a>
# **isolateFunds**
> DispositionResponse isolateFunds(isolateDisposition)

Isolate funds

This operation creates a request to isolate funds for a specific transaction. The funds will be sent to a designated isolation address for compliance purposes.  You need to specify the transaction ID to be isolated and the destination address.  Optional parameters include custom categories for tracking purposes.  &lt;Note&gt;The isolation will initiate a withdrawal transaction from the compliance-managed address to the specified isolation address.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    ComplianceApi apiInstance = new ComplianceApi();
    IsolateDisposition isolateDisposition = new IsolateDisposition();
    try {
      DispositionResponse result = apiInstance.isolateFunds(isolateDisposition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#isolateFunds");
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
| **isolateDisposition** | [**IsolateDisposition**](IsolateDisposition.md)| The request body to isolate funds. | [optional] |

### Return type

[**DispositionResponse**](DispositionResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a disposition request. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="refundFunds"></a>
# **refundFunds**
> DispositionResponse refundFunds(refundDisposition)

Refund funds

This operation creates a request to refund funds for a specific transaction. The funds will be sent to the specified destination address.  You need to specify the transaction ID to be refunded and the destination address.  Optional parameters include custom categories for tracking purposes.  &lt;Note&gt;The refund will initiate a withdrawal transaction from the compliance-managed address to the specified destination.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    ComplianceApi apiInstance = new ComplianceApi();
    RefundDisposition refundDisposition = new RefundDisposition();
    try {
      DispositionResponse result = apiInstance.refundFunds(refundDisposition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#refundFunds");
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
| **refundDisposition** | [**RefundDisposition**](RefundDisposition.md)| The request body to refund funds. | [optional] |

### Return type

[**DispositionResponse**](DispositionResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a disposition request. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="submitKytManualReview"></a>
# **submitKytManualReview**
> SubmitKytResponse submitKytManualReview(submitKytScreeningsReviewBody)

Submit KYT manual review result

This operation submits a manual review result for a KYT (Know Your Transaction) screening case that requires human analysis.  Use this endpoint when transactions flagged for manual review have been analyzed by compliance officers and require submission of review outcomes with detailed comments and justifications.  This endpoint is specifically designed for submitting comprehensive manual review findings rather than automated screening decisions.  &lt;Note&gt;Submitting a manual review result will update the KYT screening status and initiate appropriate compliance workflow actions based on the review outcome.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    ComplianceApi apiInstance = new ComplianceApi();
    SubmitKytScreeningsReviewBody submitKytScreeningsReviewBody = new SubmitKytScreeningsReviewBody();
    try {
      SubmitKytResponse result = apiInstance.submitKytManualReview(submitKytScreeningsReviewBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#submitKytManualReview");
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
| **submitKytScreeningsReviewBody** | [**SubmitKytScreeningsReviewBody**](SubmitKytScreeningsReviewBody.md)| The request body to submit a manual review result for a KYT screening case that requires human analysis. | [optional] |

### Return type

[**SubmitKytResponse**](SubmitKytResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully submitted a manual review result for a KYT screening case that requires human analysis. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="submitKytScreeningDecisions"></a>
# **submitKytScreeningDecisions**
> SubmitKytResponse submitKytScreeningDecisions(submitKytScreeningsDecisionsBody)

Submit KYT screening decision

This operation submits a KYT (Know Your Transaction) screening decision for a specific transaction based on an external compliance review.  Use this endpoint to provide a screening decision (Approval, ApprovalWithAlert, Rejection, or ManualReview) after completing the external KYT screening process.  The submitted decision will be recorded for compliance audit purposes and regulatory reporting requirements.  &lt;Note&gt;Submitting a screening decision will update the transaction&#39;s KYT status and may automatically trigger downstream compliance workflows or notifications depending on the decision type.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    ComplianceApi apiInstance = new ComplianceApi();
    SubmitKytScreeningsDecisionsBody submitKytScreeningsDecisionsBody = new SubmitKytScreeningsDecisionsBody();
    try {
      SubmitKytResponse result = apiInstance.submitKytScreeningDecisions(submitKytScreeningsDecisionsBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#submitKytScreeningDecisions");
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
| **submitKytScreeningsDecisionsBody** | [**SubmitKytScreeningsDecisionsBody**](SubmitKytScreeningsDecisionsBody.md)| The request body to submit a KYT screening decision for a specific transaction based on external compliance review. | [optional] |

### Return type

[**SubmitKytResponse**](SubmitKytResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully submitted a KYT screening decision for a specific transaction tranaction based on external compliance review. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="unfreezeFunds"></a>
# **unfreezeFunds**
> DispositionResponse unfreezeFunds(unfreezeDisposition)

Unfreeze frozen funds

This operation creates a request to unfreeze funds for a previously frozen transaction. It releases the frozen funds back to their original state.  You only need to specify the transaction ID to be unfrozen. Once unfrozen, the funds will be available for normal operations.  &lt;Note&gt;The unfreeze process will release the compliance hold on the transaction, allowing it to proceed normally.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    ComplianceApi apiInstance = new ComplianceApi();
    UnfreezeDisposition unfreezeDisposition = new UnfreezeDisposition();
    try {
      DispositionResponse result = apiInstance.unfreezeFunds(unfreezeDisposition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#unfreezeFunds");
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
| **unfreezeDisposition** | [**UnfreezeDisposition**](UnfreezeDisposition.md)| The request body to unfreeze funds. | [optional] |

### Return type

[**DispositionResponse**](DispositionResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a disposition request. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

