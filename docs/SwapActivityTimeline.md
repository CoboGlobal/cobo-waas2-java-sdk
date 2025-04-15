

# SwapActivityTimeline

The timeline of the swap activity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | The action of the swap activity. Possible values include:   - &#x60;Submitted&#x60;: The swap request is submitted.   - &#x60;Pending Authorization&#x60;: The swap request is pending authorization.   - &#x60;Bridge {Token}&#x60;: The token is being bridged to the target chain.   - &#x60;Swap {Token}&#x60;: The token is being swapped on the target chain.   - &#x60;Cobo Confirmation&#x60;: The swap result is waiting for Cobo confirmation.  |  |
|**status** | **String** | The status of the action. Possible values include:   - &#x60;Success&#x60;: The action is successfully completed.   - &#x60;Processing&#x60;: The action is being processed.   - &#x60;Failed&#x60;: The action has failed.  |  |
|**timestamp** | **Integer** | The time when the action took place, in Unix timestamp format, measured in milliseconds.  |  [optional] |



