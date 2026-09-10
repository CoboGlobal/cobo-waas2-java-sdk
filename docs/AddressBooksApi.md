# AddressBooksApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAddressBooks**](AddressBooksApi.md#createAddressBooks) | **POST** /address_books | Create address books |
| [**deleteAddressBookById**](AddressBooksApi.md#deleteAddressBookById) | **POST** /address_books/{entry_id}/delete | Delete address book |
| [**getAddressBookById**](AddressBooksApi.md#getAddressBookById) | **GET** /address_books/{entry_id} | Get address book information |
| [**listAddressBooks**](AddressBooksApi.md#listAddressBooks) | **GET** /address_books | List address book entries |
| [**updateAddressBookById**](AddressBooksApi.md#updateAddressBookById) | **PUT** /address_books/{entry_id} | Update address book |


<a id="createAddressBooks"></a>
# **createAddressBooks**
> CreateAddressBooks201Response createAddressBooks(createAddressBooksParam)

Create address books

This operation add addresses to your address book. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.AddressBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    AddressBooksApi apiInstance = new AddressBooksApi();
    CreateAddressBooksParam createAddressBooksParam = new CreateAddressBooksParam();
    try {
      CreateAddressBooks201Response result = apiInstance.createAddressBooks(createAddressBooksParam);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressBooksApi#createAddressBooks");
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
| **createAddressBooksParam** | [**CreateAddressBooksParam**](CreateAddressBooksParam.md)| The request body of the create address books operation. | [optional] |

### Return type

[**CreateAddressBooks201Response**](CreateAddressBooks201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The information about created address books. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="deleteAddressBookById"></a>
# **deleteAddressBookById**
> DeleteAddressBookById201Response deleteAddressBookById(entryId)

Delete address book

This operation deletes a specified address book. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.AddressBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    AddressBooksApi apiInstance = new AddressBooksApi();
    UUID entryId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      DeleteAddressBookById201Response result = apiInstance.deleteAddressBookById(entryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressBooksApi#deleteAddressBookById");
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
| **entryId** | **UUID**| The address book ID. | |

### Return type

[**DeleteAddressBookById201Response**](DeleteAddressBookById201Response.md)

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

<a id="getAddressBookById"></a>
# **getAddressBookById**
> AddressBook getAddressBookById(entryId)

Get address book information

This operation retrieves the detailed information about a specified address book. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.AddressBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    AddressBooksApi apiInstance = new AddressBooksApi();
    UUID entryId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    try {
      AddressBook result = apiInstance.getAddressBookById(entryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressBooksApi#getAddressBookById");
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
| **entryId** | **UUID**| The address book ID. | |

### Return type

[**AddressBook**](AddressBook.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about an address book. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listAddressBooks"></a>
# **listAddressBooks**
> ListAddressBooks200Response listAddressBooks(chainId, address, label, limit, before, after)

List address book entries

This operation retrieves a list of addresses from your address book. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.AddressBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    AddressBooksApi apiInstance = new AddressBooksApi();
    String chainId = "ETH";
    String address = "0xd8dA6BF26964aF9D7eEd9e03E53415D37aA96045";
    String label = "test";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListAddressBooks200Response result = apiInstance.listAddressBooks(chainId, address, label, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressBooksApi#listAddressBooks");
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
| **address** | **String**| The wallet address. | [optional] |
| **label** | **String**| The address label. | [optional] |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |

### Return type

[**ListAddressBooks200Response**](ListAddressBooks200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about an address book. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateAddressBookById"></a>
# **updateAddressBookById**
> AddressBook updateAddressBookById(entryId, updateAddressBookParam)

Update address book

This operation updates the information of a specified address book. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.AddressBooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    AddressBooksApi apiInstance = new AddressBooksApi();
    UUID entryId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    UpdateAddressBookParam updateAddressBookParam = new UpdateAddressBookParam();
    try {
      AddressBook result = apiInstance.updateAddressBookById(entryId, updateAddressBookParam);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressBooksApi#updateAddressBookById");
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
| **entryId** | **UUID**| The address book ID. | |
| **updateAddressBookParam** | [**UpdateAddressBookParam**](UpdateAddressBookParam.md)| The request body of the update address book operation. | [optional] |

### Return type

[**AddressBook**](AddressBook.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated address book. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

