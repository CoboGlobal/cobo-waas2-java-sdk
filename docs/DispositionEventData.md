

# DispositionEventData

The disposition information about a transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | The transaction ID. |  |
|**dispositionType** | **DispositionType** |  |  |
|**dispositionStatus** | **DispositionStatus** |  |  |
|**destinationAddress** | **String** | The blockchain address to receive the refunded/isolated funds. |  [optional] |
|**dispositionAmount** | **String** | The amount to be refunded/isolated from the original transaction, specified as a numeric string. This value cannot exceed the total amount of the original transaction.  |  [optional] |
|**updatedTimestamp** | **Long** | The time when the disposition was updated, in Unix timestamp format, measured in milliseconds. |  |



