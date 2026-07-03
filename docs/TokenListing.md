

# TokenListing

Detailed information about a token listing request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | Unique identifier of the token listing request |  |
|**chainId** | **String** | chain_id of the blockchain where the token exists |  |
|**contractAddress** | **String** | Contract address of the token |  |
|**walletType** | **WalletType** |  |  |
|**walletSubtype** | **WalletSubtype** |  |  |
|**token** | [**TokenInfo**](TokenInfo.md) |  |  [optional] |
|**status** | **TokenListingRequestStatus** |  |  |
|**source** | **TokenListingRequestSource** |  |  [optional] |
|**feedback** | **String** | Feedback provided by the admin for rejected requests |  [optional] |
|**createdTimestamp** | **Long** | Timestamp when the request was created (in milliseconds since Unix epoch) |  [optional] |
|**updatedTimestamp** | **Long** | Timestamp when the request was last updated (in milliseconds since Unix epoch) |  [optional] |



