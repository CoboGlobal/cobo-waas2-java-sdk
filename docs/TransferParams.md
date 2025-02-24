

# TransferParams

The information about a token transfer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. |  |
|**source** | [**TransferSource**](TransferSource.md) |  |  |
|**tokenId** | **String** | The token ID of the transferred token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). For transfers from Exchange Wallets, this property value represents the asset ID. |  |
|**destination** | [**TransferDestination**](TransferDestination.md) |  |  |
|**categoryNames** | **List&lt;String&gt;** | The custom category for you to identify your transactions. |  [optional] |
|**description** | **String** | The description of the transfer. |  [optional] |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  [optional] |
|**transactionProcessType** | [**TransactionProcessTypeEnum**](#TransactionProcessTypeEnum) | Transaction processing type. Possible values are: - &#x60;AutoProcess&#x60; (default): After the transaction is constructed, it will be automatically signed and broadcast.   - &#x60;BuildOnly&#x60;: Set to this value if you want to build the transaction first without automatically signing and broadcasting it. You can manually call the [Sign and broadcast transaction](https://www.cobo.com/developers/v2/api-references/transactions/sign-and-broadcast-transaction) operation to complete the signing and broadcasting process.  |  [optional] |
|**autoFuel** | **AutoFuelType** |  |  [optional] |



## Enum: TransactionProcessTypeEnum

| Name | Value |
|---- | -----|
| AUTOPROCESS | &quot;AutoProcess&quot; |
| BUILDONLY | &quot;BuildOnly&quot; |



