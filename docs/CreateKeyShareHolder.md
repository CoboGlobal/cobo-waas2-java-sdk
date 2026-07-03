

# CreateKeyShareHolder

When creating MainKeyGroup and SigningKeyGroup, the Cobo key share holder will be added automatically.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Key share holder&#39;s name. |  [optional] |
|**type** | **KeyShareHolderType** |  |  [optional] |
|**tssNodeId** | **String** | Key share holder&#39;s TSS Node ID. You can obtain the TSS Node ID using either mobile co-signer or server co-signer. See the \&quot;Primary Purposes\&quot; row on the table in [Create a Main Group](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/create-key-share-groups#create-a-main-group). |  [optional] |
|**signer** | **Boolean** | Whether the key share holder has been selected as the designated transaction signer. For example, in a 2-3 [Threshold Signature Scheme (TSS)](https://manuals.cobo.com/en/portal/mpc-wallets/introduction#threshold-signature-scheme-tss), Cobo will serve as one signer, and you can choose one of the other two key share holders to act as the second transaction signer. - &#x60;true&#x60;: The key share holder is a designated transaction signer.  - &#x60;false&#x60;: The key share holder is not a designated transaction signer.  |  [optional] |



