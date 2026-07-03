

# CreateBulkSendRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a bulk send request. The request ID is provided by you and must be unique within your system. |  [optional] |
|**sourceAccount** | **String** | The source account ID. |  |
|**executionMode** | **PaymentBulkSendExecutionMode** |  |  |
|**description** | **String** | The description for the entire bulk send batch. |  [optional] |
|**payoutParams** | [**List&lt;CreateBulkSendRequestPayoutParamsInner&gt;**](CreateBulkSendRequestPayoutParamsInner.md) | The payout items of the bulk send. |  |



