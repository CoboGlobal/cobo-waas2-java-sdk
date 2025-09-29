

# CreateSettlement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | Only used in Merchant settlement type. The merchant ID.  |  [optional] |
|**tokenId** | **String** | Only used in Crypto payout channel. The ID of the cryptocurrency you want to settle. Supported values:  - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60; - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**currency** | **String** | Only used in OffRamp payout channel. The fiat currency for settling the cryptocurrency. Currently, only &#x60;USD&#x60; is supported.  |  [optional] |
|**amount** | **String** | The settlement amount. - In Crypto payout channel, this represents the settlement amount in the specified cryptocurrency. - In OffRamp payout channel, this represents the settlement amount in the specified fiat currency.  |  [optional] |
|**bankAccountId** | **UUID** | ｜ Only used in OffRamp payout channel. The ID of the bank account where the settled funds will be deposited. |  [optional] |
|**cryptoAddressId** | **String** | Only used in Crypto payout channel. The ID of the pre-approved crypto address used for Crypto settlements. - The value must refer to a valid address that has been pre-configured and approved for the given token.  |  [optional] |
|**orderIds** | **List&lt;String&gt;** | A list of unique order IDs to be included in this settlement.  - This field is only applicable when &#x60;settlement_type&#x60; is set to &#x60;Merchant&#x60;. - If provided, the settlement will only apply to the specified orders. - The settlement &#x60;amount&#x60; must exactly match the total eligible amount from these orders. - This ensures consistency between the declared amount and the actual order-level data being settled.  |  [optional] |



