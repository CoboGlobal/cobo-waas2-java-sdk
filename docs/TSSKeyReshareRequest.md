

# TSSKeyReshareRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**oldGroupId** | **String** | The old TSS key share group ID. |  [optional] |
|**rootPubKey** | **String** | The The old TSS key share group&#39;s root extended public key. |  [optional] |
|**curve** | **TSSCurve** |  |  [optional] |
|**usedNodeIds** | **List&lt;String&gt;** |  |  [optional] |
|**oldThreshold** | **Integer** | The number of key share holders required to approve each operation in the old TSS key share group. |  [optional] |
|**newThreshold** | **Integer** | The number of key share holders required to approve each operation in the new TSS key share group. |  [optional] |
|**newNodeIds** | **List&lt;String&gt;** |  |  [optional] |
|**taskId** | **String** | The task ID. |  [optional] |
|**bizTaskId** | **String** | The business task ID. This field contains the TSS request ID. |  [optional] |



