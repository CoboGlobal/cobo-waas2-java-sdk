

# CreatePaymentOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The merchant ID. |  |
|**tokenId** | **String** | The ID of the cryptocurrency token used for payment. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**currency** | **String** | The currency of the order. |  [optional] |
|**orderAmount** | **String** | The base amount in currency to be charged for the payment order, excluding the payment gateway fee (specified in &#x60;fee_amount&#x60;). Values must be greater than &#x60;0&#x60; and contain two decimal places. |  |
|**feeAmount** | **String** | The payment gateway fee in currency. It is added to the base amount (&#x60;order_amount&#x60;) to determine the final charge. For example, if order_amount is \&quot;100.00\&quot; and fee_amount is \&quot;2.00\&quot;, the customer will be charged \&quot;102.00\&quot; in total, with \&quot;100.00\&quot; being settled to the merchant and \&quot;2.00\&quot; settled to the payment gateway. Values must be greater than 0 and contain two decimal places. |  |
|**merchantOrderCode** | **String** | A unique reference code assigned by the merchant to identify this order in their system. |  [optional] |
|**pspOrderCode** | **String** | A unique reference code assigned by the payment gateway to identify this order in their system. |  |
|**expiredAt** | **Integer** | The expiration time of the payment order, represented as a UNIX timestamp in seconds. After this time: - The order status becomes final and cannot be changed - The &#x60;received_token_amount&#x60; field will no longer be updated - Funds received after expiration will be categorized as late payments and can only be settled from the payment gateway balance. - Late deposits will trigger a &#x60;transactionLate&#x60; webhook event.  |  [optional] |



