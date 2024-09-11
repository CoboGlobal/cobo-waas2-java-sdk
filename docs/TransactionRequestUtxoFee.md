

# TransactionRequestUtxoFee

The preset properties to limit transaction fee.  In the UTXO fee model, the transaction fee is calculated by multiplying the fee rate by the transaction size. This can be expressed as: Transaction fee = fee rate * transaction size.   You can specify the maximum fee amount to limit the transaction fee. The transaction will fail if the transaction fee exceeds the specified maximum fee amount.  Switch between the tabs to display the properties for different transaction fee models. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeRate** | **String** | The fee rate in sat/vByte. The fee rate represents the satoshis you are willing to pay for each byte of data that your transaction will consume on the blockchain. |  |
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token ID of the transaction fee. |  |
|**maxFeeAmount** | **String** | The maximum fee that you are willing to pay for the transaction. The transaction will fail if the transaction fee exceeds the maximum fee. |  [optional] |



