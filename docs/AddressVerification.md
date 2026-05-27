

# AddressVerification

Summary of a self-custody address verification record. Returned as items in [List address verifications](#operation/list_address_verifications). Call [Get address verification](#operation/get_address_verification) with `verification_id` to retrieve method-specific provenance (`satoshi_test_detail` / `signature_detail`). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**verificationId** | **UUID** | The unique identifier of this verification record. |  |
|**address** | **String** | The counterparty (self-custody) wallet address being verified. |  |
|**chainId** | **String** | The chain on which this address is verified. |  |
|**status** | **AddressVerificationStatus** |  |  |
|**verificationMethod** | **AddressVerificationMethod** |  |  |
|**verifiedAt** | **Long** | Timestamp (milliseconds) when verification completed. &#x60;null&#x60; while &#x60;status&#x3D;PENDING&#x60; or &#x60;FAILED&#x60;. |  [optional] |



