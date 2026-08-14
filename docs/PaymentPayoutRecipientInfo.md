

# PaymentPayoutRecipientInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | The recipient&#39;s wallet address where the payout will be sent. |  [optional] |
|**tokenId** | **String** | The token id can be bridged. |  [optional] |
|**currency** | **String** | The currency of the bank account. |  [optional] |
|**bankAccountId** | **UUID** | The ID of the bank account to which the payout will be sent. This field is required only when the payout channel is &#x60;OffRamp&#x60;. You can retrieve the bank account ID by calling [List destination entries](https://www.cobo.com/payments/en/api-references/payment/list-destination-entries). |  [optional] |
|**transferViaVa** | **Boolean** | For OffRamp payout, whether the payout is transferred to a registered bank account via a virtual account (VA) or directly. - &#x60;true&#x60;: The payout is transferred to a registered bank account via a VA (virtual account). - &#x60;false&#x60;: The payout is transferred directly to a registered bank account.  |  [optional] |



