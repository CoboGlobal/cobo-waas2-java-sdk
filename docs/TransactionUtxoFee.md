

# TransactionUtxoFee

The transaction fee actually charged by the chain that uses the UTXO fee model, such as Bitcoin.  The transaction fee is calculated by multiplying the fee rate by the transaction size. This can be expressed as: Transaction fee = fee rate * transaction size.  Switch between the tabs to display the properties for different transaction fee models. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeRate** | **String** | The fee rate in sat/vByte. The fee rate represents the satoshis you are willing to pay for each byte of data that your transaction will consume on the blockchain. |  [optional] |
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token ID of the transaction fee. |  [optional] |
|**feeUsed** | **String** | The transaction fee. |  [optional] |
|**maxFeeAmount** | **String** | The maximum fee that you are willing to pay for the transaction. The transaction will fail if the transaction fee exceeds the maximum fee. |  [optional] |



