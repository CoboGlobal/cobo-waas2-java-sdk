

# CreateDestinationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationName** | **String** | The destination name. |  |
|**destinationType** | **DestinationType** |  |  |
|**walletAddresses** | [**List&lt;CreateWalletAddress&gt;**](CreateWalletAddress.md) | The wallet addresses of the destination. |  [optional] |
|**bankAccounts** | [**List&lt;CreateDestinationBankAccount&gt;**](CreateDestinationBankAccount.md) | The bank accounts of the destination. |  [optional] |
|**merchantId** | **String** | The ID of the merchant linked to the destination. |  [optional] |
|**fiatEntryKycId** | **UUID** | The fiat entry KYC ID linked to the destination, which you can retrieve by calling [List all fiat entry KYC](https://www.cobo.com/developers/v2/api-references/payment/list-all-fiat-entry-kyc).  |  [optional] |
|**country** | **String** | The country of the destination, in ISO 3166-1 alpha-3 format. |  [optional] |
|**email** | **String** | The email of the destination. |  [optional] |
|**contactAddress** | **String** | The contact address of the destination. |  [optional] |



