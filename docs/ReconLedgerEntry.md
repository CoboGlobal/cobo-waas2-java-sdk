

# ReconLedgerEntry

The reconciliation ledger entry, representing an address's running balance after a transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | The transaction ID (the Cobo transaction ID you provided in &#x60;transaction_ids&#x60;). |  |
|**blockTime** | **Long** | The time when the block containing the transaction was created, in Unix timestamp format, measured in milliseconds. |  [optional] |
|**walletId** | **UUID** | The wallet ID. |  |
|**address** | **String** | The wallet address involved in this entry. |  |
|**tokenId** | **String** | The token ID, which is the unique identifier of a token. |  |
|**chainId** | **String** | The chain ID, which is the unique identifier of a blockchain. |  |
|**amount** | **String** | The transaction amount for this entry, expressed in the token&#39;s main unit (already divided by the token&#39;s decimals). The value is signed - positive for deposits and negative for withdrawals. |  |
|**balanceAfter** | **String** | The running balance of the address for this token after this transaction, expressed in the token&#39;s main unit. |  |
|**transactionHash** | **String** | The transaction hash on the blockchain. |  [optional] |
|**blockNumber** | **Long** | The number of the block containing the transaction. |  [optional] |



