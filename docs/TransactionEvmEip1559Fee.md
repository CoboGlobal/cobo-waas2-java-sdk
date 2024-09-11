

# TransactionEvmEip1559Fee

The transaction fee actually charged by the chain that uses the EIP-1559 fee model.   The transaction fee is calculated by multiplying the gas price by the used gas units. This can be expressed as: Transaction fee = gas price * used gas units.  Switch between the tabs to display the properties for different transaction fee models. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxFeePerGas** | **String** | The maximum gas fee per gas unit used on the chain, in wei. |  [optional] |
|**maxPriorityFeePerGas** | **String** | The maximum priority fee per gas unit used, in wei. The maximum priority fee represents the highest amount of miner tips that you are willing to pay for your transaction. |  [optional] |
|**gasLimit** | **String** | The gas limit. It represents the maximum number of gas units that you are willing to pay for the execution of a transaction or Ethereum Virtual Machine (EVM) operation. The gas unit cost of each operation varies. |  [optional] |
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token ID of the transaction fee. |  [optional] |
|**effectiveGasPrice** | **String** | The gas price (gas fee per gas unit) on the chain, in wei. The gas price represents the amount of ETH that must be paid to validators for processing transactions. |  [optional] |
|**feeUsed** | **String** | The transaction fee. |  [optional] |
|**gasUsed** | **String** | The number of gas units used in the transaction. |  [optional] |



