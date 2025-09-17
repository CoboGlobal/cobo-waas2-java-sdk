

# CreatePaymentOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The merchant ID. |  |
|**tokenId** | **String** | The ID of the cryptocurrency used for payment. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDCOIN&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC2&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**currency** | **String** | The fiat currency for the base order amount and the developer fee. Currently, only &#x60;USD&#x60; is supported.  If left empty, both &#x60;order_amount&#x60; and &#x60;fee_amount&#x60; will be denominated in the cryptocurrency specified by &#x60;token_id&#x60;  |  [optional] |
|**orderAmount** | **String** |  The base amount of the order, excluding the developer fee (specified in &#x60;fee_amount&#x60;), in the currency specified by &#x60;currency&#x60;. If &#x60;currency&#x60; is not specified, the amount is in the cryptocurrency specified by &#x60;token_id&#x60;.   Values must be greater than &#x60;0&#x60; and contain two decimal places.   |  |
|**feeAmount** | **String** |  The developer fee for the order, in the currency specified by &#x60;currency&#x60;. If &#x60;currency&#x60; is not specified, the fee is in the cryptocurrency specified by &#x60;token_id&#x60;.  If you are a merchant directly serving payers, set this field to &#x60;0&#x60;. Developer fees are only relevant for platforms like payment service providers (PSPs) that charge fees to their downstream merchants.  The developer fee is added to the base amount (&#x60;order_amount&#x60;) to determine the final charge. For example: - Base amount (&#x60;order_amount&#x60;): \&quot;100.00\&quot; - Developer fee (&#x60;fee_amount&#x60;): \&quot;2.00\&quot;  - Total charged to customer: \&quot;102.00\&quot;  Values can contain up to two decimal places.  |  |
|**merchantOrderCode** | **String** | A unique reference code assigned by the merchant to identify this order in their system. The code should have a maximum length of 128 characters. |  [optional] |
|**pspOrderCode** | **String** | A unique reference code assigned by you as a developer to identify this order in your system. This code must be unique across all orders in your system. The code should have a maximum length of 128 characters.  |  |
|**expiredIn** | **Integer** | The number of seconds until the pay-in order expires, counted from when the request is sent. For example, if set to &#x60;1800&#x60;, the order will expire in 30 minutes. Must be greater than zero and cannot exceed 3 hours (10800 seconds). After expiration:  - The order status becomes final and cannot be changed - The &#x60;received_token_amount&#x60; field will no longer be updated - Funds received after expiration will be categorized as late payments and can only be settled from the developer balance. - A late payment will trigger a &#x60;transactionLate&#x60; webhook event.  |  [optional] |
|**useDedicatedAddress** | **Boolean** | Whether to allocate a dedicated address for this order.  - &#x60;true&#x60;: A dedicated address will be allocated for this order. - &#x60;false&#x60;: A shared address from the address pool will be used.  |  [optional] |



