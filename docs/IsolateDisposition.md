

# IsolateDisposition

The information about a request to isolate funds.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | The UUID of the transaction whose funds are to be isolated. This identifies the original transaction that requires fund isolation. |  |
|**destinationAddress** | **String** | The blockchain address to receive the isolated funds. |  |
|**dispositionAmount** | **String** | The amount to be isolated from the original transaction, specified as a numeric string. This value cannot exceed the total amount of the original transaction.  |  |
|**categoryNames** | **List&lt;String&gt;** | Custom categories to identify and track this isolation transaction. Used for transaction classification and reporting. |  [optional] |
|**description** | **String** | Additional notes or description for the isolation. |  [optional] |



