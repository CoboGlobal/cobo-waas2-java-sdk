

# CreatePaymentOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The merchant ID. |  |
|**merchantOrderCode** | **String** | A unique reference code assigned by the merchant to identify this order in their system. |  [optional] |
|**pspOrderCode** | **String** | A unique reference code assigned by the developer to identify this order in their system. |  |
|**pricingCurrency** | **String** | The pricing currency that denominates &#x60;pricing_amount&#x60; and &#x60;fee_amount&#x60;. If left empty, both values will be denominated in &#x60;payable_currency&#x60;.  Currently, For a complete list of supported currencies, see [Supported chains and tokens](https://www.cobo.com//payments/en/guides/supported-chains-and-tokens#pricing-currency).  |  [optional] |
|**pricingAmount** | **String** | The base amount of the order, excluding the developer fee (specified in &#x60;fee_amount&#x60;). Values must be greater than &#x60;0&#x60; and contain two decimal places. |  [optional] |
|**feeAmount** | **String** | The developer fee for the order. It is added to the base amount (&#x60;pricing_amount&#x60;) to determine the final charge. For example, if &#x60;pricing_amount&#x60; is \&quot;100.00\&quot; and &#x60;fee_amount&#x60; is \&quot;2.00\&quot;, the payer will be charged \&quot;102.00\&quot; in total, with \&quot;100.00\&quot; being settled to the merchant account and \&quot;2.00\&quot; settled to the developer account. Values must be greater than 0 and contain two decimal places. |  |
|**payableCurrency** | **String** | The ID of the cryptocurrency used for payment. Supported values:   - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**payableAmount** | **String** | The total amount the payer needs to pay, denominated in the specified &#x60;payable_currency&#x60;. If this field is left blank, the system will automatically calculate the amount at order creation using the following formula: (&#x60;pricing_amount&#x60; + &#x60;fee_amount&#x60;) / current exchange rate.  Values must be greater than 0 and contain two decimal places.  |  [optional] |
|**expiredIn** | **Integer** | The number of seconds until the pay-in order expires, counted from when the request is sent. For example, if set to &#x60;1800&#x60;, the order will expire in 30 minutes. Must be greater than zero and cannot exceed 3 hours (10800 seconds). After expiration:  - The order status becomes final and cannot be changed - The &#x60;received_token_amount&#x60; field will no longer be updated - Funds received after expiration will be categorized as late payments and can only be settled from the developer balance. - A late payment will trigger a &#x60;transactionLate&#x60; webhook event.  |  [optional] |
|**amountTolerance** | **String** | The allowed amount deviation, with precision up to 1 decimal place.  For example, if &#x60;payable_amount&#x60; is &#x60;100.00&#x60; and &#x60;amount_tolerance&#x60; is &#x60;0.50&#x60;: - Payer pays 99.55 → Success (difference of 0.45 ≤ 0.5) - Payer pays 99.40 → Underpaid (difference of 0.60 &gt; 0.5)  |  [optional] |
|**currency** | **String** | This field has been deprecated. Please use &#x60;pricing_currency&#x60; instead. |  [optional] |
|**orderAmount** | **String** | This field has been deprecated. Please use &#x60;pricing_amount&#x60; instead. |  [optional] |
|**tokenId** | **String** | This field has been deprecated. Please use &#x60;payable_currency&#x60; instead. |  [optional] |
|**useDedicatedAddress** | **Boolean** | This field has been deprecated. |  [optional] |
|**customExchangeRate** | **String** | This field has been deprecated. |  [optional] |



