

# ListTopUpPayers200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The merchant ID. |  |
|**payerId** | **String** | A unique identifier assigned by Cobo to track and identify individual payers. |  |
|**developerFeeRate** | **String** | The developer fee rate applied to top-up transactions made by this payer. Expressed as a decimal string where \&quot;0.1\&quot; represents 10%. |  |
|**createdTimestamp** | **Integer** | The creation time of the payer, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The last update time of the payer, represented as a UNIX timestamp in seconds. |  [optional] |
|**transactions** | [**List&lt;PaymentTransaction&gt;**](PaymentTransaction.md) | An array of top-up transactions associated with this payer. |  [optional] |



