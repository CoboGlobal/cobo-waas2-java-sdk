

# IsolateDisposition

The information about a fund isolate disposition request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | The UUID of the transaction to be isolated. This identifies the original transaction that requires isolation processing. |  |
|**destinationAddress** | **String** | The blockchain address where the isolated funds will be sent. |  |
|**dispositionAmount** | **String** | The amount to be isolated from the original transaction, specified as a numeric string. This value cannot exceed the total amount of the original transaction.  |  |
|**categoryNames** | **List&lt;String&gt;** | Custom categories to identify and track this isolate transaction. Used for transaction classification and reporting. |  [optional] |
|**description** | **String** | Additional notes or description for this isolate disposition. |  [optional] |



