

# EstimatedUtxoFee

The estimated transaction fee for UTXO-based chains.  For more details about the UTXO fee model, see [Fee models](https://www.cobo.com/developers/v2/guides/transactions/estimate-fees#fee-models). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token used to pay the transaction fee. |  |
|**slow** | [**EstimatedUtxoFeeSlow**](EstimatedUtxoFeeSlow.md) |  |  [optional] |
|**recommended** | [**EstimatedUtxoFeeSlow**](EstimatedUtxoFeeSlow.md) |  |  |
|**fast** | [**EstimatedUtxoFeeSlow**](EstimatedUtxoFeeSlow.md) |  |  [optional] |



