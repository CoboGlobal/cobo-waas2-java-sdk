

# ChainInfo

The chain information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chainId** | **String** | The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](/v2/api-references/wallets/list-enabled-chains). |  |
|**symbol** | **String** | The chain symbol, which is the abbreviated name of a chain. |  [optional] |
|**iconUrl** | **String** | The URL of the chain icon. |  [optional] |
|**explorerTxUrl** | **String** | The transaction URL pattern on the blockchain explorer. You can use it to concatenate the transaction URLs. |  [optional] |
|**explorerAddressUrl** | **String** | The address URL pattern on the blockchain explorer. You can use it to concatenate the address URLs. |  [optional] |
|**requireMemo** | **Boolean** | Whether the chain requires a memo. |  [optional] |
|**confirmingThreshold** | **Integer** | Number of confirmations required for a transaction, such as 64 for ETH chain. |  [optional] |



