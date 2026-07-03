

# CreateThirdPartyPayeeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **BankProvider** |  |  |
|**coboPayeeId** | **String** | The Cobo payee ID. |  |
|**currency** | **String** | The currency of the payee bank account. |  |
|**country** | **String** | The country, in ISO 3166-1 alpha-3 format. |  |
|**paymentMethod** | **ThirdPartyPaymentMethod** |  |  |
|**holderType** | **ThirdPartyHolderType** |  |  |
|**beneficiaryDetail** | [**ThirdPartyBeneficiaryDetail**](ThirdPartyBeneficiaryDetail.md) |  |  |
|**bankAccount** | [**ThirdPartyBankAccountInfo**](ThirdPartyBankAccountInfo.md) |  |  |
|**contractDocumentUrl** | **URI** | The AWS file link of the contract document (e.g., cooperation agreement) that proves the business relationship between you and the beneficiary, which you can retrieve by calling [Upload file](https://www.cobo.com/developers/v2/api-references/payment/upload-file).  |  |



