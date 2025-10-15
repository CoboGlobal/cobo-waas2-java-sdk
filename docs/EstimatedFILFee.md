

# EstimatedFILFee

The estimated transaction fee based on the FIL fee model.  For more details about the FIL fee model, see [Fee models](https://www.cobo.com/developers/v2/guides/transactions/estimate-fees#fee-models). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token used to pay the transaction fee. |  |
|**slow** | [**EstimatedFILFeeSlow**](EstimatedFILFeeSlow.md) |  |  [optional] |
|**recommended** | [**EstimatedFILFeeSlow**](EstimatedFILFeeSlow.md) |  |  |
|**fast** | [**EstimatedFILFeeSlow**](EstimatedFILFeeSlow.md) |  |  [optional] |



