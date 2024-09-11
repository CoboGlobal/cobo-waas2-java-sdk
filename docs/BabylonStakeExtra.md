

# BabylonStakeExtra


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**poolType** | **StakingPoolType** |  |  |
|**finalityProviderPublicKey** | **String** | The public key of the finality provider. |  |
|**stakeBlockTime** | **Long** | The number of blocks that need to be processed before the locked tokens are unlocked and become accessible. |  |
|**autoBroadcast** | **Boolean** | Whether to automatically broadcast the transaction. The default value is &#x60;true&#x60;.  - &#x60;true&#x60;: Automatically broadcast the transaction. - &#x60;false&#x60;: The transaction will not be submitted to the blockchain automatically. You can call &#x60;Broadcast transactions&#x60; to broadcast the transaction to the blockchain, or retrieve the signed raw transaction data &#x60;raw_tx&#x60; by calling [Get transaction information](/v2/api-references/transactions/get-transaction-information) and broadcast it yourself.  |  [optional] |



