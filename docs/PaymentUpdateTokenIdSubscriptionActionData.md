

# PaymentUpdateTokenIdSubscriptionActionData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The ID of the cryptocurrency you want to subscription. Supported values:  - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDCOIN&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC2&#x60;, &#x60;BSC_USDC&#x60; - USDT: &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**discount** | **String** | the discount rate, Represented as a string percentage (e.g., \&quot;0.1\&quot; means 10%). |  [optional] |
|**actionType** | **PaymentSubscriptionActionType** |  |  |
|**subscriptionId** | **String** | The subscription id in cobo. |  |
|**signature** | **String** | The signature for transaction. charge action is not required. |  [optional] |
|**deadline** | **Integer** | The signature deadline for transaction. charge action is not required. |  [optional] |



