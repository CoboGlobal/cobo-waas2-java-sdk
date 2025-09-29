

# PaymentSubscriptionActionData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionType** | **PaymentSubscriptionActionType** |  |  |
|**userAddress** | **String** | The subscription user address. |  |
|**amount** | **String** | The subscription crypto amount.  |  |
|**tokenId** | **String** | The ID of the cryptocurrency you want to subscription. Supported values:  - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDCOIN&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC2&#x60;, &#x60;BSC_USDC&#x60; - USDT: &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**discountRate** | **Integer** | the discount rate, discount_rate/10000 |  [optional] |
|**subscriptionId** | **String** | The subscription id in cobo. |  |
|**permitData** | **String** | The signature of permit. |  [optional] |
|**signature** | **String** | The signature for transaction. |  |
|**periods** | **Integer** | The periods needed updated. |  [optional] |
|**newPlanId** | **String** | The new plan id in cobo. |  |



