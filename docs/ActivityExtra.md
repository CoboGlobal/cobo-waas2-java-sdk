

# ActivityExtra


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**poolType** | **StakingPoolType** |  |  |
|**finalityProviderPublicKey** | **String** | The public key of the finality provider. |  [optional] |
|**stakeBlockTime** | **Long** | The number of blocks that need to be processed before the locked tokens are unlocked and become accessible. |  [optional] |
|**autoBroadcast** | **Boolean** | Whether to automatically broadcast the transaction.  - &#x60;true&#x60;: Automatically broadcast the transaction. - &#x60;false&#x60;: The transaction will not be submitted to the blockchain automatically. You can call [Broadcast signed transactions](https://www.cobo.com/developers/v2/api-references/transactions/broadcast-signed-transactions) to broadcast the transaction to the blockchain, or retrieve the signed raw transaction data &#x60;raw_tx&#x60; by calling [Get transaction information](https://www.cobo.com/developers/v2/api-references/transactions/get-transaction-information) and broadcast it yourself.  |  [optional] |
|**providerName** | **String** | The name of the provider. |  [optional] |
|**validatorPubkeys** | **List&lt;String&gt;** | A list of public keys associated with the Ethereum validators for this unstaking operation. |  [optional] |
|**timelock** | **Integer** | The Unix timestamp (in seconds) when the staking position will be unlocked and available for withdrawal. |  [optional] |
|**changeAddress** | **String** | The change address on the Bitcoin chain. If not provided, the source wallet&#39;s address will be used as the change address. |  [optional] |
|**validatorAddress** | **String** | The validator&#39;s EVM address. |  [optional] |
|**rewardAddress** | **String** | The EVM address to receive staking rewards. |  [optional] |



