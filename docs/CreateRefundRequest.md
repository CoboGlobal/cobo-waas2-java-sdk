

# CreateRefundRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a refund request. The request ID is provided by you and must be unique. |  |
|**merchantId** | **String** | The merchant ID. |  [optional] |
|**payableAmount** | **String** | The amount to refund in cryptocurrency. |  |
|**toAddress** | **String** | The address where the refunded cryptocurrency will be sent. |  [optional] |
|**tokenId** | **String** | The ID of the cryptocurrency used for refund. Supported values:    - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60;   - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**refundType** | **RefundType** |  |  |
|**orderId** | **String** | The ID of the original pay-in order associated with this refund. Use this to track refunds against specific payments. |  [optional] |
|**chargeMerchantFee** | **Boolean** | Indicates whether the merchant should bear the transaction fee for the refund.  If true, the fee will be deducted from merchant&#39;s account balance.  |  [optional] |
|**merchantFeeAmount** | **String** | The amount of the transaction fee that the merchant will bear for the refund.  This is only applicable if &#x60;charge_merchant_fee&#x60; is set to true.  |  [optional] |
|**merchantFeeTokenId** | **String** | The ID of the cryptocurrency used for the transaction fee.  This is only applicable if &#x60;charge_merchant_fee&#x60; is set to true.  |  [optional] |



