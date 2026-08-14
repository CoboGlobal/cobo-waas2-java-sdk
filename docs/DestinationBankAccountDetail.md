

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
|**tag** | **DestinationBankAccountTag** |  |  [optional] |
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
|**country** | **String** | Beneficiary&#39;s country, in ISO 3166-1 alpha-3 format. |  [optional] |
|**city** | **String** | Beneficiary&#39;s city. |  [optional] |
|**paymentMethod** | **BankAccountPaymentMethod** |  |  [optional] |
|**holderType** | **BankAccountHolderType** |  |  [optional] |
|**beneficiaryProvince** | **String** | The province or state of the beneficiary. Required when &#x60;payment_method&#x60; is &#x60;Swift&#x60;. Cannot be a pure number or contain Chinese characters.  |  [optional] |
|**beneficiaryPostCode** | **String** | The postal code of the beneficiary. Required when &#x60;payment_method&#x60; is &#x60;Swift&#x60;.  |  [optional] |
|**bankAccountName** | **String** | The bank account name. Cannot contain Chinese characters.  |  [optional] |
|**bankBranchCode** | **String** | The branch code. Required when &#x60;payment_method&#x60; is &#x60;Local&#x60; (HK only).  |  [optional] |
|**bankCountry** | **String** | The country, in ISO 3166-1 alpha-3 format. |  [optional] |
|**bankProvince** | **String** | The province or state of the bank. Cannot be a pure number or contain Chinese characters.  |  [optional] |
|**contractFileId** | **UUID** | The file ID of the contract document (e.g., cooperation agreement) that proves the business relationship between you and the beneficiary, which you can retrieve by calling [Upload file](https://www.cobo.com/developers/v2/api-references/payment/upload-file).  |  [optional] |
|**createdTimestamp** | **Integer** | The created time of the bank account, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The updated time of the bank account, represented as a UNIX timestamp in seconds. |  [optional] |



