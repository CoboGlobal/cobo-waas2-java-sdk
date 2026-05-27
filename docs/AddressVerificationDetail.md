

# AddressVerificationDetail

Full detail of a single address verification record, including method-specific provenance.  - `verification_method=SIGNATURE` → `signature_detail` is populated, `satoshi_test_detail` is `null`. - `verification_method=SATOSHI_TEST` → `satoshi_test_detail` carries the latest challenge state (`status`, `remaining_seconds`, `matched_txid`); `signature_detail` is `null`. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**verificationId** | **UUID** | The unique identifier of this verification record. |  |
|**address** | **String** | The counterparty (self-custody) wallet address being verified. |  |
|**chainId** | **String** | The chain on which this address is verified. |  |
|**status** | **AddressVerificationStatus** |  |  |
|**verificationMethod** | **AddressVerificationMethod** |  |  |
|**verifiedAt** | **Long** | Timestamp (milliseconds) when verification completed. &#x60;null&#x60; while &#x60;status&#x3D;PENDING&#x60; or &#x60;FAILED&#x60;. |  [optional] |
|**satoshiTestDetail** | [**AddressVerificationDetailSatoshiTestDetail**](AddressVerificationDetailSatoshiTestDetail.md) |  |  [optional] |
|**signatureDetail** | [**AddressVerificationDetailSignatureDetail**](AddressVerificationDetailSignatureDetail.md) |  |  [optional] |



