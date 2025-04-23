

# TransactionExtra


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extraType** | **TransactionExtraType** |  |  |
|**babylonAddressInfo** | [**AddressInfo**](AddressInfo.md) |  |  [optional] |
|**btcAddressInfo** | [**AddressInfo**](AddressInfo.md) |  |  [optional] |
|**stakeAmount** | **String** | The original staking amount. |  [optional] |
|**finalityProviderPublicKey** | **String** | The public key of the finality provider. |  [optional] |
|**stakeBlockTime** | **Long** | The number of blocks that need to be processed before the locked tokens are unlocked and become accessible. |  [optional] |
|**paramVersion** | **Long** | The version of Babylon global parameters. |  [optional] |
|**withdrawFromType** | **ActivityType** |  |  [optional] |
|**slashFromType** | **ActivityType** |  |  [optional] |
|**timelock** | **Integer** | The Unix timestamp (in seconds) when the staking position will be unlocked and available for withdrawal. |  [optional] |
|**changeAddress** | **String** | The change address on the Bitcoin chain. If not provided, the source wallet&#39;s address will be used as the change address. |  [optional] |
|**validatorAddress** | **String** | The validator&#39;s EVM address. |  [optional] |
|**rewardAddress** | **String** | The EVM address used to receive staking rewards. |  [optional] |



