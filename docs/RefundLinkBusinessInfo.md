

# RefundLinkBusinessInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | The id of the order to refund. Specify either &#x60;order_id&#x60; or &#x60;transaction_id&#x60;, but not both.  |  [optional] |
|**transactionId** | **String** | The transaction ID of the original order payment or top-up. Specify either &#x60;order_id&#x60; or &#x60;transaction_id&#x60;, but not both. On the refund page, the from address of this transaction will be pre-filled as the default refund address. The refund will be processed in the same token and on the same blockchain as this transaction.  |  [optional] |
|**amount** | **String** | The amount to refund, denominated in the cryptocurrency of the original payment transaction. The amount must be a positive number and can have up to two decimal places. |  |
|**refundSource** | **RefundType** |  |  |
|**merchantId** | **String** | The merchant ID, required if &#x60;refund_source&#x60; is &#x60;Merchant&#x60;. The fund will be deducted from the specified merchant&#39;s balance. |  [optional] |
|**feeAmount** | **String** | The developer fee amount to charge the merchant, denominated in the cryptocurrency of the original payment transaction. This field is only valid when &#x60;refund_source&#x60; is &#x60;Merchant&#x60;. For more information, please refer to [Accounts and fund allocation](https://www.cobo.com/payments/en/guides/amounts-and-balances). Must be:   - A positive integer with up to two decimal places.   - Less than the refund amount  |  [optional] |



