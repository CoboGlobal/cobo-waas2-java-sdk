

# SettlementDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | The fiat currency for the settlement. |  [optional] |
|**tokenId** | **String** | The ID of the cryptocurrency settled. |  [optional] |
|**chainId** | **String** | The ID of the blockchain network on which the settlement occurred. |  [optional] |
|**merchantId** | **String** | The ID of the merchant associated with this settlement. |  [optional] |
|**amount** | **String** | The settlement amount. - If &#x60;payout_channel&#x60; is set to &#x60;Crypto&#x60;, this represents the settlement amount in the specified cryptocurrency. - If &#x60;payout_channel&#x60; is set to &#x60;OffRamp&#x60;, this represents the settlement amount in the specified fiat currency.  |  [optional] |
|**settledAmount** | **String** | The settled amount of this settlement detail.  - If &#x60;payout_channel&#x60; is set to &#x60;Crypto&#x60;, this represents the actual settled amount in the specified cryptocurrency.  - If &#x60;payout_channel&#x60; is set to &#x60;OffRamp&#x60;, this represents the actual settled amount in the specified fiat currency.  |  [optional] |
|**status** | **SettleStatus** |  |  [optional] |
|**bankAccount** | [**BankAccount**](BankAccount.md) |  |  [optional] |
|**transactions** | [**List&lt;PaymentTransaction&gt;**](PaymentTransaction.md) | An array of transactions associated with this settlement request. Each transaction represents a separate blockchain operation related to the settlement process. |  [optional] |
|**createdTimestamp** | **Integer** | The creation time of the settlement, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The last update time of the settlement, represented as a UNIX timestamp in seconds. |  [optional] |
|**cryptoAddressId** | **String** | The ID of the crypto address used for crypto withdrawal. |  [optional] |
|**payoutChannel** | **PayoutChannel** |  |  [optional] |
|**acquiringType** | **AcquiringType** |  |  [optional] |



