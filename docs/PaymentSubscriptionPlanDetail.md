

# PaymentSubscriptionPlanDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockchainPlanId** | **String** | The subscription plan id in blockchain. |  [optional] |
|**planId** | **String** | The plan id in cobo. |  |
|**developerPlanId** | **String** | The developer plan id. |  |
|**periodType** | **PaymentSubscriptionPeriodType** |  |  |
|**periods** | **Integer** |  |  |
|**interval** | **Integer** |  |  |
|**amount** | **String** | The subscription plan amount.  - If &#x60;currency&#x60; is set, this represents the subscription amount in the specified fiat currency. - If &#x60;currency&#x60; isn&#39;t set, this represents the settlement amount in the specified cryptocurrency.  |  |
|**tokenId** | **String** | The ID of the cryptocurrency you want to subscription. Supported values:  - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDCOIN&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC2&#x60;, &#x60;BSC_USDC&#x60; - USDT: &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  [optional] |
|**currency** | **String** | The fiat currency for settling the cryptocurrency. Currently, only &#x60;USD&#x60; is supported. Specify this field when &#x60;payout_channel&#x60; is set to &#x60;OffRamp&#x60;. |  [optional] |



