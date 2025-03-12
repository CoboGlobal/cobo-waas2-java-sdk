

# TransactionSolContractInstruction

sol contract instruction

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accounts** | [**List&lt;TransactionSolContractAccount&gt;**](TransactionSolContractAccount.md) |  |  [optional] |
|**data** | **String** | data used for calling Solana contract..  |  [optional] |
|**programId** | **String** | contract address. when calling a Solana contract, the to_address parameter needs to match the program_id parameter. If multiple contracts are being called, then the to_address parameter should match the program_id parameter of the first instruction.  |  [optional] |



