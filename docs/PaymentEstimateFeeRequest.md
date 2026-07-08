

# PaymentEstimateFeeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | **PaymentFeeType** |  |  [optional] |
|**estimateFees** | [**List&lt;PaymentEstimateFee&gt;**](PaymentEstimateFee.md) | A list of token IDs and amounts for which fees will be calculated. |  |
|**recipientTokenId** | **String** | The token ID that the recipient will receive. Required only when &#x60;fee_type&#x60; is &#x60;CryptoPayoutBridge&#x60;. |  [optional] |
|**transferViaVa** | **Boolean** | For OffRamp payout, whether the payout is transferred to a registered bank account via a virtual account (VA) or directly. - &#x60;true&#x60;: The payout is transferred to a registered bank account via a VA (virtual account). - &#x60;false&#x60;: The payout is transferred directly to a registered bank account.  |  [optional] |



