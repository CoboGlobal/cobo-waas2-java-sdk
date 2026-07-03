

# CreatePayoutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a payout request. The request ID is provided by you and must be unique. |  |
|**sourceAccount** | **String** | required |  |
|**payoutChannel** | **PayoutChannel** |  |  |
|**payoutParams** | [**List&lt;PaymentPayoutParam&gt;**](PaymentPayoutParam.md) |  |  |
|**recipientInfo** | [**PaymentPayoutRecipientInfo**](PaymentPayoutRecipientInfo.md) |  |  |
|**remark** | **String** | The remark for the create payouts. |  [optional] |



