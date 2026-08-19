

# CreateBankWithdrawalRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a bank withdrawal request. The request ID is provided by you and must be unique. |  |
|**sourceBankAccountId** | **String** | The source bank account ID. The destination bank account must be tagged as &#x60;VA&#x60;. Cobo uses the mapped VA account to initiate the withdrawal.  |  |
|**targetBankAccountId** | **String** | The target bank account ID that receives the bank withdrawal. |  |
|**currency** | **String** | The fiat currency of the bank withdrawal. |  |
|**amount** | **String** | The bank withdrawal amount. |  |
|**remark** | **String** | The remark for the bank withdrawal. |  [optional] |



