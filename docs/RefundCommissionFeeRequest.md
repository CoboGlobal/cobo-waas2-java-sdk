

# RefundCommissionFeeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | A client-generated request identifier used for idempotency. The request_id must be unique within the same organization.  |  |
|**commissionFeeId** | **String** | The unique identifier of the commission fee to be refunded. Each commission fee can be refunded only once.  |  |
|**normalizedAmount** | **String** | Must be less than or equal to the total charged amount, partial refunds are supported, and multiple refund requests may be made  |  |



