

# CreateExchangeWalletParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The wallet name. This field is required and cannot be empty. Letters, numbers, and spaces are supported (for example, &#x60;My WaaS 2.0 Wallet&#x60;).  &lt;Note&gt;Some special characters are not accepted. For example, the at sign (&#x60;@&#x60;) is rejected. If the name is empty or contains unsupported characters, the request fails with a &#x60;400 Bad Request&#x60; error.&lt;/Note&gt;  |  |
|**walletType** | **WalletType** |  |  |
|**walletSubtype** | **WalletSubtype** |  |  |
|**enableAutoSweep** | **Boolean** | Enable the auto-sweep feature for the wallet. This parameter only applies to MPC Wallets and Custodial Wallets (Web3 Wallets). |  [optional] |
|**exchangeId** | **ExchangeId** |  |  |
|**apikey** | **String** | The API key of your exchange account. |  |
|**secret** | **String** | The API secret of your exchange account. |  |
|**passphrase** | **String** | The passphrase of your exchange account. |  [optional] |
|**memo** | **String** | The memo you use when applying for the API key of your exchange account. |  [optional] |
|**accountIdentify** | **String** | The identifier of your exchange account. - For Binance, this is email address of your exchange account. - For OKX, this is the user name of your exchange account.  |  [optional] |
|**gaCode** | **String** | The GA code for the exchange. |  [optional] |
|**mainWalletId** | **String** | The ID of the Exchange Wallet (Main Account). |  [optional] |



