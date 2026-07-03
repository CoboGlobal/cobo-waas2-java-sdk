

# CreateBankPayoutPyvioRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a payout request. The request ID is provided by you and must be unique. |  |
|**bankProvider** | [**BankProviderEnum**](#BankProviderEnum) | 法币三方下发Pyvio. |  |
|**transactionCurrency** | **String** | The currency of the transaction. |  |
|**transactionAmount** | **String** | The amount of the transfer. |  |
|**sender** | [**BankPayoutSender**](BankPayoutSender.md) |  |  |
|**beneficiary** | [**CreateBankPayoutPyvioRequestBeneficiary**](CreateBankPayoutPyvioRequestBeneficiary.md) |  |  |



## Enum: BankProviderEnum

| Name | Value |
|---- | -----|
| PYVIO | &quot;PYVIO&quot; |



