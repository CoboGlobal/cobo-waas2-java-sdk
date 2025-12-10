

# CreatePayoutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a settlement request. The request ID is provided by you and must be unique. |  |
|**payoutChannel** | **PayoutChannel** |  |  |
|**sourceType** | **PaymentSourceType** |  |  |
|**payoutParams** | [**List&lt;PaymentPayoutParam&gt;**](PaymentPayoutParam.md) |  |  |
|**bankAccountId** | **UUID** | ｜ Only used in OffRamp payout channel. The ID of the bank account where the settled funds will be deposited. |  [optional] |
|**currency** | **String** | The fiat currency for the create payouts. |  [optional] |
|**remark** | **String** | The remark for the create payouts. |  [optional] |



