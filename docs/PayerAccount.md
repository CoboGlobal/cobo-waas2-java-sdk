

# PayerAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The merchant ID. |  |
|**payerId** | **String** | A unique identifier assigned by Cobo to track and identify individual payers. |  |
|**developerFeeRate** | **String** | The developer fee rate applied to the top-up transactions made by the payer. Expressed as a decimal string where \&quot;0.1\&quot; represents 10%. |  |
|**createdTimestamp** | **Integer** | The creation time of the payer, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The last update time of the payer, represented as a UNIX timestamp in seconds. |  [optional] |
|**accounts** | [**List&lt;Account&gt;**](Account.md) | An array of accounts associated with this payer. |  [optional] |



