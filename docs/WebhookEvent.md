

# WebhookEvent

The webhook event payload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **UUID** | The event ID. |  [optional] |
|**url** | **String** | The webhook endpoint URL. |  |
|**createdTimestamp** | **Long** | The time when the event was triggered, in Unix timestamp format (milliseconds). - The value remains unchanged across retries. - The default webhook timeout is 2 seconds.  |  |
|**type** | **WebhookEventType** |  |  |
|**data** | [**WebhookEventData**](WebhookEventData.md) |  |  |
|**status** | **WebhookEventStatus** |  |  [optional] |
|**nextRetryTimestamp** | **Long** | The timestamp indicating the next scheduled retry to deliver this event, in Unix timestamp format, measured in milliseconds. This field is only present if the event status is &#x60;Retrying&#x60;.  |  [optional] |
|**retriesLeft** | **Integer** | The number of retries left. This field is only present if the event status is &#x60;Retrying&#x60;. |  [optional] |



