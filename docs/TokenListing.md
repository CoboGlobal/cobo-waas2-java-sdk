

# TokenListing

Detailed information about a token listing request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The unique identifier of the token listing request. |  |
|**chainId** | **String** | The ID of the blockchain where the token is deployed. |  |
|**contractAddress** | **String** | The token&#39;s contract address on the specified blockchain. |  |
|**walletType** | **WalletType** |  |  |
|**walletSubtype** | **WalletSubtype** |  |  |
|**token** | [**TokenInfo**](TokenInfo.md) |  |  [optional] |
|**status** | **TokenListingRequestStatus** |  |  |
|**source** | **TokenListingRequestSource** |  |  [optional] |
|**feedback** | **String** | The feedback provided by Cobo when a token listing request is rejected. |  [optional] |
|**createdTimestamp** | **Long** | The time when the request was created in Unix timestamp format, measured in milliseconds. |  [optional] |
|**updatedTimestamp** | **Long** | The time when the request was last updated in Unix timestamp format, measured in milliseconds. |  [optional] |



