

# TSSCallbackResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The unique ID of the callback request. |  [optional] |
|**status** | **Integer** | The response status code. 0 indicates success.  Any other value indicates that an error occurred while processing the request in the callback server. |  [optional] |
|**action** | **TSSCallbackActionType** |  |  [optional] |
|**error** | **String** | The error message. - When status is not 0, Contains internal error messages from the callback server. - When status is 0 and action is REJECT, Contains the specific reason for the rejection. |  [optional] |



