

# BalanceUpdateInfo

The balance information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). |  |
|**address** | **String** | The wallet address. |  |
|**walletUuid** | **UUID** | The wallet ID. |  |
|**updatedTimestamp** | **Long** | The time when the balance updated, in Unix timestamp format, measured in milliseconds.  |  |
|**balance** | [**Balance**](Balance.md) |  |  |



