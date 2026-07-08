

# CreatePayoutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a payout request. The request ID is provided by you and must be unique. |  |
|**sourceAccount** | **String** | The source account from which the payout will be made. - If the source account is a merchant account, provide the merchant&#39;s ID (e.g., \&quot;M1001\&quot;). - If the source account is the developer account, use the string &#x60;\&quot;developer\&quot;&#x60;.  |  |
|**payoutChannel** | **PayoutChannel** |  |  |
|**payoutParams** | [**List&lt;PaymentPayoutParam&gt;**](PaymentPayoutParam.md) |  |  |
|**recipientInfo** | [**PaymentPayoutRecipientInfo**](PaymentPayoutRecipientInfo.md) |  |  |
|**remark** | **String** | An optional note or comment about the payout for your internal reference. |  [optional] |



