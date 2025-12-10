

# KyaScreeningRequest

Individual address screening request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a request. The request ID is provided by you and must be unique within your organization. This ID is used for idempotency to prevent duplicate submissions and for troubleshooting purposes. |  |
|**address** | **String** | The blockchain address to be screened. For chains requiring memo (XRP, EOS, XLM, IOST, BNB_BNB, ATOM, LUNA, TON), append the memo to the address using \&quot;|\&quot; separator (e.g., \&quot;address|memo\&quot;).  |  |
|**chainId** | **String** | The chain identifier (e.g., ETH, BTC, TRON). |  |
|**note** | **String** | Optional note for this address screening. |  [optional] |



