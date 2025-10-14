

# OrderLinkBusinessInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenIds** | **List&lt;String&gt;** | List of supported cryptocurrency token IDs for this payment. Each token ID must be from the supported values.  |  |
|**customExchangeRates** | [**List&lt;OrderLinkBusinessInfoCustomExchangeRatesInner&gt;**](OrderLinkBusinessInfoCustomExchangeRatesInner.md) | Optional list of final exchange rates for different tokens. If provided, these rates will be used instead of real-time market rates.  |  [optional] |
|**currency** | **String** | The currency for the base order amount and the developer fee. Currently, only &#x60;USD&#x60;/&#x60;USDT&#x60;/&#x60;USDC&#x60; are supported.  |  |
|**feeAmount** | **String** | The developer fee for the order, in the currency specified by &#x60;currency&#x60;. If &#x60;currency&#x60; is not specified, the fee is in the cryptocurrency specified by &#x60;token_id&#x60;.  If you are a merchant directly serving payers, set this field to &#x60;0&#x60;. Developer fees are only relevant for platforms like payment service providers (PSPs) that charge fees to their downstream merchants.  The developer fee is added to the base amount (&#x60;order_amount&#x60;) to determine the final charge. For example: - Base amount (&#x60;order_amount&#x60;): \&quot;100.00\&quot; - Developer fee (&#x60;fee_amount&#x60;): \&quot;2.00\&quot;  - Total charged to customer: \&quot;102.00\&quot;  Values can contain up to two decimal places.  |  |
|**merchantId** | **String** | The merchant ID. |  |
|**orderAmount** | **String** | The base amount of the order, excluding the developer fee (specified in &#x60;fee_amount&#x60;), in the currency specified by &#x60;currency&#x60;. If &#x60;currency&#x60; is not specified, the amount is in the cryptocurrency specified by &#x60;token_id&#x60;.   Values must be greater than &#x60;0&#x60; and contain two decimal places.   |  |
|**merchantOrderCode** | **String** | A unique reference code assigned by the merchant to identify this order in their system. The code should have a maximum length of 128 characters. |  [optional] |
|**pspOrderCode** | **String** | A unique reference code assigned by you as a developer to identify this order in your system. This code must be unique across all orders in your system. The code should have a maximum length of 128 characters.  |  |
|**expiredIn** | **Integer** | The number of seconds until the pay-in order expires, counted from when the request is sent. For example, if set to &#x60;1800&#x60;, the order will expire in 30 minutes. Must be greater than zero and cannot exceed 3 hours (10800 seconds). After expiration:  - The order status becomes final and cannot be changed - The &#x60;received_token_amount&#x60; field will no longer be updated - Funds received after expiration will be categorized as late payments and can only be settled from the developer balance. - A late payment will trigger a &#x60;transactionLate&#x60; webhook event.  |  [optional] |
|**useDedicatedAddress** | **Boolean** | Whether to allocate a dedicated address for this order.  - &#x60;true&#x60;: A dedicated address will be allocated for this order. - &#x60;false&#x60;: A shared address from the address pool will be used.  |  [optional] |



