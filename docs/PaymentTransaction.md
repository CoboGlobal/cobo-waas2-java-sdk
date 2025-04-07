

# PaymentTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**txId** | **String** | Unique identifier for the transaction. |  |
|**txHash** | **String** | The blockchain transaction hash, may be initially null and populated after submission. |  [optional] |
|**fromAddress** | **String** | Source cryptocurrency address for the transaction. |  |
|**toAddress** | **String** | Destination cryptocurrency address for the transaction. |  |
|**amount** | **String** | The amount of cryptocurrency transferred, as a decimal string. |  |
|**status** | **TransactionStatus** |  |  |
|**createdTimestamp** | **Long** | The time when the transaction was created, in Unix timestamp format, measured in milliseconds. |  |
|**updatedTimestamp** | **Long** | The time when the transaction was updated, in Unix timestamp format, measured in milliseconds. |  |



