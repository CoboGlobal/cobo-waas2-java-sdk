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
import com.cobo.waas2.model.OrgInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganizationsApi
 */
@Disabled
public class OrganizationsApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // set custom base url
    {
        defaultClient.setBasePath("https://api.sandbox.cobo.com/v2");
        defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    }
    private final OrganizationsApi api = new OrganizationsApi();

    /**
     * Get organization information
     *
     * This operation retrieves the detailed information about the organization associated with the current API key. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrgInfoTest() throws ApiException {
        OrgInfo response = api.getOrgInfo();
        // TODO: test validations
    }

}
