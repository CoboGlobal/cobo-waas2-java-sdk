

# AllocationParam


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The ID of the cryptocurrency you want to allocation. Supported values:  - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60; - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**amount** | **String** | The allocation amount.  |  |
|**sourceAccount** | **String** | The source account from which the allocation will be deducted. - If the source account is a merchant account, provide the merchant&#39;s ID (e.g., \&quot;M1001\&quot;). - If the source account is the developer account, use the string &#x60;\&quot;developer\&quot;&#x60;.  |  |
|**destinationAccount** | **String** | The destination account to which the allocation will be credited. - If the destination account is a merchant account, provide the merchant&#39;s ID (e.g., \&quot;M1001\&quot;). - If the destination account is the developer account, use the string &#x60;\&quot;developer\&quot;&#x60;.  |  |
|**description** | **String** | The description of the allocation. |  |



