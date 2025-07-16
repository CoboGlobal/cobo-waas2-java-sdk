

# EstimatedSOLFeeSlow


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**computeUnitPrice** | **String** | The price paid per compute unit. This value determines the priority fee for the transaction, allowing you to increase inclusion probability in congested conditions. |  |
|**computeUnitLimit** | **String** | The maximum number of compute units your transaction is allowed to consume. It sets an upper bound on computational resource usage to prevent overload. |  |
|**baseFee** | **String** | A fixed fee charged per signature. The default is 5,000 lamports per signature. |  |
|**rentAmount** | **String** | The rent fee charged by the network to store non–rent-exempt accounts on-chain. It is deducted periodically until the account maintains the minimum balance required for rent exemption. |  [optional] |



