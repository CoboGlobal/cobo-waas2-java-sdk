

# EstimateBatchPayoutFeeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The ID of the cryptocurrency used for payout.  |  |
|**payoutMode** | **BatchPayoutMode** |  |  |
|**loopEnabled** | **Boolean** | Enable loop mode for standard transfers when source is asset wallet. Only applicable when: - &#x60;payout_mode&#x60; is &#x60;Normal&#x60; - &#x60;source_type&#x60; is asset wallet  |  [optional] |
|**source** | [**BatchPayoutSource**](BatchPayoutSource.md) |  |  |
|**destinations** | [**List&lt;BatchPayoutDestination&gt;**](BatchPayoutDestination.md) | The destinations of the payout. |  |
|**rbfType** | **BatchPayoutRbfType** |  |  [optional] |
|**replacedPayoutId** | **String** | The ID of the payout that this payout replaced. |  [optional] |



