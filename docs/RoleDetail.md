

# RoleDetail

Details of the role in a transaction approval.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**result** | **ApprovalTransactionResult** |  |  [optional] |
|**reviewThreshold** | **Integer** | Minimum number of approvals required for this role. |  [optional] |
|**initiator** | **String** | The initiator of the transaction. |  [optional] |
|**isUpgraded** | **Boolean** | Indicates whether the transaction approval has been upgraded. |  [optional] |
|**completeTime** | **String** | Time when the role completed the approval. |  [optional] |
|**userDetails** | [**List&lt;ApprovalUserDetail&gt;**](ApprovalUserDetail.md) |  |  [optional] |



