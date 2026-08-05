

# PaymentPayoutParam


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The ID of the cryptocurrency you want to pay out. Specify this field when &#x60;payout_channel&#x60; is set to &#x60;Crypto&#x60;. Supported values: - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60; - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**amount** | **String** | The payout amount, provided as a decimal string. You can include up to two nonzero digits after the decimal point; trailing zeros beyond that (for example, &#x60;100.500&#x60;) are accepted, but a value with more than two nonzero fractional digits (for example, &#x60;100.567&#x60;) is rejected with an invalid amount format error instead of being rounded.  |  |



