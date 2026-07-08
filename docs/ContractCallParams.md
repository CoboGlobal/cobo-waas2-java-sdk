

# ContractCallParams

The information about a transaction that interacts with a smart contract

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | A client-defined unique request identifier (idempotency key) used to prevent duplicate contract call requests. It must be unique within the same organization. Requests with the same request ID will be rejected with an error. |  |
|**chainId** | **String** | The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). |  |
|**source** | [**ContractCallSource**](ContractCallSource.md) |  |  |
|**destination** | [**ContractCallDestination**](ContractCallDestination.md) |  |  |
|**description** | **String** | The description of the contract call transaction. Maximum length is 2048 characters for MPC Wallets and Custodial Wallets (Web3 Wallets), and 1000 characters for Custodial Wallets (Asset Wallets). |  [optional] |
|**categoryNames** | **List&lt;String&gt;** | The custom category for you to identify your transactions. |  [optional] |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  [optional] |
|**transactionProcessType** | **TransactionProcessType** |  |  [optional] |
|**autoFuel** | **AutoFuelType** |  |  [optional] |
|**preCheck** | [**PreCheck**](PreCheck.md) |  |  [optional] |



