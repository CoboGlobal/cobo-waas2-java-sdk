

# Merchant


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The merchant ID. |  |
|**name** | **String** | The merchant name. |  |
|**walletId** | **UUID** | The ID of the linked wallet. |  |
|**developerFeeRate** | **String** | The developer fee rate applied to this merchant. Expressed as a string in decimal format where \&quot;0.1\&quot; represents 10%. This fee is deducted from the payment amount and only applies to top-up transactions. If you are a merchant (directly serving the payer), you do not need to configure the developer fee rate. |  [optional] |
|**createdTimestamp** | **Integer** | The creation time of the merchant, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The last update time of the merchant, represented as a UNIX timestamp in seconds. |  [optional] |



