

# SettlementInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The merchant ID. For developer balance, this field will be empty. |  [optional] |
|**tokenId** | **String** | The ID of the cryptocurrency. |  [optional] |
|**availableAmount** | **String** | This field is no longer in use and can be ignored. |  |
|**availableCurrencyBalance** | **String** | This field is no longer in use and can be ignored. |  [optional] |
|**pendingAmount** | **String** | This field is no longer in use and can be ignored. |  [optional] |
|**pendingCurrencyBalance** | **String** | This field is no longer in use and can be ignored. |  [optional] |
|**settledAmount** | **String** | The amount already settled, in the specified cryptocurrency. |  [optional] |
|**availableBalance** | **String** | The balance available for settlement or refund, in the specified cryptocurrency. |  [optional] |
|**totalBalance** | **String** |  The total unsettled balance in the specified cryptocurrency, including: - Available balance that can be settled immediately - Amounts below the sweep threshold that require forced sweep before settlement  |  [optional] |
|**acquiringType** | **AcquiringType** |  |  [optional] |
|**createdTimestamp** | **Integer** | The creation time of the settlement, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The last update time of the settlement, represented as a UNIX timestamp in seconds. |  [optional] |



