

# TransactionEvmContractDestination

Information about the transaction destination type `EVM_Contract`. Refer to [Transaction sources and destinations](https://www.cobo.com/developers/v2/guides/transactions/sources-and-destinations) for a detailed introduction about the supported sources and destinations for each transaction type.  Switch between the tabs to display the properties for different transaction destinations. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **TransactionDestinationType** |  |  |
|**address** | **String** | The destination address. |  |
|**value** | **String** | The transfer amount. For example, if you trade 1.5 ETH, then the value is &#x60;1.5&#x60;.  |  [optional] |
|**calldata** | **String** | The data that is used to invoke a specific function or method within the specified contract at the destination address.  |  |
|**calldataInfo** | [**TransactionEvmCalldataInfo**](TransactionEvmCalldataInfo.md) |  |  [optional] |



