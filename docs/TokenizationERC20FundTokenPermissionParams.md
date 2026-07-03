

# TokenizationERC20FundTokenPermissionParams

Role-based permission settings for ERC-4626 fund token contract. If not provided, all permissions will be granted to the issuance wallet by default.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**owner** | **List&lt;String&gt;** | List of addresses for the owner/admin role. Have full administrative control over the fund contract. |  [optional] |
|**manager** | **List&lt;String&gt;** | List of addresses for the fund manager role. Can manage fund configurations and operational parameters. |  [optional] |
|**navUpdater** | **List&lt;String&gt;** | List of addresses for the NAV updater role. Can update the net asset value (NAV) per share price. |  [optional] |
|**redemptionApprover** | **List&lt;String&gt;** | List of addresses for the redemption approver role. Can approve or reject investor redemption requests. |  [optional] |
|**settlementOperator** | **List&lt;String&gt;** | List of addresses for the settlement operator role. Can execute investment and redemption settlement operations. |  [optional] |
|**emergencyGuardian** | **List&lt;String&gt;** | List of addresses for the emergency guardian role. Can trigger emergency actions such as pausing the fund. |  [optional] |



