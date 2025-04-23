

# CreateRefundRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a refund request. The request ID is provided by you and must be unique. |  |
|**merchantId** | **String** | The merchant ID. |  [optional] |
|**payableAmount** | **String** | The amount to refund in cryptocurrency. |  |
|**toAddress** | **String** | The address where the refunded cryptocurrency will be sent. |  |
|**tokenId** | **String** | The ID of the cryptocurrency used for refund. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**refundType** | **RefundType** |  |  |
|**orderId** | **String** | The ID of the original pay-in order associated with this refund. Use this to track refunds against specific payments. |  [optional] |



