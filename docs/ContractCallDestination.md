

# ContractCallDestination


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **ContractCallDestinationType** |  |  |
|**address** | **String** | The destination address. |  |
|**value** | **String** | The transfer amount. For example, if you trade 1.5 ETH, then the value is &#x60;1.5&#x60;.  |  [optional] |
|**calldata** | **String** | The data that is used to invoke a specific function or method within the specified contract at the destination address.  |  |
|**instructions** | [**List&lt;SolContractCallInstruction&gt;**](SolContractCallInstruction.md) |  |  |
|**contractParam** | [**StellarContractCallContractParam**](StellarContractCallContractParam.md) |  |  |



