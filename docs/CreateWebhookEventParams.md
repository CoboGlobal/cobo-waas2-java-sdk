

# CreateWebhookEventParams

The webhook event payload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelId** | **String** | Identifier for the client/organization. Corresponds to organization_id in Cobo Portal. |  |
|**type** | **WebhookEventType** |  |  |
|**data** | **Map&lt;String, Object&gt;** | The event payload object. |  |
|**uuid** | **UUID** | Unique event identifier. |  |
|**walletScopesInfo** | **Map&lt;String, Object&gt;** | Wallet scope information. |  [optional] |
|**transactionHash** | **String** | Blockchain transaction hash. |  [optional] |
|**requestId** | **String** | Request identifier. |  [optional] |
|**transactionId** | **String** | Internal transaction identifier. |  [optional] |
|**coboId** | **String** | Cobo internal identifier. |  [optional] |



