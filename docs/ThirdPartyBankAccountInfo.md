

# ThirdPartyBankAccountInfo

Bank account details for creating a third-party beneficiary.  For USD company bank accounts: - `swift_code` is required for both `Swift` and `Local` payments. - `branch_code` is required when `payment_method` is `Local` (HK only). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountNumber** | **String** | The bank account number. For USD Swift payments, must be 3–33 alphanumeric characters without spaces or special symbols.  |  |
|**accountName** | **String** | The bank account name. Cannot contain Chinese characters.  |  |
|**country** | **String** | The country, in ISO 3166-1 alpha-3 format. |  |
|**bankName** | **String** | The bank name. Cannot contain Chinese characters.  |  |
|**swiftCode** | **String** | The SWIFT/BIC code of the bank. |  |
|**branchCode** | **String** | The branch code. Required when &#x60;payment_method&#x60; is &#x60;Local&#x60; (HK only).  |  [optional] |
|**bankAddress** | **String** | The bank address. Cannot be a pure number or contain Chinese characters.  |  [optional] |
|**province** | **String** | The province or state of the bank. Cannot be a pure number or contain Chinese characters.  |  |
|**city** | **String** | The city of the bank. |  [optional] |
|**routingValue** | **String** | The routing value of the bank account. |  [optional] |



