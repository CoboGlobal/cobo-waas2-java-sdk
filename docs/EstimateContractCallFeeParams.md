

# EstimateContractCallFeeParams

The information about a transaction that interacts with a smart contract

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. It is recommended to use the same request ID as the transaction for which you want to estimate the transaction fee. |  [optional] |
|**requestType** | **EstimateFeeRequestType** |  |  |
|**chainId** | **String** | The chain ID of the chain on which the smart contract is deployed. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). |  |
|**source** | [**ContractCallSource**](ContractCallSource.md) |  |  |
|**destination** | [**ContractCallDestination**](ContractCallDestination.md) |  |  |
|**feeType** | **FeeType** |  |  [optional] |
|**replacedTransactionId** | **UUID** | The ID of the transaction that this transaction replaced. |  [optional] |



