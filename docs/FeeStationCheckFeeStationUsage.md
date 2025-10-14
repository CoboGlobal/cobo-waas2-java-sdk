

# FeeStationCheckFeeStationUsage

The information about a check fee station usage.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. |  |
|**amount** | **String** | The amount of tokens to be transferred in this request. |  |
|**tokenId** | **String** | The token ID of the transferred token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). |  |
|**estimatedFeeAmount** | **String** | The estimated transaction fee required for this transfer, before applying any fee station rules. |  |
|**fromAddress** | **String** | The blockchain address that initiates the transfer. |  |
|**fromWalletId** | **UUID** | The wallet ID. |  |



