

# TransferDestination


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **TransferDestinationType** |  |  |
|**accountOutput** | [**AddressTransferDestinationAccountOutput**](AddressTransferDestinationAccountOutput.md) |  |  [optional] |
|**utxoOutputs** | [**List&lt;AddressTransferDestinationUtxoOutputsInner&gt;**](AddressTransferDestinationUtxoOutputsInner.md) |  |  [optional] |
|**changeAddress** | **String** | The address used to receive the remaining funds or change from the transaction. |  [optional] |
|**forceInternal** | **Boolean** | Whether the transaction request must be executed as a Loop transfer. For more information about Loop, see [Loop&#39;s website](https://loop.top/).   - &#x60;true&#x60;: The transaction request must be executed as a Loop transfer.   - &#x60;false&#x60;: The transaction request may not be executed as a Loop transfer. &lt;Note&gt;Please do not set both &#x60;force_internal&#x60; and &#x60;force_internal&#x60; as &#x60;true&#x60;.&lt;/Note&gt;  |  [optional] |
|**forceExternal** | **Boolean** | Whether the transaction request must not be executed as a Loop transfer. For more information about Loop, see [Loop&#39;s website](https://loop.top/).   - &#x60;true&#x60;: The transaction request must not be executed as a Loop transfer.   - &#x60;false&#x60;: The transaction request can be executed as a Loop transfer. &lt;Note&gt;Please do not set both &#x60;force_internal&#x60; and &#x60;force_internal&#x60; as &#x60;true&#x60;.&lt;/Note&gt;  |  [optional] |
|**walletId** | **UUID** | The wallet ID. |  |
|**tradingAccountType** | **String** | The trading account type. |  |
|**amount** | **String** | The transfer amount. For example, if you trade 1.5 BTC, then the value is &#x60;1.5&#x60;.  |  |



