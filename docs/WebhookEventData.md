

# WebhookEventData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  The data type of the event. - &#x60;Transaction&#x60;: The transaction event data. - &#x60;TSSRequest&#x60;: The TSS request event data. - &#x60;Addresses&#x60;: The addresses event data. - &#x60;WalletInfo&#x60;: The wallet information event data. - &#x60;MPCVault&#x60;: The MPC vault event data. - &#x60;Chains&#x60;: The enabled chain event data. - &#x60;Tokens&#x60;: The enabled token event data. - &#x60;TokenListing&#x60;: The token listing event data.        - &#x60;PaymentOrder&#x60;: The payment order event data. - &#x60;PaymentRefund&#x60;: The payment refund event data. - &#x60;PaymentSettlement&#x60;: The payment settlement event data. - &#x60;PaymentTransaction&#x60;: The payment transaction event data. - &#x60;PaymentAddressUpdate&#x60;: The top-up address update event data. - &#x60;PaymentPayout&#x60;: The payment payout event data. - &#x60;PaymentBulkSend&#x60;: The payment bulk send event data. - &#x60;PaymentAccountBalanceUpdate&#x60;: The Payments account balance updated event data, including account information and balance change details. - &#x60;BalanceUpdateInfo&#x60;: The balance update event data. - &#x60;SuspendedToken&#x60;: The token suspension event data. - &#x60;ComplianceDisposition&#x60;: The compliance disposition event data. - &#x60;ComplianceKytScreenings&#x60;: The compliance KYT screenings event data. - &#x60;ComplianceKyaScreenings&#x60;: The compliance KYA screenings event data. - &#x60;Organization&#x60;: The organization event data. - &#x60;FiatTransaction&#x60;: The fiat transaction event data. |  |
|**transactionId** | **String** | The transaction ID. |  |
|**coboId** | **String** | The Cobo ID, which can be used to track a transaction. |  [optional] |
|**requestId** | **String** | The request ID. |  |
|**walletId** | **String** | For deposit transactions, this property represents the wallet ID of the transaction destination. For transactions of other types, this property represents the wallet ID of the transaction source. |  |
|**type** | **TransactionType** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the fiat transaction. Possible values include:   - &#x60;Created&#x60;: The transaction has been created.   - &#x60;Succeeded&#x60;: The transaction has been completed successfully.  |  |
|**subStatus** | **TransactionSubStatus** |  |  [optional] |
|**failedReason** | **String** | (This property is applicable to approval failures and signature failures only) The reason why the transaction failed. |  [optional] |
|**chainId** | **String** | The chain identifier. |  |
|**tokenId** | **String** | The token ID of the balance change. |  |
|**assetId** | **String** | (This concept applies to Exchange Wallets only) The asset ID. An asset ID is the unique identifier of the asset held within your linked exchange account. |  [optional] |
|**source** | [**TransactionSource**](TransactionSource.md) |  |  |
|**destination** | [**TransactionDestination**](TransactionDestination.md) |  |  |
|**result** | [**TransactionResult**](TransactionResult.md) |  |  [optional] |
|**fee** | [**TransactionFee**](TransactionFee.md) |  |  [optional] |
|**initiator** | **String** | The initiator of this payout, usually the user&#39;s API key. |  [optional] |
|**initiatorType** | **TransactionInitiatorType** |  |  |
|**confirmedNum** | **Integer** | The number of confirmations this transaction has received. |  [optional] |
|**confirmingThreshold** | **Integer** | The minimum number of confirmations required to deem a transaction secure. The common threshold is 6 for a Bitcoin transaction. |  [optional] |
|**transactionHash** | **String** | The transaction hash. |  [optional] |
|**blockInfo** | [**TransactionBlockInfo**](TransactionBlockInfo.md) |  |  [optional] |
|**rawTxInfo** | [**TransactionRawTxInfo**](TransactionRawTxInfo.md) |  |  [optional] |
|**replacement** | [**TransactionReplacement**](TransactionReplacement.md) |  |  [optional] |
|**category** | **List&lt;String&gt;** | A custom transaction category for you to identify your transfers more easily. |  [optional] |
|**description** | **String** | The description for the entire bulk send batch. |  [optional] |
|**isLoop** | **Boolean** | Whether the transaction was executed as a [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop) transfer. - &#x60;true&#x60;: The transaction was executed as a Cobo Loop transfer. - &#x60;false&#x60;: The transaction was not executed as a Cobo Loop transfer.  |  [optional] |
|**coboCategory** | **List&lt;String&gt;** | The Cobo category of the transaction. |  [optional] |
|**extra** | **List&lt;String&gt;** | A list of JSON-encoded strings containing structured, business-specific extra information for the transaction. Each item corresponds to a specific data type, indicated by the &#x60;extra_type&#x60; field in the JSON object (for example, \&quot;BabylonBusinessInfo\&quot;, \&quot;BtcAddressInfo\&quot;).  |  [optional] |
|**fuelingInfo** | [**TransactionFuelingInfo**](TransactionFuelingInfo.md) |  |  [optional] |
|**createdTimestamp** | **Long** | The time when the transaction was created, in Unix timestamp format, measured in milliseconds. |  |
|**updatedTimestamp** | **Long** | The time when the screening status was updated, in Unix timestamp format, measured in milliseconds. |  |
|**tssRequestId** | **String** | The TSS request ID. |  [optional] |
|**sourceKeyShareHolderGroup** | [**SourceGroup**](SourceGroup.md) |  |  [optional] |
|**targetKeyShareHolderGroupId** | **String** | The target key share holder group ID. |  [optional] |
|**addresses** | [**List&lt;AddressesEventDataAllOfAddresses&gt;**](AddressesEventDataAllOfAddresses.md) | A list of addresses. |  [optional] |
|**wallet** | [**WalletInfo**](WalletInfo.md) |  |  [optional] |
|**vaultId** | **String** | The vault ID. |  [optional] |
|**projectId** | **String** | The project ID. |  [optional] |
|**name** | **String** | The organization name. |  [optional] |
|**rootPubkeys** | [**List&lt;RootPubkey&gt;**](RootPubkey.md) |  |  [optional] |
|**chains** | [**List&lt;ChainInfo&gt;**](ChainInfo.md) | The enabled chains. |  |
|**walletType** | **WalletType** |  |  |
|**walletSubtypes** | **List&lt;WalletSubtype&gt;** |  |  [optional] |
|**tokens** | [**List&lt;TokenInfo&gt;**](TokenInfo.md) | The enabled tokens. |  |
|**contractAddress** | **String** | The token&#39;s contract address on the specified blockchain. |  |
|**walletSubtype** | **WalletSubtype** |  |  |
|**token** | [**TokenInfo**](TokenInfo.md) |  |  [optional] |
|**feedback** | **String** | The feedback provided by Cobo when a token listing request is rejected. |  [optional] |
|**address** | **String** | The screened blockchain address. |  |
|**walletUuid** | **UUID** | The wallet ID. |  |
|**balance** | [**Balance**](Balance.md) |  |  |
|**tokenIds** | **String** | A list of token IDs, separated by comma. |  |
|**operationType** | **SuspendedTokenOperationType** |  |  |
|**orderId** | **String** | The pay-in order ID. |  |
|**merchantId** | **String** | The merchant ID. |  [optional] |
|**merchantOrderCode** | **String** | A unique reference code assigned by the merchant to identify this order in their system. |  [optional] |
|**pspOrderCode** | **String** | A unique reference code assigned by the developer to identify this order in their system. |  |
|**pricingCurrency** | **String** | The pricing currency of the order. |  [optional] |
|**pricingAmount** | **String** | The base amount of the order, excluding the developer fee (specified in &#x60;fee_amount&#x60;). |  [optional] |
|**feeAmount** | **String** | The developer fee for the order. It is added to the base amount to determine the final charge. |  |
|**payableCurrency** | **String** | The ID of the cryptocurrency used for payment. |  [optional] |
|**payableAmount** | **String** | The cryptocurrency amount to be paid for this order. |  |
|**exchangeRate** | **String** | The exchange rate between &#x60;payable_currency&#x60; and &#x60;pricing_currency&#x60;, calculated as (&#x60;pricing_amount&#x60; + &#x60;fee_amount&#x60;) / &#x60;payable_amount&#x60;.    &lt;Note&gt;This field is only returned when &#x60;payable_amount&#x60; was not provided in the order creation request. &lt;/Note&gt;  |  |
|**amountTolerance** | **String** | The allowed amount deviation, with precision up to 1 decimal place.  For example, if &#x60;payable_amount&#x60; is &#x60;100.00&#x60; and &#x60;amount_tolerance&#x60; is &#x60;0.50&#x60;: - Payer pays 99.55 → Success (difference of 0.45 ≤ 0.5) - Payer pays 99.40 → Underpaid (difference of 0.60 &gt; 0.5)  |  [optional] |
|**receiveAddress** | **String** | The recipient wallet address to be used for the payment transaction. |  |
|**receivedTokenAmount** | **String** | The total cryptocurrency amount received for this order. Updates until the expiration time. Precision matches the token standard (e.g., 6 decimals for USDT). |  |
|**expiredAt** | **Integer** | The expiration time of the pay-in order, represented as a UNIX timestamp in seconds. |  [optional] |
|**transactions** | [**List&lt;PaymentTransaction&gt;**](PaymentTransaction.md) | An array of payout transactions. |  [optional] |
|**currency** | **String** | The fiat currency for the off-ramp. |  [optional] |
|**orderAmount** | **String** | This field has been deprecated. Please use &#x60;pricing_amount&#x60; instead. |  [optional] |
|**settlementStatus** | **SettleStatus** |  |  [optional] |
|**refundId** | **String** | The refund order ID. |  |
|**amount** | **String** | The transaction amount. |  |
|**toAddress** | **String** | The recipient&#39;s wallet address where the refund will be sent. |  |
|**refundType** | **RefundType** |  |  [optional] |
|**chargeMerchantFee** | **Boolean** | Whether to charge developer fee to the merchant for the refund.    - &#x60;true&#x60;: The fee amount (specified in &#x60;merchant_fee_amount&#x60;) will be deducted from the merchant&#39;s balance and added to the developer&#39;s balance    - &#x60;false&#x60;: The merchant is not charged any developer fee.  |  [optional] |
|**merchantFeeAmount** | **String** | The developer fee amount to charge the merchant, denominated in the cryptocurrency specified by &#x60;merchant_fee_token_id&#x60;. This is only applicable if &#x60;charge_merchant_fee&#x60; is set to &#x60;true&#x60;. |  [optional] |
|**merchantFeeTokenId** | **String** | The ID of the cryptocurrency used for the developer fee. This is only applicable if &#x60;charge_merchant_fee&#x60; is set to true. |  [optional] |
|**commissionFee** | [**CommissionFee**](CommissionFee.md) | The commission fee. Not returned when no fee has been incurred, the actual charged amount once incurred, or &#x60;0&#x60; if refunded. |  [optional] |
|**settlementRequestId** | **String** | The settlement request ID generated by Cobo. |  |
|**settlements** | [**List&lt;SettlementDetail&gt;**](SettlementDetail.md) |  |  |
|**acquiringType** | **AcquiringType** |  |  |
|**payoutChannel** | **PayoutChannel** |  |  |
|**settlementType** | **SettlementType** |  |  [optional] |
|**receivedAmountFiat** | **String** | The estimated amount of the fiat currency to receive after off-ramping. This amount is subject to change due to bank transfer fees. |  [optional] |
|**bankAccount** | [**BankAccount**](BankAccount.md) |  |  [optional] |
|**payerId** | **String** | A unique identifier assigned by Cobo to track and identify individual payers. |  |
|**customPayerId** | **String** | A unique identifier assigned by the developer to track and identify individual payers in their system. |  |
|**subscriptionId** | **String** | A unique identifier assigned by Cobo to track and identify subscription. |  [optional] |
|**actionId** | **String** | A unique identifier assigned by Cobo to track and identify subscription action. |  [optional] |
|**chain** | **String** | The chain ID. |  |
|**previousAddress** | **String** | The previous top-up address that was assigned to the payer. |  |
|**updatedAddress** | **String** | The new top-up address that has been assigned to the payer. |  |
|**payoutId** | **String** | The payout ID generated by Cobo. |  |
|**sourceAccount** | **String** | The source account of the balance change. This field uses the same semantics as &#x60;source_account&#x60; in [List balance changes](https://www.cobo.com/developers/v2/api-references/payment/list-balance-changes). - When the account is a merchant account, this is the merchant ID (merchant code), which you can retrieve by calling [List all merchants](https://www.cobo.com/developers/v2/api-references/payment/list-all-merchants). - When the account is the developer account, use &#x60;developer&#x60;.  |  |
|**payoutItems** | [**List&lt;PaymentPayoutItem&gt;**](PaymentPayoutItem.md) | required |  [optional] |
|**recipientInfo** | [**PaymentPayoutRecipientInfo**](PaymentPayoutRecipientInfo.md) |  |  [optional] |
|**actualPayoutAmount** | **String** | - For &#x60;Crypto&#x60; payouts: The amount of cryptocurrency sent to the recipient&#39;s address, denominated in the token specified in &#x60;recipient_info.token_id&#x60;. - For &#x60;OffRamp&#x60; payouts: The amount of fiat currency sent to the recipient&#39;s bank account, denominated in the currency specified in &#x60;recipient_info.currency&#x60;. (Note: The actual amount received may be lower due to additional bank transfer fees.)  |  [optional] |
|**commissionFees** | [**List&lt;CommissionFee&gt;**](CommissionFee.md) | The commission fees. Not returned when no fee has been incurred, the actual charged amounts once incurred, or &#x60;0&#x60; if refunded. |  [optional] |
|**remark** | **String** | A note or comment about the payout. |  [optional] |
|**bulkSendId** | **String** | The bulk send ID. |  |
|**executionMode** | **PaymentBulkSendExecutionMode** |  |  |
|**sourceId** | **String** | The source ID of the balance change. |  |
|**sourceType** | **PaymentBalanceChangeSourceType** |  |  |
|**amountRaw** | **String** | The balance change amount in the token&#39;s decimal precision, represented as a numeric string. |  |
|**balanceBefore** | **String** | The account balance before the balance change, truncated to two decimal places and represented as a numeric string. |  |
|**balanceBeforeRaw** | **String** | The account balance before the balance change in the token&#39;s decimal precision, represented as a numeric string. |  |
|**balanceAfter** | **String** | The account balance after the balance change, truncated to two decimal places and represented as a numeric string. |  |
|**balanceAfterRaw** | **String** | The account balance after the balance change in the token&#39;s decimal precision, represented as a numeric string. |  |
|**flowDirection** | **PaymentBalanceFlowDirection** |  |  |
|**updateTime** | **Long** | The time when the balance was updated, represented as a UNIX timestamp in seconds. |  |
|**dispositionType** | **DispositionType** |  |  |
|**dispositionStatus** | **DispositionStatus** |  |  |
|**destinationAddress** | **String** | The blockchain address to receive the refunded/isolated funds. |  [optional] |
|**dispositionAmount** | **String** | The amount to be refunded/isolated from the original transaction, specified as a numeric string. This value cannot exceed the total amount of the original transaction.  |  [optional] |
|**transactionType** | **FeeStationFiatTransactionType** |  |  |
|**reviewStatus** | **ReviewStatusType** |  |  |
|**fundsStatus** | **FundsStatusType** |  |  |
|**screeningId** | **UUID** | The unique system-generated identifier for this screening request (UUID format, fixed 36 characters). |  |
|**orgId** | **UUID** | The organization ID. |  [optional] |
|**mainTransactionId** | **UUID** | The UUID of the parent (main) transaction that this record is associated with. Set only when the current record is a gas/fee transaction initiated by FeeStation; omit for main transactions. |  [optional] |
|**fiatCurrency** | **String** | The fiat currency of the transaction. Possible values include:   - &#x60;USD&#x60;: US Dollar.  |  |
|**modifiedTimestamp** | **Long** | The time when the transaction was last modified, in Unix timestamp format, measured in milliseconds. |  [optional] |



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
| PAYMENTPAYOUT | &quot;PaymentPayout&quot; |
| PAYMENTBULKSEND | &quot;PaymentBulkSend&quot; |
| PAYMENTACCOUNTBALANCEUPDATE | &quot;PaymentAccountBalanceUpdate&quot; |
| BALANCEUPDATEINFO | &quot;BalanceUpdateInfo&quot; |
| SUSPENDEDTOKEN | &quot;SuspendedToken&quot; |
| COMPLIANCEDISPOSITION | &quot;ComplianceDisposition&quot; |
| COMPLIANCEKYTSCREENINGS | &quot;ComplianceKytScreenings&quot; |
| COMPLIANCEKYASCREENINGS | &quot;ComplianceKyaScreenings&quot; |
| ORGANIZATION | &quot;Organization&quot; |
| FIATTRANSACTION | &quot;FiatTransaction&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;Created&quot; |
| SUCCEEDED | &quot;Succeeded&quot; |



