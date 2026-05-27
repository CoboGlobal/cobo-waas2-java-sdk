

# SignatureDetail

Details of an off-chain signature that verified a self-custody address. Returned only when `verification_method=SIGNATURE`. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | The self-custody wallet address that signed the challenge. |  |
|**challenge** | **String** | The challenge string that was signed. |  [optional] |
|**signature** | **String** | The wallet signature submitted by the client. |  [optional] |
|**verifiedAt** | **Long** | Timestamp (milliseconds) when the signature was verified. |  [optional] |



