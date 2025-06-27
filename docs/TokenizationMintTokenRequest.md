

# TokenizationMintTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**source** | [**TokenizationTokenOperationSource**](TokenizationTokenOperationSource.md) |  |  |
|**mints** | [**List&lt;TokenizationMintTokenParamsMintsInner&gt;**](TokenizationMintTokenParamsMintsInner.md) | Details for each token mint, including amount and address to mint to. |  |
|**appInitiator** | **String** | The initiator of the tokenization activity. If you do not specify this property, the WaaS service will automatically designate the API key as the initiator. |  [optional] |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  |



