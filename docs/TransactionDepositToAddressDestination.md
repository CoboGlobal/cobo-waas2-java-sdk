

# TransactionDepositToAddressDestination

Information about the transaction destination type `DepositToAddress`. Switch between the tabs to display the properties for different transaction destinations. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **TransactionDestinationType** |  |  |
|**walletId** | **UUID** | The wallet ID. |  |
|**walletType** | **WalletType** |  |  |
|**walletSubtype** | **WalletSubtype** |  |  [optional] |
|**address** | **String** | The destination address. |  |
|**memo** | **String** | The memo that identifies a transaction in order to credit the correct account. For transfers out of Cobo Portal, it is highly recommended to include a memo for the chains such as XRP, EOS, XLM, IOST, BNB_BNB, ATOM, LUNA, and TON. |  [optional] |
|**amount** | **String** | The transfer amount. For example, if you trade 1.5 BTC, then the value is &#x60;1.5&#x60;.  |  |



