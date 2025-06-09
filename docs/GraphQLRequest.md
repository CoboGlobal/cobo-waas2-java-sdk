

# GraphQLRequest

The request body for a GraphQL query or mutation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**query** | **String** | The GraphQL query or mutation as a string. |  |
|**variables** | **Map&lt;String, Object&gt;** | Variables to use in the GraphQL operation. Can include dynamic values required for the query or mutation. |  [optional] |
|**operationName** | **String** | The operation name in case of multiple operations in the same query or mutation. |  [optional] |



