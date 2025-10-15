

# CreateMerchantRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The merchant name. |  |
|**walletId** | **UUID** | The ID of the wallet linked to the merchant. |  [optional] |
|**developerFeeRate** | **String** | The developer fee rate applied to this merchant. Expressed as a string in decimal format where \&quot;0.1\&quot; represents 10%. This fee is deducted from the payment amount and only applies to top-up transactions. If you are a merchant (directly serving the payer), you do not need to configure the developer fee rate. |  [optional] |
|**walletSetup** | **WalletSetup** |  |  [optional] |



