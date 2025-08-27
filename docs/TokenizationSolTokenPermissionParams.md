

# TokenizationSolTokenPermissionParams

Role-based permission settings for the Solana Token-2022 Program. If not provided, all permissions will be granted to the issuing wallet by default.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**permanentDelegate** | **String** | Solana wallet address assigned as the permanent delegate authority. It can perform delegated operations on behalf of token holders. |  [optional] |
|**minter** | **String** | Solana wallet address assigned as the mint authority. It can mint new tokens. |  [optional] |
|**freezer** | **String** | Solana wallet address assigned as the freeze authority. It can freeze token accounts. |  [optional] |
|**updater** | **String** | Solana wallet address assigned as the update authority. It can update token metadata. |  [optional] |
|**pauser** | **String** | Solana wallet address assigned as the pause authority. It can pause or unpause all token activities including transfers, burns, and mints. |  [optional] |



