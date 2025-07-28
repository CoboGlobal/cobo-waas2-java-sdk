

# WebhookEventData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  The data type of the event. - &#x60;Transaction&#x60;: The transaction event data. - &#x60;TSSRequest&#x60;: The TSS request event data. - &#x60;Addresses&#x60;: The addresses event data. - &#x60;WalletInfo&#x60;: The wallet information event data. - &#x60;MPCVault&#x60;: The MPC vault event data. - &#x60;Chains&#x60;: The enabled chain event data. - &#x60;Tokens&#x60;: The enabled token event data. - &#x60;TokenListing&#x60;: The token listing event data.        - &#x60;PaymentOrder&#x60;: The payment order event data. - &#x60;PaymentRefund&#x60;: The payment refund event data. - &#x60;PaymentSettlement&#x60;: The payment settlement event data. - &#x60;PaymentTransaction&#x60;: The payment transaction event data. - &#x60;PaymentAddressUpdate&#x60;: The payment address update event data. - &#x60;BalanceUpdateInfo&#x60;: The balance update event data. - &#x60;SuspendedToken&#x60;: The suspended token event data. |  |
|**transactionId** | **UUID** | The transaction ID. |  |
|**coboId** | **String** | The Cobo ID, which can be used to track a transaction. |  [optional] |
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. |  |
|**walletId** | **String** | For deposit transactions, this property represents the wallet ID of the transaction destination. For transactions of other types, this property represents the wallet ID of the transaction source. |  |
|**type** | **TransactionType** |  |  [optional] |
|**status** | **TransactionStatus** |  |  |
|**subStatus** | **TransactionSubStatus** |  |  [optional] |
|**failedReason** | **String** | (This property is applicable to approval failures and signature failures only) The reason why the transaction failed. |  [optional] |
|**chainId** | **String** | The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). |  |
|**tokenId** | **String** | The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). |  |
|**assetId** | **String** | (This concept applies to Exchange Wallets only) The asset ID. An asset ID is the unique identifier of the asset held within your linked exchange account. |  [optional] |
|**source** | [**TransactionSource**](TransactionSource.md) |  |  |
|**destination** | [**TransactionDestination**](TransactionDestination.md) |  |  |
|**result** | [**TransactionResult**](TransactionResult.md) |  |  [optional] |
|**fee** | [**TransactionFee**](TransactionFee.md) |  |  [optional] |
|**initiator** | **String** | The transaction initiator. |  [optional] |
|**initiatorType** | **TransactionInitiatorType** |  |  |
|**confirmedNum** | **Integer** | The number of confirmations this transaction has received. |  [optional] |
|**confirmingThreshold** | **Integer** | The minimum number of confirmations required to deem a transaction secure. The common threshold is 6 for a Bitcoin transaction. |  [optional] |
|**transactionHash** | **String** | The transaction hash. |  [optional] |
|**blockInfo** | [**TransactionBlockInfo**](TransactionBlockInfo.md) |  |  [optional] |
|**rawTxInfo** | [**TransactionRawTxInfo**](TransactionRawTxInfo.md) |  |  [optional] |
|**replacement** | [**TransactionReplacement**](TransactionReplacement.md) |  |  [optional] |
|**category** | **List&lt;String&gt;** | A custom transaction category for you to identify your transfers more easily. |  [optional] |
|**description** | **String** | The description for your transaction. |  [optional] |
|**isLoop** | **Boolean** | Whether the transaction was executed as a [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop) transfer. - &#x60;true&#x60;: The transaction was executed as a Cobo Loop transfer. - &#x60;false&#x60;: The transaction was not executed as a Cobo Loop transfer.  |  [optional] |
|**coboCategory** | **List&lt;String&gt;** | The transaction category defined by Cobo. Possible values include:  - &#x60;AutoSweep&#x60;: An auto-sweep transaction. - &#x60;AutoFueling&#x60;: A transaction where Fee Station pays transaction fees to an address within your wallet. - &#x60;AutoFuelingRefund&#x60;: A refund for an auto-fueling transaction. - &#x60;SafeTxMessage&#x60;: A message signing transaction to authorize a Smart Contract Wallet (Safe\\{Wallet\\}) transaction. - &#x60;BillPayment&#x60;: A transaction to pay Cobo bills through Fee Station. - &#x60;BillRefund&#x60;: A refund for a previously made bill payment. - &#x60;CommissionFeeCharge&#x60;: A transaction to charge commission fees via Fee Station. - &#x60;CommissionFeeRefund&#x60;: A refund of previously charged commission fees.  |  [optional] |
|**extra** | **List&lt;String&gt;** | The transaction extra information. |  [optional] |
|**fuelingInfo** | [**TransactionFuelingInfo**](TransactionFuelingInfo.md) |  |  [optional] |
|**createdTimestamp** | **Long** | The time when the transaction was created, in Unix timestamp format, measured in milliseconds. |  |
|**updatedTimestamp** | **Long** | The time when the transaction was updated, in Unix timestamp format, measured in milliseconds. |  |
|**tssRequestId** | **String** | The TSS request ID. |  [optional] |
|**sourceKeyShareHolderGroup** | [**SourceGroup**](SourceGroup.md) |  |  [optional] |
|**targetKeyShareHolderGroupId** | **String** | The target key share holder group ID. |  [optional] |
|**addresses** | [**List&lt;AddressesEventDataAllOfAddresses&gt;**](AddressesEventDataAllOfAddresses.md) | A list of addresses. |  [optional] |
|**wallet** | [**WalletInfo**](WalletInfo.md) |  |  [optional] |
|**vaultId** | **String** | The vault ID. |  [optional] |
|**projectId** | **String** | The project ID. |  [optional] |
|**name** | **String** | The vault name. |  [optional] |
|**rootPubkeys** | [**List&lt;RootPubkey&gt;**](RootPubkey.md) |  |  [optional] |
|**chains** | [**List&lt;ChainInfo&gt;**](ChainInfo.md) | The enabled chains. |  |
|**walletType** | **WalletType** |  |  |
|**walletSubtypes** | **List&lt;WalletSubtype&gt;** |  |  [optional] |
|**tokens** | [**List&lt;TokenInfo&gt;**](TokenInfo.md) | The enabled tokens. |  |
|**contractAddress** | **String** | Contract address of the token |  |
|**walletSubtype** | **WalletSubtype** |  |  |
|**token** | [**TokenInfo**](TokenInfo.md) |  |  [optional] |
|**feedback** | **String** | Feedback provided by the admin for rejected requests |  [optional] |
|**address** | **String** | The wallet address. |  |
|**walletUuid** | **UUID** | The wallet ID. |  |
|**balance** | [**Balance**](Balance.md) |  |  |
|**tokenIds** | **String** | A list of token IDs, separated by comma. |  |
|**operationType** | **SuspendedTokenOperationType** |  |  |
|**orderId** | **String** | Unique identifier of a single order |  |
|**merchantId** | **String** | The merchant ID. |  [optional] |
|**payableAmount** | **String** | The cryptocurrency amount to be paid for this order. |  |
|**receiveAddress** | **String** | The recipient wallet address to be used for the payment transaction. |  |
|**currency** | **String** | The fiat currency of the order. |  |
|**orderAmount** | **String** | The base amount of the order in fiat currency, excluding the developer fee (specified in &#x60;fee_amount&#x60;). |  |
|**feeAmount** | **String** | The developer fee for the order in fiat currency. It is added to the base amount (&#x60;order_amount&#x60;) to determine the final charge. |  |
|**exchangeRate** | **String** | The exchange rate between a currency pair. Expressed as the amount of fiat currency per one unit of cryptocurrency. For example, if the cryptocurrency is USDT and the fiat currency is USD, a rate of \&quot;0.99\&quot; means 1 USDT &#x3D; 0.99 USD. |  |
|**expiredAt** | **Integer** | The expiration time of the pay-in order, represented as a UNIX timestamp in seconds. |  [optional] |
|**merchantOrderCode** | **String** | A unique reference code assigned by the merchant to identify this order in their system. |  [optional] |
|**pspOrderCode** | **String** | A unique reference code assigned by the developer to identify this order in their system. |  |
|**receivedTokenAmount** | **String** | The total cryptocurrency amount received for this order. Updates until the expiration time. Precision matches the token standard (e.g., 6 decimals for USDT). |  |
|**transactions** | [**List&lt;PaymentTransaction&gt;**](PaymentTransaction.md) | An array of transactions associated with this refund order. Each transaction represents a separate blockchain operation related to the refund process. |  [optional] |
|**settlementStatus** | **SettleStatus** |  |  [optional] |
|**refundId** | **String** | The refund order ID. |  |
|**amount** | **String** | The amount in cryptocurrency to be returned for this refund order. |  |
|**toAddress** | **String** | The recipient&#39;s wallet address where the refund will be sent. |  |
|**refundType** | **RefundType** |  |  [optional] |
|**chargeMerchantFee** | **Boolean** | Whether to charge developer fee to the merchant.  - &#x60;true&#x60;: The fee amount (specified in &#x60;merchant_fee_amount&#x60;) will be deducted from the merchant&#39;s balance and added to the developer&#39;s balance - &#x60;false&#x60;: The merchant is not charged any developer fee.  |  [optional] |
|**merchantFeeAmount** | **String** | The developer fee amount to charge the merchant, denominated in the cryptocurrency specified by &#x60;merchant_fee_token_id&#x60;. |  [optional] |
|**merchantFeeTokenId** | **String** | The ID of the cryptocurrency used for the developer fee. |  [optional] |
|**settlementRequestId** | **String** | The settlement request ID generated by Cobo. |  |
|**settlements** | [**List&lt;SettlementDetail&gt;**](SettlementDetail.md) |  |  |
|**acquiringType** | **AcquiringType** |  |  |
|**payerId** | **String** | Unique payer identifier on the Cobo side, auto-generated by the system.  |  |
|**customPayerId** | **String** | Unique user identifier on the merchant side, used to assign a dedicated deposit address.  |  |
|**chain** | **String** | Blockchain network identifier, e.g., &#39;ETH&#39; for Ethereum, &#39;TRON&#39; for Tron.  |  |
|**previousAddress** | **String** | The previous deposit address that was assigned before update.  |  |
|**updatedAddress** | **String** | The new updated deposit address assigned to the user.  |  |



## Enum: DataTypeEnum

| Name | Value |
|---- | -----|
| TRANSACTION | &quot;Transaction&quot; |
| TSSREQUEST | &quot;TSSRequest&quot; |
| ADDRESSES | &quot;Addresses&quot; |
| WALLETINFO | &quot;WalletInfo&quot; |
| MPCVAULT | &quot;MPCVault&quot; |
| CHAINS | &quot;Chains&quot; |
| TOKENS | &quot;Tokens&quot; |
| TOKENLISTING | &quot;TokenListing&quot; |
| PAYMENTORDER | &quot;PaymentOrder&quot; |
| PAYMENTREFUND | &quot;PaymentRefund&quot; |
| PAYMENTSETTLEMENT | &quot;PaymentSettlement&quot; |
| PAYMENTTRANSACTION | &quot;PaymentTransaction&quot; |
| PAYMENTADDRESSUPDATE | &quot;PaymentAddressUpdate&quot; |
| BALANCEUPDATEINFO | &quot;BalanceUpdateInfo&quot; |
| SUSPENDEDTOKEN | &quot;SuspendedToken&quot; |



