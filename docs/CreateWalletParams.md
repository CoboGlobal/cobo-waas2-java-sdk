

# CreateWalletParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The wallet name. |  |
|**walletType** | **WalletType** |  |  |
|**walletSubtype** | **WalletSubtype** |  |  |
|**enableAutoSweep** | **Boolean** | Enable the auto sweep feature for the wallet. This parameter only applies to MPC and Web3 wallets. |  [optional] |
|**vaultId** | **String** | The ID of the owning vault. You can call [List all vaults](https://www.cobo.com/developers/v2/api-references/wallets--mpc-wallets/list-all-vaults) to retrieve all vault IDs under your organization. |  |
|**exchangeId** | **ExchangeId** |  |  |
|**apikey** | **String** | The API key of your exchange account. |  |
|**secret** | **String** | The API secret of your exchange account. |  |
|**passphrase** | **String** | The passphrase of your exchange account. |  [optional] |
|**memo** | **String** | The memo you use when applying for the API key of your exchange account. |  [optional] |
|**accountIdentify** | **String** | The identifier of your exchange account. - For Binance, this is email address of your exchange account. - For OKX, this is the user name of your exchange account.  |  [optional] |
|**gaCode** | **String** | The GA code for the exchange. |  [optional] |
|**mainWalletId** | **String** | The ID of the Exchange Wallet (Main Account). |  [optional] |



