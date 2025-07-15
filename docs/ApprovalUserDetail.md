

# ApprovalUserDetail

The user detail for a transaction approval. This includes the user's email, public key, signature, statement UUID, result of the approval, creation time, template version, header title, whether it is for signing, and additional information to show. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userEmail** | **String** | The email address of the user who approved the transaction. |  [optional] |
|**pubkey** | **String** | The public key of the user who approved the transaction. |  [optional] |
|**signature** | **String** | The signature of the transaction approval. |  [optional] |
|**statementUuid** | **UUID** | The UUID of the statement associated with the transaction approval. |  [optional] |
|**result** | **ApprovalResult** |  |  [optional] |
|**createdTime** | **Integer** | The timestamp when the approval was created. |  [optional] |
|**templateVersion** | **String** | The version of the template used for the transaction approval. |  [optional] |
|**headerTitle** | **String** | The title of the header for the transaction approval. |  [optional] |
|**isForSign** | **Boolean** | Indicates whether the approval is for signing. |  [optional] |
|**showInfo** | [**ApprovalShowInfo**](ApprovalShowInfo.md) |  |  [optional] |



