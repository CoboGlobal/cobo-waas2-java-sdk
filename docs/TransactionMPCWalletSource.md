

# TransactionMPCWalletSource

Information about the transaction source type `Org-Controlled` and `User-Controlled`. Switch between the tabs to display the properties for different transaction sources. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceType** | **TransactionSourceType** |  |  |
|**walletId** | **UUID** | The wallet ID. |  |
|**address** | **String** | The wallet address. |  [optional] |
|**includedUtxos** | [**List&lt;TransactionUtxo&gt;**](TransactionUtxo.md) |  |  [optional] |
|**excludedUtxos** | [**List&lt;TransactionUtxo&gt;**](TransactionUtxo.md) |  |  [optional] |
|**signerKeyShareHolderGroupId** | **String** | The ID of the key share holder group that is selected to sign the transaction. |  [optional] |



