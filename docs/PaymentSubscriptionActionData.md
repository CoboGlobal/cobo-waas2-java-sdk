

# PaymentSubscriptionActionData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionType** | **PaymentSubscriptionActionType** |  |  |
|**userAddress** | **String** | The subscription user address. |  |
|**tokenId** | **String** | The ID of the cryptocurrency you want to subscription. Supported values:  - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDCOIN&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC2&#x60;, &#x60;BSC_USDC&#x60; - USDT: &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**chargeAmount** | **String** | The subscription plan crypto amount with input token_id.  |  |
|**subscriptionId** | **String** | The subscription id in cobo. |  |
|**signature** | **String** | The signature for transaction. charge action is not required. |  |
|**deadline** | **Integer** | The signature deadline for transaction. charge action is not required. |  |
|**periods** | **Integer** | The periods needed updated. |  |
|**newPlanId** | **String** | The new plan id in cobo. |  |



