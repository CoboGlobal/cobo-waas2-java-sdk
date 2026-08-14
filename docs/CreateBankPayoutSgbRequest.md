

# CreateBankPayoutSgbRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a payout request. The request ID is provided by you and must be unique. |  |
|**bankProvider** | [**BankProviderEnum**](#BankProviderEnum) | The bank provider. |  |
|**transactionCurrency** | **String** | The currency of the transaction. |  |
|**transactionAmount** | **String** | The amount of the transfer. |  |
|**feeAmount** | **String** | The amount of the fee. |  [optional] |
|**feeCurrency** | **String** | The currency of the fee. |  [optional] |
|**remarks** | **String** | The remarks of the payout. |  [optional] |
|**forceExternal** | **Boolean** | Whether to force the payout to be remittance between bank accounts. |  [optional] |
|**cryptoAmount** | **String** | The amount of the cryptocurrency. |  [optional] |
|**sender** | [**BankPayoutSender**](BankPayoutSender.md) |  |  |
|**beneficiary** | [**BankPayoutBeneficiary**](BankPayoutBeneficiary.md) |  |  |



## Enum: BankProviderEnum

| Name | Value |
|---- | -----|
| SGB | &quot;SGB&quot; |



