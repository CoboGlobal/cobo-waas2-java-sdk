

# EstimatedEvmLegacyFee

The estimated transaction fee based on the Legacy fee model.  For more details about the Legacy fee model, see [Fee models](https://www.cobo.com/developers/v2/guides/transactions/estimate-fees#fee-models). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token used to pay the transaction fee. |  |
|**slow** | [**EstimatedEvmLegacyFeeSlow**](EstimatedEvmLegacyFeeSlow.md) |  |  [optional] |
|**recommended** | [**EstimatedEvmLegacyFeeSlow**](EstimatedEvmLegacyFeeSlow.md) |  |  |
|**fast** | [**EstimatedEvmLegacyFeeSlow**](EstimatedEvmLegacyFeeSlow.md) |  |  [optional] |



