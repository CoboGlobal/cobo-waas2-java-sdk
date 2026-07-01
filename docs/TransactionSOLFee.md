

# TransactionSOLFee

The transaction fee actually charged by the chain that uses the Solana fee model.  For more details about the Solana fee model, see [Fee models](https://www.cobo.com/developers/v2/guides/transactions/estimate-fees#fee-models).  Switch between the tabs to display the properties for different transaction fee models. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseFee** | **String** | A fixed fee charged per signature. The default is 5,000 lamports per signature. |  [optional] |
|**rentAmount** | **String** | The one-time rent required to activate a Solana token Associated Token Account (ATA) before the token can be received or used. **This field is reserved for future use and is currently not populated.** |  [optional] |
|**computeUnitPrice** | **String** | The price paid per compute unit. This value determines the priority fee for the transaction, allowing you to increase inclusion probability in congested conditions. |  [optional] |
|**computeUnitLimit** | **String** | The maximum number of compute units your transaction is allowed to consume. It sets an upper bound on computational resource usage to prevent overload. |  [optional] |
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token used to pay the transaction fee. |  [optional] |
|**feeUsed** | **String** | The actual on-chain network transaction fee charged for this Solana transaction. This covers the network fee only and does not include ATA activation rent. |  [optional] |
|**estimatedFeeUsed** | **String** | The estimated transaction fee. |  [optional] |



