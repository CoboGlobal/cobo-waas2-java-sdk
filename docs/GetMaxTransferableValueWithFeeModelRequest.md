

# GetMaxTransferableValueWithFeeModelRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The token ID of the transferred token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). For transfers from Exchange Wallets, this property value represents the asset ID. |  |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  |
|**toAddress** | **String** | The recipient&#39;s address. |  |
|**fromAddress** | **String** | The sender&#39;s address. For EVM addresses in MPC Wallets, this parameter is required. |  [optional] |



