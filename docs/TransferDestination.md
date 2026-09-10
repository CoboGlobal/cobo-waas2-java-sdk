

# TransferDestination


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **TransferDestinationType** |  |  |
|**accountOutput** | [**AddressTransferDestinationAccountOutput**](AddressTransferDestinationAccountOutput.md) |  |  [optional] |
|**utxoOutputs** | [**List&lt;AddressTransferDestinationUtxoOutputsInner&gt;**](AddressTransferDestinationUtxoOutputsInner.md) |  |  [optional] |
|**changeAddress** | **String** | The address used to receive the remaining funds or change from the transaction. |  [optional] |
|**changeOutputType** | [**ChangeOutputTypeEnum**](#ChangeOutputTypeEnum) | The position of the change output in the transaction&#39;s outputs. Possible values are: - &#x60;Last&#x60;: The change output is placed at the end of the transaction&#39;s outputs.   - &#x60;First&#x60;: The change output is placed at the beginning of the transaction&#39;s outputs.  |  [optional] |
|**forceInternal** | **Boolean** | Whether the transaction request must be executed as a [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop) transfer.   - &#x60;true&#x60;: The transaction request must be executed as a Cobo Loop transfer.   - &#x60;false&#x60;: The transaction request may not be executed as a Cobo Loop transfer.    Please do not set both &#x60;force_internal&#x60; and &#x60;force_external&#x60; as &#x60;true&#x60;.  |  [optional] |
|**forceExternal** | **Boolean** | Whether the transaction request must not be executed as a [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop) transfer.   - &#x60;true&#x60;: The transaction request must not be executed as a Cobo Loop transfer.   - &#x60;false&#x60;: The transaction request can be executed as a Cobo Loop transfer.  Please do not set both &#x60;force_internal&#x60; and &#x60;force_external&#x60; as &#x60;true&#x60;.  |  [optional] |
|**walletId** | **UUID** | The wallet ID. |  |
|**amount** | **String** | The transfer amount. For example, if you trade 1.5 BTC, then the value is &#x60;1.5&#x60;.  |  |
|**tradingAccountType** | **String** | The trading account type. |  |



## Enum: ChangeOutputTypeEnum

| Name | Value |
|---- | -----|
| LAST | &quot;Last&quot; |
| FIRST | &quot;First&quot; |



