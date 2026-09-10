

# PaymentBulkSend


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bulkSendId** | **String** | The bulk send ID. |  |
|**requestId** | **String** | The request ID. |  [optional] |
|**sourceAccount** | **String** | The source account ID. |  |
|**description** | **String** | The description for the entire bulk send batch. |  [optional] |
|**executionMode** | **PaymentBulkSendExecutionMode** |  |  |
|**status** | **PaymentBulkSendStatus** |  |  |
|**failedReason** | **String** | The reason why the bulk send failed. |  [optional] |
|**createdTimestamp** | **Integer** | The created time of the order, represented as a UNIX timestamp in seconds. |  |
|**updatedTimestamp** | **Integer** | The updated time of the order, represented as a UNIX timestamp in seconds. |  |
|**commissionFee** | [**CommissionFee**](CommissionFee.md) | The commission fee. Not returned when no fee has been incurred, the actual charged amount once incurred, or &#x60;0&#x60; if refunded. |  [optional] |



