

# PaymentPayoutRecipientInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | The recipient&#39;s wallet address where the payout will be sent. |  [optional] |
|**tokenId** | **String** | The token ID for the cryptocurrency to be sent to the recipient.  If &#x60;recipient_info.token_id&#x60; is on a different chain than &#x60;payout_param.token_id&#x60;, the token will be automatically bridged to the chain specified in &#x60;recipient_info.token_id&#x60;.  |  [optional] |
|**currency** | **String** | The fiat currency of the bank account to which the payout will be sent. |  [optional] |
|**bankAccountId** | **UUID** | The ID of the bank account to which the payout will be sent. You can retrieve the bank account ID by calling [List destination entries](https://www.cobo.com/payments/en/api-references/payment/list-destination-entries). |  [optional] |
|**transferViaVa** | **Boolean** | For OffRamp payout, whether the payout is transferred to a registered bank account via a virtual account (VA) or directly. - &#x60;true&#x60;: The payout is transferred to a registered bank account via a VA (virtual account). - &#x60;false&#x60;: The payout is transferred directly to a registered bank account.  |  [optional] |



