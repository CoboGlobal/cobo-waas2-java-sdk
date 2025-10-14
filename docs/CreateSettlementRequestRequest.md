

# CreateSettlementRequestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a settlement request. The request ID is provided by you and must be unique. |  |
|**acquiringType** | **AcquiringType** |  |  [optional] |
|**payoutChannel** | **PayoutChannel** |  |  [optional] |
|**settlementType** | **SettlementType** |  |  [optional] |
|**settlements** | [**List&lt;CreateSettlement&gt;**](CreateSettlement.md) |  |  |
|**bankAccountId** | **UUID** | ｜ Only used in OffRamp payout channel. The ID of the bank account where the settled funds will be deposited. |  [optional] |
|**currency** | **String** | The fiat currency for the settlement request. |  [optional] |
|**remark** | **String** | The remark for the settlement request. |  [optional] |



