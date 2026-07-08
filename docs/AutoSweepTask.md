

# AutoSweepTask

Auto-sweep task information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taskId** | **UUID** | Auto-sweep task ID. |  |
|**walletId** | **String** | Wallet ID. |  |
|**tokenId** | **String** | Token ID of the swept token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). |  |
|**status** | **AutoSweepTaskStatus** |  |  |
|**transactionIds** | **List&lt;String&gt;** | IDs of the transactions triggered by the task. This array is empty while the task &#x60;status&#x60; is &#x60;Submitted&#x60;, and is populated only after the status becomes &#x60;TransactionCreated&#x60;. Poll [Get auto-sweep task details](https://www.cobo.com/developers/v2/api-references/autosweep/get-auto-sweep-task-details) until the transaction IDs are available.  |  [optional] |
|**failedReasons** | **List&lt;String&gt;** | Reasons why the task creation failed. |  [optional] |
|**createdTimestamp** | **Long** | The time when the task was created, in Unix timestamp format, measured in milliseconds. |  |
|**updatedTimestamp** | **Long** | The time when the task was updated, in Unix timestamp format, measured in milliseconds. |  [optional] |



