

# PaymentOrderEventData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  The data type of the event. - &#x60;Transaction&#x60;: The transaction event data. - &#x60;TSSRequest&#x60;: The TSS request event data. - &#x60;Addresses&#x60;: The addresses event data. - &#x60;WalletInfo&#x60;: The wallet information event data. - &#x60;MPCVault&#x60;: The MPC vault event data. - &#x60;Chains&#x60;: The enabled chain event data. - &#x60;Tokens&#x60;: The enabled token event data. - &#x60;TokenListing&#x60;: The token listing event data.        - &#x60;PaymentOrder&#x60;: The payment order event data. - &#x60;PaymentRefund&#x60;: The payment refund event data. - &#x60;PaymentSettlement&#x60;: The payment settlement event data. - &#x60;PaymentTransaction&#x60;: The payment transaction event data. - &#x60;PaymentAddressUpdate&#x60;: The top-up address update event data. - &#x60;BalanceUpdateInfo&#x60;: The balance update event data. - &#x60;SuspendedToken&#x60;: The token suspension event data. - &#x60;ComplianceDisposition&#x60;: The compliance disposition event data. - &#x60;ComplianceKytScreenings&#x60;: The compliance KYT screenings event data. |  |
|**orderId** | **String** | The order ID. |  |
|**merchantId** | **String** | The merchant ID. |  [optional] |
|**tokenId** | **String** |  The ID of the cryptocurrency used for payment. Supported tokens:  - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDCOIN&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC2&#x60;, &#x60;BSC_USDC&#x60; - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**chainId** | **String** |  The ID of the blockchain network where the payment transaction should be made. Supported chains:  - USDC: &#x60;ETH&#x60;, &#x60;ARBITRUM&#x60;, &#x60;SOL&#x60;, &#x60;BASE&#x60;, &#x60;MATIC&#x60;, &#x60;BSC&#x60; - USDT: &#x60;TRON&#x60;, &#x60;ETH&#x60;, &#x60;ARBITRUM&#x60;, &#x60;SOL&#x60;, &#x60;BASE&#x60;, &#x60;MATIC&#x60;, &#x60;BSC&#x60;  |  |
|**payableAmount** | **String** | The cryptocurrency amount to be paid for this order. |  |
|**receiveAddress** | **String** | The recipient wallet address to be used for the payment transaction. |  |
|**currency** | **String** | The fiat currency of the order. |  |
|**orderAmount** | **String** | The base amount of the order in fiat currency, excluding the developer fee (specified in &#x60;fee_amount&#x60;). |  |
|**feeAmount** | **String** | The developer fee for the order in fiat currency. It is added to the base amount (&#x60;order_amount&#x60;) to determine the final charge. |  |
|**exchangeRate** | **String** | The exchange rate between a currency pair. Expressed as the amount of fiat currency per one unit of cryptocurrency. For example, if the cryptocurrency is USDT and the fiat currency is USD, a rate of \&quot;0.99\&quot; means 1 USDT &#x3D; 0.99 USD. |  |
|**expiredAt** | **Integer** | The expiration time of the pay-in order, represented as a UNIX timestamp in seconds. |  [optional] |
|**merchantOrderCode** | **String** | A unique reference code assigned by the merchant to identify this order in their system. |  [optional] |
|**pspOrderCode** | **String** | A unique reference code assigned by the developer to identify this order in their system. |  |
|**status** | **OrderStatus** |  |  |
|**receivedTokenAmount** | **String** | The total cryptocurrency amount received for this order. Updates until the expiration time. Precision matches the token standard (e.g., 6 decimals for USDT). |  |
|**createdTimestamp** | **Integer** | The creation time of the order, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The last update time of the order, represented as a UNIX timestamp in seconds. |  [optional] |
|**transactions** | [**List&lt;PaymentTransaction&gt;**](PaymentTransaction.md) | An array of transactions associated with this pay-in order. Each transaction represents a separate blockchain operation related to the pay-in process. |  [optional] |
|**settlementStatus** | **SettleStatus** |  |  [optional] |
|**amountTolerance** | **String** | The maximum allowed deviation from the payable amount in the case of underpayment, specified as a positive value with up to one decimal place. If you provide more than one decimal place, an error will occur.  When the actual received amount is within this deviation (inclusive) of the payable amount, the order status will be set to &#x60;Completed&#x60; rather than &#x60;Underpaid&#x60;.  |  [optional] |



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
| COMPLIANCEDISPOSITION | &quot;ComplianceDisposition&quot; |
| COMPLIANCEKYTSCREENINGS | &quot;ComplianceKytScreenings&quot; |



