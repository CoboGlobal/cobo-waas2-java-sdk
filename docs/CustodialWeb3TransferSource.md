

# CustodialWeb3TransferSource

The information about the transaction source types `Web3`. Refer to [Transaction sources and destinations](https://www.cobo.com/developers/v2/guides/transactions/sources-and-destinations) for a detailed introduction about the supported sources and destinations for each transaction type.  You need to provide either the `address` or `included_utxos` property. If neither property is provided, the transfer will fail.  Switch between the tabs to display the properties for different transaction sources. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceType** | **WalletSubtype** |  |  |
|**walletId** | **UUID** | The wallet ID. |  |
|**address** | **String** | The wallet address.  If you want to specify the UTXOs to be used, please provide the &#x60;included_utxos&#x60; property. When &#x60;included_utxos&#x60; is specified, only these specified UTXOs will be used for the transaction. If you specify both the &#x60;address&#x60; and &#x60;included_utxos&#x60; properties, the specified included UTXOs must belong to the address. It is recommended to specify no more than 100 included UTXOs to ensure optimal transaction processing.  You need to provide either the &#x60;address&#x60; or &#x60;included_utxos&#x60; property. If neither property is provided, the transfer will fail.  |  [optional] |
|**includedUtxos** | [**List&lt;TransactionUtxo&gt;**](TransactionUtxo.md) |  |  [optional] |
|**excludedUtxos** | [**List&lt;TransactionUtxo&gt;**](TransactionUtxo.md) |  |  [optional] |



