

# TokenizationIssueTokenParamsTokenParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**standard** | **TokenizationTokenStandard** |  |  |
|**name** | **String** | The name of the fund token. |  |
|**symbol** | **String** | The symbol of the fund token. |  |
|**decimals** | **Integer** | The number of decimals for the token (0-18). |  |
|**tokenAccessActivated** | **Boolean** | Whether the allowlist feature is activated for the token. When activated, only addresses in the allowlist can perform token operations. |  [optional] |
|**permissions** | [**TokenizationERC20FundTokenPermissionParams**](TokenizationERC20FundTokenPermissionParams.md) |  |  [optional] |
|**underlyingToken** | **String** | The address of the underlying token that this tokenized asset represents. |  |
|**assetToken** | **String** | The address of the underlying asset token (e.g., XAUT, USDC). The fund will hold this token as collateral. |  |
|**initialNav** | **String** | Initial net asset value (NAV) per share (optional). Default: &#39;1.0&#39; (standard for new funds). |  [optional] |
|**initialAnnualRate** | **String** | Initial annual rate (optional). Can be updated later via NAV updater. Default: &#39;0&#39;. |  [optional] |
|**minDeposit** | **String** | Minimum deposit amount (optional). Default: &#39;0&#39; (no minimum, accepts any amount &gt; 0). Admin can update this later. |  [optional] |
|**minRedemption** | **String** | Minimum redemption amount (optional). Default: &#39;0&#39; (no minimum, accepts any amount &gt; 0). Admin can update this later. |  [optional] |
|**maxAnnualRate** | **String** | Maximum allowed annual rate (optional). Default: type(uint256).max (no limit). Set lower for conservative funds (e.g., &#39;0.2&#39; for 20%). |  [optional] |
|**maxRateChange** | **String** | Maximum rate change per NAV update (optional). Default: type(uint256).max (no limit). Set lower to prevent volatility (e.g., &#39;0.05&#39; for 5%). |  [optional] |
|**minUpdateIntervalSeconds** | **Integer** | Minimum interval between NAV updates in seconds (optional). Default: 0 (no minimum). Set higher to prevent frequent updates (e.g., 86400 for 1 day). |  [optional] |



