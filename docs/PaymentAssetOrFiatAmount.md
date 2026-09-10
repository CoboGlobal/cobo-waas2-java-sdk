

# PaymentAssetOrFiatAmount

An amount represented either as a cryptocurrency asset or a fiat currency.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amountType** | [**AmountTypeEnum**](#AmountTypeEnum) | The amount representation type. |  |
|**amount** | **String** | The amount, represented as a decimal string. |  |
|**tokenId** | **String** | The token ID of the asset. This field is present when &#x60;amount_type&#x60; is &#x60;Crypto&#x60;. |  [optional] |
|**chainId** | **String** | The chain ID of the asset. This field is present when &#x60;amount_type&#x60; is &#x60;Crypto&#x60;. |  [optional] |
|**currency** | **String** | The fiat currency code. This field is present when &#x60;amount_type&#x60; is &#x60;Fiat&#x60;. |  [optional] |



## Enum: AmountTypeEnum

| Name | Value |
|---- | -----|
| CRYPTO | &quot;Crypto&quot; |
| FIAT | &quot;Fiat&quot; |



