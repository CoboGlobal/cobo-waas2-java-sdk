

# MerchantKycSubmission


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kycSubmissionId** | **UUID** | The KYC submission ID. |  |
|**merchantId** | **String** | The merchant ID. |  |
|**status** | **MerchantKycStatus** |  |  |
|**email** | **String** | The merchant email address. |  |
|**phone** | **String** | The merchant phone number. |  |
|**merchantType** | **MerchantKycMerchantType** |  |  |
|**country** | **String** | The country/region of the merchant, in ISO 3166-1 alpha-3 format. |  |
|**industry** | **List&lt;String&gt;** | The industry categories of the merchant. |  |
|**companyInfo** | [**MerchantKycCompanyInfo**](MerchantKycCompanyInfo.md) |  |  [optional] |
|**individualInfo** | [**MerchantKycPersonInfo**](MerchantKycPersonInfo.md) |  |  [optional] |
|**createdTimestamp** | **Long** | The creation timestamp in Unix seconds. |  |
|**updatedTimestamp** | **Long** | The last update timestamp in Unix seconds. |  [optional] |



