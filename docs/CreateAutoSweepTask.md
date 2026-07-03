

# CreateAutoSweepTask

The sweep to address information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **String** | The wallet ID. |  |
|**tokenId** | **String** | The token ID of the swept token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). |  |
|**minBalanceThreshold** | **String** | The minimum token balance threshold for auto sweep. If the token balance of an address is less than this threshold, the address will not be swept.  |  [optional] |



