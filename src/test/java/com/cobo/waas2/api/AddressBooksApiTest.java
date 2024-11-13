/*
 * Cobo Wallet as a Service 2.0
 *
 * Contact: help@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.api;

import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.ErrorResponse;
import com.cobo.waas2.model.ListAddressBooks200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressBooksApi
 */
@Disabled
public class AddressBooksApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // set custom base url
    {
        defaultClient.setBasePath("https://api.sandbox.cobo.com/v2");
        defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    }
    private final AddressBooksApi api = new AddressBooksApi();

    /**
     * List address book entries
     *
     * This operation retrieves a list of addresses from your address book. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAddressBooksTest() throws ApiException {
        String chainId = null;
        String address = null;
        String label = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListAddressBooks200Response response = api.listAddressBooks(chainId, address, label, limit, before, after);
        // TODO: test validations
    }

}