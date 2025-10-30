

# OrderLinkBusinessInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenIds** | **List&lt;String&gt;** | An array of token IDs representing the cryptocurrencies and chains available for payment. These options will be shown to users on the payment page for them to choose from. Supported token IDs include:   - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDCOIN&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC2&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**customExchangeRates** | [**List&lt;OrderLinkBusinessInfoCustomExchangeRatesInner&gt;**](OrderLinkBusinessInfoCustomExchangeRatesInner.md) | A list of custom exchange rates defining how much one unit of a specific cryptocurrency (&#x60;token_id&#x60;) is valued in the selected fiat or crypto currency (&#x60;currency&#x60;). If this field is omitted, the system’s default exchange rates will apply.  Each item specifies a &#x60;token_id&#x60; and its corresponding &#x60;exchange_rate&#x60;. For example, to treat 1 USDT (on Ethereum) as equivalent to 0.99 USD, provide:  &#x60;&#x60;&#x60;json {   \&quot;custom_exchange_rates\&quot;: [     {       \&quot;token_id\&quot;: \&quot;ETH_USDT\&quot;,       \&quot;exchange_rate\&quot;: \&quot;0.99\&quot;     }   ],   \&quot;currency\&quot;: \&quot;USD\&quot; } &#x60;&#x60;&#x60;  |  [optional] |
|**currency** | **String** | The currency in which both the order amount (&#x60;order_amount&#x60;) and the developer fee (&#x60;fee_amount&#x60;) are denominated. Only the following values are supported: &#x60;USD&#x60;, &#x60;USDT&#x60;, or &#x60;USDC&#x60;.  |  |
|**feeAmount** | **String** | The developer fee for the order, denominated in the currency specified by &#x60;currency&#x60;.   If you are a merchant directly serving payers, set this field to &#x60;0&#x60;. Developer fees are only relevant for platforms like payment service providers (PSPs) that charge fees to their downstream merchants.  The developer fee is added to the base amount (&#x60;order_amount&#x60;) to determine the final charge. For example: - Base amount (&#x60;order_amount&#x60;): \&quot;100.00\&quot; - Developer fee (&#x60;fee_amount&#x60;): \&quot;2.00\&quot;  - Total charged to customer: \&quot;102.00\&quot;  Values can contain up to two decimal places.  |  |
|**merchantId** | **String** | The merchant ID. |  |
|**orderAmount** | **String** | The base amount of the order, excluding the developer fee (specified in &#x60;fee_amount&#x60;), denominated in the currency specified by &#x60;currency&#x60;.  Values must be greater than &#x60;0&#x60; and contain two decimal places.   |  |
|**merchantOrderCode** | **String** | A unique reference code assigned by the merchant to identify this order in their system. The code should have a maximum length of 128 characters. |  [optional] |
|**pspOrderCode** | **String** | A unique reference code assigned by you as a developer to identify this order in your system. This code must be unique across all orders in your system. The code should have a maximum length of 128 characters.  |  |
|**expiredIn** | **Integer** | The number of seconds until the pay-in order expires, counted from when the request is sent. For example, if set to &#x60;1800&#x60;, the order will expire in 30 minutes. Must be greater than zero and cannot exceed 3 hours (10800 seconds). After expiration:  - The order status becomes final and cannot be changed - The &#x60;received_token_amount&#x60; field will no longer be updated - Funds received after expiration will be categorized as late payments and can only be settled from the developer balance. - A late payment will trigger a &#x60;transactionLate&#x60; webhook event.  |  [optional] |
|**useDedicatedAddress** | **Boolean** | This field has been deprecated.  |  [optional] |
|**amountTolerance** | **String** | The maximum allowed deviation from the payable amount in the case of underpayment, specified as a positive value with up to one decimal place. If you provide more than one decimal place, an error will occur.  When the actual received amount is within this deviation (inclusive) of the payable amount, the order status will be set to &#x60;Completed&#x60; rather than &#x60;Underpaid&#x60;.  |  [optional] |



