

# TransactionRequestFixedFee

The preset properties to limit transaction fee.  In the fixed fee model, the transaction fee is a fixed amount within a certain amount of period regardless of the transaction size or network congestion, which can vary between different chains.  You can specify the maximum fee amount to limit the transaction fee. The transaction will fail if the transaction fee exceeds the specified maximum fee amount.  Switch between the tabs to display the properties for different transaction fee models. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxFeeAmount** | **String** | The maximum fee that you are willing to pay for the transaction. The transaction will fail if the transaction fee exceeds the maximum fee. |  [optional] |
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token ID of the transaction fee. |  |



