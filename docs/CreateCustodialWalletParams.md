

# CreateCustodialWalletParams

The information of Custodial Wallets.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The wallet name. This field is required and cannot be empty. Letters, numbers, and spaces are supported (for example, &#x60;My WaaS 2.0 Wallet&#x60;).  &lt;Note&gt;Some special characters are not accepted. For example, the at sign (&#x60;@&#x60;) is rejected. If the name is empty or contains unsupported characters, the request fails with a &#x60;400 Bad Request&#x60; error.&lt;/Note&gt;  |  |
|**walletType** | **WalletType** |  |  |
|**walletSubtype** | **WalletSubtype** |  |  |
|**enableAutoSweep** | **Boolean** | Enable the auto-sweep feature for the wallet. This parameter only applies to MPC Wallets and Custodial Wallets (Web3 Wallets). |  [optional] |



