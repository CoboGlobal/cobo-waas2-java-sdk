/*
 * Cobo Wallet as a Service 2.0
 *
 * Contact: support@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.api;

import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.CreateWebhookEndpointRequest;
import com.cobo.waas2.model.ErrorResponse;
import com.cobo.waas2.model.ListWebhookEndpoints200Response;
import com.cobo.waas2.model.ListWebhookEventDefinitions200ResponseInner;
import com.cobo.waas2.model.ListWebhookEventLogs200Response;
import com.cobo.waas2.model.ListWebhookEvents200Response;
import com.cobo.waas2.model.RetryWebhookEventById201Response;
import java.util.UUID;
import com.cobo.waas2.model.UpdateWebhookEndpointByIdRequest;
import com.cobo.waas2.model.WebhookEndpoint;
import com.cobo.waas2.model.WebhookEndpointStatus;
import com.cobo.waas2.model.WebhookEvent;
import com.cobo.waas2.model.WebhookEventStatus;
import com.cobo.waas2.model.WebhookEventType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevelopersWebhooksApi
 */
@Disabled
public class DevelopersWebhooksApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // set custom base url
    {
        defaultClient.setBasePath("https://api.sandbox.cobo.com/v2");
        defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    }
    private final DevelopersWebhooksApi api = new DevelopersWebhooksApi();

    /**
     * Register webhook endpoint
     *
     * This operation registers a new webhook endpoint for your organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWebhookEndpointTest() throws ApiException {
        CreateWebhookEndpointRequest createWebhookEndpointRequest = null;
        WebhookEndpoint response = api.createWebhookEndpoint(createWebhookEndpointRequest);
        // TODO: test validations
    }

    /**
     * Get webhook endpoint information
     *
     * This operation retrieves the information of a specified webhook endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhookEndpointByIdTest() throws ApiException {
        UUID endpointId = null;
        WebhookEndpoint response = api.getWebhookEndpointById(endpointId);
        // TODO: test validations
    }

    /**
     * Retrieve event information
     *
     * This operation retrieves the information of a webhook event by the event ID. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhookEventByIdTest() throws ApiException {
        UUID eventId = null;
        UUID endpointId = null;
        WebhookEvent response = api.getWebhookEventById(eventId, endpointId);
        // TODO: test validations
    }

    /**
     * List webhook endpoints
     *
     * This operation retrieves the information of all webhook endpoints registered under your organization. You can filter the result by endpoint status and the subscribed event type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWebhookEndpointsTest() throws ApiException {
        WebhookEndpointStatus status = null;
        WebhookEventType eventType = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListWebhookEndpoints200Response response = api.listWebhookEndpoints(status, eventType, limit, before, after);
        // TODO: test validations
    }

    /**
     * Get webhook event types
     *
     * This operation retrieves all supported webhook event types.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWebhookEventDefinitionsTest() throws ApiException {
        List<ListWebhookEventDefinitions200ResponseInner> response = api.listWebhookEventDefinitions();
        // TODO: test validations
    }

    /**
     * List webhook event logs
     *
     * This operation retrieves a list of webhook event logs by event ID. Each retry will generate a separate event log. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWebhookEventLogsTest() throws ApiException {
        UUID eventId = null;
        UUID endpointId = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListWebhookEventLogs200Response response = api.listWebhookEventLogs(eventId, endpointId, limit, before, after);
        // TODO: test validations
    }

    /**
     * List all webhook events
     *
     * This operation retrieves a list of webhook events that have occurred within the last 30 days.  &lt;Note&gt;The request will only return webhook events that have occurred to the wallets associated with your current API key. For example, if the current API key is only associated with Custodial Wallets, any webhook events that have occurred to an MPC Wallet will not be retrieved with the current API key.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWebhookEventsTest() throws ApiException {
        UUID endpointId = null;
        WebhookEventStatus status = null;
        WebhookEventType type = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListWebhookEvents200Response response = api.listWebhookEvents(endpointId, status, type, limit, before, after);
        // TODO: test validations
    }

    /**
     * Retry event
     *
     * This operation retries delivering a webhook event with the specified event ID. You can only retry delivering a webhook event in the &#x60;Retrying&#x60; or &#x60;Failed&#x60; status. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retryWebhookEventByIdTest() throws ApiException {
        UUID eventId = null;
        UUID endpointId = null;
        RetryWebhookEventById201Response response = api.retryWebhookEventById(eventId, endpointId);
        // TODO: test validations
    }

    /**
     * Update webhook endpoint
     *
     * This operation updates the information of a specified webhook endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWebhookEndpointByIdTest() throws ApiException {
        UUID endpointId = null;
        UpdateWebhookEndpointByIdRequest updateWebhookEndpointByIdRequest = null;
        WebhookEndpoint response = api.updateWebhookEndpointById(endpointId, updateWebhookEndpointByIdRequest);
        // TODO: test validations
    }

}
