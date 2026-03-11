

# PaymentPayoutRecipientInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | The recipient&#39;s wallet address where the payout will be sent. |  [optional] |
|**tokenId** | **String** | The token id can be bridged. |  [optional] |
|**currency** | **String** | The currency of the bank account. |  [optional] |
|**bankAccountId** | **UUID** | The destination bank account ID. |  [optional] |
|**transferViaVa** | **Boolean** | For OffRamp payout, whether the payout is transferred to a registered bank account via a virtual account (VA) or directly. - &#x60;true&#x60;: The payout is transferred to a registered bank account via a VA (virtual account). - &#x60;false&#x60;: The payout is transferred directly to a registered bank account.  |  [optional] |



