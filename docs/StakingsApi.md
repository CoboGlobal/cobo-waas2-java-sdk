# StakingsApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBabylonAirdropRegistration**](StakingsApi.md#createBabylonAirdropRegistration) | **POST** /stakings/protocols/babylon/airdrops/registrations | Register for Babylon airdrop |
| [**createBabylonStakingRegistration**](StakingsApi.md#createBabylonStakingRegistration) | **POST** /stakings/protocols/babylon/stakings/registrations | Register for Babylon Phase-2 |
| [**createClaimActivity**](StakingsApi.md#createClaimActivity) | **POST** /stakings/activities/claim | Create claim activity |
| [**createStakeActivity**](StakingsApi.md#createStakeActivity) | **POST** /stakings/activities/stake | Create stake activity |
| [**createUnstakeActivity**](StakingsApi.md#createUnstakeActivity) | **POST** /stakings/activities/unstake | Create unstake activity |
| [**createWithdrawActivity**](StakingsApi.md#createWithdrawActivity) | **POST** /stakings/activities/withdraw | Create withdraw activity |
| [**getBabylonAirdropRegistrationById**](StakingsApi.md#getBabylonAirdropRegistrationById) | **GET** /stakings/protocols/babylon/airdrops/registrations/{registration_id} | Get Babylon airdrop registration details |
| [**getBabylonStakingRegistrationById**](StakingsApi.md#getBabylonStakingRegistrationById) | **GET** /stakings/protocols/babylon/stakings/registrations/{registration_id} | Get Babylon Phase-2 registration details |
| [**getStakingActivityById**](StakingsApi.md#getStakingActivityById) | **GET** /stakings/activities/{activity_id} | Get staking activity details |
| [**getStakingById**](StakingsApi.md#getStakingById) | **GET** /stakings/{staking_id} | Get staking position details |
| [**getStakingEstimationFee**](StakingsApi.md#getStakingEstimationFee) | **POST** /stakings/estimate_fee | Estimate staking fees |
| [**getStakingEstimationFeeV2**](StakingsApi.md#getStakingEstimationFeeV2) | **POST** /stakings/estimate_fee_v2 | Estimate staking fees v2 |
| [**getStakingPoolById**](StakingsApi.md#getStakingPoolById) | **GET** /stakings/pools/{pool_id} | Get staking pool details |
| [**listBabylonAirdropRegistrations**](StakingsApi.md#listBabylonAirdropRegistrations) | **GET** /stakings/protocols/babylon/airdrops/registrations | List Babylon airdrop registrations |
| [**listBabylonEligibleAirdrops**](StakingsApi.md#listBabylonEligibleAirdrops) | **GET** /stakings/protocols/babylon/airdrops/eligibles | List wallets eligible for Babylon airdrop |
| [**listBabylonEligibleStakings**](StakingsApi.md#listBabylonEligibleStakings) | **GET** /stakings/protocols/babylon/stakings/eligibles | List staking positions eligible for Babylon Phase-2 |
| [**listBabylonStakingRegistrations**](StakingsApi.md#listBabylonStakingRegistrations) | **GET** /stakings/protocols/babylon/stakings/registrations | List Babylon Phase-2 registrations |
| [**listStakingActivities**](StakingsApi.md#listStakingActivities) | **GET** /stakings/activities | List staking activities |
| [**listStakingPools**](StakingsApi.md#listStakingPools) | **GET** /stakings/pools | List staking pools |
| [**listStakings**](StakingsApi.md#listStakings) | **GET** /stakings | List staking positions |


<a id="createBabylonAirdropRegistration"></a>
# **createBabylonAirdropRegistration**
> CreateBabylonAirdropRegistration201Response createBabylonAirdropRegistration(createBabylonAirdropRegistrationRequest)

Register for Babylon airdrop

This operation initiates a Babylon airdrop registration request.   Before calling this operation, please ensure the following: - The Bitcoin (BTC) address is eligible for the Babylon airdrop and has not been registered. You can call the [List wallets eligible for Babylon airdrop](https://www.cobo.com/developers/v2/api-references/stakings/list-wallets-eligible-for-babylon-airdrop) operation to check the registration status. - The Babylon address has enough asset to pay for the registration fee. - The Babylon address must be a Babylon address in an MPC Wallet in your organization.  The system first checks whether the provided address is eligible for the Babylon airdrop. If eligible, it creates a unique registration ID, which can be used to track the status.   The registration is processed asynchronously and may take some time to complete. It is recommended that you regularly call the [Get Babylon airdrop registration details](https://www.cobo.com/developers/v2/api-references/stakings/get-babylon-airdrop-registration-details) operation to check the status and handle registration accordingly.  For more information, refer to [Babylon&#39;s official doc](https://github.com/babylonlabs-io/babylon/tree/main/docs). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    CreateBabylonAirdropRegistrationRequest createBabylonAirdropRegistrationRequest = new CreateBabylonAirdropRegistrationRequest();
    try {
      CreateBabylonAirdropRegistration201Response result = apiInstance.createBabylonAirdropRegistration(createBabylonAirdropRegistrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#createBabylonAirdropRegistration");
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
| **createBabylonAirdropRegistrationRequest** | [**CreateBabylonAirdropRegistrationRequest**](CreateBabylonAirdropRegistrationRequest.md)| The request body to register for the Babylon airdrop. | [optional] |

### Return type

[**CreateBabylonAirdropRegistration201Response**](CreateBabylonAirdropRegistration201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Airdrop registration created successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createBabylonStakingRegistration"></a>
# **createBabylonStakingRegistration**
> CreateBabylonStakingRegistration201Response createBabylonStakingRegistration(createBabylonStakingRegistrationRequest)

Register for Babylon Phase-2

This operation initiates a Babylon Phase-2 registration request.   Before calling this operation, please ensure the following: - The staking position is eligible for the Babylon Phase-2 and has not been registered. You can call the [List staking positions eligible for Babylon Phase-2](https://www.cobo.com/developers/v2/api-references/stakings/list-staking-positions-eligible-for-babylon-phase-2) operation to check the registration status. - The Babylon address has enough asset to pay for the registration fee. - The Babylon address must be a Babylon address in an MPC Wallet in your organization.  The system first checks whether the provided address is eligible for Phase-2. If eligible, it creates a unique registration ID, which can be used to track the status.   The registration is processed asynchronously and may take some time to complete. It is recommended that you regularly call the [Get Babylon Phase-2 registration details](https://www.cobo.com/developers/v2/api-references/stakings/get-babylon-phase-2-registration-details) operation to check the status and handle registration accordingly.  For more information, refer to [Babylon&#39;s official doc](https://github.com/babylonlabs-io/babylon/tree/main/docs). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    CreateBabylonStakingRegistrationRequest createBabylonStakingRegistrationRequest = new CreateBabylonStakingRegistrationRequest();
    try {
      CreateBabylonStakingRegistration201Response result = apiInstance.createBabylonStakingRegistration(createBabylonStakingRegistrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#createBabylonStakingRegistration");
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
| **createBabylonStakingRegistrationRequest** | [**CreateBabylonStakingRegistrationRequest**](CreateBabylonStakingRegistrationRequest.md)| The request body to transit Babylon BTC staking to phase 2 | [optional] |

### Return type

[**CreateBabylonStakingRegistration201Response**](CreateBabylonStakingRegistration201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Register Babylon BTC staking for phase 2 successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createClaimActivity"></a>
# **createClaimActivity**
> CreateStakeActivity201Response createClaimActivity(createClaimActivityRequest)

Create claim activity

This operation creates a claim request.  &lt;Note&gt;Currently, only the Ethereum Beacon protocol supports this operation.&lt;/Note&gt;  For some protocols, you can use the &#x60;fee&#x60; property in the request body to specify the maximum fee you are willing to pay. The transaction will fail if the actual fee exceeds the specified maximum fee. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    CreateClaimActivityRequest createClaimActivityRequest = new CreateClaimActivityRequest();
    try {
      CreateStakeActivity201Response result = apiInstance.createClaimActivity(createClaimActivityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#createClaimActivity");
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
| **createClaimActivityRequest** | [**CreateClaimActivityRequest**](CreateClaimActivityRequest.md)| The request body to create a staking request. | [optional] |

### Return type

[**CreateStakeActivity201Response**](CreateStakeActivity201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a staking activity. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createStakeActivity"></a>
# **createStakeActivity**
> CreateStakeActivity201Response createStakeActivity(createStakeActivityRequest)

Create stake activity

This operation creates a staking request.  For some protocols, you can use the &#x60;fee&#x60; property in the request body to specify the maximum fee you are willing to pay. The transaction will fail if the actual fee exceeds the specified maximum fee.   &lt;Note&gt;For the Babylon protocol, you can only select UTXO as the fee model.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    CreateStakeActivityRequest createStakeActivityRequest = new CreateStakeActivityRequest();
    try {
      CreateStakeActivity201Response result = apiInstance.createStakeActivity(createStakeActivityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#createStakeActivity");
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
| **createStakeActivityRequest** | [**CreateStakeActivityRequest**](CreateStakeActivityRequest.md)| The request body to create a staking request. | [optional] |

### Return type

[**CreateStakeActivity201Response**](CreateStakeActivity201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a staking activity. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createUnstakeActivity"></a>
# **createUnstakeActivity**
> CreateStakeActivity201Response createUnstakeActivity(createUnstakeActivityRequest)

Create unstake activity

This operation creates an unstaking request. Your staked tokens will be automatically unlocked once the specified locking period ends. If you want to withdraw your tokens beforehand, you can unstake them with this operation.  For some protocols, you can use the &#x60;fee&#x60; property in the request body to specify the maximum fee you are willing to pay. The transaction will fail if the actual fee exceeds the specified maximum fee.   &lt;Note&gt;For the Babylon protocol, you can only select UTXO as the fee model.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    CreateUnstakeActivityRequest createUnstakeActivityRequest = new CreateUnstakeActivityRequest();
    try {
      CreateStakeActivity201Response result = apiInstance.createUnstakeActivity(createUnstakeActivityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#createUnstakeActivity");
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
| **createUnstakeActivityRequest** | [**CreateUnstakeActivityRequest**](CreateUnstakeActivityRequest.md)| The request body to create a unstaking request. | [optional] |

### Return type

[**CreateStakeActivity201Response**](CreateStakeActivity201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a staking activity. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createWithdrawActivity"></a>
# **createWithdrawActivity**
> CreateStakeActivity201Response createWithdrawActivity(createWithdrawActivityRequest)

Create withdraw activity

This operation creates a withdrawal request.   For some protocols, you can use the &#x60;fee&#x60; property in the request body to specify the maximum fee you are willing to pay. The transaction will fail if the actual fee exceeds the specified maximum fee.   &lt;Note&gt;For the Babylon protocol, you can only select UTXO as the fee model.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    CreateWithdrawActivityRequest createWithdrawActivityRequest = new CreateWithdrawActivityRequest();
    try {
      CreateStakeActivity201Response result = apiInstance.createWithdrawActivity(createWithdrawActivityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#createWithdrawActivity");
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
| **createWithdrawActivityRequest** | [**CreateWithdrawActivityRequest**](CreateWithdrawActivityRequest.md)| The request body to create a withdraw activity. | [optional] |

### Return type

[**CreateStakeActivity201Response**](CreateStakeActivity201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a staking activity. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getBabylonAirdropRegistrationById"></a>
# **getBabylonAirdropRegistrationById**
> BabylonAirdropRegistration getBabylonAirdropRegistrationById(registrationId)

Get Babylon airdrop registration details

This operation returns the details of a specific Babylon airdrop registration, including registration status, Bitcoin (BTC) and Babylon addresses, airdrop amount, and error messages (if any).  Please note that registration is an asynchronous process and may take several minutes to complete. It is recommended to call this operation at regular intervals to track the status.  If the registration request fails, please check the error message and resolve the issues before resubmitting the registration request.  For more information, refer to [Babylon&#39;s official doc](https://github.com/babylonlabs-io/babylon/tree/main/docs). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    String registrationId = "registrationId_example";
    try {
      BabylonAirdropRegistration result = apiInstance.getBabylonAirdropRegistrationById(registrationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#getBabylonAirdropRegistrationById");
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
| **registrationId** | **String**| The Babylon airdrop or Babylon Phase-2 registration ID. You can use the [Register for Babylon airdrop](https://www.cobo.com/developers/v2/api-references/stakings/register-for-babylon-airdrop) or the [Register for Babylon Phase-2](https://www.cobo.com/developers/v2/api-references/stakings/register-for-babylon-phase-2) operation to get this information. | |

### Return type

[**BabylonAirdropRegistration**](BabylonAirdropRegistration.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get airdrop registration details successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getBabylonStakingRegistrationById"></a>
# **getBabylonStakingRegistrationById**
> BabylonStakingRegistration getBabylonStakingRegistrationById(registrationId)

Get Babylon Phase-2 registration details

This operation returns the details of a specific Babylon Phase-2 registration, including registration status, Bitcoin (BTC) and Babylon addresses, staked amount, and error messages (if any).  Please note that registration is an asynchronous process and may take several minutes to complete. It is recommended to call this operation at regular intervals to track the status.  If the registration request fails, please check the error message and resolve the issues before resubmitting the registration request.  For more information, refer to [Babylon&#39;s official doc](https://github.com/babylonlabs-io/babylon/tree/main/docs). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    String registrationId = "registrationId_example";
    try {
      BabylonStakingRegistration result = apiInstance.getBabylonStakingRegistrationById(registrationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#getBabylonStakingRegistrationById");
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
| **registrationId** | **String**| The Babylon airdrop or Babylon Phase-2 registration ID. You can use the [Register for Babylon airdrop](https://www.cobo.com/developers/v2/api-references/stakings/register-for-babylon-airdrop) or the [Register for Babylon Phase-2](https://www.cobo.com/developers/v2/api-references/stakings/register-for-babylon-phase-2) operation to get this information. | |

### Return type

[**BabylonStakingRegistration**](BabylonStakingRegistration.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get babylon staking registration details successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getStakingActivityById"></a>
# **getStakingActivityById**
> Activity getStakingActivityById(activityId)

Get staking activity details

This operation retrieves the details of a specified staking activity. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    String activityId = "f47ac10b-58cc-4372-a567-0e02b2c3d479";
    try {
      Activity result = apiInstance.getStakingActivityById(activityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#getStakingActivityById");
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
| **activityId** | **String**| The activity ID. | |

### Return type

[**Activity**](Activity.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A staking activity has been successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getStakingById"></a>
# **getStakingById**
> Stakings getStakingById(stakingId)

Get staking position details

This operation retrieves the detailed information about a specified staking position. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    String stakingId = "f47ac10b-58cc-4372-a567-0e02b2c3d479";
    try {
      Stakings result = apiInstance.getStakingById(stakingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#getStakingById");
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
| **stakingId** | **String**| The ID of the staking position. You can retrieve a list of staking positions by calling [List staking positions](https://www.cobo.com/developers/v2/api-references/stakings/list-staking-positions). | |

### Return type

[**Stakings**](Stakings.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A staking position has been successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getStakingEstimationFee"></a>
# **getStakingEstimationFee**
> GetStakingEstimationFee201Response getStakingEstimationFee(getStakingEstimationFeeRequest)

Estimate staking fees

&lt;Note&gt;This operation is deprecated. Please use the [updated version](https://www.cobo.com/developers/v2/api-references/stakings/estimate-staking-fees-v2) instead.&lt;/Note&gt;  This operation calculates the fee required for a staking activity based on factors such as network congestion and transaction complexity.  For some protocols, you can use the &#x60;fee.fee_rate&#x60; property in the request body to specify the fee rate you are willing to pay.  The &#x60;fee.max_fee_amount&#x60; property in the request body will be ignored.  &lt;Note&gt;For the Babylon protocol, you can only select UTXO as the fee model.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    GetStakingEstimationFeeRequest getStakingEstimationFeeRequest = new GetStakingEstimationFeeRequest();
    try {
      GetStakingEstimationFee201Response result = apiInstance.getStakingEstimationFee(getStakingEstimationFeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#getStakingEstimationFee");
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
| **getStakingEstimationFeeRequest** | [**GetStakingEstimationFeeRequest**](GetStakingEstimationFeeRequest.md)| The request body to get the estimated fee of a staking activity. | [optional] |

### Return type

[**GetStakingEstimationFee201Response**](GetStakingEstimationFee201Response.md)

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

<a id="getStakingEstimationFeeV2"></a>
# **getStakingEstimationFeeV2**
> EthStakeEstimatedFee getStakingEstimationFeeV2(getStakingEstimationFeeRequest)

Estimate staking fees v2

This operation calculates the fee required for a staking activity based on factors such as network congestion and transaction complexity.  &lt;Note&gt;For the Babylon protocol, you can only select UTXO as the fee model.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    GetStakingEstimationFeeRequest getStakingEstimationFeeRequest = new GetStakingEstimationFeeRequest();
    try {
      EthStakeEstimatedFee result = apiInstance.getStakingEstimationFeeV2(getStakingEstimationFeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#getStakingEstimationFeeV2");
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
| **getStakingEstimationFeeRequest** | [**GetStakingEstimationFeeRequest**](GetStakingEstimationFeeRequest.md)| The request body to get the estimated fee of a staking activity. | [optional] |

### Return type

[**EthStakeEstimatedFee**](EthStakeEstimatedFee.md)

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

<a id="getStakingPoolById"></a>
# **getStakingPoolById**
> PoolDetails getStakingPoolById(poolId)

Get staking pool details

This operation retrieves the detailed information about a specified staking pool. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    String poolId = "babylon_btc";
    try {
      PoolDetails result = apiInstance.getStakingPoolById(poolId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#getStakingPoolById");
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
| **poolId** | **String**| The ID of the staking pool. A staking pool is a pairing of a staking protocol and a specific type of token. You can call [List staking pools](https://www.cobo.com/developers/v2/api-references/stakings/list-staking-pools) to retrieve a list of staking pools. | |

### Return type

[**PoolDetails**](PoolDetails.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A staking pool has been successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listBabylonAirdropRegistrations"></a>
# **listBabylonAirdropRegistrations**
> ListBabylonAirdropRegistrations200Response listBabylonAirdropRegistrations(status, btcAddress, limit, before, after)

List Babylon airdrop registrations

This operation lists all Babylon airdrop registration records within your organization. You can filter the results by request status and Bitcoin (BTC) address.  The registration is processed asynchronously and may take some time to complete. It is recommended to implement automatic monitoring and handle the registration on time.  If the registration request fails, please check the error message and resolve the issues before resubmitting the registration request.  For more information, refer to [Babylon&#39;s official doc](https://github.com/babylonlabs-io/babylon/tree/main/docs). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    String status = "Processing";
    String btcAddress = "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListBabylonAirdropRegistrations200Response result = apiInstance.listBabylonAirdropRegistrations(status, btcAddress, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#listBabylonAirdropRegistrations");
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
| **status** | **String**| The registration request status. | [optional] [enum: Processing, Completed, Failed] |
| **btcAddress** | **String**| The Bitcoin (BTC) address used for staking. | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListBabylonAirdropRegistrations200Response**](ListBabylonAirdropRegistrations200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of babylon airdrop registrations retrieved successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listBabylonEligibleAirdrops"></a>
# **listBabylonEligibleAirdrops**
> ListBabylonEligibleAirdrops200Response listBabylonEligibleAirdrops(status, limit, before, after)

List wallets eligible for Babylon airdrop

This operation lists all wallets that are eligible for the Babylon airdrop. If an eligible wallet&#39;s status is &#x60;Unregistered&#x60;, you can initiate an airdrop registration for it. You can filter the results by airdrop registration status.  You can use this operation to: - Check which wallets are eligible for airdrop registrations - Estimate airdrop amounts before claiming - Monitor available airdrop  As registration is an asynchronous process and might take some time to complete, it is recommended that you regularly call this operation to check wallet eligibility and register eligible wallets on time.  For more information, refer to [Babylon&#39;s official doc](https://github.com/babylonlabs-io/babylon/tree/main/docs). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    String status = "Registered";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListBabylonEligibleAirdrops200Response result = apiInstance.listBabylonEligibleAirdrops(status, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#listBabylonEligibleAirdrops");
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
| **status** | **String**| The status of Babylon airdrop or Phase-2 registration. Possible values are: - &#x60;Registered&#x60;: Registered for Babylon airdrop or Phase-2. - &#x60;Unregistered&#x60;: Not registered for any Babylon airdrop or Phase-2. - &#x60;Registering&#x60;: The Babylon airdrop or Phase-2 registration is in progress but not yet completed.  | [optional] [enum: Registered, Unregistered, Registering] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListBabylonEligibleAirdrops200Response**](ListBabylonEligibleAirdrops200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of wallets eligible for Babylon airdrop registration |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listBabylonEligibleStakings"></a>
# **listBabylonEligibleStakings**
> ListBabylonEligibleStakings200Response listBabylonEligibleStakings(status, limit, before, after)

List staking positions eligible for Babylon Phase-2

This operation lists all staking positions that are eligible for Babylon Phase-2. If an eligible staking position&#39;s status is &#x60;Unregistered&#x60;, you can initiate a registration for it. You can filter the results by registration status.  You can use this operation to: - Check which staking positions can be registered - Get staking details before initiating registration - Monitor available positions for registration  As registration is an asynchronous process and might take some time to complete, it is recommended that you regularly call this operation to check staking position eligibility and register eligible positions on time.  For more information, refer to [Babylon&#39;s official doc](https://github.com/babylonlabs-io/babylon/tree/main/docs). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    String status = "Registered";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListBabylonEligibleStakings200Response result = apiInstance.listBabylonEligibleStakings(status, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#listBabylonEligibleStakings");
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
| **status** | **String**| The status of Babylon airdrop or Phase-2 registration. Possible values are: - &#x60;Registered&#x60;: Registered for Babylon airdrop or Phase-2. - &#x60;Unregistered&#x60;: Not registered for any Babylon airdrop or Phase-2. - &#x60;Registering&#x60;: The Babylon airdrop or Phase-2 registration is in progress but not yet completed.  | [optional] [enum: Registered, Unregistered, Registering] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListBabylonEligibleStakings200Response**](ListBabylonEligibleStakings200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of stakings eligible for Babylon Phase-2 registration |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listBabylonStakingRegistrations"></a>
# **listBabylonStakingRegistrations**
> ListBabylonStakingRegistrations200Response listBabylonStakingRegistrations(status, stakingId, limit, before, after)

List Babylon Phase-2 registrations

This operation lists all Babylon Phase-2 registration records within your organization. You can filter the results by request status and staking position ID.  The registration is processed asynchronously and may take some time to complete. It is recommended to implement automatic monitoring and handle the registration on time.  If the registration request fails, please check the error message and resolve the issues before resubmitting the registration request.  For more information, refer to [Babylon&#39;s official doc](https://github.com/babylonlabs-io/babylon/tree/main/docs). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    String status = "Processing";
    String stakingId = "f47ac10b-58cc-4372-a567-0e02b2c3d479";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListBabylonStakingRegistrations200Response result = apiInstance.listBabylonStakingRegistrations(status, stakingId, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#listBabylonStakingRegistrations");
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
| **status** | **String**| The registration request status. | [optional] [enum: Processing, Completed, Failed] |
| **stakingId** | **String**| The ID of the Phase-1 BTC staking position. | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListBabylonStakingRegistrations200Response**](ListBabylonStakingRegistrations200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of babylon staking registrations retrieved successfully |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listStakingActivities"></a>
# **listStakingActivities**
> ListStakingActivities200Response listStakingActivities(poolId, stakingId, activityType, activityStatus, minModifiedTimestamp, maxModifiedTimestamp, initiator, requestId, limit, before, after)

List staking activities

This operation retrieves a list of staking activities. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    String poolId = "babylon_btc";
    String stakingId = "f47ac10b-58cc-4372-a567-0e02b2c3d479";
    ActivityType activityType = ActivityType.fromValue("Stake");
    ActivityStatus activityStatus = ActivityStatus.fromValue("Success");
    Long minModifiedTimestamp = 1635744000000L;
    Long maxModifiedTimestamp = 1635744000000L;
    String initiator = "steve@example.com";
    String requestId = "web_send_by_user_327_1610444045047";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListStakingActivities200Response result = apiInstance.listStakingActivities(poolId, stakingId, activityType, activityStatus, minModifiedTimestamp, maxModifiedTimestamp, initiator, requestId, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#listStakingActivities");
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
| **poolId** | **String**| The ID of the staking pool. A staking pool is a pairing of a staking protocol and a specific type of token. You can call [List staking pools](https://www.cobo.com/developers/v2/api-references/stakings/list-staking-pools) to retrieve a list of staking pools. | [optional] |
| **stakingId** | **String**| The ID of the Phase-1 BTC staking position. | [optional] |
| **activityType** | [**ActivityType**](.md)|  | [optional] [enum: Stake, Unstake, Withdraw, Claim] |
| **activityStatus** | [**ActivityStatus**](.md)|  | [optional] [enum: Success, Processing, Failed] |
| **minModifiedTimestamp** | **Long**| The start time of the query. All staking activities updated after the specified time will be retrieved. The time is in Unix timestamp format, measured in milliseconds. | [optional] |
| **maxModifiedTimestamp** | **Long**| The end time of the query. All staking activities updated before the specified time will be retrieved. The time is in Unix timestamp format, measured in milliseconds. | [optional] |
| **initiator** | **String**| The activity initiator, which is your API key by default. You can also specify the initiator when creating the activity. | [optional] |
| **requestId** | **String**| The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListStakingActivities200Response**](ListStakingActivities200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of staking activities have been successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listStakingPools"></a>
# **listStakingPools**
> ListStakingPools200Response listStakingPools(chainId, tokenId, limit, before, after)

List staking pools

This operation retrieves a list of staking pools currently supported. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    String chainId = "ETH";
    String tokenId = "ETH_USDT";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListStakingPools200Response result = apiInstance.listStakingPools(chainId, tokenId, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#listStakingPools");
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
| **chainId** | **String**| The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). | [optional] |
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListStakingPools200Response**](ListStakingPools200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of staking pools has been successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listStakings"></a>
# **listStakings**
> ListStakings200Response listStakings(poolId, statuses, walletId, tokenId, limit, before, after)

List staking positions

This operation retrieves a list of staking positions. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.StakingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    StakingsApi apiInstance = new StakingsApi();
    String poolId = "babylon_btc";
    String statuses = "Active,StakeInProgress,";
    UUID walletId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    String tokenId = "ETH_USDT";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListStakings200Response result = apiInstance.listStakings(poolId, statuses, walletId, tokenId, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StakingsApi#listStakings");
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
| **poolId** | **String**| The ID of the staking pool. A staking pool is a pairing of a staking protocol and a specific type of token. You can call [List staking pools](https://www.cobo.com/developers/v2/api-references/stakings/list-staking-pools) to retrieve a list of staking pools. | [optional] |
| **statuses** | **String**| The statuses of the staking amounts, separated by comma. Possible values include:  - &#x60;StakeInProgress&#x60;: The staking request is submitted and is waiting to be confirmed by the staking protocol. - &#x60;Active&#x60;: The amount has been staked. - &#x60;Rejected&#x60;: The staking request has been rejected because the signer refuses to sign the transaction. - &#x60;LimitExceeded&#x60;: The total staking cap of the staking protocol has been reached. - &#x60;Invalid&#x60;: The staking request is invalid. This is often due to the failure to broadcast the transaction. - &#x60;UnstakeInProgress&#x60;: The unstaking request is submitted and is waiting to be confirmed by the staking protocol. - &#x60;Withdrawable&#x60;: The tokens have been unstaked and are ready to be withdrawn. - &#x60;WithdrawInProgress&#x60;: The withdrawal request is submitted and is waiting to be confirmed on the chain network. - &#x60;Closed&#x60;: The staking position is closed.  | [optional] |
| **walletId** | **UUID**| The wallet ID. | [optional] |
| **tokenId** | **String**| The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListStakings200Response**](ListStakings200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of staking positions has been successfully retrieved. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

