

# SwapActivity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activityId** | **UUID** | The unique identifier of the swap activity. |  [optional] |
|**swapType** | **SwapType** |  |  [optional] |
|**status** | **SwapActivityStatus** |  |  [optional] |
|**requestId** | **String** | The request ID of the swap transaction. |  [optional] |
|**walletId** | **UUID** | The ID of the wallet used to pay. |  [optional] |
|**payTokenId** | **String** | The ID of the token to pay. |  [optional] |
|**receiveTokenId** | **String** | The ID of the token to receive. |  [optional] |
|**payAmount** | **String** | The amount of the token to pay. |  [optional] |
|**receiveAmount** | **String** | The amount of the token to receive. |  [optional] |
|**feeTokenId** | **String** | The ID of the token used for paying the service fee. |  [optional] |
|**feeAmount** | **String** | The amount of the service fee. |  [optional] |
|**initiator** | **String** | The initiator of the swap activity. |  [optional] |
|**initiatorType** | **TransactionInitiatorType** |  |  [optional] |
|**description** | **String** | The description of the swap activity. |  [optional] |
|**createdTimestamp** | **Integer** | The time when the swap activity was created, in Unix timestamp format, measured in milliseconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The time when the swap activity was last updated, in Unix timestamp format, measured in milliseconds. |  [optional] |
|**networkFee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  [optional] |
|**destinationAddress** | **String** | The address of an MPC Wallet or Web3 Wallet that receives the swapped or bridged assets. |  [optional] |



