

# TransactionRequestFILFee

The preset properties to limit transaction fee.  In the Fil fee model, the calculation method for the fee is: fee = gas_fee_cap * gas_limit, refer to [Fee models](https://www.cobo.com/developers/v2/guides/transactions/estimate-fees#fee-models).  Switch between the tabs to display the properties for different transaction fee models. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gasPremium** | **String** | An optional additional fee that users can include to prioritize their transactions over others. It acts like a tip to incentivize miners to select and include your transaction over transactions with only the base fee. |  |
|**gasFeeCap** | **String** | The gas_fee_cap is a user-defined limit on how much they are willing to pay per unit of gas. |  |
|**gasLimit** | **String** | This defines the maximum amount of computational effort that a transaction is allowed to consume. It&#39;s a way to cap the resources that a transaction can use, ensuring it doesn&#39;t consume excessive network resources. |  [optional] |
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token ID of the transaction fee. |  |



