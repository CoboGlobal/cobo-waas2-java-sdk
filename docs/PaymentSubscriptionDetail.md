

# PaymentSubscriptionDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actions** | [**List&lt;PaymentSubscriptionAction&gt;**](PaymentSubscriptionAction.md) | An array of subscription actions. |  [optional] |
|**transactions** | [**List&lt;Transaction&gt;**](Transaction.md) | An array of subscription transactions. |  [optional] |
|**planId** | **String** | The plan id in cobo. |  |
|**subscriptionId** | **String** | The subscription id in cobo. |  |
|**merchantId** | **String** | The merchant id in cobo. |  |
|**merchantAddress** | **String** | The merchant address in cobo. |  |
|**userAddress** | **String** | The user address in subscription. |  |
|**tokenId** | **String** | The token_id in subscription. |  |
|**amount** | **String** | The amount in subscription. |  |
|**startTime** | **Integer** | The subscription start timestamp. |  |
|**expirationTime** | **Integer** | The subscription expired timestamp. |  |
|**chargesMade** | **Integer** | The subscription charge times. |  |
|**periodType** | **PaymentSubscriptionPeriodType** |  |  |
|**periods** | **Integer** |  |  |
|**interval** | **Integer** | The subscription charge interval. |  |
|**status** | **PaymentSubscriptionStatus** |  |  |
|**createdTimestamp** | **Integer** | The created time of the subscription, represented as a UNIX timestamp in seconds. |  |
|**updatedTimestamp** | **Integer** | The updated time of the subscription, represented as a UNIX timestamp in seconds. |  |



