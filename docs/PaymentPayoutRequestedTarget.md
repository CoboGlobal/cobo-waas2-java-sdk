

# PaymentPayoutRequestedTarget


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targetType** | [**TargetTypeEnum**](#TargetTypeEnum) | The type of the payout target. |  |
|**address** | **String** | The recipient address. |  |
|**chainId** | **String** | The chain ID of the recipient address. |  |
|**bankAccountId** | **String** | The recipient bank account ID. |  |
|**accountAlias** | **String** | The alias of the recipient bank account. |  [optional] |
|**bankName** | **String** | The recipient bank name. |  [optional] |
|**currency** | **String** | The currency of the recipient bank account. |  [optional] |



## Enum: TargetTypeEnum

| Name | Value |
|---- | -----|
| BANKACCOUNT | &quot;BankAccount&quot; |



