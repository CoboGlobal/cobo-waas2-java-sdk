

# TransactionSOLFee

The transaction fee actually charged by the chain that uses the SOL fee model.  In the SOL fee model, the calculation method for the fee is: fee = base_fee + compute_unit_price * compute_unit_limit + rent_amount, refer to [Fee models](https://www.cobo.com/developers/v2/guides/transactions/estimate-fees#fee-models).  Switch between the tabs to display the properties for different transaction fee models. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseFee** | **String** | The fundamental fee required for each transaction. It is charged to prevent spam transactions and network congestion, ensuring that only meaningful transactions consume network resources. |  [optional] |
|**rentAmount** | **String** | The fee charged as rent for maintaining the state of accounts on the blockchain. This rent ensures accounts are stored on-chain over the long term and that there&#39;s sufficient balance to sustain the account state. |  [optional] |
|**computeUnitPrice** | **String** | The cost per compute unit. Transactions consume computational resources measured in compute units, and this price helps determine the cost of executing transactions, especially complex ones involving smart contracts. |  [optional] |
|**computeUnitLimit** | **String** | The maximum number of compute units allowed for a transaction. This limits the resources any single transaction can consume, preventing excessive resource usage that could impact network performance negatively. |  [optional] |
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token ID of the transaction fee. |  [optional] |
|**feeUsed** | **String** | The transaction fee. |  [optional] |
|**estimatedFeeUsed** | **String** | The estimated transaction fee. |  [optional] |



