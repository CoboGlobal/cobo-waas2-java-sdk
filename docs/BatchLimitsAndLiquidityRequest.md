

# BatchLimitsAndLiquidityRequest

Batch swap limits and liquidity request.  Only the pay/receive token pair varies per item - the org (from auth context) and the wallet (`wallet_id`/`wallet_type`/`wallet_subtype`) are fixed for the whole batch, not per item. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **UUID** | The wallet ID, applied to every item in this batch. |  [optional] |
|**walletType** | **WalletType** |  |  [optional] |
|**walletSubtype** | **WalletSubtype** |  |  [optional] |
|**items** | [**List&lt;BatchLimitsAndLiquidityItem&gt;**](BatchLimitsAndLiquidityItem.md) | The pay/receive token pairs to query, up to 50 per request. |  |



