

# CreateUnstakeActivityRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a request. The request ID is provided by you and must be unique within your organization. |  [optional] |
|**stakingId** | **String** | The ID of the corresponding staking position. |  |
|**amount** | **String** | The amount to unstake. For the Babylon protocol, this property is ignored. |  [optional] |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  [optional] |
|**appInitiator** | **String** | The initiator of the staking activity. If you do not specify this property, the WaaS service will automatically designate the API key as the initiator. |  [optional] |


