

# TransactionFee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token used to pay the transaction fee. |  [optional] |
|**effectiveGasPrice** | **String** | The gas price (gas fee per gas unit) on the chain, in wei. The gas price represents the amount of ETH that must be paid to validators for processing transactions. |  [optional] |
|**feeUsed** | **String** | The actually charged transaction fee. |  [optional] |
|**estimatedFeeUsed** | **String** | The estimated transaction fee. |  [optional] |
|**gasUsed** | **String** | The gas units used in the transaction. |  [optional] |
|**maxFeePerGas** | **String** | The maximum gas fee per gas unit used on the chain, in wei. |  [optional] |
|**maxPriorityFeePerGas** | **String** | The maximum priority fee per gas unit used, in wei. The maximum priority fee represents the highest amount of miner tips that you are willing to pay for your transaction. |  [optional] |
|**gasLimit** | **String** | The maximum amount of gas your transaction is allowed to consume. |  [optional] |
|**gasPrice** | **String** | The gas price, in wei. The gas price represents the amount of ETH that must be paid to validators for processing transactions per gas unit used. |  [optional] |
|**maxFeeAmount** | **String** | The maximum fee that you are willing to pay for the transaction. Provide the value without applying precision. The transaction will fail if the transaction fee exceeds the maximum fee. |  [optional] |
|**feeRate** | **String** | The fee rate in sat/vByte. The fee rate represents the satoshis you are willing to pay for each byte of data that your transaction will consume on the blockchain. |  [optional] |
|**baseFee** | **String** | A fixed fee charged per signature. The default is 5,000 lamports per signature. |  [optional] |
|**rentAmount** | **String** | The rent fee charged by the network to store non–rent-exempt accounts on-chain. It is deducted periodically until the account maintains the minimum balance required for rent exemption. |  [optional] |
|**computeUnitPrice** | **String** | The price paid per compute unit. This value determines the priority fee for the transaction, allowing you to increase inclusion probability in congested conditions. |  [optional] |
|**computeUnitLimit** | **String** | The maximum number of compute units your transaction is allowed to consume. It sets an upper bound on computational resource usage to prevent overload. |  [optional] |
|**gasBase** | **String** | The minimum fee required for a transaction to be included in a block. The base fee is dynamically adjusted based on network congestion to maintain target block utilization. It is burned rather than paid to miners, reducing the total Filecoin supply over time. |  [optional] |
|**gasPremium** | **String** | An optional tip you can include to prioritize your transaction. The gas premium incentivizes miners to include your transaction sooner than those offering only the base fee. |  [optional] |
|**gasFeeCap** | **String** | The maximum gas price you are willing to pay per unit of gas. |  [optional] |



