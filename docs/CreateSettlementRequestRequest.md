

# CreateSettlementRequestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a settlement request. The request ID is provided by you and must be unique. |  |
|**acquiringType** | **AcquiringType** |  |  [optional] |
|**payoutChannel** | **PayoutChannel** |  |  [optional] |
|**settlementType** | **SettlementType** |  |  [optional] |
|**settlements** | [**List&lt;CreateSettlement&gt;**](CreateSettlement.md) |  |  |
|**bankAccountId** | **UUID** |  The ID of the bank account where the funds will be deposited. You can call [List all bank accounts](https://www.cobo.com/developers/v2/api-references/payment/list-all-bank-accounts) to retrieve the IDs of registered bank accounts.  This field is only applicable for off-ramp.  |  [optional] |
|**currency** | **String** | The fiat currency to receive after off-ramping. Currently, only &#x60;USD&#x60; is supported. Specify this field when &#x60;payout_channel&#x60; is set to &#x60;OffRamp&#x60;. |  [optional] |
|**remark** | **String** | The remark for the payout request. |  [optional] |



