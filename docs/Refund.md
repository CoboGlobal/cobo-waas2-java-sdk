

# Refund


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID provided by you when creating the refund request. |  [optional] |
|**refundId** | **String** | The refund order ID. |  |
|**orderId** | **String** | The order ID corresponding to this refund. |  [optional] |
|**merchantId** | **String** | The merchant ID. |  [optional] |
|**tokenId** | **String** | The ID of the cryptocurrency used for refund. |  |
|**chainId** | **String** | The ID of the blockchain network on which the refund transaction occurs. |  |
|**amount** | **String** | The amount in cryptocurrency to be returned for this refund order. |  |
|**toAddress** | **String** | The recipient&#39;s wallet address where the refund will be sent. |  |
|**status** | **RefundStatus** |  |  |
|**refundType** | **RefundType** |  |  [optional] |
|**createdTimestamp** | **Integer** | The created time of the refund order, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The updated time of the refund order, represented as a UNIX timestamp in seconds. |  [optional] |
|**initiator** | **String** | The initiator of this refund order, usually the user&#39;s API key. |  [optional] |
|**transactions** | [**List&lt;PaymentTransaction&gt;**](PaymentTransaction.md) | An array of transactions associated with this refund order. Each transaction represents a separate blockchain operation related to the refund process. |  [optional] |



