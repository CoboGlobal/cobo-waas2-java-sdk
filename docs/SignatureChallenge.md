

# SignatureChallenge

A signature challenge for self-custody wallet verification. The wallet owner must sign the `challenge` string with the wallet associated with `address` and submit the signature via [Submit Travel Rule information for deposits](#operation/submit_deposit_travel_rule_info) or [withdrawals](#operation/submit_withdraw_travel_rule_info). The challenge is time-bounded — each call rotates the challenge and only the most recently-issued value will verify. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | The self-custody wallet address that must sign this challenge. This is the counterparty address for the transaction: for deposits it is the sender&#39;s wallet, and for withdrawals it is the recipient&#39;s wallet.  |  |
|**challenge** | **String** | The human-readable, time-sensitive message to sign. Contains the wallet address, a unique nonce, and a timestamp.  |  |
|**expiresIn** | **Integer** | Number of seconds before the challenge expires. The signature must be submitted within this window. |  |



