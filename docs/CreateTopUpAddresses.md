

# CreateTopUpAddresses

The request body to batch create top-up address.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The merchant ID. If not provided, the default merchant created during organization initialization will be used. |  [optional] |
|**tokenId** | **String** | The token ID, which identifies the cryptocurrency.  |  |
|**customPayerIds** | **List&lt;String&gt;** | A list of unique custom payer IDs required to create top-up addresses. The maximum number of items is 50.  |  |



