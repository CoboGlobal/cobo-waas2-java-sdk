

# UpdateFiatEntryKyc

The request body to update fiat entry KYC information.  All fields are optional. Omitted fields keep their existing values. You can pass empty values to clear a field. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantType** | **FiatEntryKycMerchantType** |  |  [optional] |
|**country** | **String** | The country/region of the fiat entry KYC, in ISO 3166-1 alpha-3 format. |  [optional] |
|**industry** | **List&lt;String&gt;** | The industry categories of the fiat entry KYC. |  [optional] |
|**companyInfo** | [**FiatEntryKycCompanyInfo**](FiatEntryKycCompanyInfo.md) |  |  [optional] |
|**individualInfo** | [**FiatEntryKycPersonInfo**](FiatEntryKycPersonInfo.md) |  |  [optional] |



