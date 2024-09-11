

# CreateStakeActivityRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a request. The request ID is provided by you and must be unique within your organization. |  [optional] |
|**source** | [**StakingSource**](StakingSource.md) |  |  [optional] |
|**poolId** | **String** | The ID of the staking pool. |  |
|**amount** | **String** | The amount to stake. |  |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  |
|**extra** | [**CreateStakeActivityExtra**](CreateStakeActivityExtra.md) |  |  |
|**appInitiator** | **String** | The initiator of the staking activity. If you do not specify this property, the WaaS service will automatically designate the API key as the initiator. |  [optional] |



