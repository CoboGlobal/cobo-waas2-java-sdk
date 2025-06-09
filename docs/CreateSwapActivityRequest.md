

# CreateSwapActivityRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **String** | The unique identifier of the wallet to pay. |  |
|**address** | **String** | The wallet address. |  [optional] |
|**quoteId** | **UUID** | The unique identifier of the quote. |  |
|**appInitiator** | **String** | The initiator of the app activity. If you do not specify this property, the WaaS service will automatically designate the API key as the initiator. |  [optional] |
|**requestId** | **String** | The request id of the swap activity. |  [optional] |
|**destination** | [**AddressTransferDestination**](AddressTransferDestination.md) |  |  [optional] |



