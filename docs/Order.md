

# Order


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | The order ID. |  |
|**merchantId** | **String** | The merchant ID. |  [optional] |
|**merchantOrderCode** | **String** | A unique reference code assigned by the merchant to identify this order in their system. |  [optional] |
|**pspOrderCode** | **String** | A unique reference code assigned by the developer to identify this order in their system. |  |
|**pricingCurrency** | **String** | The pricing currency of the order. |  [optional] |
|**pricingAmount** | **String** | The base amount of the order, excluding the developer fee (specified in &#x60;fee_amount&#x60;). |  [optional] |
|**feeAmount** | **String** | The developer fee for the order. It is added to the base amount to determine the final charge. |  |
|**payableCurrency** | **String** | The ID of the cryptocurrency used for payment. |  [optional] |
|**chainId** | **String** | The ID of the blockchain network where the payment transaction should be made. |  |
|**payableAmount** | **String** | The cryptocurrency amount to be paid for this order. |  |
|**exchangeRate** | **String** | The exchange rate between &#x60;payable_currency&#x60; and &#x60;pricing_currency&#x60;, calculated as (&#x60;pricing_amount&#x60; + &#x60;fee_amount&#x60;) / &#x60;payable_amount&#x60;.    &lt;Note&gt;This field is only returned when &#x60;payable_amount&#x60; was not provided in the order creation request. &lt;/Note&gt;  |  |
|**amountTolerance** | **String** | The allowed amount deviation, with precision up to 1 decimal place.  For example, if &#x60;payable_amount&#x60; is &#x60;100.00&#x60; and &#x60;amount_tolerance&#x60; is &#x60;0.50&#x60;: - Payer pays 99.55 → Success (difference of 0.45 ≤ 0.5) - Payer pays 99.40 → Underpaid (difference of 0.60 &gt; 0.5)  |  [optional] |
|**receiveAddress** | **String** | The recipient wallet address to be used for the payment transaction. |  |
|**status** | **OrderStatus** |  |  |
|**receivedTokenAmount** | **String** | The total cryptocurrency amount received for this order. Updates until the expiration time. Precision matches the token standard (e.g., 6 decimals for USDT). |  |
|**expiredAt** | **Integer** | The expiration time of the pay-in order, represented as a UNIX timestamp in seconds. |  [optional] |
|**createdTimestamp** | **Integer** | The created time of the order, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The updated time of the order, represented as a UNIX timestamp in seconds. |  [optional] |
|**transactions** | [**List&lt;PaymentTransaction&gt;**](PaymentTransaction.md) | An array of transactions associated with this pay-in order. Each transaction represents a separate blockchain operation related to the settlement process. |  [optional] |
|**currency** | **String** | This field has been deprecated. Please use &#x60;pricing_currency&#x60; instead. |  [optional] |
|**orderAmount** | **String** | This field has been deprecated. Please use &#x60;pricing_amount&#x60; instead. |  [optional] |
|**tokenId** | **String** | This field has been deprecated. Please use &#x60;payable_currency&#x60; instead. |  [optional] |
|**settlementStatus** | **SettleStatus** |  |  [optional] |



