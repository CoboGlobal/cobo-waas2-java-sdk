

# TokenizationUpdatePermissionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**source** | [**TokenizationTokenOperationSource**](TokenizationTokenOperationSource.md) |  |  |
|**action** | **TokenizationPermissionAction** |  |  |
|**address** | **String** | The address to manage permissions for. |  |
|**permissions** | **List&lt;TokenizationTokenPermissionType&gt;** | The list of permissions to operate on. |  |
|**appInitiator** | **String** | The initiator of the tokenization activity. If you do not specify this property, the WaaS service will automatically designate the API key as the initiator. |  [optional] |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  |
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. |  [optional] |



