

# CosmosContractCallDestination

The information about the transaction destination. Refer to [Transaction sources and destinations](https://www.cobo.com/developers/v2/guides/transactions/sources-and-destinations) for a detailed introduction about the supported sources and destinations for each transaction type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **ContractCallDestinationType** |  |  |
|**cosmosMessages** | [**List&lt;CosmosContractCallMessage&gt;**](CosmosContractCallMessage.md) |  |  |
|**value** | **String** | The transfer amount. For example, if you trade 1.5 ETH, then the value is &#x60;1.5&#x60;.  |  [optional] |



