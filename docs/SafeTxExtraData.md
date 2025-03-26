

# SafeTxExtraData

The information about the extra data of the Safe{Wallet} tx message transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**to** | **String** | The recipient address of the transaction |  |
|**value** | **String** | Readable transaction value (e.g., 1 ETH) |  |
|**data** | **String** | The transaction data |  |
|**domainHash** | **String** | EIP712 structured data domain hash |  |
|**messageHash** | **String** | Hash of the structured message |  |
|**safeAddress** | **String** | Address of the Safe contract |  |
|**safeTxHash** | **String** | Hash of the Safe transaction |  |
|**safeNonce** | **Integer** | Safe transaction nonce |  |
|**operation** | **String** | Type of operation performed in the transaction |  |
|**gasTokenAddr** | **String** | Address of the gas token |  [optional] |
|**safeTxGas** | **Integer** | Gas used for the Safe transaction |  [optional] |
|**baseGas** | **Integer** | Base gas for the transaction |  [optional] |
|**gasPrice** | **String** | Gas price used in the transaction |  [optional] |
|**refundReceiver** | **String** | Address to receive the gas refund |  [optional] |
|**toContractName** | **String** | Name of the recipient contract (if available) |  [optional] |
|**decodedData** | [**SafeTxDecodedData**](SafeTxDecodedData.md) |  |  [optional] |
|**signature** | **String** | Signature of the transaction (if signed by Cobo Signer) |  [optional] |
|**wei** | **String** | Transaction amount in Wei |  [optional] |



