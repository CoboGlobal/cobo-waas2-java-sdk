

# BatchPayoutDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payoutId** | **String** | The payout ID. |  |
|**source** | [**BatchPayoutSource**](BatchPayoutSource.md) |  |  [optional] |
|**destinationCount** | **Integer** | The destination count. |  |
|**tokenId** | **String** | The token ID. |  |
|**totalAmount** | **String** | The total amount. |  |
|**status** | **BatchPayoutStatus** |  |  |
|**description** | **String** | The description. |  [optional] |
|**createdTimestamp** | **Integer** | The created time of the payout, represented as a UNIX timestamp in seconds. |  |
|**updatedTimestamp** | **Integer** | The updated time of the payout, represented as a UNIX timestamp in seconds. |  [optional] |
|**destinations** | [**List&lt;BatchPayoutDestinationDetail&gt;**](BatchPayoutDestinationDetail.md) | The destinations of the payout. |  [optional] |



