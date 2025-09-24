

# RoleDetail

Transaction approval details response schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**result** | **ApprovalTransactionResult** |  |  [optional] |
|**reviewThreshold** | **Integer** | The threshold for the transaction approval. |  [optional] |
|**initiator** | **String** | The initiator of the transaction. |  [optional] |
|**isUpgraded** | **Boolean** | Indicates whether the transaction approval has been upgraded. |  [optional] |
|**completeTime** | **String** | Time to complete the review. |  [optional] |
|**userDetails** | [**List&lt;ApprovalUserDetail&gt;**](ApprovalUserDetail.md) |  |  [optional] |



