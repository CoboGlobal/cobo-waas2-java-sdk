

# TokenizationBurnTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**source** | [**TokenizationTokenOperationSource**](TokenizationTokenOperationSource.md) |  |  |
|**burns** | [**List&lt;TokenizationBurnTokenParamsBurnsInner&gt;**](TokenizationBurnTokenParamsBurnsInner.md) | Details for each token burn, including amount and address to burn from. |  |
|**appInitiator** | **String** | The initiator of the tokenization activity. If you do not specify this property, the WaaS service will automatically designate the API key as the initiator. |  [optional] |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  |



