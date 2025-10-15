

# MerchantBalance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The merchant ID. |  |
|**tokenId** | **String** | The token ID, which is a unique identifier that specifies both the blockchain network and cryptocurrency token in the format &#x60;{CHAIN}_{TOKEN}&#x60;. |  |
|**acquiringType** | **AcquiringType** |  |  |
|**totalReceivedAmount** | **String** | The total amount of the token that has been received by the merchant. |  [optional] |
|**settledAmount** | **String** | The total amount of the token that has been paid out from the merchant&#39;s balance. |  [optional] |
|**refundedAmount** | **String** | The total amount of the token that has been refunded from the merchant&#39;s balance. |  [optional] |
|**totalBalance** | **String** |  The total balance of the token available for payout or refund for the merchant.  &#x60;total_balance&#x60; &#x3D; &#x60;total_received_amount&#x60; - &#x60;settled_amount&#x60; - &#x60;refunded_amount&#x60;  For more information, please refer to [Amounts and Balances](/v2_cn/payments/amounts-and-balances)  |  [optional] |
|**availableBalance** | **String** | This field has been deprecated. |  [optional] |



