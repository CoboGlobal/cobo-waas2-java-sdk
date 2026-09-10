

# BatchLimitsAndLiquidityResult

Swap limits and liquidity result for a single pay/receive token pair.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payTokenId** | **String** | Unique id of the token to pay, echoed back from the request item. |  |
|**receiveTokenId** | **String** | Unique id of the token to receive, echoed back from the request item. |  |
|**minPayAmount** | **String** | The minimum amount of pay token that can be swapped. |  [optional] |
|**maxPayAmount** | **String** | The maximum amount of pay token that can be swapped. |  [optional] |
|**minGetAmount** | **String** | The minimum amount of receive token that can be swapped. |  [optional] |
|**maxGetAmount** | **String** | The maximum amount of receive token that can be swapped. |  [optional] |
|**availableLiquidityPayToken** | **String** | The available liquidity denominated in pay token. |  [optional] |
|**availableLiquidityUsd** | **String** | The available liquidity denominated in USD. |  [optional] |



