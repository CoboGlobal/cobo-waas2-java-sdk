

# ApprovalDetail

The approval detail data for transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | The transaction ID. |  [optional] |
|**coboId** | **String** | The Cobo ID, which can be used to track a transaction. |  [optional] |
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. |  [optional] |
|**result** | **ApprovalTransactionResult** |  |  [optional] |
|**threshold** | **Integer** | The threshold for the transaction approval. |  [optional] |
|**userDetails** | [**List&lt;ApprovalUserDetail&gt;**](ApprovalUserDetail.md) |  |  [optional] |



