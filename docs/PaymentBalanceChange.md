

# PaymentBalanceChange


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceId** | **String** | The source ID of the balance change. |  |
|**sourceType** | **PaymentBalanceChangeSourceType** |  |  |
|**tokenId** | **String** | The token ID of the balance change. |  |
|**amount** | **String** | The balance change amount, truncated to two decimal places and represented as a numeric string. |  |
|**amountRaw** | **String** | The balance change amount in the token&#39;s decimal precision, represented as a numeric string. |  |
|**balanceBefore** | **String** | The account balance before the balance change, truncated to two decimal places and represented as a numeric string. |  |
|**balanceBeforeRaw** | **String** | The account balance before the balance change in the token&#39;s decimal precision, represented as a numeric string. |  |
|**balanceAfter** | **String** | The account balance after the balance change, truncated to two decimal places and represented as a numeric string. |  |
|**balanceAfterRaw** | **String** | The account balance after the balance change in the token&#39;s decimal precision, represented as a numeric string. |  |
|**flowDirection** | **PaymentBalanceFlowDirection** |  |  |
|**createdTimestamp** | **Long** | The time when the balance change was created, represented as a UNIX timestamp in seconds. |  |



