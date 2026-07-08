

# ThirdPartyBeneficiaryDetail

Beneficiary detail for creating a third-party beneficiary.  For USD company bank accounts: - When `payment_method` is `Swift`, `city`, `province`, and `post_code` are required. - When `payment_method` is `Local` (HK only), `city` is optional. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**companyName** | **String** | The company name of the beneficiary. Cannot be a pure number or contain Chinese characters.  |  |
|**streetAddress** | **String** | The street address of the beneficiary. Cannot be a pure number or contain Chinese characters.  |  |
|**city** | **String** | The city of the beneficiary. Required when &#x60;payment_method&#x60; is &#x60;Swift&#x60;. Cannot be a pure number or contain Chinese characters.  |  [optional] |
|**province** | **String** | The province or state of the beneficiary. Required when &#x60;payment_method&#x60; is &#x60;Swift&#x60;. Cannot be a pure number or contain Chinese characters.  |  [optional] |
|**postCode** | **String** | The postal code of the beneficiary. Required when &#x60;payment_method&#x60; is &#x60;Swift&#x60;.  |  [optional] |



