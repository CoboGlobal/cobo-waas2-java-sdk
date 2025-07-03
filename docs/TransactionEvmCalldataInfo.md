

# TransactionEvmCalldataInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chainId** | **String** | The ID of the chain on which the smart contract is issued. |  [optional] |
|**address** | **String** | The address of the smart contract. |  [optional] |
|**name** | **String** | The name of the smart contract. |  [optional] |
|**implAddress** | **String** | The address of the implementation smart contract. This property is applicable only when the specified smart contract is a proxy contract. |  [optional] |
|**implName** | **String** | The name of the implementation smart contract. This property is applicable only when the specified smart contract is a proxy contract. |  [optional] |
|**proxy** | **Boolean** | Whether the specified smart contract address is a proxy contract. - &#x60;true&#x60;: The specified smart contract address is a proxy contract. - &#x60;false&#x60;: The specified smart contract address is not a proxy contract.  |  [optional] |
|**method** | [**TransactionEvmContractMethod**](TransactionEvmContractMethod.md) |  |  [optional] |
|**params** | **String** | The parameters of the contract method are represented as a JSON array of arrays. Each element in the outer array is itself an array containing three elements that provide detailed information about a specific parameter: - Parameter name: The unique identifier of the parameter, such as &#x60;kind&#x60;, &#x60;swaps&#x60;, and &#x60;to&#x60;. - Parameter type: The Solidity data type of the parameter, such as &#x60;uint8&#x60;, &#x60;tuple[]&#x60;, &#x60;address[]&#x60;, and &#x60;int256[]&#x60;. - Parameter value: The actual value of the parameter. If the parameter type is a basic type such as &#x60;uint256&#x60; or &#x60;address&#x60;, this value is a single element. If the parameter type is a complex type such as &#x60;tuple[]&#x60; or &#x60;address[]&#x60;, the value is a nested array, with each inner array containing parameter names, types, and values.  |  [optional] |



