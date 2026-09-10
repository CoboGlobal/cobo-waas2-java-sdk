

# PaymentRefundEventData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  The data type of the event. - &#x60;Transaction&#x60;: The transaction event data. - &#x60;TSSRequest&#x60;: The TSS request event data. - &#x60;Addresses&#x60;: The addresses event data. - &#x60;WalletInfo&#x60;: The wallet information event data. - &#x60;MPCVault&#x60;: The MPC vault event data. - &#x60;Chains&#x60;: The enabled chain event data. - &#x60;Tokens&#x60;: The enabled token event data. - &#x60;TokenListing&#x60;: The token listing event data.        - &#x60;PaymentOrder&#x60;: The payment order event data. - &#x60;PaymentRefund&#x60;: The payment refund event data. - &#x60;PaymentSettlement&#x60;: The payment settlement event data. - &#x60;PaymentTransaction&#x60;: The payment transaction event data. - &#x60;PaymentAddressUpdate&#x60;: The payment address update event data. - &#x60;PaymentPayout&#x60;: The payment payout event data. - &#x60;PaymentBankWithdrawal&#x60;: The payment bank withdrawal event data. - &#x60;PaymentBulkSend&#x60;: The payment bulk send event data. - &#x60;PaymentBulkSendItem&#x60;: The payment bulk send item event data. - &#x60;PaymentTopUpUpdate&#x60;: The payment top-up update event data. - &#x60;PaymentOrderUpdate&#x60;: The payment order update event data. - &#x60;PaymentRefundUpdate&#x60;: The payment refund update event data. - &#x60;PaymentPayoutUpdate&#x60;: The payment payout update event data. - &#x60;PaymentBulkSendUpdate&#x60;: The payment bulk send update event data. - &#x60;PaymentBulkSendItemUpdate&#x60;: The payment bulk send item update event data. - &#x60;PaymentAccountBalanceUpdate&#x60;: The Payments account balance updated event data, including account information and balance change details. - &#x60;BalanceUpdateInfo&#x60;: The balance update event data. - &#x60;SuspendedToken&#x60;: The suspended token event data. - &#x60;ComplianceDisposition&#x60;: The compliance disposition event data. - &#x60;ComplianceKytScreenings&#x60;: The compliance KYT screenings event data. - &#x60;ComplianceKyaScreenings&#x60;: The compliance KYA screenings event data. - &#x60;Organization&#x60;: The organization event data. - &#x60;FiatTransaction&#x60;: The fiat transaction event data. |  |
|**requestId** | **String** | The request ID provided by you when creating the refund request. |  [optional] |
|**refundId** | **String** | The refund order ID. |  |
|**orderId** | **String** | The order ID corresponding to this refund. |  [optional] |
|**merchantId** | **String** | The merchant ID. |  [optional] |
|**tokenId** | **String** | The ID of the cryptocurrency used for refund. |  |
|**chainId** | **String** | The ID of the blockchain network on which the refund transaction occurs. |  |
|**amount** | **String** | The amount in cryptocurrency to be returned for this refund order. |  |
|**toAddress** | **String** | The recipient&#39;s wallet address where the refund will be sent. |  |
|**status** | **RefundStatus** |  |  |
|**failedReason** | **String** | The reason why the refund failed. |  [optional] |
|**refundType** | **RefundType** |  |  [optional] |
|**createdTimestamp** | **Integer** | The created time of the refund order, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The updated time of the refund order, represented as a UNIX timestamp in seconds. |  [optional] |
|**initiator** | **String** | The initiator of this refund order, usually the user&#39;s API key. |  [optional] |
|**transactions** | [**List&lt;PaymentTransaction&gt;**](PaymentTransaction.md) | An array of transactions associated with this refund order. Each transaction represents a separate blockchain operation related to the refund process. |  [optional] |
|**chargeMerchantFee** | **Boolean** | Whether to charge developer fee to the merchant.  - &#x60;true&#x60;: The fee amount (specified in &#x60;merchant_fee_amount&#x60;) will be deducted from the merchant&#39;s balance and added to the developer&#39;s balance - &#x60;false&#x60;: The merchant is not charged any developer fee.  |  [optional] |
|**merchantFeeAmount** | **String** | The developer fee amount to charge the merchant, denominated in the cryptocurrency specified by &#x60;merchant_fee_token_id&#x60;. |  [optional] |
|**merchantFeeTokenId** | **String** | The ID of the cryptocurrency used for the developer fee. |  [optional] |
|**commissionFee** | [**CommissionFee**](CommissionFee.md) | The commission fee. Not returned when no fee has been incurred, the actual charged amount once incurred, or &#x60;0&#x60; if refunded. |  [optional] |



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
| PAYMENTSUBSCRIPTIONUPDATE | &quot;PaymentSubscriptionUpdate&quot; |
| PAYMENTCHARGEUPDATE | &quot;PaymentChargeUpdate&quot; |
| PAYMENTPAYOUT | &quot;PaymentPayout&quot; |
| PAYMENTBANKWITHDRAWAL | &quot;PaymentBankWithdrawal&quot; |
| PAYMENTBULKSEND | &quot;PaymentBulkSend&quot; |
| PAYMENTBULKSENDITEM | &quot;PaymentBulkSendItem&quot; |
| PAYMENTTOPUPUPDATE | &quot;PaymentTopUpUpdate&quot; |
| PAYMENTORDERUPDATE | &quot;PaymentOrderUpdate&quot; |
| PAYMENTREFUNDUPDATE | &quot;PaymentRefundUpdate&quot; |
| PAYMENTPAYOUTUPDATE | &quot;PaymentPayoutUpdate&quot; |
| PAYMENTBULKSENDUPDATE | &quot;PaymentBulkSendUpdate&quot; |
| PAYMENTBULKSENDITEMUPDATE | &quot;PaymentBulkSendItemUpdate&quot; |
| PAYMENTACCOUNTBALANCEUPDATE | &quot;PaymentAccountBalanceUpdate&quot; |
| BALANCEUPDATEINFO | &quot;BalanceUpdateInfo&quot; |
| SUSPENDEDTOKEN | &quot;SuspendedToken&quot; |
| COMPLIANCEDISPOSITION | &quot;ComplianceDisposition&quot; |
| COMPLIANCEKYTSCREENINGS | &quot;ComplianceKytScreenings&quot; |
| COMPLIANCEKYASCREENINGS | &quot;ComplianceKyaScreenings&quot; |
| ORGANIZATION | &quot;Organization&quot; |
| FIATTRANSACTION | &quot;FiatTransaction&quot; |



