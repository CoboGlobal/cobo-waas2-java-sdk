

# TransactionRequestFee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token ID of the transaction fee. |  |
|**maxFeeAmount** | **String** | The maximum fee that you are willing to pay for the transaction. Provide the value without applying precision. The transaction will fail if the transaction fee exceeds the maximum fee. |  [optional] |
|**gasLimit** | **String** | This defines the maximum amount of computational effort that a transaction is allowed to consume. It&#39;s a way to cap the resources that a transaction can use, ensuring it doesn&#39;t consume excessive network resources. |  [optional] |
|**maxFeePerGas** | **String** | The maximum gas fee per gas unit used on the chain, in wei. |  |
|**maxPriorityFeePerGas** | **String** | The maximum priority fee per gas unit used, in wei. The maximum priority fee represents the highest amount of miner tips that you are willing to pay for your transaction. |  |
|**gasPrice** | **String** | The gas price, in wei. The gas price represents the amount of ETH that must be paid to validators for processing transactions per gas unit used. |  |
|**feeRate** | **String** | The fee rate in sat/vByte. The fee rate represents the satoshis you are willing to pay for each byte of data that your transaction will consume on the blockchain. |  [optional] |
|**computeUnitPrice** | **String** | The cost per compute unit. Transactions consume computational resources measured in compute units, and this price helps determine the cost of executing transactions, especially complex ones involving smart contracts. |  |
|**computeUnitLimit** | **String** | The maximum number of compute units allowed for a transaction. This limits the resources any single transaction can consume, preventing excessive resource usage that could impact network performance negatively. |  |
|**gasPremium** | **String** | An optional additional fee that users can include to prioritize their transactions over others. It acts like a tip to incentivize miners to select and include your transaction over transactions with only the base fee. |  |
|**gasFeeCap** | **String** | The gas_fee_cap is a user-defined limit on how much they are willing to pay per unit of gas. |  |



