

# PoolSummary

The basic information of the staking pool.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the staking pool. A staking pool is a pairing of a staking protocol and a specific type of token. |  |
|**chainId** | **String** | The chain ID. |  |
|**protocol** | **String** | The name of the protocol. |  |
|**protocolIconUrl** | **String** | The URL of the protocol&#39;s icon. |  |
|**supportedWalletTypes** | **List&lt;WalletType&gt;** | The wallet type. Possible values include:  - &#x60;Custodial&#x60;: [Custodial Wallets](https://manuals.cobo.com/en/portal/custodial-wallets/introduction)  - &#x60;MPC&#x60;: [MPC Wallets](https://manuals.cobo.com/en/portal/mpc-wallets/introduction)  - &#x60;SmartContract&#x60;: [Smart Contract Wallets](https://manuals.cobo.com/en/portal/smart-contract-wallets/introduction)  - &#x60;Exchange&#x60;: [Exchange Wallets](https://manuals.cobo.com/en/portal/exchange-wallets/introduction)  |  |
|**supportedWalletSubtypes** | **List&lt;WalletSubtype&gt;** | The wallet subtype. Possible values include: - &#x60;Asset&#x60;: Custodial Wallets (Asset Wallets). - &#x60;Web3&#x60;: Custodial Wallets (Web3  Wallets). - &#x60;Org-Controlled&#x60;: MPC Wallets (Organization-Controlled Wallets). - &#x60;User-Controlled&#x60;: MPC Wallets (User-Controlled Wallets). - &#x60;Safe{Wallet}&#x60;: Smart Contract Wallets (Safe{Wallet}). - &#x60;Main&#x60;: Exchange Wallets (Main Account). - &#x60;Sub&#x60;: Exchange Wallets (Sub Account).  |  |
|**tokenId** | **String** | The token ID. |  |
|**estApr** | **Float** | The estimated annual percentage rate (APR). |  |



