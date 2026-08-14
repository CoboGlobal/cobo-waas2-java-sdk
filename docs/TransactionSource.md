

# TransactionSource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceType** | **TransactionSourceType** |  |  |
|**walletId** | **UUID** | The wallet ID. |  |
|**address** | **String** | The wallet address. |  [optional] |
|**includedUtxos** | [**List&lt;TransactionUtxo&gt;**](TransactionUtxo.md) |  |  [optional] |
|**excludedUtxos** | [**List&lt;TransactionUtxo&gt;**](TransactionUtxo.md) |  |  [optional] |
|**signerKeyShareHolderGroupId** | **String** | The ID of the key share holder group that is selected to sign the transaction. |  [optional] |
|**exchangeId** | **ExchangeId** |  |  |
|**tradingAccountType** | **String** | The exchange trading account or a sub-wallet ID. |  [optional] |
|**walletType** | **WalletType** |  |  |
|**walletSubtype** | **WalletSubtype** |  |  |
|**addresses** | **List&lt;String&gt;** | A list of addresses. |  |



