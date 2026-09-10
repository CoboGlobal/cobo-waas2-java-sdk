

# BabylonStakingRegistration

The details of aBabylon Phase-2 registration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The registration ID, a unique identifier for tracking the staking registration. |  [optional] |
|**stakingId** | **String** | The ID of the Phase-1 BTC staking position. |  [optional] |
|**babylonAddress** | [**StakingSource**](StakingSource.md) |  |  [optional] |
|**btcAddress** | [**StakingSource**](StakingSource.md) |  |  [optional] |
|**status** | **BabylonRegistrationRequestStatus** |  |  [optional] |
|**stakedAmount** | **String** | The amount of BTC that is staked. |  [optional] |
|**errorMessage** | **String** | The error message if the Babylon Phase-2 registration request failed. |  [optional] |
|**createdTimestamp** | **Long** | The time when the registration was created, in Unix timestamp format, measured in milliseconds. |  [optional] |
|**updatedTimestamp** | **Long** | The time when the registration was updated, in Unix timestamp format, measured in milliseconds. |  [optional] |



