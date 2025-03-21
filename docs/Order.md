

# Order


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | The unique ID of the order. |  |
|**merchantId** | **String** | The unique identifier of the merchant. |  [optional] |
|**tokenId** | **String** | Cryptocurrency token used for payment. |  |
|**chainId** | **String** | Blockchain network where the token is being transferred. |  |
|**amount** | **String** | The amount of cryptocurrency to be paid. |  |
|**receiveAddress** | **String** | Wallet address where the payment should be sent. |  |
|**fiatCurrency** | **String** | The fiat currency of the order. |  |
|**fiatAmount** | **String** | The fiat amount of the order. |  |
|**feeFiatAmount** | **String** | Transaction fee in fiat currency. |  |
|**fiatRate** | **String** | The conversion rate between the token and fiat currency. |  |
|**expiredAt** | **Integer** | Expiration time in UNIX timestamp. |  [optional] |
|**merchantOrderCode** | **String** | The merchant-provided order code. |  [optional] |
|**pspOrderCode** | **String** | The PSP-provided order code. |  |
|**status** | **OrderStatus** |  |  |
|**receivedTokenAmount** | **String** | The actual amount of tokens received for the order. |  |



