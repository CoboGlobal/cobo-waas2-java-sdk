

# SwapActivityTimeline

The timeline of the swap activity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | The action in the swap activity. Possible values include:   - &#x60;Submitted&#x60;: The swap request has been submitted.   - &#x60;Pending Authorization&#x60;: The swap request is pending authorization.   - &#x60;Bridge {Token}&#x60;: The token is being bridged to the destination chain.   - &#x60;Swap {Token}&#x60;: The token is being exchanged to the destination token.   - &#x60;Cobo Confirmation&#x60;: The swap result is pending Cobo&#39;s final confirmation.  |  |
|**status** | **String** | The status of the action. Possible values include:   - &#x60;Success&#x60;: The action completed successfully.   - &#x60;Processing&#x60;: The action is being processed.   - &#x60;Failed&#x60;: The action failed.  |  |
|**timestamp** | **Integer** | The time when the action occurred, in Unix timestamp format, measured in milliseconds.   |  [optional] |



