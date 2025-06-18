

# PolicyActionContent

The definition of the quorum action. This property is applicable only when `action_type` is `Quorum`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The quorum type. Possible values include:    - &#x60;FULL_APPROVAL&#x60;: Requires approval from all participants.   - &#x60;PART_APPROVAL&#x60;: Requires approval from a specified number of participants.  |  |
|**roles** | **List&lt;String&gt;** | The roles included in the quorum. Possible values include &#x60;admin&#x60;, &#x60;spender&#x60;, &#x60;operator&#x60;, and &#x60;approver&#x60;. |  [optional] |
|**userIds** | **List&lt;String&gt;** | The ID of the users included in the quorum. |  [optional] |
|**threshold** | **Integer** | The number of approvers required to meet the quorum. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FULL_APPROVAL | &quot;FULL_APPROVAL&quot; |
| PART_APPROVAL | &quot;PART_APPROVAL&quot; |



