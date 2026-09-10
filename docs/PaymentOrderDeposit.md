

# PaymentOrderDeposit


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** | The incoming Payment transaction ID. |  |
|**txHash** | **String** | The blockchain transaction hash. |  |
|**amount** | [**PaymentAssetAmount**](PaymentAssetAmount.md) |  |  |
|**sourceAddress** | **String** | The source address of the incoming transaction. |  |
|**status** | **PaymentPayInStatus** |  |  |
|**screeningMode** | **PaymentScreeningMode** |  |  [optional] |
|**isLate** | **Boolean** | Whether the incoming transaction completed after the order reached a terminal status. |  |
|**message** | **String** | The action prompt for an &#x60;ActionRequired&#x60; status. |  [optional] |
|**failedReason** | [**PaymentFailedReason**](PaymentFailedReason.md) |  |  [optional] |



