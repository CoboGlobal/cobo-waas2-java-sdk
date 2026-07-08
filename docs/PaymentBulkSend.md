

# PaymentBulkSend


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bulkSendId** | **String** | The bulk send ID. |  |
|**requestId** | **String** | The request ID. |  [optional] |
|**sourceAccount** | **String** | The source account from which the bulk send will be made. - If the source account is a merchant account, provide the merchant&#39;s ID (e.g., \&quot;M1001\&quot;). - If the source account is the developer account, use the string &#x60;\&quot;developer\&quot;&#x60;.  |  |
|**description** | **String** | The description for the entire bulk send batch. |  [optional] |
|**executionMode** | **PaymentBulkSendExecutionMode** |  |  |
|**status** | **PaymentBulkSendStatus** |  |  |
|**createdTimestamp** | **Integer** | The created time of the bulk send, represented as a UNIX timestamp in seconds. |  |
|**updatedTimestamp** | **Integer** | The updated time of the bulk send, represented as a UNIX timestamp in seconds. |  |
|**commissionFee** | [**CommissionFee**](CommissionFee.md) | The commission fee. Not returned when no fee has been incurred, the actual charged amount once incurred, or &#x60;0&#x60; if refunded. |  [optional] |



