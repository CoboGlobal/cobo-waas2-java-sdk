

# MerchantBalance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The merchant ID. |  |
|**tokenId** | **String** | The token ID, which is a unique identifier that specifies both the blockchain network and cryptocurrency token in the format &#x60;{CHAIN}_{TOKEN}&#x60;. |  |
|**acquiringType** | **AcquiringType** |  |  [optional] |
|**totalReceivedAmount** | **String** | The total amount of the token that has been received by the merchant. |  [optional] |
|**settledAmount** | **String** | The total amount of the token that has been paid out from the merchant&#39;s balance. |  [optional] |
|**payoutAmount** | **String** | This field is reserved for future use. |  [optional] |
|**refundedAmount** | **String** | The total amount of the token that has been refunded from the merchant&#39;s balance. |  [optional] |
|**totalBalance** | **String** |  The current balance of this token available to the merchant for payouts or refunds.  For more information, please refer to [Accounts and fund allocation](https://www.cobo.com/payments/en/guides/amounts-and-balances)  |  [optional] |
|**availableBalance** | **String** | This field has been deprecated.  |  [optional] |
|**lockedBalance** | **String** | This field is reserved for future use. |  [optional] |



