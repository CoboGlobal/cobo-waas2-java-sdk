

# SolContractCallAccount

The information about the account involved in a Solana instruction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pubkey** | **String** | The public key of the account. If the account is a signer of this transaction, this property must be the same as the value of the &#x60;source.address&#x60; property.  |  |
|**isSigner** | **Boolean** | Whether the account is the signer of this transaction: - &#x60;true&#x60;: The account is a signer. - &#x60;false&#x60;: The account is not a signer.  |  |
|**isWritable** | **Boolean** | Whether the account can be modified by the instruction: - &#x60;true&#x60;: The account can be modified by the instruction. - &#x60;false&#x60;: The account cannot be modified by the instruction.  |  |



