

# Activity

The staking activity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The activity ID. |  [optional] |
|**initiator** | **String** | The initiator of the activity. |  [optional] |
|**initiatorType** | **TransactionInitiatorType** |  |  [optional] |
|**type** | **ActivityType** |  |  [optional] |
|**walletId** | **String** | The staker&#39;s wallet ID. |  [optional] |
|**address** | **String** | The staker&#39;s wallet address. |  [optional] |
|**poolId** | **String** | The ID of the staking pool. |  |
|**tokenId** | **String** | The token ID. |  |
|**stakingId** | **String** | The ID of the corresponding staking position. |  [optional] |
|**amount** | **String** | The staking amount. |  |
|**transactionIds** | **List&lt;String&gt;** | The IDs of the corresponding transactions of the activity. |  [optional] |
|**timeline** | [**List&lt;ActivityTimeline&gt;**](ActivityTimeline.md) | The timeline of the activity. |  [optional] |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  [optional] |
|**status** | **ActivityStatus** |  |  |
|**createdTimestamp** | **Long** | The time when the activity was created. |  [optional] |
|**updatedTimestamp** | **Long** | The time when the activity was last updated. |  [optional] |



