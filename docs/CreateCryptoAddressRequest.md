

# CreateCryptoAddressRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The token ID that identifies the cryptocurrency and its corresponding blockchain.  **Supported values**:   - **USDC**: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDCOIN&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC2&#x60;, &#x60;BSC_USDC&#x60;   - **USDT**: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**address** | **String** | The blockchain address where crypto withdrawals will be sent. Must be a valid address format for the blockchain specified by &#x60;token_id&#x60;. For example: - For &#x60;SOL_USDC&#x60;: Provide a Solana address. - For &#x60;ETH_USDT&#x60;: Provide an Ethereum address.  |  |
|**label** | **String** | A label to help identify the address&#39;s purpose.  |  [optional] |



