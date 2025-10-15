

# SwapQuote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quoteId** | **String** | The unique identifier of the swap quote. |  |
|**payTokenId** | **String** | The ID of the token to pay. |  |
|**payAmount** | **String** | The amount of the token to pay. |  |
|**receiveTokenId** | **String** | The ID of the token to receive. |  |
|**receiveAmount** | **String** | The amount of the token to receive. |  |
|**feeTokenId** | **String** | The ID of the token for the service fee. |  |
|**feeAmount** | **String** | The amount of the token for the service fee. |  |
|**minReceiveAmount** | **String** | The minimum amount of the token to receive if &#x60;pay_amount&#x60; is specified. |  [optional] |
|**maxPayAmount** | **String** | The maximum amount of the token to pay if &#x60;receive_amount&#x60; is specified. |  [optional] |
|**quoteExpiredTimestamp** | **Integer** | The time when the swap quote expires, in Unix timestamp format, measured in milliseconds. |  |



