

# PaymentSubscriptionActionDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The action request id. |  |
|**actionId** | **String** | The action id. |  |
|**planId** | **String** | The plan id in cobo. |  |
|**subscriptionId** | **String** | The subscription id in cobo. |  |
|**merchantId** | **String** | The merchant id in cobo. |  |
|**merchantAddress** | **String** | The merchant address in cobo. |  |
|**data** | [**PaymentSubscriptionActionData**](PaymentSubscriptionActionData.md) |  |  |
|**transactionIds** | **List&lt;String&gt;** |  |  [optional] |
|**status** | **PaymentSubscriptionActionStatus** |  |  |
|**createdTimestamp** | **Integer** | The created time of the subscription action, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The updated time of the subscription action, represented as a UNIX timestamp in seconds. |  [optional] |
|**subscription** | [**PaymentSubscription**](PaymentSubscription.md) |  |  [optional] |
|**transactions** | [**List&lt;Transaction&gt;**](Transaction.md) | An array of subscription transactions. |  [optional] |



