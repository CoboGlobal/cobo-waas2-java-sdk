

# CreateKeyShareHolder

When creating MainKeyGroup and SigningKeyGroup, the Cobo key share holder will be added automatically.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Key share holder&#39;s name. |  [optional] |
|**type** | **KeyShareHolderType** |  |  [optional] |
|**tssNodeId** | **String** | Key share holder&#39;s TSS Node ID. For detailed information about signer types and their setup, see the [**Signer Type** table](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/holder-group-main-group). Mobile signers can view their TSS Node ID in the [Cobo Guard app](https://manuals.cobo.com/en/guard/manage). |  [optional] |
|**signer** | **Boolean** | Whether the key share holder has been selected as the designated transaction signer. For example, in a 2-3 [Threshold Signature Scheme (TSS)](https://manuals.cobo.com/en/portal/mpc-wallets/introduction#threshold-signature-scheme-tss), Cobo will serve as one signer, and you can choose one of the other two key share holders to act as the second transaction signer. - &#x60;true&#x60;: The key share holder is a designated transaction signer.  - &#x60;false&#x60;: The key share holder is not a designated transaction signer.  |  [optional] |



