

# TransactionFuelingInfo

Details of the auto-fueling transaction that provides gas for the current transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID of the transaction. |  [optional] |
|**transactionId** | **UUID** | The transaction ID. |  [optional] |
|**mainTransactionId** | **UUID** | The UUID of the parent (main) transaction that this record is associated with. Set only when the current record is a gas/fee transaction initiated by FeeStation; omit for main transactions. |  [optional] |



