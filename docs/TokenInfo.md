

# TokenInfo

The token information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](/v2/api-references/wallets/list-enabled-tokens). |  |
|**chainId** | **String** | The ID of the chain on which the token operates. |  |
|**assetId** | **String** | (This concept applies to Exchange Wallets only) The asset ID. An asset ID is the unique identifier of the asset held within your linked exchange account. |  [optional] |
|**symbol** | **String** | The token symbol, which is the abbreviated name of a token. |  [optional] |
|**name** | **String** | The token name, which is the full name of a token. |  [optional] |
|**decimal** | **Integer** | The token decimal. |  [optional] |
|**iconUrl** | **String** | The URL of the token icon. |  [optional] |
|**tokenAddress** | **String** | The token address, if applicable. |  [optional] |
|**feeTokenId** | **String** | The fee token ID. A fee token is the token with which you pay transaction fees. |  [optional] |
|**canDeposit** | **Boolean** | Whether deposits are enabled for this token. |  [optional] |
|**canWithdraw** | **Boolean** | Whether withdrawals are enabled for this token. |  [optional] |
|**dustThreshold** | **String** | Minimum amount of token that can be transacted, such as 0.00000546 for BTC. |  [optional] |
|**custodialMinimumDepositThreshold** | **String** | Minimum amount of token that can be deposit, such as 0.0001 for BTC. |  [optional] |



