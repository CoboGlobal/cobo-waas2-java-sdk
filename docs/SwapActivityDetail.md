

# SwapActivityDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activityId** | **UUID** | The unique identifier of the swap activity. |  [optional] |
|**swapType** | **SwapType** |  |  [optional] |
|**status** | **SwapActivityStatus** |  |  [optional] |
|**requestId** | **String** | The request id of the swap activity. |  [optional] |
|**walletId** | **UUID** | The unique identifier of the wallet. |  [optional] |
|**payTokenId** | **String** | The token ID to pay. |  [optional] |
|**receiveTokenId** | **String** | The token ID to receive. |  [optional] |
|**payAmount** | **String** | The amount of tokens to bridge. |  [optional] |
|**receiveAmount** | **String** | The amount of tokens to receive. |  [optional] |
|**feeTokenId** | **String** | The fee token ID. |  [optional] |
|**feeAmount** | **String** | The amount of fee. |  [optional] |
|**initiator** | **String** | The initiator of the swap activity. |  [optional] |
|**initiatorType** | **TransactionInitiatorType** |  |  [optional] |
|**description** | **String** | The description of the swap activity. |  [optional] |
|**createdTimestamp** | **Integer** | The time when the swap activity was created, in Unix timestamp format, measured in milliseconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The time when the swap activity was last updated, in Unix timestamp format, measured in milliseconds. |  [optional] |
|**timeline** | [**List&lt;SwapActivityTimeline&gt;**](SwapActivityTimeline.md) |  |  [optional] |
|**approvers** | [**List&lt;SwapActivityApprovers&gt;**](SwapActivityApprovers.md) |  |  [optional] |
|**signers** | [**List&lt;SwapActivitySigners&gt;**](SwapActivitySigners.md) |  |  [optional] |



