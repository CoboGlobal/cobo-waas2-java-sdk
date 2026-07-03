

# CreateDestinationBankAccount

The bank account details for creating a destination bank account.  For USD company bank accounts, optional prefixed fields may be required depending on `payment_method`: - When `payment_method` is `Swift`, `beneficiary_province` and `beneficiary_post_code` are required. - When `payment_method` is `Local` (HK only), `bank_branch_code` is required. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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
|**country** | **String** | The country, in ISO 3166-1 alpha-3 format. |  [optional] |
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



