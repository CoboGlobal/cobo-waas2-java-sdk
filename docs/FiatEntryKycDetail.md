

# FiatEntryKycDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fiatEntryKycId** | **UUID** | The fiat entry KYC ID. |  |
|**status** | **FiatEntryKycStatus** |  |  |
|**merchantType** | **FiatEntryKycMerchantType** |  |  |
|**country** | **String** | The country/region of the fiat entry KYC, in ISO 3166-1 alpha-3 format. |  |
|**industry** | **List&lt;String&gt;** | The industry categories of the fiat entry KYC. |  |
|**email** | **String** | The email address. |  [optional] |
|**phone** | **String** | The phone number. |  [optional] |
|**companyInfo** | [**FiatEntryKycCompanyInfo**](FiatEntryKycCompanyInfo.md) |  |  [optional] |
|**individualInfo** | [**FiatEntryKycPersonInfo**](FiatEntryKycPersonInfo.md) |  |  [optional] |
|**createdTimestamp** | **Long** | The creation timestamp in Unix seconds. |  |
|**updatedTimestamp** | **Long** | The last update timestamp in Unix seconds. |  [optional] |



