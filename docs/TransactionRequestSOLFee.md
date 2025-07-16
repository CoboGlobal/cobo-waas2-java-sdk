

# TransactionRequestSOLFee

The preset properties to limit transaction fee.  In the Solana fee model, the transaction fee is calculated by adding the base fee to the product of the compute unit limit and the compute unit price. This can be expressed as: Transaction fee = base fee + (CU limit * CU price). For more information about the Solana fee model, refer to [Fee models](https://www.cobo.com/developers/v2/guides/transactions/estimate-fees#fee-models).  You can specify CU price and CU limit to adjust the priority and resource allocation of your transaction.  Switch between the tabs to display the properties for different transaction fee models. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**computeUnitPrice** | **String** | The price paid per compute unit. This value determines the priority fee for the transaction, allowing you to increase inclusion probability in congested conditions. |  |
|**computeUnitLimit** | **String** | The maximum number of compute units your transaction is allowed to consume. It sets an upper bound on computational resource usage to prevent overload. |  |
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token used to pay the transaction fee. |  |



