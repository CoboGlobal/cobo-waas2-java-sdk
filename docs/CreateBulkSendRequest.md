

# CreateBulkSendRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a bulk send request. The request ID is provided by you and must be unique within your system. |  [optional] |
|**sourceAccount** | **String** | The source account from which the bulk send will be made. - If the source account is a merchant account, provide the merchant&#39;s ID (e.g., \&quot;M1001\&quot;). - If the source account is the developer account, use the string &#x60;\&quot;developer\&quot;&#x60;.  |  |
|**executionMode** | **PaymentBulkSendExecutionMode** |  |  |
|**description** | **String** | The description for the entire bulk send batch. Maximum length: 255 characters. |  [optional] |
|**payoutParams** | [**List&lt;CreateBulkSendRequestPayoutParamsInner&gt;**](CreateBulkSendRequestPayoutParamsInner.md) | The bulk send items. |  |



