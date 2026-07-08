

# BankPayout


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payoutId** | **String** | The payout ID. |  |
|**status** | **BankPayoutStatus** |  |  |
|**requestId** | **String** | The request ID of the payout. |  |
|**bankProvider** | **BankProvider** |  |  |
|**transactionId** | **String** | The transaction reference id at bank side. |  [optional] |
|**transactionCurrency** | **String** | The currency of the transaction. |  |
|**transactionAmount** | **String** | The amount of the transaction. |  |
|**feeCurrency** | **String** | The currency of the fee. |  [optional] |
|**feeAmount** | **String** | The amount of the fee. |  [optional] |
|**remarks** | **String** | The remarks of the payout. |  [optional] |
|**payoutType** | **BankPayoutType** |  |  [optional] |
|**sender** | [**BankPayoutSender**](BankPayoutSender.md) |  |  |
|**beneficiary** | [**BankPayoutBeneficiary**](BankPayoutBeneficiary.md) |  |  |
|**refundedAmount** | **String** | The amount refunded for this remittance, in &#x60;transaction_currency&#x60;. Populated when &#x60;status&#x60; is &#x60;RefundProcessing&#x60; or &#x60;Refunded&#x60;.  |  [optional] |
|**createdTimestamp** | **Integer** | The created time of the payout, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The updated time of the payout, represented as a UNIX timestamp in seconds. |  [optional] |



