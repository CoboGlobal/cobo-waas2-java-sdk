

# SafeWallet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **UUID** | The wallet ID. |  |
|**walletType** | **WalletType** |  |  |
|**walletSubtype** | **WalletSubtype** |  |  |
|**name** | **String** | The wallet name. |  |
|**orgId** | **String** | The ID of the owning organization. |  |
|**enableAutoSweep** | **Boolean** | Enable the auto sweep feature for the wallet |  [optional] |
|**chainId** | **String** | The ID of the chain on which the wallet operates. |  [optional] |
|**smartContractWalletType** | **SmartContractWalletType** |  |  |
|**safeAddress** | **String** | The Smart Contract Wallet address. |  [optional] |
|**signers** | **List&lt;String&gt;** | The signers of the Smart Contract Wallet. |  [optional] |
|**threshold** | **Integer** | The minimum number of confirmations required for the Smart Contract Wallet.  |  [optional] |
|**coboSafeAddress** | **String** | The address of Cobo Safe. |  [optional] |
|**initiator** | [**SmartContractInitiator**](SmartContractInitiator.md) |  |  [optional] |



