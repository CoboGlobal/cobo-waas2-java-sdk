

# TokenizationUpdateAllowlistAddressesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **TokenizationUpdateAddressAction** |  |  |
|**source** | [**TokenizationTokenOperationSource**](TokenizationTokenOperationSource.md) |  |  |
|**addresses** | [**List&lt;TokenizationUpdateAllowlistAddressesParamsAddressesInner&gt;**](TokenizationUpdateAllowlistAddressesParamsAddressesInner.md) | A list of addresses to manage. For &#39;add&#39; operations, notes can be provided. For &#39;remove&#39; operations, notes are ignored. |  |
|**appInitiator** | **String** | The initiator of the tokenization activity. If you do not specify this property, the WaaS service will automatically designate the API key as the initiator. |  [optional] |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  |
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. |  [optional] |



