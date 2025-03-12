# TravelRuleApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTransactionLimitation**](TravelRuleApi.md#getTransactionLimitation) | **GET** /travel_rule/transaction/limitation | Retrieve transaction limitations |
| [**listSupportedCountries**](TravelRuleApi.md#listSupportedCountries) | **GET** /travel_rule/transaction/countries | List supported countries |
| [**submitDepositTravelRuleInfo**](TravelRuleApi.md#submitDepositTravelRuleInfo) | **POST** /travel_rule/transaction/deposit/travel_rule_info | Submit Travel Rule information for deposits |
| [**submitWithdrawTravelRuleInfo**](TravelRuleApi.md#submitWithdrawTravelRuleInfo) | **POST** /travel_rule/transaction/withdraw/travel_rule_info | Submit Travel Rule information for withdrawals |


<a id="getTransactionLimitation"></a>
# **getTransactionLimitation**
> GetTransactionLimitation200Response getTransactionLimitation(transactionType, transactionId)

Retrieve transaction limitations

This operation retrieves Travel Rule requirements and available options for a transaction based on its transaction type and ID.  Use this endpoint before submitting Travel Rule information to understand the requirements and available options for your transaction. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    String transactionType = "DEPOSIT";
    UUID transactionId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
    try {
      GetTransactionLimitation200Response result = apiInstance.getTransactionLimitation(transactionType, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#getTransactionLimitation");
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
| **transactionType** | **String**| The transaction type. Possible values include:    - &#x60;DEPOSIT&#x60;: A deposit transaction.   - &#x60;WITHDRAW&#x60;: A withdrawal transaction.  | [enum: DEPOSIT, WITHDRAW] |
| **transactionId** | **UUID**| The transaction ID. | |

### Return type

[**GetTransactionLimitation200Response**](GetTransactionLimitation200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listSupportedCountries"></a>
# **listSupportedCountries**
> List&lt;ListSupportedCountries200ResponseInner&gt; listSupportedCountries()

List supported countries

This operation retrieves a list of supported countries that can be used when submitting Travel Rule information.  Use this endpoint to obtain valid country values for:   - Place of incorporation of a legal entity   - Place of birth of a natural person 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    try {
      List<ListSupportedCountries200ResponseInner> result = apiInstance.listSupportedCountries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#listSupportedCountries");
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

[**List&lt;ListSupportedCountries200ResponseInner&gt;**](ListSupportedCountries200ResponseInner.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of countries supported. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="submitDepositTravelRuleInfo"></a>
# **submitDepositTravelRuleInfo**
> SubmitDepositTravelRuleInfo201Response submitDepositTravelRuleInfo(travelRuleDepositRequest)

Submit Travel Rule information for deposits

This operation submits Travel Rule information for a deposit transaction. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    TravelRuleDepositRequest travelRuleDepositRequest = new TravelRuleDepositRequest();
    try {
      SubmitDepositTravelRuleInfo201Response result = apiInstance.submitDepositTravelRuleInfo(travelRuleDepositRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#submitDepositTravelRuleInfo");
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
| **travelRuleDepositRequest** | [**TravelRuleDepositRequest**](TravelRuleDepositRequest.md)|  | [optional] |

### Return type

[**SubmitDepositTravelRuleInfo201Response**](SubmitDepositTravelRuleInfo201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully submitted the Travel Rule information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="submitWithdrawTravelRuleInfo"></a>
# **submitWithdrawTravelRuleInfo**
> SubmitDepositTravelRuleInfo201Response submitWithdrawTravelRuleInfo(travelRuleWithdrawRequest)

Submit Travel Rule information for withdrawals

This operation submits Travel Rule information for a withdrawal transaction. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    TravelRuleWithdrawRequest travelRuleWithdrawRequest = new TravelRuleWithdrawRequest();
    try {
      SubmitDepositTravelRuleInfo201Response result = apiInstance.submitWithdrawTravelRuleInfo(travelRuleWithdrawRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#submitWithdrawTravelRuleInfo");
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
| **travelRuleWithdrawRequest** | [**TravelRuleWithdrawRequest**](TravelRuleWithdrawRequest.md)|  | [optional] |

### Return type

[**SubmitDepositTravelRuleInfo201Response**](SubmitDepositTravelRuleInfo201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully submitted the Travel Rule information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

