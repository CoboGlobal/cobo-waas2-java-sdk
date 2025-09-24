

# Stakings

The information about a staking position.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the staking position. |  |
|**walletId** | **String** | The staker&#39;s wallet ID. |  |
|**address** | **String** | The staker&#39;s wallet address. |  |
|**amounts** | [**List&lt;AmountDetailsInner&gt;**](AmountDetailsInner.md) | The details about the staking amount. |  |
|**poolId** | **StakingPoolId** |  |  |
|**tokenId** | **String** | The token ID. |  |
|**rewardsInfo** | **Object** | The information about the staking rewards. |  [optional] |
|**createdTimestamp** | **Long** | The time when the staking position was created. |  |
|**updatedTimestamp** | **Long** | The time when the staking position was last updated. |  |
|**validatorInfo** | [**BabylonValidator**](BabylonValidator.md) |  |  [optional] |
|**validators** | [**List&lt;BabylonValidator&gt;**](BabylonValidator.md) |  |  [optional] |
|**extra** | [**StakingsExtra**](StakingsExtra.md) |  |  [optional] |



