

# CreateSmartContractWalletParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The wallet name. This field is required and cannot be empty. Letters, numbers, and spaces are supported (for example, &#x60;My WaaS 2.0 Wallet&#x60;).  &lt;Note&gt;Some special characters are not accepted. For example, the at sign (&#x60;@&#x60;) is rejected. If the name is empty or contains unsupported characters, the request fails with a &#x60;400 Bad Request&#x60; error.&lt;/Note&gt;  |  |
|**walletType** | **WalletType** |  |  |
|**walletSubtype** | **WalletSubtype** |  |  |
|**enableAutoSweep** | **Boolean** | Enable the auto-sweep feature for the wallet. This parameter only applies to MPC Wallets and Custodial Wallets (Web3 Wallets). |  [optional] |
|**chainId** | **String** | The ID of the chain that the wallet operates on. |  |
|**smartContractWalletType** | **SmartContractWalletType** |  |  |
|**safeAddress** | **String** | The address of the Smart Contract Wallet. If this is not provided, Cobo will create a new Safe{Wallet} and set up Cobo Safe for you. In that case, the &#x60;threshold&#x60; and &#x60;signers&#x60; properties are required. |  [optional] |
|**signers** | **List&lt;String&gt;** | The signers of the Smart Contract Wallet. This property is required when creating a new Safe{Wallet}. |  [optional] |
|**threshold** | **Integer** | The minimum number of confirmations required for the Smart Contract Wallet. This property is required when creating a new Safe{Wallet}. |  [optional] |
|**coboSafeAddress** | **String** | The address of Cobo Safe. If you are importing an existing Safe{Wallet}, Cobo Safe must have been created and enabled. |  [optional] |
|**initiator** | [**SmartContractInitiator**](SmartContractInitiator.md) |  |  [optional] |



