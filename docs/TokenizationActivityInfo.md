

# TokenizationActivityInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activityId** | **UUID** | The ID of the activity. |  |
|**tokenId** | **String** | The token ID. |  |
|**type** | **TokenizationOperationType** |  |  |
|**status** | **TokenizationActivityStatus** |  |  |
|**source** | [**TokenizationTokenOperationSource**](TokenizationTokenOperationSource.md) |  |  |
|**initiator** | **String** | The initiator of the activity. |  |
|**initiatorType** | **TransactionInitiatorType** |  |  |
|**transactionIds** | **List&lt;String&gt;** | The IDs of the corresponding transactions of the activity. |  [optional] |
|**createdTimestamp** | **Long** | The creation timestamp of the activity in milliseconds since the Unix epoch. |  [optional] |
|**updatedTimestamp** | **Long** | The last update timestamp of the activity in milliseconds since the Unix epoch. |  |



