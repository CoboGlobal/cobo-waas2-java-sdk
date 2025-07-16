

# TransactionRequestFILFee

The preset properties to limit transaction fee.  In the Filecoin fee model, the transaction fee is calculated using the minimum of your specified gas fee cap and the sum of the base fee and gas premium, then multiplied by the gas limit. This can be expressed as: Transaction fee = min(gas fee cap, base fee + gas premium) * gas limit. For more information about the Filecoin fee model, refer to [Fee models](https://www.cobo.com/developers/v2/guides/transactions/estimate-fees#fee-models).  You can specify the gas fee cap, gas premium, and gas limit to control fee behavior and prioritization.  Switch between the tabs to display the properties for different transaction fee models. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gasPremium** | **String** | An optional tip you can include to prioritize your transaction. The gas premium incentivizes miners to include your transaction sooner than those offering only the base fee. |  |
|**gasFeeCap** | **String** | The maximum gas price you are willing to pay per unit of gas. |  |
|**gasLimit** | **String** | The maximum amount of gas your transaction is allowed to consume. |  [optional] |
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token used to pay the transaction fee. |  |



