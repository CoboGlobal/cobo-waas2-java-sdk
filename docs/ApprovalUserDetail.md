

# ApprovalUserDetail

Details about a user involved in a transaction approval workflow. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the user who approved the transaction. |  [optional] |
|**email** | **String** | Email of the user. |  [optional] |
|**pubkey** | **String** | Public key of the user. |  [optional] |
|**signature** | **String** | Signature produced by the user for this approval. |  [optional] |
|**statementUuid** | **UUID** | UUID of the statement associated with this approval. |  [optional] |
|**result** | **ApprovalResult** |  |  [optional] |
|**approvalResultCode** | **Integer** | Integer value representing the result of the approval. |  [optional] |
|**createdTime** | **Integer** | Timestamp when the approval was created. |  [optional] |
|**templateVersion** | **String** | Version of the template used for the transaction approval. |  [optional] |
|**headerTitle** | **String** | Display title used in the transaction approval. |  [optional] |
|**isForSign** | **Boolean** | Indicates whether this approval requires signing: - &#x60;true&#x60;: The user must sign the transaction. - &#x60;false&#x60;: The user only needs to approve or reject without signing.  |  [optional] |
|**showInfo** | **String** | Additional information to show for the transaction approval. |  [optional] |
|**language** | **String** | Language used for the transaction approval. |  [optional] |
|**messageVersion** | **String** | Version of the message format used for the transaction approval. |  [optional] |
|**message** | **String** | Message associated with the transaction approval. |  [optional] |
|**extraMessage** | **String** | Any additional message or information related to the transaction approval. |  [optional] |



