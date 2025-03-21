

# TransactionMessageSignEIP712Destination

Information about the transaction destination type `EVM_EIP_712_Signature`. Refer to [Transaction sources and destinations](https://www.cobo.com/developers/v2/guides/transactions/sources-and-destinations) for a detailed introduction about the supported sources and destinations for each transaction type.  Switch between the tabs to display the properties for different transaction destinations. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **TransactionDestinationType** |  |  |
|**rawStructuredData** | **String** | The raw structured data to be signed, formatted as a JSON string. |  [optional] |
|**structuredData** | **Map&lt;String, Object&gt;** | The structured data to be signed, formatted as a JSON object according to the EIP-712 standard. |  |
|**safeTxExtraData** | [**SafeTxExtraData**](SafeTxExtraData.md) |  |  [optional] |



