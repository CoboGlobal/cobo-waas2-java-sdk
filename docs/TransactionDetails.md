

# TransactionDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | The transaction ID. |  |
|**coboId** | **String** | The Cobo ID, which can be used to track a transaction. |  [optional] |
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. |  [optional] |
|**walletId** | **String** | For deposit transactions, this property represents the wallet ID of the transaction destination. For transactions of other types, this property represents the wallet ID of the transaction source. |  |
|**type** | **TransactionType** |  |  [optional] |
|**status** | **TransactionStatus** |  |  |
|**subStatus** | **TransactionSubStatus** |  |  [optional] |
|**failedReason** | **String** | (This property is applicable to approval failures and signature failures only) The reason why the transaction failed. |  [optional] |
|**chainId** | **String** | The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). |  [optional] |
|**tokenId** | **String** | The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). |  [optional] |
|**assetId** | **String** | (This concept applies to Exchange Wallets only) The asset ID. An asset ID is the unique identifier of the asset held within your linked exchange account. |  [optional] |
|**source** | [**TransactionSource**](TransactionSource.md) |  |  |
|**destination** | [**TransactionDestination**](TransactionDestination.md) |  |  |
|**result** | [**TransactionResult**](TransactionResult.md) |  |  [optional] |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  [optional] |
|**initiator** | **String** | Transaction initiator |  [optional] |
|**initiatorType** | **TransactionInitiatorType** |  |  |
|**confirmedNum** | **Integer** | Transaction confirmed number |  [optional] |
|**confirmingThreshold** | **Integer** | Number of confirmations required for a transaction, such as 15 for ETH chain. |  [optional] |
|**transactionHash** | **String** | The transaction hash. |  [optional] |
|**blockInfo** | [**TransactionBlockInfo**](TransactionBlockInfo.md) |  |  [optional] |
|**rawTxInfo** | [**TransactionRawTxInfo**](TransactionRawTxInfo.md) |  |  [optional] |
|**replacement** | [**TransactionReplacement**](TransactionReplacement.md) |  |  [optional] |
|**category** | **List&lt;String&gt;** | A custom transaction category for you to identify your transfers more easily. |  [optional] |
|**description** | **String** | The description for your transaction. |  [optional] |
|**isLoop** | **Boolean** | Whether the transaction was executed as a [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop) transfer. - &#x60;true&#x60;: The transaction was executed as a Cobo Loop transfer. - &#x60;false&#x60;: The transaction was not executed as a Cobo Loop transfer.  |  [optional] |
|**coboCategory** | **List&lt;String&gt;** | A transaction category for cobo to identify your transactions. |  [optional] |
|**fuelingInfo** | [**TransactionFuelingInfo**](TransactionFuelingInfo.md) |  |  [optional] |
|**createdTimestamp** | **Long** | The time when the transaction was created, in Unix timestamp format, measured in milliseconds. |  [optional] |
|**updatedTimestamp** | **Long** | The time when the transaction was updated, in Unix timestamp format, measured in milliseconds. |  [optional] |
|**approvers** | [**List&lt;TransactionApprover&gt;**](TransactionApprover.md) |  |  [optional] |
|**signers** | [**List&lt;TransactionSigner&gt;**](TransactionSigner.md) |  |  [optional] |
|**nonce** | **Integer** | Transaction nonce |  [optional] |
|**replacedBy** | **String** | Replace by transaction hash |  [optional] |
|**fueledBy** | **String** | Fueled by address |  [optional] |
|**tokenApproval** | [**TransactionTokeApproval**](TransactionTokeApproval.md) |  |  [optional] |
|**message** | **String** | Transaction raw message |  [optional] |
|**algorithm** | **String** | Transaction message signing algorithm |  [optional] |
|**timeline** | [**List&lt;TransactionTimeline&gt;**](TransactionTimeline.md) |  |  [optional] |



