

# AutoSweepTask

The auto sweep task information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taskId** | **UUID** | The auto sweep task ID. |  |
|**walletId** | **String** | The wallet ID. |  |
|**tokenId** | **String** | The token ID of the swept token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). |  |
|**status** | **AutoSweepTaskStatus** |  |  |
|**transactionIds** | **List&lt;String&gt;** | The IDs of the corresponding transactions of the auto sweep task. |  [optional] |
|**failedReasons** | **List&lt;String&gt;** | Failed reason of create auto sweep transaction. |  [optional] |
|**createdTimestamp** | **Long** | The time when the task was created, in Unix timestamp format, measured in milliseconds. |  |
|**updatedTimestamp** | **Long** | The time when the task was updated, in Unix timestamp format, measured in milliseconds. |  [optional] |



