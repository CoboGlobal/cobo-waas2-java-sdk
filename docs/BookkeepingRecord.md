

# BookkeepingRecord

The bookkeeping item information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **UUID** | The wallet ID. |  |
|**walletType** | **WalletType** |  |  [optional] |
|**walletName** | **String** | The wallet name. |  [optional] |
|**transactionTimestamp** | **Long** | The time when the bookkeeping was created, in Unix timestamp format, measured in milliseconds. |  |
|**tokenId** | **String** | The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](/v2/api-references/wallets/list-enabled-tokens). |  |
|**type** | **String** | The bookkeeping type. |  |
|**amount** | **String** | The amount of the bookkeeping. |  |
|**balance** | **String** | The post-balance of the tx. |  |
|**fromAddress** | **String** | The from address. |  [optional] |
|**toAddress** | **String** | The to address. |  [optional] |
|**transactionHash** | **String** | The transaction hash. |  [optional] |



