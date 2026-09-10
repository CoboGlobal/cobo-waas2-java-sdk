

# DispositionEventData

The disposition information about a transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | The transaction ID. |  |
|**dispositionType** | **DispositionType** |  |  |
|**dispositionStatus** | **DispositionStatus** |  |  |
|**destinationAddress** | **String** | The blockchain address where the refund/isolated funds will be sent. |  [optional] |
|**dispositionAmount** | **String** | The amount to be refund/isolated from the original transaction, specified as a numeric string. This value cannot exceed the total amount of the original transaction.  |  [optional] |
|**updatedTimestamp** | **Long** | The time when the disposition was updated, in Unix timestamp format, measured in milliseconds. |  |



