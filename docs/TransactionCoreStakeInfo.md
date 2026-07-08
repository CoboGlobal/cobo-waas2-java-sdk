

# TransactionCoreStakeInfo

The extra information related to core staking operations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extraType** | **TransactionExtraType** |  |  |
|**stakeAmount** | **String** | The original staking amount. |  [optional] |
|**timelock** | **Integer** | The Unix timestamp (in seconds) when the staking position will be unlocked and available for withdrawal. |  [optional] |
|**changeAddress** | **String** | The change address on the Bitcoin chain. If not provided, the source wallet&#39;s address will be used as the change address. |  [optional] |
|**validatorAddress** | **String** | The validator&#39;s EVM address. |  [optional] |
|**rewardAddress** | **String** | The EVM address used to receive staking rewards. |  [optional] |



