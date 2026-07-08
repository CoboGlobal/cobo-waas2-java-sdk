

# CreateWebhookEventInfo

The webhook event response model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Unique event identifier. |  |
|**channelId** | **String** | Identifier for the client/organization. Corresponds to organization_id in Cobo Portal. |  |
|**type** | **WebhookEventType** |  |  |
|**data** | **String** | JSON serialized object of event data. |  |
|**walletScopesInfo** | **Map&lt;String, Object&gt;** | Wallet scope information. |  |
|**transactionHash** | **String** | Blockchain transaction hash. |  [optional] |
|**requestId** | **String** | Request identifier. |  [optional] |
|**transactionId** | **String** | Internal transaction identifier. |  [optional] |
|**coboId** | **String** | Cobo internal identifier. |  [optional] |
|**status** | **WebhookEventInternalStatus** |  |  |



