

# TransactionDestination


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **TransactionDestinationType** |  |  |
|**accountOutput** | [**TransactionTransferToAddressDestinationAccountOutput**](TransactionTransferToAddressDestinationAccountOutput.md) |  |  [optional] |
|**utxoOutputs** | [**List&lt;TransactionTransferToAddressDestinationUtxoOutputsInner&gt;**](TransactionTransferToAddressDestinationUtxoOutputsInner.md) |  |  [optional] |
|**changeAddress** | **String** | The address used to receive the remaining funds or change from the transaction. |  [optional] |
|**forceInternal** | **Boolean** | Whether the transaction request must be executed as a [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop) transfer.   - &#x60;true&#x60;: The transaction request must be executed as a Cobo Loop transfer.   - &#x60;false&#x60;: The transaction request may not be executed as a Cobo Loop transfer.  |  [optional] |
|**forceExternal** | **Boolean** | Whether the transaction request must not be executed as a [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop) transfer.   - &#x60;true&#x60;: The transaction request must not be executed as a Cobo Loop transfer.   - &#x60;false&#x60;: The transaction request can be executed as a Cobo Loop transfer.  |  [optional] |
|**walletId** | **UUID** | The wallet ID. |  |
|**tradingAccountType** | **String** | The trading account type. |  [optional] |
|**exchangeId** | **ExchangeId** |  |  [optional] |
|**amount** | **String** | The transfer amount. For example, if you trade 1.5 BTC, then the value is &#x60;1.5&#x60;.  |  |
|**address** | **String** | The destination address. |  |
|**value** | **String** | The transfer amount. For example, if you trade 1.5 ETH, then the value is &#x60;1.5&#x60;.  |  [optional] |
|**calldata** | **String** | The data that is used to invoke a specific function or method within the specified contract at the destination address.  |  |
|**calldataInfo** | [**TransactionEvmCalldataInfo**](TransactionEvmCalldataInfo.md) |  |  [optional] |
|**instructions** | [**List&lt;TransactionSolContractInstruction&gt;**](TransactionSolContractInstruction.md) |  |  [optional] |
|**cosmosMessages** | [**List&lt;TransactionCosmosMessage&gt;**](TransactionCosmosMessage.md) |  |  |
|**message** | **String** | The raw data of the message to be signed, encoded in Base64 format. |  |
|**rawStructuredData** | **String** | The raw structured data to be signed, formatted as a JSON string. |  [optional] |
|**structuredData** | **Map&lt;String, Object&gt;** | The structured data to be signed, formatted as a JSON object according to the EIP-712 standard. |  |
|**safeTxExtraData** | [**SafeTxExtraData**](SafeTxExtraData.md) |  |  [optional] |
|**msgHash** | **String** | Message hash to be signed, in hexadecimal format. |  [optional] |
|**walletType** | **WalletType** |  |  |
|**walletSubtype** | **WalletSubtype** |  |  |
|**memo** | **String** | The memo that identifies a transaction in order to credit the correct account. For transfers out of Cobo Portal, it is highly recommended to include a memo for the chains such as XRP, EOS, XLM, IOST, BNB_BNB, ATOM, LUNA, and TON. |  [optional] |
|**txInfo** | [**TransactionDepositToAddressDestinationTxInfo**](TransactionDepositToAddressDestinationTxInfo.md) |  |  [optional] |
|**messageBip137** | **String** | Message to be signed, in hexadecimal format. |  |
|**messageBip322** | **String** | Message to be signed, in hexadecimal format. |  |
|**messageCosmosAdr36** | **String** | Message to be signed, in hexadecimal format. |  |



