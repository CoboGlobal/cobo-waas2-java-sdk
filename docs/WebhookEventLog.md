

# WebhookEventLog

The webhook event log.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The event log ID. |  |
|**createdTimestamp** | **Long** | The time when the log was created, in Unix timestamp format, measured in milliseconds. |  |
|**requestHeaders** | **Object** | The request headers of the webhook event. |  |
|**requestBody** | [**WebhookEvent**](WebhookEvent.md) |  |  |
|**responseBody** | **String** | The response body of the webhook event. |  [optional] |
|**responseStatusCode** | **Integer** | The response status code of the webhook event. |  [optional] |
|**responseTime** | **Integer** | The response time of the webhook event, in milliseconds. |  [optional] |
|**success** | **Boolean** | Whether the webhook event has been successfully delivered. |  |
|**failureReason** | **String** | The reason why the webhook event fails to be delivered. |  [optional] |



