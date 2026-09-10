

# RefundLinkBusinessInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | The id of the order to refund. Specify either &#x60;order_id&#x60; or &#x60;transaction_id&#x60;, but not both.  |  [optional] |
|**transactionId** | **String** | The id of the transaction to refund. Specify either &#x60;order_id&#x60; or &#x60;transaction_id&#x60;, but not both.  |  [optional] |
|**amount** | **String** | The amount to refund in cryptocurrency. |  |
|**refundSource** | **RefundType** |  |  |
|**merchantId** | **String** | The merchant ID, required if the refund amount source is &#x60;Merchant&#x60;. |  [optional] |
|**feeAmount** | **String** | The amount of the transaction fee that the merchant will bear for the refund.  |  [optional] |



