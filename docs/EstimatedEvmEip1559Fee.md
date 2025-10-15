

# EstimatedEvmEip1559Fee

The estimated transaction fee based on the EIP-1559 fee model.  For more details about the EIP-1559 fee model, see [Fee models](https://www.cobo.com/developers/v2/guides/transactions/estimate-fees#fee-models). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token used to pay the transaction fee. |  |
|**slow** | [**EstimatedEvmEip1559FeeSlow**](EstimatedEvmEip1559FeeSlow.md) |  |  [optional] |
|**recommended** | [**EstimatedEvmEip1559FeeSlow**](EstimatedEvmEip1559FeeSlow.md) |  |  |
|**fast** | [**EstimatedEvmEip1559FeeSlow**](EstimatedEvmEip1559FeeSlow.md) |  |  [optional] |



