

# TransactionRequestEvmLegacyFee

The preset properties to limit transaction fee.  In the legacy fee model, the transaction fee is calculated by multiplying the gas price by the gas units used by the transaction. This can be expressed as: Transaction fee =  (gas price * gas units used).   You can specify the gas limit to limit the gas units used in the transaction.  Switch between the tabs to display the properties for different transaction fee models. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gasPrice** | **String** | The gas price, in wei. The gas price represents the amount of ETH that must be paid to validators for processing transactions per gas unit used. |  |
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token ID of the transaction fee. |  |
|**gasLimit** | **String** | The gas limit. It represents the maximum number of gas units that you are willing to pay for the execution of a transaction or Ethereum Virtual Machine (EVM) operation. The gas unit cost of each operation varies. |  [optional] |



