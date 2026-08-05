

# PaymentPayoutRecipientInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | The recipient&#39;s cryptocurrency address. Use an address that you have registered as a destination and that has been approved for payouts. Call [List destination entries](https://www.cobo.com/payments/en/api-references/payment/list-destination-entries) with &#x60;entry_type&#x60; set to &#x60;Address&#x60; to retrieve your registered wallet addresses and each address&#39;s &#x60;chain_id&#x60;. A destination entry returns the &#x60;address&#x60; and its &#x60;chain_id&#x60;, not a &#x60;token_id&#x60; -- confirm that the network indicated by &#x60;chain_id&#x60; matches the network encoded in the &#x60;token_id&#x60; you use, since an address on the wrong network for that token cannot complete the transfer. |  [optional] |
|**tokenId** | **String** | The cryptocurrency ID of the token to send (for example, &#x60;ETH_USDT&#x60;, &#x60;TRON_USDT&#x60;). When this token ID and the &#x60;token_id&#x60; in &#x60;payout_params&#x60; represent the same token on different chains, Cobo automatically executes a cross-chain transfer. You can retrieve the full list of supported token IDs by calling [List supported tokens](https://www.cobo.com/payments/en/api-references/payment/list-supported-tokens). |  [optional] |
|**currency** | **String** | The fiat currency of the bank account selected in &#x60;bank_account_id&#x60; -- the two must match. This endpoint currently accepts only &#x60;USD&#x60;. |  [optional] |
|**bankAccountId** | **UUID** | The ID of the bank account to which the payout will be sent. This field is required only when the payout channel is &#x60;OffRamp&#x60;. You can retrieve the bank account ID by calling [List destination entries](https://www.cobo.com/payments/en/api-references/payment/list-destination-entries). |  [optional] |
|**transferViaVa** | **Boolean** | For OffRamp payout, whether the payout is transferred to a registered bank account via a virtual account (VA) or directly. - &#x60;true&#x60;: The payout is transferred to a registered bank account via a VA (virtual account). - &#x60;false&#x60;: The payout is transferred directly to a registered bank account.  |  [optional] |



