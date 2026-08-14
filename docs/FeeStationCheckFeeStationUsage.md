

# FeeStationCheckFeeStationUsage

The information about a check fee station usage.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. |  |
|**amount** | **String** | Applicable to transfer requests only. The amount of tokens to be transferred in this request. |  [optional] |
|**tokenId** | **String** | Applicable to transfer requests only. The token ID of the asset to be transferred.   You can retrieve available token IDs by calling   [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens).  |  [optional] |
|**feeTokenId** | **String** | The token ID used to pay the gas fee for the main transaction. You can retrieve available token IDs by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). |  [optional] |
|**estimatedFeeAmount** | **String** | The estimated transaction fee required for this transfer, before applying any fee station rules. |  |
|**fromAddress** | **String** | The blockchain address that initiates the transfer. |  |
|**fromWalletId** | **UUID** | The wallet ID. |  |
|**autoFuel** | **AutoFuelType** |  |  [optional] |



