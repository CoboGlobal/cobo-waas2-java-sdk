

# KyaScreeningResult

Complete address screening result including risk assessment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The idempotency identifier from the request, unique within your organization, used for tracking and troubleshooting. Only present in create response. |  |
|**screeningId** | **UUID** | The unique system-generated identifier for this screening request (UUID format, fixed 36 characters). |  |
|**address** | **String** | The screened blockchain address. |  |
|**chainId** | **String** | The chain identifier. |  |
|**note** | **String** | Optional note for this address screening. |  [optional] |
|**createdTimestamp** | **Long** | The time when the screening request was created, in Unix timestamp format, measured in milliseconds. |  |
|**requestedBy** | **String** | The identifier of the user or application that created this screening request. |  |
|**status** | **KyaScreeningStatus** |  |  |
|**riskAssessment** | [**KyaScreeningResultRiskAssessment**](KyaScreeningResultRiskAssessment.md) |  |  [optional] |



