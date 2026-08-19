

# ReconDailyStatement

The daily reconciliation statement for a wallet and token on a business date.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bizDate** | **LocalDate** | The business date (UTC), in YYYY-MM-DD format. |  |
|**tokenId** | **String** | The token ID, which is the unique identifier of a token. |  |
|**chainId** | **String** | The chain ID, which is the unique identifier of a blockchain. |  |
|**walletId** | **UUID** | The wallet ID. |  |
|**openingBalance** | **String** | The opening balance at the start of the business date, expressed in the token&#39;s main unit. |  |
|**totalDeposit** | **String** | The total deposit amount during the business date, expressed in the token&#39;s main unit. |  |
|**depositCount** | **Integer** | The number of deposits during the business date. |  |
|**totalWithdrawal** | **String** | The total withdrawal amount during the business date, expressed in the token&#39;s main unit. |  |
|**withdrawalCount** | **Integer** | The number of withdrawals during the business date. |  |
|**closingBalance** | **String** | The closing balance at the end of the business date, expressed in the token&#39;s main unit. |  |
|**status** | **ReconStatementStatus** |  |  |



