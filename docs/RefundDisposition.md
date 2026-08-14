

# RefundDisposition

The information about a fund refund disposition request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | The UUID of the transaction to be refunded. This identifies the original transaction that requires refund processing. |  |
|**destinationAddress** | **String** | The blockchain address where the refunded funds will be sent. |  |
|**dispositionAmount** | **String** | The amount to be refunded from the original transaction, specified as a numeric string. This value cannot exceed the total amount of the original transaction.  |  |
|**categoryNames** | **List&lt;String&gt;** | Custom categories to identify and track this refund transaction. Used for transaction classification and reporting. |  [optional] |
|**description** | **String** | Additional notes or description for this refund disposition. |  [optional] |



