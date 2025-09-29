

# PolicyActionContent

The information of an app workflow policy quorum action content.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The quorum action content type. Possible values include:    - &#x60;FULL_APPROVAL&#x60;: The content type is approved by all persons.   - &#x60;PART_APPROVAL&#x60;: The content type is approved by some persons.  |  |
|**roles** | **List&lt;String&gt;** |  |  [optional] |
|**userIds** | **List&lt;String&gt;** |  |  [optional] |
|**threshold** | **Integer** | The number of persons need approved, such as 2. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FULL_APPROVAL | &quot;FULL_APPROVAL&quot; |
| PART_APPROVAL | &quot;PART_APPROVAL&quot; |



