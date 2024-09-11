

# CreateAddressRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chainId** | **String** | The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](/v2/api-references/wallets/list-enabled-chains). |  |
|**count** | **Integer** | The number of addresses to create. If you want to generate a tweaked address, &#x60;count&#x60; can only be &#x60;1&#x60;. |  |
|**taprootScriptTreeHash** | **String** | The information about the new address. This parameter is required only if you want to generate a tweaked address. |  [optional] |
|**taprootInternalAddress** | **String** | The address you want to tweak. This parameter is required only if you want to generate a tweaked address. |  [optional] |
|**encoding** | **AddressEncoding** |  |  [optional] |



