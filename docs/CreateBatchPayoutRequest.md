

# CreateBatchPayoutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the batch payout. |  |
|**tokenId** | **String** | The ID of the cryptocurrency used for payout.  |  |
|**payoutMode** | **PayoutMode** |  |  |
|**unlimitedTokenApproval** | **Boolean** | Whether to apply unlimited token allowance. Only applicable when: - &#x60;payout_mode&#x60; is &#x60;SmartContract&#x60;  |  [optional] |
|**source** | [**PayoutSource**](PayoutSource.md) |  |  |
|**destinations** | [**List&lt;PayoutDestination&gt;**](PayoutDestination.md) | The destinations of the payout. |  |



