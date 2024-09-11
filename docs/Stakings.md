

# Stakings

The information about a staking position.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the staking position. |  |
|**walletId** | **String** | The staker&#39;s wallet ID. |  |
|**address** | **String** | The staker&#39;s wallet address. |  |
|**amounts** | [**List&lt;AmountDetailsInner&gt;**](AmountDetailsInner.md) | The details about the staking amount. |  |
|**poolId** | **String** | The ID of the staking pool. |  |
|**tokenId** | **String** | The token ID. |  |
|**rewardsInfo** | **Object** | The information about the staking rewards. |  [optional] |
|**createdTimestamp** | **Long** | The time when the staking position was created. |  |
|**updatedTimestamp** | **Long** | The time when the staking position was last updated. |  |
|**validatorInfo** | [**StakingsValidatorInfo**](StakingsValidatorInfo.md) |  |  |
|**extra** | [**StakingsExtra**](StakingsExtra.md) |  |  [optional] |



