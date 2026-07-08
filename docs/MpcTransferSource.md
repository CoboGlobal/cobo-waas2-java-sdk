

# MpcTransferSource

The information about the transaction source types `Org-Controlled` and `User-Controlled`. Refer to [Transaction sources and destinations](https://www.cobo.com/developers/v2/guides/transactions/sources-and-destinations) for a detailed introduction about the supported sources and destinations for each transaction type.  - For UTXO-based chains: both `address` and `included_utxos` are optional. If both `address` and `included_utxos` are provided, the UTXOs must belong to the specified address. If neither `address` nor `included_utxos` is provided, the system will select UTXOs from the wallet associated with `wallet_id`. - For account-based chains: You need to provide `address` otherwise the token transfer will fail. However, when estimating fees for a transfer, `address` is not required.  For detailed rules on `address` and `included_utxos` in both regular and RBF transactions, see [Address and included_utxos usage](https://www.cobo.com/developers/v2/guides/transactions/sources-and-destinations#address-and-included-utxos-usage).  Switch between the tabs to display the properties for different transaction sources. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceType** | **WalletSubtype** |  |  |
|**walletId** | **UUID** | The wallet ID. |  |
|**address** | **String** | Indicates the wallet address to be used as the source of funds. - For UTXO-based chains: both &#x60;address&#x60; and &#x60;included_utxos&#x60; are optional. If both &#x60;address&#x60; and &#x60;included_utxos&#x60; are provided, the UTXOs must belong to the specified address. If neither &#x60;address&#x60; nor &#x60;included_utxos&#x60; is provided, the system will select UTXOs from the wallet associated with &#x60;wallet_id&#x60;. - For account-based chains: You need to provide &#x60;address&#x60; otherwise the token transfer will fail. However, when estimating fees for a transfer, &#x60;address&#x60; is not required.  For detailed rules on &#x60;address&#x60; and &#x60;included_utxos&#x60; in both regular and RBF transactions, see [Address and included_utxos usage](https://www.cobo.com/developers/v2/guides/transactions/sources-and-destinations#address-and-included-utxos-usage).  |  [optional] |
|**includedUtxos** | [**List&lt;TransactionUtxo&gt;**](TransactionUtxo.md) |  |  [optional] |
|**excludedUtxos** | [**List&lt;TransactionUtxo&gt;**](TransactionUtxo.md) |  |  [optional] |
|**mpcUsedKeyShareHolderGroup** | [**MpcSigningGroup**](MpcSigningGroup.md) |  |  [optional] |



