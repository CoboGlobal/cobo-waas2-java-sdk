

# TransactionFee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token ID of the transaction fee. |  [optional] |
|**effectiveGasPrice** | **String** | The gas price (gas fee per gas unit) on the chain, in wei. The gas price represents the amount of ETH that must be paid to validators for processing transactions. |  [optional] |
|**feeUsed** | **String** | The transaction fee. |  [optional] |
|**estimatedFeeUsed** | **String** | The estimated transaction fee. |  [optional] |
|**gasUsed** | **String** | The gas units used in the transaction. |  [optional] |
|**maxFeePerGas** | **String** | The maximum gas fee per gas unit used on the chain, in wei. |  [optional] |
|**maxPriorityFeePerGas** | **String** | The maximum priority fee per gas unit used, in wei. The maximum priority fee represents the highest amount of miner tips that you are willing to pay for your transaction. |  [optional] |
|**gasLimit** | **String** | This defines the maximum amount of computational effort that a transaction is allowed to consume. It&#39;s a way to cap the resources that a transaction can use, ensuring it doesn&#39;t consume excessive network resources. |  [optional] |
|**gasPrice** | **String** | The gas price, in wei. The gas price represents the amount of ETH that must be paid to validators for processing transactions per gas unit used. |  [optional] |
|**maxFeeAmount** | **String** | The maximum fee that you are willing to pay for the transaction. Provide the value without applying precision. The transaction will fail if the transaction fee exceeds the maximum fee. |  [optional] |
|**feeRate** | **String** | The fee rate in sat/vByte. The fee rate represents the satoshis you are willing to pay for each byte of data that your transaction will consume on the blockchain. |  [optional] |
|**baseFee** | **String** | The fundamental fee required for each transaction. It is charged to prevent spam transactions and network congestion, ensuring that only meaningful transactions consume network resources. |  [optional] |
|**rentAmount** | **String** | The fee charged as rent for maintaining the state of accounts on the blockchain. This rent ensures accounts are stored on-chain over the long term and that there&#39;s sufficient balance to sustain the account state. |  [optional] |
|**computeUnitPrice** | **String** | The cost per compute unit. Transactions consume computational resources measured in compute units, and this price helps determine the cost of executing transactions, especially complex ones involving smart contracts. |  [optional] |
|**computeUnitLimit** | **String** | The maximum number of compute units allowed for a transaction. This limits the resources any single transaction can consume, preventing excessive resource usage that could impact network performance negatively. |  [optional] |
|**gasBase** | **String** | This is the minimum fee required to include a transaction in a block. It is determined by the network&#39;s congestion level, which adjusts to maintain a target block utilization rate. The base fee is burned, reducing the total supply of Filecoin over time. |  [optional] |
|**gasPremium** | **String** | An optional additional fee that users can include to prioritize their transactions over others. It acts like a tip to incentivize miners to select and include your transaction over transactions with only the base fee. |  [optional] |
|**gasFeeCap** | **String** | The gas_fee_cap is a user-defined limit on how much they are willing to pay per unit of gas. |  [optional] |



