

# TokenizationIssueTokenParamsTokenParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**standard** | **TokenizationTokenStandard** |  |  |
|**name** | **String** | The name of the token. |  |
|**symbol** | **String** | The symbol of the token. |  |
|**decimals** | **Integer** | The number of decimals for the token (0-18). |  |
|**tokenAccessActivated** | **Boolean** | Whether the allowlist feature is activated for the token. When activated, only addresses in the allowlist can perform token operations. |  [optional] |
|**permissions** | [**TokenizationSolWrappedTokenPermissionParams**](TokenizationSolWrappedTokenPermissionParams.md) |  |  [optional] |
|**underlyingToken** | **String** | The address of the underlying token that this tokenized asset represents. |  |



