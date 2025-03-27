

# SafeTxExtraData

The information used to construct and sign Safe{Wallet} transactions using the EIP-712 standard.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**to** | **String** | The recipient address of the transaction. |  |
|**value** | **String** | The human-readable transaction value, for example, &#x60;1 ETH&#x60;. |  |
|**data** | **String** | The transaction call data. |  |
|**domainHash** | **String** | The EIP-712 domain separator hash. |  |
|**messageHash** | **String** | The hash of the structured message to be signed. |  |
|**safeAddress** | **String** | The address of the Safe contract. |  |
|**safeTxHash** | **String** | The hash of the transaction. |  |
|**safeNonce** | **Integer** | The nonce of the transaction. |  |
|**operation** | **String** | The operation type for the transaction. |  |
|**gasTokenAddr** | **String** | The address of the token used to pay gas. |  [optional] |
|**safeTxGas** | **Integer** | The gas limit used for the transaction. |  [optional] |
|**baseGas** | **Integer** | The base gas for the transaction. |  [optional] |
|**gasPrice** | **String** | The gas price used in the transaction. |  [optional] |
|**refundReceiver** | **String** | The address used to receive the gas refund. |  [optional] |
|**toContractName** | **String** | The name of the recipient contract (if available). |  [optional] |
|**decodedData** | [**SafeTxDecodedData**](SafeTxDecodedData.md) |  |  [optional] |
|**signature** | **String** | The signature of the transaction (if signed by Cobo Signer). |  [optional] |
|**wei** | **String** | The transaction amount in Wei. |  [optional] |



