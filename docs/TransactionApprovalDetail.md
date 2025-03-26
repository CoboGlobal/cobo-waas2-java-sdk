

# TransactionApprovalDetail

The approval detail data for transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | The transaction ID. |  [optional] |
|**coboId** | **String** | The Cobo ID, which can be used to track a transaction. |  [optional] |
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. |  [optional] |
|**spender** | [**TransactionRoleApprovalDetail**](TransactionRoleApprovalDetail.md) |  |  [optional] |
|**approver** | [**TransactionRoleApprovalDetail**](TransactionRoleApprovalDetail.md) |  |  [optional] |
|**addressOwner** | [**TransactionRoleApprovalDetail**](TransactionRoleApprovalDetail.md) |  |  [optional] |



