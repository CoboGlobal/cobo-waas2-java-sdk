

# EstimateBatchPayoutFeeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The ID of the cryptocurrency used for payout.  |  |
|**payoutMode** | **PayoutMode** |  |  |
|**source** | [**PayoutSource**](PayoutSource.md) |  |  |
|**destinations** | [**List&lt;PayoutDestination&gt;**](PayoutDestination.md) | The destinations of the payout. |  |
|**rbfType** | **PayoutRbfType** |  |  [optional] |
|**replacedPayoutId** | **String** | The ID of the payout that this payout replaced. |  [optional] |



