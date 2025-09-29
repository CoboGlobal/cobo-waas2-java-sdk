

# ApprovalUserDetail

The user detail for a transaction approval. This includes the user's email, public key, signature, statement UUID, result of the approval, creation time, template version, header title, whether it is for signing, and additional information to show. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the user who approved the transaction. |  [optional] |
|**email** | **String** | The email address of the user who approved the transaction. |  [optional] |
|**pubkey** | **String** | The public key of the user who approved the transaction. |  [optional] |
|**signature** | **String** | The signature of the transaction approval. |  [optional] |
|**statementUuid** | **UUID** | The UUID of the statement associated with the transaction approval. |  [optional] |
|**result** | **ApprovalResult** |  |  [optional] |
|**approvalResultCode** | **Integer** | The integer value representing the result of the approval. |  [optional] |
|**createdTime** | **Integer** | The timestamp when the approval was created. |  [optional] |
|**templateVersion** | **String** | The version of the template used for the transaction approval. |  [optional] |
|**headerTitle** | **String** | The title of the header for the transaction approval. |  [optional] |
|**isForSign** | **Boolean** | Indicates whether the approval is for signing. |  [optional] |
|**showInfo** | **String** | Additional information to show for the transaction approval. |  [optional] |
|**language** | **String** | The language used for the transaction approval. |  [optional] |
|**messageVersion** | **String** | The version of the message format used for the transaction approval. |  [optional] |
|**message** | **String** | The message associated with the transaction approval. |  [optional] |
|**extraMessage** | **String** | Any additional message or information related to the transaction approval. |  [optional] |



