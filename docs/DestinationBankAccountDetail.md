

# DestinationBankAccountDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationId** | **UUID** | The destination ID. |  |
|**destinationName** | **String** | The name of the destination. |  |
|**destinationType** | **DestinationType** |  |  |
|**destinationEmail** | **String** | The email of the destination. |  [optional] |
|**destinationCountry** | **String** | The country of the destination, in ISO 3166-1 alpha-3 format. |  [optional] |
|**destinationContactAddress** | **String** | The contact address of the destination. |  [optional] |
|**destinationMerchantId** | **String** | The ID of the merchant linked to the destination. |  [optional] |
|**bankAccountId** | **UUID** | The destination bank account ID. |  |
|**accountAlias** | **String** | The alias of the bank account. |  |
|**accountNumber** | **String** | The bank account number. |  |
|**swiftCode** | **String** | The SWIFT or BIC code of the bank. |  |
|**currency** | **String** | The currency of the bank account. |  |
|**beneficiaryName** | **String** | The name of the account holder. |  |
|**beneficiaryAddress** | **String** | The address of the account holder. |  |
|**bankName** | **String** | The name of the bank. |  |
|**bankAddress** | **String** | The address of the bank. |  |
|**ibanCode** | **String** | The IBAN code of the bank account. |  [optional] |
|**furtherCredit** | **String** | The further credit of the bank account. |  [optional] |
|**intermediaryBankInfo** | [**IntermediaryBankInfo**](IntermediaryBankInfo.md) |  |  [optional] |
|**bankAccountStatus** | **BankAccountStatus** |  |  |
|**createdTimestamp** | **Integer** | The created time of the bank account, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The updated time of the bank account, represented as a UNIX timestamp in seconds. |  [optional] |



