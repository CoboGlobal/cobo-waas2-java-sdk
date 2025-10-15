

# EstimateTransferFeeParams

The information about a token transfer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a transaction request. |  [optional] |
|**requestType** | **EstimateFeeRequestType** |  |  |
|**source** | [**TransferSource**](TransferSource.md) |  |  |
|**tokenId** | **String** | The token ID of the transferred token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). |  |
|**destination** | [**TransferDestination**](TransferDestination.md) |  |  [optional] |
|**feeType** | **FeeType** |  |  [optional] |
|**replacedTransactionId** | **UUID** | The ID of the transaction that this transaction replaced. |  [optional] |



