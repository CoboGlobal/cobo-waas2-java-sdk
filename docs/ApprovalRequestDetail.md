

# ApprovalRequestDetail

The information of an approval request detail.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvalId** | **String** | The system-generated unique ID of the approval request. |  [optional] |
|**initiator** | [**ApprovalUser**](ApprovalUser.md) |  |  |
|**approvedList** | [**List&lt;ApprovalEntry&gt;**](ApprovalEntry.md) |  |  [optional] |
|**status** | **ApprovalStatus** |  |  |
|**modifiedTimestamp** | **Long** | The time when the approval was modified, in Unix timestamp format, measured in milliseconds. |  [optional] |



