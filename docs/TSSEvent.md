

# TSSEvent

The TSS Node event payload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **UUID** | The event ID. |  [optional] |
|**createdTimestamp** | **Long** | The time when the event occurred, in Unix timestamp format, measured in milliseconds. |  [optional] |
|**nodeId** | **String** | The event publisher&#39;s TSS Node ID. |  [optional] |
|**eventType** | **TSSEventType** |  |  |
|**data** | [**TSSEventData**](TSSEventData.md) |  |  [optional] |



