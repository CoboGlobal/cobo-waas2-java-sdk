

# CreateSafeWalletParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The wallet name. |  |
|**walletType** | **WalletType** |  |  |
|**walletSubtype** | **WalletSubtype** |  |  |
|**enableAutoSweep** | **Boolean** | Enable the auto-sweep feature for the wallet. This parameter only applies to MPC Wallets and Web3 Wallets. |  [optional] |
|**chainId** | **String** | The ID of the chain that the wallet operates on. |  |
|**smartContractWalletType** | **SmartContractWalletType** |  |  |
|**safeAddress** | **String** | The address of the Smart Contract Wallet. If this is not provided, Cobo will create a new Safe{Wallet} and set up Cobo Safe for you. In that case, the &#x60;threshold&#x60; and &#x60;signers&#x60; properties are required. |  [optional] |
|**signers** | **List&lt;String&gt;** | The signers of the Smart Contract Wallet. This property is required when creating a new Safe{Wallet}. |  [optional] |
|**threshold** | **Integer** | The minimum number of confirmations required for the Smart Contract Wallet. This property is required when creating a new Safe{Wallet}. |  [optional] |
|**coboSafeAddress** | **String** | The address of Cobo Safe. If you are importing an existing Safe{Wallet}, Cobo Safe must have been created and enabled. |  [optional] |
|**initiator** | [**SmartContractInitiator**](SmartContractInitiator.md) |  |  [optional] |



