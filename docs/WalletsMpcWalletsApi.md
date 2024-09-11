# WalletsMpcWalletsApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelTssRequestById**](WalletsMpcWalletsApi.md#cancelTssRequestById) | **POST** /wallets/mpc/vaults/{vault_id}/tss_requests/{tss_request_id}/cancel | Cancel TSS request |
| [**createKeyShareHolderGroup**](WalletsMpcWalletsApi.md#createKeyShareHolderGroup) | **POST** /wallets/mpc/vaults/{vault_id}/key_share_holder_groups | Create key share holder group |
| [**createMpcProject**](WalletsMpcWalletsApi.md#createMpcProject) | **POST** /wallets/mpc/projects | Create project |
| [**createMpcVault**](WalletsMpcWalletsApi.md#createMpcVault) | **POST** /wallets/mpc/vaults | Create vault |
| [**createTssRequest**](WalletsMpcWalletsApi.md#createTssRequest) | **POST** /wallets/mpc/vaults/{vault_id}/tss_requests | Create TSS request |
| [**deleteKeyShareHolderGroupById**](WalletsMpcWalletsApi.md#deleteKeyShareHolderGroupById) | **POST** /wallets/mpc/vaults/{vault_id}/key_share_holder_groups/{key_share_holder_group_id}/delete | Delete key share holder group |
| [**getKeyShareHolderGroupById**](WalletsMpcWalletsApi.md#getKeyShareHolderGroupById) | **GET** /wallets/mpc/vaults/{vault_id}/key_share_holder_groups/{key_share_holder_group_id} | Get key share holder group information |
| [**getMpcProjectById**](WalletsMpcWalletsApi.md#getMpcProjectById) | **GET** /wallets/mpc/projects/{project_id} | Get project information |
| [**getMpcVaultById**](WalletsMpcWalletsApi.md#getMpcVaultById) | **GET** /wallets/mpc/vaults/{vault_id} | Get vault information |
| [**getTssRequestById**](WalletsMpcWalletsApi.md#getTssRequestById) | **GET** /wallets/mpc/vaults/{vault_id}/tss_requests/{tss_request_id} | Get TSS request |
| [**listCoboKeyHolders**](WalletsMpcWalletsApi.md#listCoboKeyHolders) | **GET** /wallets/mpc/cobo_key_share_holders | List all Cobo key share holders |
| [**listKeyShareHolderGroups**](WalletsMpcWalletsApi.md#listKeyShareHolderGroups) | **GET** /wallets/mpc/vaults/{vault_id}/key_share_holder_groups | List all key share holder groups |
| [**listMpcProjects**](WalletsMpcWalletsApi.md#listMpcProjects) | **GET** /wallets/mpc/projects | List all projects |
| [**listMpcVaults**](WalletsMpcWalletsApi.md#listMpcVaults) | **GET** /wallets/mpc/vaults | List all vaults |
| [**listTssRequests**](WalletsMpcWalletsApi.md#listTssRequests) | **GET** /wallets/mpc/vaults/{vault_id}/tss_requests | List TSS requests |
| [**updateKeyShareHolderGroupById**](WalletsMpcWalletsApi.md#updateKeyShareHolderGroupById) | **PUT** /wallets/mpc/vaults/{vault_id}/key_share_holder_groups/{key_share_holder_group_id} | Update key share holder group |
| [**updateMpcProjectById**](WalletsMpcWalletsApi.md#updateMpcProjectById) | **PUT** /wallets/mpc/projects/{project_id} | Update project name |
| [**updateMpcVaultById**](WalletsMpcWalletsApi.md#updateMpcVaultById) | **PUT** /wallets/mpc/vaults/{vault_id} | Update vault name |


<a id="cancelTssRequestById"></a>
# **cancelTssRequestById**
> TSSRequest cancelTssRequestById(vaultId, tssRequestId)

Cancel TSS request

This operation cancels a TSS request. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    UUID vaultId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    String tssRequestId = "20240711114129000132315000003970";
    try {
      TSSRequest result = apiInstance.cancelTssRequestById(vaultId, tssRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#cancelTssRequestById");
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
| **vaultId** | **UUID**| The vault ID, which you can retrieve by calling [List all vaults](/v2/api-references/wallets--mpc-wallet/list-all-mpc-vaults). | |
| **tssRequestId** | **String**| The TSS request ID, which you can retrieve by calling [List TSS requests](/v2/api-references/wallets--mpc-wallets/list-tss-requests). | |

### Return type

[**TSSRequest**](TSSRequest.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully modified the TSS request. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createKeyShareHolderGroup"></a>
# **createKeyShareHolderGroup**
> KeyShareHolderGroup createKeyShareHolderGroup(vaultId, createKeyShareHolderGroupRequest)

Create key share holder group

This operation creates a key share holder group for a specified vault. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    UUID vaultId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    CreateKeyShareHolderGroupRequest createKeyShareHolderGroupRequest = new CreateKeyShareHolderGroupRequest();
    try {
      KeyShareHolderGroup result = apiInstance.createKeyShareHolderGroup(vaultId, createKeyShareHolderGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#createKeyShareHolderGroup");
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
| **vaultId** | **UUID**| The vault ID, which you can retrieve by calling [List all vaults](/v2/api-references/wallets--mpc-wallet/list-all-mpc-vaults). | |
| **createKeyShareHolderGroupRequest** | [**CreateKeyShareHolderGroupRequest**](CreateKeyShareHolderGroupRequest.md)| The request body to create a key share holder group. | [optional] |

### Return type

[**KeyShareHolderGroup**](KeyShareHolderGroup.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | mpc vault successfully created |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createMpcProject"></a>
# **createMpcProject**
> MPCProject createMpcProject(createMpcProjectRequest)

Create project

This operation creates a project.  &lt;Note&gt;This operation applies to MPC Wallets (User-Controlled Wallets) only.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    CreateMpcProjectRequest createMpcProjectRequest = new CreateMpcProjectRequest();
    try {
      MPCProject result = apiInstance.createMpcProject(createMpcProjectRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#createMpcProject");
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
| **createMpcProjectRequest** | [**CreateMpcProjectRequest**](CreateMpcProjectRequest.md)| The request body to create a project. | [optional] |

### Return type

[**MPCProject**](MPCProject.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created project. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createMpcVault"></a>
# **createMpcVault**
> MPCVault createMpcVault(createMpcVaultRequest)

Create vault

This operation creates a vault. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    CreateMpcVaultRequest createMpcVaultRequest = new CreateMpcVaultRequest();
    try {
      MPCVault result = apiInstance.createMpcVault(createMpcVaultRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#createMpcVault");
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
| **createMpcVaultRequest** | [**CreateMpcVaultRequest**](CreateMpcVaultRequest.md)| The request body to create a vault. | [optional] |

### Return type

[**MPCVault**](MPCVault.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created the vault. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createTssRequest"></a>
# **createTssRequest**
> TSSRequest createTssRequest(vaultId, createTssRequestRequest)

Create TSS request

This operation creates a TSS request under a specified vault. You can use this operation to perform actions such as key generation and recovery. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    UUID vaultId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    CreateTssRequestRequest createTssRequestRequest = new CreateTssRequestRequest();
    try {
      TSSRequest result = apiInstance.createTssRequest(vaultId, createTssRequestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#createTssRequest");
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
| **vaultId** | **UUID**| The vault ID, which you can retrieve by calling [List all vaults](/v2/api-references/wallets--mpc-wallet/list-all-mpc-vaults). | |
| **createTssRequestRequest** | [**CreateTssRequestRequest**](CreateTssRequestRequest.md)| The request body to create a TSS request. | [optional] |

### Return type

[**TSSRequest**](TSSRequest.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | mpc vault successfully created |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="deleteKeyShareHolderGroupById"></a>
# **deleteKeyShareHolderGroupById**
> DeleteKeyShareHolderGroupById201Response deleteKeyShareHolderGroupById(vaultId, keyShareHolderGroupId)

Delete key share holder group

This operation deletes a specified key share holder group.

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    UUID vaultId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    String keyShareHolderGroupId = "e8257ac8-76b8-4d1e-a1f9-eec4cb931dce";
    try {
      DeleteKeyShareHolderGroupById201Response result = apiInstance.deleteKeyShareHolderGroupById(vaultId, keyShareHolderGroupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#deleteKeyShareHolderGroupById");
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
| **vaultId** | **UUID**| The vault ID, which you can retrieve by calling [List all vaults](/v2/api-references/wallets--mpc-wallet/list-all-mpc-vaults). | |
| **keyShareHolderGroupId** | **String**| The key share holder group ID. | |

### Return type

[**DeleteKeyShareHolderGroupById201Response**](DeleteKeyShareHolderGroupById201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully deleted the specified key share holder group. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getKeyShareHolderGroupById"></a>
# **getKeyShareHolderGroupById**
> KeyShareHolderGroup getKeyShareHolderGroupById(vaultId, keyShareHolderGroupId)

Get key share holder group information

This operation retrieves detailed information about a specified key share holder group. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    UUID vaultId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    String keyShareHolderGroupId = "e8257ac8-76b8-4d1e-a1f9-eec4cb931dce";
    try {
      KeyShareHolderGroup result = apiInstance.getKeyShareHolderGroupById(vaultId, keyShareHolderGroupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#getKeyShareHolderGroupById");
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
| **vaultId** | **UUID**| The vault ID, which you can retrieve by calling [List all vaults](/v2/api-references/wallets--mpc-wallet/list-all-mpc-vaults). | |
| **keyShareHolderGroupId** | **String**| The key share holder group ID. | |

### Return type

[**KeyShareHolderGroup**](KeyShareHolderGroup.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully get mpc tss group |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getMpcProjectById"></a>
# **getMpcProjectById**
> MPCProject getMpcProjectById(projectId)

Get project information

This operation retrieves detailed information about a project. &lt;Note&gt;This operation applies to MPC Wallets (User-Controlled Wallets) only.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    UUID projectId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      MPCProject result = apiInstance.getMpcProjectById(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#getMpcProjectById");
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
| **projectId** | **UUID**| The project ID, which you can retrieve by calling [List all projects](/v2/api-references/wallets--mpc-wallets/list-all-projects). | |

### Return type

[**MPCProject**](MPCProject.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully listed all vaults. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getMpcVaultById"></a>
# **getMpcVaultById**
> MPCVault getMpcVaultById(vaultId)

Get vault information

This operation retrieves detailed information about a vault. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    UUID vaultId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      MPCVault result = apiInstance.getMpcVaultById(vaultId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#getMpcVaultById");
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
| **vaultId** | **UUID**| The vault ID, which you can retrieve by calling [List all vaults](/v2/api-references/wallets--mpc-wallet/list-all-mpc-vaults). | |

### Return type

[**MPCVault**](MPCVault.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved vault information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getTssRequestById"></a>
# **getTssRequestById**
> TSSRequest getTssRequestById(vaultId, tssRequestId)

Get TSS request

This operation retrieves detailed information about a TSS request. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    UUID vaultId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    String tssRequestId = "20240711114129000132315000003970";
    try {
      TSSRequest result = apiInstance.getTssRequestById(vaultId, tssRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#getTssRequestById");
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
| **vaultId** | **UUID**| The vault ID, which you can retrieve by calling [List all vaults](/v2/api-references/wallets--mpc-wallet/list-all-mpc-vaults). | |
| **tssRequestId** | **String**| The TSS request ID, which you can retrieve by calling [List TSS requests](/v2/api-references/wallets--mpc-wallets/list-tss-requests). | |

### Return type

[**TSSRequest**](TSSRequest.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved TSS request. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listCoboKeyHolders"></a>
# **listCoboKeyHolders**
> List&lt;KeyShareHolder&gt; listCoboKeyHolders()

List all Cobo key share holders

This operation retrieves a list of all Cobo key share holders and their information.   &lt;Info&gt;When using this operation, &#x60;type&#x60; will only return &#x60;Cobo&#x60; and will never return &#x60;Mobile&#x60; or &#x60;API&#x60;.&lt;/Info&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    try {
      List<KeyShareHolder> result = apiInstance.listCoboKeyHolders();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#listCoboKeyHolders");
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

[**List&lt;KeyShareHolder&gt;**](KeyShareHolder.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully listed MPC Wallets&#39; key share holder information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listKeyShareHolderGroups"></a>
# **listKeyShareHolderGroups**
> ListKeyShareHolderGroups200Response listKeyShareHolderGroups(vaultId, keyShareHolderGroupType, limit, before, after)

List all key share holder groups

This operation retrieves all key share holder groups under a specified vault. You can filter the result by group type. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    UUID vaultId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    KeyShareHolderGroupType keyShareHolderGroupType = KeyShareHolderGroupType.fromValue("MainGroup");
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListKeyShareHolderGroups200Response result = apiInstance.listKeyShareHolderGroups(vaultId, keyShareHolderGroupType, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#listKeyShareHolderGroups");
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
| **vaultId** | **UUID**| The vault ID, which you can retrieve by calling [List all vaults](/v2/api-references/wallets--mpc-wallet/list-all-mpc-vaults). | |
| **keyShareHolderGroupType** | [**KeyShareHolderGroupType**](.md)| The key share holder group type. Possible values include: - &#x60;MainGroup&#x60;: The [Main Group](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/create-key-share-groups#main-group).  - &#x60;SigningGroup&#x60;: The [Signing Group](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/create-key-share-groups#signing-group).  - &#x60;RecoveryGroup&#x60;: The [Recovery Group](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/create-key-share-groups#recovery-group).  **Note**: If this parameter is left empty, all key share holder group types will be retrieved.  | [optional] [enum: MainGroup, SigningGroup, RecoveryGroup] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| An object ID that serves as a starting point for retrieving data in reverse chronological order. For example, if you specify &#x60;before&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;, the request will retrieve a list of data objects that end before the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;. You can set this parameter to the value of &#x60;pagination.before&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  - If you set &#x60;before&#x60; to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| An object ID that acts as a starting point for retrieving data in chronological order. For example, if you specify &#x60;after&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;, the request will retrieve a list of data objects that start after the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;. You can set this parameter to the value of &#x60;pagination.after&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListKeyShareHolderGroups200Response**](ListKeyShareHolderGroups200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully listed key share holder groups. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listMpcProjects"></a>
# **listMpcProjects**
> ListMpcProjects200Response listMpcProjects(limit, before, after)

List all projects

This operation retrieves a list of all projects.  &lt;Note&gt;This operation applies to MPC Wallets (User-Controlled Wallets) only.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListMpcProjects200Response result = apiInstance.listMpcProjects(limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#listMpcProjects");
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
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| An object ID that serves as a starting point for retrieving data in reverse chronological order. For example, if you specify &#x60;before&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;, the request will retrieve a list of data objects that end before the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;. You can set this parameter to the value of &#x60;pagination.before&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  - If you set &#x60;before&#x60; to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| An object ID that acts as a starting point for retrieving data in chronological order. For example, if you specify &#x60;after&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;, the request will retrieve a list of data objects that start after the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;. You can set this parameter to the value of &#x60;pagination.after&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListMpcProjects200Response**](ListMpcProjects200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully listed all projects. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listMpcVaults"></a>
# **listMpcVaults**
> ListMpcVaults200Response listMpcVaults(vaultType, projectId, limit, before, after)

List all vaults

This operation retrieves a list of all vaults. You can filter the result by project ID.  **Notes for query parameters**: 1. &#x60;project_id&#x60; is required when &#x60;vault_type&#x60; is set to &#x60;User-Controlled&#x60;. 2. &#x60;project_id&#x60; must be left blank when &#x60;vault_type&#x60; is set to &#x60;Org-Controlled&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    MPCVaultType vaultType = MPCVaultType.fromValue("Org-Controlled");
    UUID projectId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListMpcVaults200Response result = apiInstance.listMpcVaults(vaultType, projectId, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#listMpcVaults");
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
| **vaultType** | [**MPCVaultType**](.md)| The vault type. Possible values include: - &#x60;Org-Controlled&#x60;: This vault is a collection of [Organization-Controlled Wallets](https://manuals.cobo.com/en/portal/mpc-wallets/introduction#organization-controlled-wallets).  - &#x60;User-Controlled&#x60;: This vault is a collection of [User-Controlled Wallets](https://manuals.cobo.com/en/portal/mpc-wallets/introduction#user-controlled-wallets).  | [enum: Org-Controlled, User-Controlled] |
| **projectId** | **UUID**| The project ID, which you can retrieve by calling [List all projects](/v2/api-references/wallets--mpc-wallets/list-all-projects).  | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| An object ID that serves as a starting point for retrieving data in reverse chronological order. For example, if you specify &#x60;before&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;, the request will retrieve a list of data objects that end before the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;. You can set this parameter to the value of &#x60;pagination.before&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  - If you set &#x60;before&#x60; to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| An object ID that acts as a starting point for retrieving data in chronological order. For example, if you specify &#x60;after&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;, the request will retrieve a list of data objects that start after the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;. You can set this parameter to the value of &#x60;pagination.after&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListMpcVaults200Response**](ListMpcVaults200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully listed all vaults. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listTssRequests"></a>
# **listTssRequests**
> ListTssRequests200Response listTssRequests(vaultId, keyShareHolderGroupId, limit, before, after)

List TSS requests

This operation retrieves a list of TSS requests and their details. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    UUID vaultId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    String keyShareHolderGroupId = "a3a45e99-5a12-444f-867a-ffe0ebb1bb30";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListTssRequests200Response result = apiInstance.listTssRequests(vaultId, keyShareHolderGroupId, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#listTssRequests");
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
| **vaultId** | **UUID**| The vault ID, which you can retrieve by calling [List all vaults](/v2/api-references/wallets--mpc-wallet/list-all-mpc-vaults). | |
| **keyShareHolderGroupId** | **String**| The key share holder group ID of the TSS request, which you can retrieve by calling [List all key share holder groups](/v2/api-references/wallets--mpc-wallets/list-all-key-share-holder-groups). | |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| An object ID that serves as a starting point for retrieving data in reverse chronological order. For example, if you specify &#x60;before&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;, the request will retrieve a list of data objects that end before the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1&#x60;. You can set this parameter to the value of &#x60;pagination.before&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  - If you set &#x60;before&#x60; to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| An object ID that acts as a starting point for retrieving data in chronological order. For example, if you specify &#x60;after&#x60; as &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;, the request will retrieve a list of data objects that start after the object with the object ID &#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;. You can set this parameter to the value of &#x60;pagination.after&#x60; in the response of the previous request.  - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur.  - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListTssRequests200Response**](ListTssRequests200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved TSS request. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateKeyShareHolderGroupById"></a>
# **updateKeyShareHolderGroupById**
> KeyShareHolderGroup updateKeyShareHolderGroupById(vaultId, keyShareHolderGroupId, updateKeyShareHolderGroupByIdRequest)

Update key share holder group

This operation updates a specified active [Signing Group](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/create-key-share-groups). For example, you can use this operation to upgrade a Signing Group to the [Main Group](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/create-key-share-groups). 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    UUID vaultId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    String keyShareHolderGroupId = "e8257ac8-76b8-4d1e-a1f9-eec4cb931dce";
    UpdateKeyShareHolderGroupByIdRequest updateKeyShareHolderGroupByIdRequest = new UpdateKeyShareHolderGroupByIdRequest();
    try {
      KeyShareHolderGroup result = apiInstance.updateKeyShareHolderGroupById(vaultId, keyShareHolderGroupId, updateKeyShareHolderGroupByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#updateKeyShareHolderGroupById");
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
| **vaultId** | **UUID**| The vault ID, which you can retrieve by calling [List all vaults](/v2/api-references/wallets--mpc-wallet/list-all-mpc-vaults). | |
| **keyShareHolderGroupId** | **String**| The key share holder group ID. | |
| **updateKeyShareHolderGroupByIdRequest** | [**UpdateKeyShareHolderGroupByIdRequest**](UpdateKeyShareHolderGroupByIdRequest.md)|  | [optional] |

### Return type

[**KeyShareHolderGroup**](KeyShareHolderGroup.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully modify mpc tss group |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateMpcProjectById"></a>
# **updateMpcProjectById**
> MPCProject updateMpcProjectById(projectId, updateMpcProjectByIdRequest)

Update project name

This operation updates a project&#39;s name.  &lt;Note&gt;This operation applies to MPC Wallets (User-Controlled Wallets) only.&lt;/Note&gt; 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    UUID projectId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    UpdateMpcProjectByIdRequest updateMpcProjectByIdRequest = new UpdateMpcProjectByIdRequest();
    try {
      MPCProject result = apiInstance.updateMpcProjectById(projectId, updateMpcProjectByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#updateMpcProjectById");
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
| **projectId** | **UUID**| The project ID, which you can retrieve by calling [List all projects](/v2/api-references/wallets--mpc-wallets/list-all-projects). | |
| **updateMpcProjectByIdRequest** | [**UpdateMpcProjectByIdRequest**](UpdateMpcProjectByIdRequest.md)| The request body to update a project&#39;s name. | [optional] |

### Return type

[**MPCProject**](MPCProject.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully listed all vaults. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateMpcVaultById"></a>
# **updateMpcVaultById**
> MPCVault updateMpcVaultById(vaultId, updateMpcVaultByIdRequest)

Update vault name

This operation updates a vault&#39;s name. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.WalletsMpcWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    WalletsMpcWalletsApi apiInstance = new WalletsMpcWalletsApi();
    UUID vaultId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    UpdateMpcVaultByIdRequest updateMpcVaultByIdRequest = new UpdateMpcVaultByIdRequest();
    try {
      MPCVault result = apiInstance.updateMpcVaultById(vaultId, updateMpcVaultByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsMpcWalletsApi#updateMpcVaultById");
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
| **vaultId** | **UUID**| The vault ID, which you can retrieve by calling [List all vaults](/v2/api-references/wallets--mpc-wallet/list-all-mpc-vaults). | |
| **updateMpcVaultByIdRequest** | [**UpdateMpcVaultByIdRequest**](UpdateMpcVaultByIdRequest.md)| The request body to update a vault&#39;s name. | [optional] |

### Return type

[**MPCVault**](MPCVault.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully modify mpc vault |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

