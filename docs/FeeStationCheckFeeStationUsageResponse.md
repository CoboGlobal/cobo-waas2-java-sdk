

# FeeStationCheckFeeStationUsageResponse

The fee station evaluation result for the transfer request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The token used to pay the gas fee for this specific transaction. You can retrieve the IDs of all supported tokens by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). |  |
|**gasStationType** | **FeeStationGasStationType** |  |  |
|**isFeeStationApplicable** | **Boolean** | Indicates whether the fee station is applied for this transfer request. |  |
|**isBalanceSufficient** | **Boolean** | If the fee station is used, indicates whether its balance is sufficient to cover the required gas fee. |  |
|**balance** | **String** | The current token balance available in the fee station. |  |
|**totalFeeAmount** | **String** | The total gas amount required for this transfer request. |  |
|**isSponsorApplicable** | **Boolean** | Indicates whether USDT (U) sponsorship is applied when the fee station balance is insufficient. |  |
|**sponsoredFeeAmount** | **String** | The amount of gas fee sponsored by USDT (U) when applicable. |  |



