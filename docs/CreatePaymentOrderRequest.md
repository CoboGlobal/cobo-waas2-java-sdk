

# CreatePaymentOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The unique identifier of the merchant. |  |
|**tokenId** | **String** | Cryptocurrency token used for payment (e.g., USDT, BTC, ETH). |  |
|**fiatCurrency** | **String** | The fiat currency for the order. |  [optional] |
|**fiatAmount** | **String** | The fiat amount of the order. |  |
|**feeFiatAmount** | **String** | Transaction fee in fiat currency. |  |
|**merchantOrderCode** | **String** | The merchant-provided order identifier. |  [optional] |
|**pspOrderCode** | **String** | The PSP-provided order identifier. |  |
|**expiredAt** | **Integer** | Expiration time in UNIX timestamp. |  [optional] |



