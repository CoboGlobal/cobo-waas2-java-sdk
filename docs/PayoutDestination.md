

# PayoutDestination


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | The destination address. |  |
|**amount** | **String** | The amount of cryptocurrency to send to the destination. |  |
|**email** | **String** | The email of the destination. |  [optional] |
|**note** | **String** | The note of the destination. |  [optional] |
|**loopEnabled** | **Boolean** | Enable loop mode for standard transfers when source is asset wallet. Only applicable when: - &#x60;payout_mode&#x60; is &#x60;Normal&#x60; - &#x60;source_type&#x60; is asset wallet  |  [optional] |
|**networkFee** | [**PayoutFeeData**](PayoutFeeData.md) |  |  [optional] |



