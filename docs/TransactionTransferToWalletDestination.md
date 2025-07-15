

# TransactionTransferToWalletDestination

Information about the transaction destination type `CustodialWallet` or `ExchangeWallet`. Refer to [Transaction sources and destinations](https://www.cobo.com/developers/v2/guides/transactions/sources-and-destinations) for a detailed introduction about the supported sources and destinations for each transaction type.  Switch between the tabs to display the properties for different transaction destinations. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **TransactionDestinationType** |  |  |
|**walletId** | **UUID** | The wallet ID. |  |
|**tradingAccountType** | **String** | The trading account type. Only available for &#x60;ExchangeWallet&#x60;. |  [optional] |
|**exchangeId** | **ExchangeId** |  |  [optional] |
|**amount** | **String** | The transfer amount. For example, if you trade 1.5 BTC, then the value is &#x60;1.5&#x60;.  |  |



