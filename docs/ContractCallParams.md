

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
|**transactionProcessType** | [**TransactionProcessTypeEnum**](#TransactionProcessTypeEnum) | Transaction processing type. Possible values are: - &#x60;AutoProcess&#x60; (default): After the transaction is constructed, it will be automatically signed and broadcast.   - &#x60;BuildOnly&#x60;: Set to this value if you want to build the transaction first without automatically signing and broadcasting it. You can manually call the [Sign and broadcast transaction](https://www.cobo.com/developers/v2/api-references/transactions/sign-and-broadcast-transaction) operation to complete the signing and broadcasting process.  |  [optional] |
|**autoFuel** | **AutoFuelType** |  |  [optional] |



## Enum: TransactionProcessTypeEnum

| Name | Value |
|---- | -----|
| AUTOPROCESS | &quot;AutoProcess&quot; |
| BUILDONLY | &quot;BuildOnly&quot; |



