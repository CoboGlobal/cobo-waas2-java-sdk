

# CreatePaymentOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The merchant ID. |  |
|**merchantOrderCode** | **String** | An optional reference for the order maintained by a downstream merchant you serve — for example, when you are a payment service provider (PSP) processing pay-in orders on behalf of merchants. Set this field only when such a downstream merchant supplies its own order reference that is distinct from your internal &#x60;psp_order_code&#x60;. Omit this field if you are collecting payment directly as the merchant, with no separate downstream merchant reference to track. |  [optional] |
|**pspOrderCode** | **String** | The order identifier for your own internal business order. Set this to the order reference you use internally to identify this pay-in — for example, an order or transaction ID from your own order-management system. This value must be unique within your Cobo organization: Cobo enforces uniqueness on &#x60;psp_order_code&#x60;, so reusing a code already associated with an existing order in your organization is rejected. If a downstream merchant you serve supplies its own separate order reference, record that in &#x60;merchant_order_code&#x60; instead — &#x60;psp_order_code&#x60; always identifies your own order, not the merchant&#39;s. |  |
|**pricingCurrency** | **String** | The pricing currency that denominates &#x60;pricing_amount&#x60; and &#x60;fee_amount&#x60;. If left empty, both values will be denominated in &#x60;payable_currency&#x60;.  Currently, For a complete list of supported currencies, see [Supported chains and tokens](https://www.cobo.com//payments/en/guides/supported-chains-and-tokens#pricing-currency).  |  [optional] |
|**pricingAmount** | **String** | The base amount of the order, excluding the developer fee (specified in &#x60;fee_amount&#x60;). Values must be greater than &#x60;0&#x60; and contain two decimal places. |  [optional] |
|**feeAmount** | **String** | The order-level developer charge deducted from the payment collected for this order and credited to your developer balance. Both &#x60;0&#x60; and positive values are valid. A value of &#x60;0&#x60; means that no developer fee is taken and the merchant receives the full collected amount.  When the collected payment exactly matches the payable amount, the merchant balance is credited with the payable amount minus &#x60;fee_amount&#x60;, and your developer balance is credited with &#x60;fee_amount&#x60;. For example, for a payable amount of &#x60;104.08&#x60; and a &#x60;fee_amount&#x60; of &#x60;2&#x60;, the merchant receives &#x60;102.08&#x60; and you receive &#x60;2&#x60;.  For related fee settings and settlement details, see [Merchant management](https://www.cobo.com/payments/en/guides/merchants) and [Accounts and fund allocation](https://www.cobo.com/payments/en/guides/amounts-and-balances).  |  |
|**payableCurrency** | **String** | The ID of the cryptocurrency used for payment. Supported values:   - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**payableAmount** | **String** | The total amount the payer needs to pay, denominated in the specified &#x60;payable_currency&#x60;. If this field is left blank, the system will automatically calculate the amount at order creation using the following formula: (&#x60;pricing_amount&#x60; + &#x60;fee_amount&#x60;) / current exchange rate.  Values must be greater than 0 and contain two decimal places.  |  [optional] |
|**expiredIn** | **Integer** | The number of seconds until the pay-in order expires, counted from when the request is sent. For example, if set to &#x60;1800&#x60;, the order will expire in 30 minutes. Must be greater than zero and cannot exceed 3 hours (10800 seconds). After expiration:  - The order status becomes final and cannot be changed - The &#x60;received_token_amount&#x60; field will no longer be updated - Funds received after expiration will be categorized as late payments and can only be settled from the developer balance. - A late payment will trigger a &#x60;transactionLate&#x60; webhook event.  |  [optional] |
|**amountTolerance** | **String** | The allowed amount deviation, with precision up to 1 decimal place.  For example, if &#x60;payable_amount&#x60; is &#x60;100.00&#x60; and &#x60;amount_tolerance&#x60; is &#x60;0.50&#x60;: - Payer pays 99.55 → Success (difference of 0.45 ≤ 0.5) - Payer pays 99.40 → Underpaid (difference of 0.60 &gt; 0.5)  |  [optional] |
|**currency** | **String** | This field has been deprecated. Please use &#x60;pricing_currency&#x60; instead. |  [optional] |
|**orderAmount** | **String** | This field has been deprecated. Please use &#x60;pricing_amount&#x60; instead. |  [optional] |
|**tokenId** | **String** | This field has been deprecated. Please use &#x60;payable_currency&#x60; instead. |  [optional] |
|**useDedicatedAddress** | **Boolean** | This field has been deprecated. |  [optional] |
|**customExchangeRate** | **String** | This field has been deprecated. |  [optional] |



