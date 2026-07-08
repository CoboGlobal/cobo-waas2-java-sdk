

# FeeStationCheckFeeStationUsageResponse

The fee station evaluation result for the transfer request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The token used to pay the gas fee for this specific transaction. You can retrieve the IDs of all supported tokens by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). |  |
|**balance** | **String** | The current token balance available in Fee Station. |  |
|**gasStationType** | **FeeStationGasStationType** |  |  |
|**isFeeStationApplicable** | **Boolean** | Indicates whether Fee Station is applied for this transfer request. |  |
|**isBalanceSufficient** | **Boolean** | If Fee Station is used, indicates whether its balance is sufficient to cover the required gas fee. |  |
|**totalFeeAmount** | **String** | The total gas amount required for this transfer request. |  |
|**isSponsorApplicable** | **Boolean** | Indicates whether USD stablecoin sponsorship is applied when the Fee Station balance is insufficient. |  |
|**sponsoredFeeAmount** | **String** | The amount of gas fee sponsored by USD stablecoin when applicable. |  |
|**sponsoredTokenId** | **String** | The token ID used to sponsor the gas fee. |  [optional] |



