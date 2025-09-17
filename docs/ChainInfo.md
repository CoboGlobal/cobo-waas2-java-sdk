

# ChainInfo

The chain information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chainId** | **String** | The chain ID, which is the unique identifier of a blockchain. |  |
|**symbol** | **String** | The chain symbol for display purposes, which is the abbreviated name of a chain. |  [optional] |
|**iconUrl** | **String** | The URL of the chain icon. |  [optional] |
|**chainIdentifier** | **String** | A functional identifier used to group blockchains with similar execution logic. For example, &#x60;ETH&#x60; for all EVM-compatible chains (Ethereum, BNB Smart Chain, Polygon). |  [optional] |
|**explorerTxUrl** | **String** | The transaction URL pattern on the blockchain explorer. You can use it to concatenate the transaction URLs. |  [optional] |
|**explorerAddressUrl** | **String** | The address URL pattern on the blockchain explorer. You can use it to concatenate the address URLs. |  [optional] |
|**requireMemo** | **Boolean** | Whether the chain requires a memo. |  [optional] |
|**confirmingThreshold** | **Integer** | The number of confirmations required for an on-chain transaction, such as 64 for Ethereum. |  [optional] |
|**coinbaseMaturity** | **Integer** | The number of confirmations required before a coinbase transaction is considered mature and can be spent, for example, 100 confirmations for BTC. |  [optional] |



