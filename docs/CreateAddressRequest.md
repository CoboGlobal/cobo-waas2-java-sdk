

# CreateAddressRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chainId** | **String** | The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). |  |
|**count** | **Integer** | The number of addresses to create. This property will be ignored if you are generating tweaked Taproot addresses. |  |
|**taprootScriptTreeHashes** | **List&lt;String&gt;** | A list of script tree hashes used to generate a tweaked Taproot address. This property is required only if you want to generate tweaked Taproot addresses. |  [optional] |
|**taprootInternalAddress** | **String** | The original Taproot address to be tweaked. This property is required only if you want to generate tweaked Taproot addresses. |  [optional] |
|**encoding** | **AddressEncoding** |  |  [optional] |



