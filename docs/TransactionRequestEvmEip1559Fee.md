

# TransactionRequestEvmEip1559Fee

The preset properties to limit transaction fee.  In the EIP-1559 fee model, the transaction fee is calculated by multiplying the gas price and the gas units used by the transaction. This can be expressed as: Transaction fee = gas price * gas units used.   You can specify the maximum gas fee per gas unit, maximum priority fee per gas unit, and the gas limit to limit the gas price, priority fee per gas unit, gas units used in the transaction.   Switch between the tabs to display the properties for different transaction fee models. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxFeePerGas** | **String** | The maximum gas fee per gas unit used on the chain, in wei. |  |
|**maxPriorityFeePerGas** | **String** | The maximum priority fee per gas unit used, in wei. The maximum priority fee represents the highest amount of miner tips that you are willing to pay for your transaction. |  |
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token ID of the transaction fee. |  |
|**gasLimit** | **String** | The gas limit. It represents the maximum number of gas units that you are willing to pay for the execution of a transaction or Ethereum Virtual Machine (EVM) operation. The gas unit cost of each operation varies. |  [optional] |



