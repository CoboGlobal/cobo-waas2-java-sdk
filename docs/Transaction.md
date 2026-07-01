

# Transaction

The information about a transaction.

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
|**fee** | [**TransactionFee**](TransactionFee.md) |  |  [optional] |
|**initiator** | **String** | The transaction initiator. |  [optional] |
|**initiatorType** | **TransactionInitiatorType** |  |  |
|**confirmedNum** | **Integer** | The number of confirmations this transaction has received. |  [optional] |
|**confirmingThreshold** | **Integer** | The minimum number of confirmations required to deem a transaction secure. The common threshold is 6 for a Bitcoin transaction. |  [optional] |
|**transactionHash** | **String** | The transaction hash (on-chain transaction identifier, also referred to as &#x60;txid&#x60;).  This property is populated only after the transaction is broadcast on-chain, so it may be &#x60;null&#x60; or absent before broadcast. In contrast, &#x60;transaction_id&#x60; (the Cobo internal transaction ID) is assigned at creation and is always present.  |  [optional] |
|**blockInfo** | [**TransactionBlockInfo**](TransactionBlockInfo.md) |  |  [optional] |
|**rawTxInfo** | [**TransactionRawTxInfo**](TransactionRawTxInfo.md) |  |  [optional] |
|**replacement** | [**TransactionReplacement**](TransactionReplacement.md) |  |  [optional] |
|**category** | **List&lt;String&gt;** | A custom transaction category for you to identify your transfers more easily. |  [optional] |
|**description** | **String** | The description for your transaction. |  [optional] |
|**isLoop** | **Boolean** | Whether the transaction was executed as a [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop) transfer. - &#x60;true&#x60;: The transaction was executed as a Cobo Loop transfer. - &#x60;false&#x60;: The transaction was not executed as a Cobo Loop transfer.  |  [optional] |
|**coboCategory** | **List&lt;String&gt;** | The transaction category defined by Cobo. For more details, refer to [Cobo-defined categories](/v2/guides/transactions/manage-transactions#cobo-defined-categories).  |  [optional] |
|**extra** | **List&lt;String&gt;** | A list of JSON-encoded strings containing structured, business-specific extra information for the transaction. Each item corresponds to a specific data type, indicated by the &#x60;extra_type&#x60; field in the JSON object (for example, \&quot;BabylonBusinessInfo\&quot;, \&quot;BtcAddressInfo\&quot;).  |  [optional] |
|**fuelingInfo** | [**TransactionFuelingInfo**](TransactionFuelingInfo.md) |  |  [optional] |
|**createdTimestamp** | **Long** | The time when the transaction was created, in Unix timestamp format, measured in milliseconds. |  |
|**updatedTimestamp** | **Long** | The time when the transaction was updated, in Unix timestamp format, measured in milliseconds. |  |



