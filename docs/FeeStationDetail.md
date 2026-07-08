

# FeeStationDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeStationId** | **String** | The unique identifier of the Fee Station configuration to be applied. |  [optional] |
|**gasStationType** | **FeeStationGasStationType** |  |  [optional] |
|**coboPaidTokenIds** | **List&lt;String&gt;** | The list of token symbols for which gas fees are paid by Cobo. |  [optional] |
|**wallets** | [**List&lt;FeeStationWallet&gt;**](FeeStationWallet.md) | The list of wallet identifiers to which this fee station configuration applies. |  [optional] |
|**gasFuelStrategies** | [**List&lt;FeeStationDetailGasFuelStrategiesInner&gt;**](FeeStationDetailGasFuelStrategiesInner.md) | The list of gas fuel strategies. |  [optional] |
|**enableGasFeeSponsor** | **Boolean** | Indicates whether gas fee sponsorship is enabled. |  [optional] |



