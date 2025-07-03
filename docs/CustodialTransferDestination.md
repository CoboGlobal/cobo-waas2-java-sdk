

# CustodialTransferDestination

The information about the transaction destination type `CustodialWallet`. Refer to [Transaction sources and destinations](https://www.cobo.com/developers/v2/guides/transactions/sources-and-destinations) for a detailed introduction about the supported sources and destinations for each transaction type.  A Custodial Wallet (Asset Wallet) can only receive transfers from another Custodial Wallet (Asset Wallet) by using [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop).  Switch between the tabs to display the properties for different transaction destinations. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **TransferDestinationType** |  |  |
|**walletId** | **UUID** | The wallet ID. |  |
|**amount** | **String** | The transfer amount. For example, if you trade 1.5 BTC, then the value is &#x60;1.5&#x60;.  |  |



