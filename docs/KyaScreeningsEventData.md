

# KyaScreeningsEventData

Event data for KYA address screening status updates.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**screeningId** | **UUID** | The unique system-generated identifier for this screening request (UUID format, fixed 36 characters). |  |
|**address** | **String** | The screened blockchain address. |  |
|**chainId** | **String** | The chain identifier. |  |
|**status** | **KyaScreeningStatus** |  |  |
|**createdTimestamp** | **Long** | The time when the screening request was created, in Unix timestamp format, measured in milliseconds. |  |
|**updatedTimestamp** | **Long** | The time when the screening status was updated, in Unix timestamp format, measured in milliseconds. |  |



