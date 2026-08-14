

# InternalCreateBatchPayoutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a batch payout request. The request ID is provided by you and must be unique within your organization.  |  |
|**description** | **String** | Description of the batch payout. |  |
|**tokenId** | **String** | The ID of the cryptocurrency used for payout.  |  |
|**payoutMode** | **BatchPayoutMode** |  |  |
|**unlimitedTokenApproval** | **Boolean** | Whether to apply unlimited token allowance. Only applicable when: - &#x60;payout_mode&#x60; is &#x60;SmartContract&#x60;  |  [optional] |
|**loopEnabled** | **Boolean** | Enable loop mode for standard transfers when source is asset wallet. Only applicable when: - &#x60;payout_mode&#x60; is &#x60;Normal&#x60; - &#x60;source_type&#x60; is asset wallet  |  [optional] |
|**networkFee** | [**BatchPayoutFeeData**](BatchPayoutFeeData.md) |  |  [optional] |
|**source** | [**BatchPayoutSource**](BatchPayoutSource.md) |  |  |
|**destinations** | [**List&lt;InternalBatchPayoutDestination&gt;**](InternalBatchPayoutDestination.md) | The destinations of the payout. |  |



