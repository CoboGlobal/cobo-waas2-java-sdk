

# TokenizationSolWrappedTokenPermissionParams

Role-based permission settings for Solana wrapped token. The owner is automatically set to the address that calls the initialize function (typically the issuance wallet) and cannot be specified here. Only wrapper and pauser roles can be configured during initialization.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**wrapper** | **List&lt;String&gt;** | List of Solana wallet addresses that can perform wrap/unwrap operations. Multiple addresses can be assigned this role. |  [optional] |
|**pauser** | **String** | Solana wallet address that acts as a pauser authority for the token. This authority can pause token transfers. |  [optional] |
|**freezer** | **String** | Solana wallet address that acts as a freezer authority for the token. This authority can freeze token accounts. |  [optional] |
|**updater** | **String** | Solana wallet address that acts as an updater authority for the token. This authority can update token metadata. |  [optional] |



