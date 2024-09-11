

# TransactionEvmLegacyFee

The transaction fee actually charged by the chain that uses the legacy fee model.   The transaction fee is calculated by multiplying the gas price by the used gas. This can be expressed as: Transaction fee = gas price * used gas units.  Switch between the tabs to display the properties for different transaction fee models. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gasPrice** | **String** | The gas price, in wei. The gas price represents the amount of ETH that must be paid to validators for processing transactions per gas unit used. |  [optional] |
|**gasLimit** | **String** | The gas limit. It represents the maximum number of gas units that you are willing to pay for the execution of a transaction or Ethereum Virtual Machine (EVM) operation. The gas unit cost of each operation varies. |  [optional] |
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token ID of the transaction fee. |  [optional] |
|**feeUsed** | **String** | The transaction fee. |  [optional] |
|**gasUsed** | **String** | The gas units used in the transaction. |  [optional] |



