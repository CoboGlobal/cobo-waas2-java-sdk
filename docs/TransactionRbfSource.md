

# TransactionRbfSource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceType** | **WalletSubtype** |  |  |
|**walletId** | **UUID** | The wallet ID. |  |
|**address** | **String** | The wallet address.  If you want to specify the UTXOs to be used, please provide the &#x60;included_utxos&#x60; property. If you specify both the &#x60;address&#x60; and &#x60;included_utxos&#x60; properties, the specified included UTXOs must belong to the address. It is recommended to specify no more than 100 included UTXOs to ensure optimal transaction processing.  You need to provide either the &#x60;address&#x60; or &#x60;included_utxos&#x60; property. If neither property is provided, the transfer will fail.  |  [optional] |
|**includedUtxos** | [**List&lt;TransactionUtxo&gt;**](TransactionUtxo.md) |  |  [optional] |
|**excludedUtxos** | [**List&lt;TransactionUtxo&gt;**](TransactionUtxo.md) |  |  [optional] |
|**mpcUsedKeyShareHolderGroup** | [**MpcSigningGroup**](MpcSigningGroup.md) |  |  [optional] |



