

# TransactionReceiptLog

The information about an event log emitted during the execution of a transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logIndex** | **Long** | The index position of the log within the block. |  |
|**address** | **String** | The address of the contract that emitted the log. |  |
|**topics** | **List&lt;String&gt;** | The indexed log arguments. The first topic is the hash of the event signature, and the remaining topics are the indexed event parameters, with a maximum of three. |  |
|**data** | **String** | The non-indexed log arguments, encoded as a hexadecimal string. |  |
|**blockNumber** | **Long** | The number of the block that contains the log. |  [optional] |
|**blockHash** | **String** | The hash of the block that contains the log. |  [optional] |
|**transactionHash** | **String** | The hash of the transaction that emitted the log. |  [optional] |
|**transactionIndex** | **Long** | The index position within the block of the transaction that emitted the log. |  [optional] |
|**removed** | **Boolean** | Whether the log was removed due to a chain reorganization. - &#x60;true&#x60;: The log was removed because the block that contains it was reorganized out of the canonical chain. - &#x60;false&#x60;: The log is still valid.  |  [optional] |



