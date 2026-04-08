

# FeeStationFiatTransaction

The information about a fiat transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** | The transaction ID. |  |
|**mainTransactionId** | **UUID** | The UUID of the parent (main) transaction that this record is associated with. Set only when the current record is a gas/fee transaction initiated by FeeStation; omit for main transactions. |  [optional] |
|**transactionType** | **FeeStationFiatTransactionType** |  |  |
|**amount** | **String** | The transaction amount. |  |
|**fiatCurrency** | **String** | The fiat currency of the transaction. Possible values include:   - &#x60;USD&#x60;: US Dollar.  |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the fiat transaction. Possible values include:   - &#x60;Created&#x60;: The transaction has been created.   - &#x60;Succeeded&#x60;: The transaction has been completed successfully.  |  |
|**coboCategory** | **List&lt;String&gt;** | The Cobo category of the transaction. |  [optional] |
|**createdTimestamp** | **Long** | The time when the transaction was created, in Unix timestamp format, measured in milliseconds. |  [optional] |
|**modifiedTimestamp** | **Long** | The time when the transaction was last modified, in Unix timestamp format, measured in milliseconds. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;Created&quot; |
| SUCCEEDED | &quot;Succeeded&quot; |



