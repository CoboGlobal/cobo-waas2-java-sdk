

# PayoutDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payoutId** | **String** | The payout ID. |  |
|**source** | [**PayoutSource**](PayoutSource.md) |  |  [optional] |
|**destinationCount** | **Integer** | The destination count. |  |
|**tokenId** | **String** | The token ID. |  |
|**totalAmount** | **String** | The total amount. |  |
|**status** | **PayoutStatus** |  |  |
|**description** | **String** | The description. |  [optional] |
|**createdTimestamp** | **Integer** | The created time of the payout, represented as a UNIX timestamp in seconds. |  |
|**updatedTimestamp** | **Integer** | The updated time of the payout, represented as a UNIX timestamp in seconds. |  [optional] |
|**destinations** | [**List&lt;PayoutDestinationDetail&gt;**](PayoutDestinationDetail.md) | The destinations of the payout. |  [optional] |



