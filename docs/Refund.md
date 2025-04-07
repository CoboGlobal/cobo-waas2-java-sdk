

# Refund


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request id. |  [optional] |
|**refundId** | **String** | The refund order ID. |  |
|**merchantId** | **String** | The merchant ID. |  [optional] |
|**tokenId** | **String** | The ID of the cryptocurrency token used for refund. |  |
|**chainId** | **String** | The ID of the blockchain network on which the refund transaction occurs. |  |
|**amount** | **String** | The amount in cryptocurrency to be returned for this refund order. |  |
|**toAddress** | **String** | The recipient&#39;s wallet address where the refund will be sent. |  |
|**status** | **RefundStatus** |  |  |
|**transactions** | [**List&lt;PaymentTransaction&gt;**](PaymentTransaction.md) |  |  [optional] |



