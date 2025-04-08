

# Order


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | The order ID. |  |
|**merchantId** | **String** | The merchant ID. |  [optional] |
|**tokenId** | **String** | The ID of the cryptocurrency token used for payment. |  |
|**chainId** | **String** | The ID of the blockchain network where the payment transaction should be made. |  |
|**payableAmount** | **String** | The cryptocurrency amount to be paid for this order. |  |
|**receiveAddress** | **String** | The recipient wallet address to be used for the payment transaction. |  |
|**currency** | **String** | The currency of the order. |  |
|**orderAmount** | **String** | The base amount in currency to be charged for the payment order, excluding the payment gateway fee (specified in &#x60;fee_amount&#x60;). |  |
|**feeAmount** | **String** | The payment gateway fee in currency. It is added to the base amount (&#x60;order_amount&#x60;) to determine the final charge. |  |
|**exchangeRate** | **String** | The exchange rate used to convert between currency and cryptocurrency token. Expressed as the amount of currency per one unit of cryptocurrency. For example, if the token is USDT and the currency is USD, a rate of \&quot;0.99\&quot; means 1 USDT &#x3D; 0.99 USD. |  |
|**expiredAt** | **Integer** | The expiration time of the payment order, represented as a UNIX timestamp in seconds. |  [optional] |
|**merchantOrderCode** | **String** | A unique reference code assigned by the merchant to identify this order in their system. |  [optional] |
|**pspOrderCode** | **String** | A unique reference code assigned by the payment gateway to identify this order in their system. |  |
|**status** | **OrderStatus** |  |  |
|**receivedTokenAmount** | **String** | The total cryptocurrency amount received for this order. Updates until order expires. Precision matches the token standard (e.g., 6 decimals for USDT). |  |



