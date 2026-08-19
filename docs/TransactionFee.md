

# TransactionFee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token ID of the transaction fee. |  [optional] |
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
|**rentAmount** | **String** | The one-time rent required to activate a Solana token Associated Token Account (ATA) before the token can be received or used. **This field is reserved for future use and is currently not populated.** |  [optional] |
|**computeUnitPrice** | **String** | The price paid per compute unit. This value determines the priority fee for the transaction, allowing you to increase inclusion probability in congested conditions. |  [optional] |
|**computeUnitLimit** | **String** | The maximum number of compute units your transaction is allowed to consume. It sets an upper bound on computational resource usage to prevent overload. |  [optional] |
|**gasBase** | **String** | This is the minimum fee required to include a transaction in a block. It is determined by the network&#39;s congestion level, which adjusts to maintain a target block utilization rate. The base fee is burned, reducing the total supply of Filecoin over time. |  [optional] |
|**gasPremium** | **String** | An optional additional fee that users can include to prioritize their transactions over others. It acts like a tip to incentivize miners to select and include your transaction over transactions with only the base fee. |  [optional] |
|**gasFeeCap** | **String** | The gas_fee_cap is a user-defined limit on how much they are willing to pay per unit of gas. |  [optional] |



