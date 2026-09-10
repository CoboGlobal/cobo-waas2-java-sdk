

# ApprovalRequestDetail

The information of an app workflow approval detail.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvalId** | **String** |  |  [optional] |
|**initiator** | [**ApprovalUser**](ApprovalUser.md) |  |  |
|**approvedList** | [**List&lt;ApprovalEntry&gt;**](ApprovalEntry.md) |  |  [optional] |
|**status** | **ApprovalStatus** |  |  |
|**modifiedTimestamp** | **Long** | The time when the approval was modified, in Unix timestamp format, measured in milliseconds. |  [optional] |



