

# RefundDisposition

The information about a request to refund funds.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | The UUID of the transaction whose funds are to be refunded. This identifies the original transaction that requires refund processing. |  |
|**destinationAddress** | **String** | The blockchain address to receive the refunded funds. |  |
|**dispositionAmount** | **String** | The amount to be refunded from the original transaction, specified as a numeric string. This value cannot exceed the total amount of the original transaction.  |  |
|**categoryNames** | **List&lt;String&gt;** | Custom categories to identify and track this refund transaction. Used for transaction classification and reporting. |  [optional] |
|**description** | **String** | Additional notes or description for the refund. |  [optional] |



