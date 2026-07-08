

# EstimatedFee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token used to pay the transaction fee. |  |
|**isLoop** | **Boolean** | Whether the transaction was executed as a [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop) transfer. - &#x60;true&#x60;: The transaction was executed as a Cobo Loop transfer. - &#x60;false&#x60;: The transaction was not executed as a Cobo Loop transfer.  |  [optional] |
|**feeAmount** | **String** | The transaction fee that you need to pay for the transaction. |  |
|**slow** | [**EstimatedFILFeeSlow**](EstimatedFILFeeSlow.md) |  |  [optional] |
|**recommended** | [**EstimatedFILFeeSlow**](EstimatedFILFeeSlow.md) |  |  |
|**fast** | [**EstimatedFILFeeSlow**](EstimatedFILFeeSlow.md) |  |  [optional] |



