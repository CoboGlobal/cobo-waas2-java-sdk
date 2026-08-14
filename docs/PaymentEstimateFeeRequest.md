

# PaymentEstimateFeeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | **PaymentFeeType** |  |  [optional] |
|**estimateFees** | [**List&lt;PaymentEstimateFee&gt;**](PaymentEstimateFee.md) |  |  |
|**recipientTokenId** | **String** | only need fee_type is CryptoPayoutBridge |  [optional] |
|**transferViaVa** | **Boolean** | For OffRamp payout, whether the payout is transferred to a registered bank account via a virtual account (VA) or directly. - &#x60;true&#x60;: The payout is transferred to a registered bank account via a VA (virtual account). - &#x60;false&#x60;: The payout is transferred directly to a registered bank account.  |  [optional] |
|**bankAccountId** | **UUID** | The bank account ID, which you can retrieve by calling [List counterparty entries](https://www.cobo.com/developers/v2/api-references/payment/list-counterparty-entries).  |  [optional] |



