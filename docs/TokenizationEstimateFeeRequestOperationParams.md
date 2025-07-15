

# TokenizationEstimateFeeRequestOperationParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chainId** | **String** | The chain ID where the token will be issued. |  |
|**source** | [**TokenizationTokenOperationSource**](TokenizationTokenOperationSource.md) |  |  |
|**tokenParams** | [**TokenizationIssueTokenParamsTokenParams**](TokenizationIssueTokenParamsTokenParams.md) |  |  |
|**operationType** | **TokenizationOperationType** |  |  |
|**mints** | [**List&lt;TokenizationMintTokenParamsMintsInner&gt;**](TokenizationMintTokenParamsMintsInner.md) | Details for each token mint, including amount and address to mint to. |  |
|**tokenId** | **String** | The ID of the token. |  |
|**burns** | [**List&lt;TokenizationBurnTokenParamsBurnsInner&gt;**](TokenizationBurnTokenParamsBurnsInner.md) | Details for each token burn, including amount and address to burn from. |  |
|**action** | **TokenizationUpdateAddressAction** |  |  |
|**addresses** | [**List&lt;TokenizationUpdateBlocklistAddressesParamsAddressesInner&gt;**](TokenizationUpdateBlocklistAddressesParamsAddressesInner.md) | A list of addresses to manage. For &#39;add&#39; operations, notes can be provided. For &#39;remove&#39; operations, notes are ignored. |  |
|**activation** | **Boolean** | Whether to activate the allowlist feature for the token. |  |
|**data** | [**TokenizationContractCallParamsData**](TokenizationContractCallParamsData.md) |  |  [optional] |



