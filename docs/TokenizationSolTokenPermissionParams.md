

# TokenizationSolTokenPermissionParams

Role-based permission settings for Solana SPL Token 2022. If not provided, all permissions will be granted to the issuance wallet by default.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**permanentDelegate** | **String** | Solana wallet address that acts as a permanent delegate authority for the token. This authority can perform delegated operations on behalf of token holders. |  [optional] |
|**minter** | **String** | Solana wallet addres that acts as a minter authority for the token. This authority can mint new tokens. |  [optional] |
|**freezer** | **String** | Solana wallet address that acts as a freezer authority for the token. This authority can freeze token accounts. |  [optional] |
|**updater** | **String** | Solana wallet address that acts as an updater authority for the token. This authority can update token metadata. |  [optional] |
|**pauser** | **String** | Solana wallet address that acts as a pauser authority for the token. This authority can pause token transfers. |  [optional] |



