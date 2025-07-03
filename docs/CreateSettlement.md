

# CreateSettlement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The merchant ID. Specify this field when &#x60;settlement_type&#x60; is set to &#x60;Merchant&#x60;. |  [optional] |
|**tokenId** | **String** | The ID of the cryptocurrency you want to settle. Specify this field when &#x60;payout_channel&#x60; is set to &#x60;Crypto&#x60;. Supported values:  - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60; - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  [optional] |
|**currency** | **String** | The fiat currency for settling the cryptocurrency. Currently, only &#x60;USD&#x60; is supported. Specify this field when &#x60;payout_channel&#x60; is set to &#x60;OffRamp&#x60;. |  [optional] |
|**amount** | **String** | The settlement amount. - If &#x60;payout_channel&#x60; is set to &#x60;Crypto&#x60;, this represents the settlement amount in the specified cryptocurrency. - If &#x60;payout_channel&#x60; is set to &#x60;OffRamp&#x60;, this represents the settlement amount in the specified fiat currency.  |  [optional] |
|**bankAccountId** | **UUID** | The ID of the bank account where the settled funds will be deposited. This field is only applicable when &#x60;payout_channel&#x60; is set to &#x60;OffRamp&#x60;. Call [List all bank accounts](/v2/api-references/payment/list-all-bank-accounts) to retrieve the IDs of registered bank accounts.  |  [optional] |
|**cryptoAddressId** | **String** | The ID of the crypto address used for crypto withdrawal. Specify this field when &#x60;payout_channel&#x60; is set to &#x60;Crypto&#x60;.  Call [List all crypto addresses](/v2/api-references/payments/list-all-crypto-addresses) to retrieve registered crypto addresses.  |  [optional] |
|**orderIds** | **List&lt;String&gt;** | A list of order IDs to be included in this settlement. If provided, the settlement request will settle the merchant funds received from the specified orders, and the &#x60;amount&#x60; field will be ignored.   This field is only applicable when &#x60;settlement_type&#x60; is set to &#x60;Merchant&#x60;.   |  [optional] |



