

# Refund


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID provided by you when creating the refund request. |  [optional] |
|**refundId** | **String** | The refund order ID. |  |
|**merchantId** | **String** | The merchant ID. |  [optional] |
|**tokenId** | **String** | The ID of the cryptocurrency used for refund. |  |
|**chainId** | **String** | The ID of the blockchain network on which the refund transaction occurs. |  |
|**amount** | **String** | The amount in cryptocurrency to be returned for this refund order. |  |
|**toAddress** | **String** | The recipient&#39;s wallet address where the refund will be sent. |  |
|**status** | **RefundStatus** |  |  |
|**transactions** | [**List&lt;PaymentTransaction&gt;**](PaymentTransaction.md) | An array of transactions associated with this refund order. Each transaction represents a separate blockchain operation related to the refund process. |  [optional] |



