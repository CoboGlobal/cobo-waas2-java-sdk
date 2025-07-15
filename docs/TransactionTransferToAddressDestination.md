

# TransactionTransferToAddressDestination

Information about the transaction destination type `Address`. Refer to [Transaction sources and destinations](https://www.cobo.com/developers/v2/guides/transactions/sources-and-destinations) for a detailed introduction about the supported sources and destinations for each transaction type.  Switch between the tabs to display the properties for different transaction destinations. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **TransactionDestinationType** |  |  |
|**accountOutput** | [**TransactionTransferToAddressDestinationAccountOutput**](TransactionTransferToAddressDestinationAccountOutput.md) |  |  [optional] |
|**utxoOutputs** | [**List&lt;TransactionTransferToAddressDestinationUtxoOutputsInner&gt;**](TransactionTransferToAddressDestinationUtxoOutputsInner.md) |  |  [optional] |
|**changeAddress** | **String** | The address used to receive the remaining funds or change from the transaction. |  [optional] |
|**forceInternal** | **Boolean** | Whether the transaction request must be executed as a [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop) transfer.   - &#x60;true&#x60;: The transaction request must be executed as a Cobo Loop transfer.   - &#x60;false&#x60;: The transaction request may not be executed as a Cobo Loop transfer.  |  [optional] |
|**forceExternal** | **Boolean** | Whether the transaction request must not be executed as a [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop) transfer.   - &#x60;true&#x60;: The transaction request must not be executed as a Cobo Loop transfer.   - &#x60;false&#x60;: The transaction request can be executed as a Cobo Loop transfer.  |  [optional] |



