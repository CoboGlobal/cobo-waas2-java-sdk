

# CreateThirdPartyMerchantRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**thirdMerchantId** | **String** | The third-party merchant ID. If provided, the existing third-party merchant is updated; otherwise, a new third-party merchant is created.  |  [optional] |
|**provider** | **BankProvider** |  |  |
|**coboMerchantId** | **String** | The Cobo merchant ID. |  |
|**merchantType** | **ThirdPartyMerchantType** |  |  |
|**country** | **String** | The country, in ISO 3166-1 alpha-3 format. |  |
|**industry** | **List&lt;String&gt;** | The industry categories of the merchant. |  |
|**companyInfo** | [**ThirdPartyCompanyInfo**](ThirdPartyCompanyInfo.md) | The company information. Required for company merchants. |  [optional] |
|**individualInfo** | [**ThirdPartyPersonInfo**](ThirdPartyPersonInfo.md) | The individual information. Required for individual merchants. |  [optional] |



