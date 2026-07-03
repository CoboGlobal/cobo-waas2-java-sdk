

# FeeStationUnifiedTransaction

The information about a fee station unified transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** | The unique identifier of the unified transaction. |  |
|**asset** | [**FeeStationUnifiedTransactionAsset**](FeeStationUnifiedTransactionAsset.md) |  |  |
|**type** | **Integer** | The transaction type. Possible values include:   - &#x60;1&#x60;: Deposit transaction.   - &#x60;2&#x60;: Payment transaction.  |  |
|**subtype** | **FeeStationUnifiedTransactionSubtype** |  |  |
|**txTime** | **Long** | The time when the transaction occurred, in Unix timestamp format, measured in milliseconds. |  |
|**createdTime** | **Long** | The time when the transaction record was created, in Unix timestamp format, measured in milliseconds. |  |
|**updatedTime** | **Long** | The time when the transaction record was last updated, in Unix timestamp format, measured in milliseconds. |  |
|**bizId** | **String** | The business ID used to associate this transaction with an existing business context. |  [optional] |



