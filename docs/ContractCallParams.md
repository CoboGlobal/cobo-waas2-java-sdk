

# ContractCallParams

The information about a transaction that interacts with a smart contract

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. |  |
|**chainId** | **String** | The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). |  |
|**source** | [**ContractCallSource**](ContractCallSource.md) |  |  |
|**destination** | [**ContractCallDestination**](ContractCallDestination.md) |  |  |
|**description** | **String** | The description of the contract call transaction. |  [optional] |
|**categoryNames** | **List&lt;String&gt;** | The custom category for you to identify your transactions. |  [optional] |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  [optional] |
|**transactionProcessType** | **TransactionProcessType** |  |  [optional] |
|**autoFuel** | **AutoFuelType** |  |  [optional] |



