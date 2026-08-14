

# DestinationDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationId** | **UUID** | The destination ID. |  |
|**destinationType** | **DestinationType** |  |  |
|**destinationName** | **String** | The destination name. |  |
|**source** | **DestinationSource** |  |  [optional] |
|**country** | **String** | The country of the destination, in ISO 3166-1 alpha-3 format. |  [optional] |
|**email** | **String** | The email of the destination. |  [optional] |
|**contactAddress** | **String** | The contact address of the destination. |  [optional] |
|**walletAddresses** | [**List&lt;WalletAddress&gt;**](WalletAddress.md) | The wallet addresses of the destination. |  [optional] |
|**bankAccounts** | [**List&lt;DestinationBankAccount&gt;**](DestinationBankAccount.md) | The bank accounts of the destination. |  [optional] |
|**merchantId** | **String** | The ID of the merchant linked to the destination. |  [optional] |
|**createdTimestamp** | **Integer** | The created time of the destination, represented as a UNIX timestamp in seconds. |  |
|**updatedTimestamp** | **Integer** | The updated time of the destination, represented as a UNIX timestamp in seconds. |  |



