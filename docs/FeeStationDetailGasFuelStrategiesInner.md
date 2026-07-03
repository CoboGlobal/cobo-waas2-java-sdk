

# FeeStationDetailGasFuelStrategiesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**chainIdentify** | **String** |  |  [optional] |
|**feeStationId** | **String** |  |  [optional] |
|**fuelType** | [**FuelTypeEnum**](#FuelTypeEnum) | - -1: Unknown - 0: 不使用加油功能 - 1: 被动使用gas station功能：当地址余额不足时，gas station地址将交易支付手续费 - 2: 所有交易的手续费由gas station地址支付 - 3: 加油交易，使用 portal 侧的配置  |  [optional] |
|**priority** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**createdTime** | **Integer** |  |  [optional] |
|**updatedTime** | **Integer** |  |  [optional] |



## Enum: FuelTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_MINUS_1 | -1 |
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



