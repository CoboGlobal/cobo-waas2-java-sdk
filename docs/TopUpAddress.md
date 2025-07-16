

# TopUpAddress

The details of a top-up address

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | The dedicated top-up address assigned to a specific payer under a merchant on a specified chain. |  |
|**payerId** | **String** | A unique identifier assigned by Cobo to track and identify individual payers. |  |
|**customPayerId** | **String** | A unique identifier assigned by the developer to track and identify individual payers in their system. |  |
|**merchantId** | **String** | The merchant ID. |  |
|**tokenId** | **String** | The token ID, which is a unique identifier that specifies both the blockchain network and cryptocurrency token in the format &#x60;{CHAIN}_{TOKEN}&#x60;. |  |
|**chain** | **String** | The chain ID. |  [optional] |
|**developerFeeRate** | **String** | The developer fee rate applied to top-up transactions made to this address. Expressed as a decimal string where \&quot;0.1\&quot; represents 10%. |  [optional] |
|**minAmount** | **String** | The minimum top-up amount allowed for this address. Top-ups below this threshold will not be credited to merchant or developer funds. |  |
|**createdTimestamp** | **Integer** | The creation time of the top-up address, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The last update time of the top-up address, represented as a UNIX timestamp in seconds. |  [optional] |



