

# Link


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** | The base URL of the payment page. This URL should be combined with the token parameter to form the complete payment link.  Example: &#x60;https://checkout.cobo.com/payment&#x60;  |  |
|**token** | **String** | The unique payment token that should be appended to the URL as a query parameter. This token authenticates and identifies the specific payment session.  The complete payment link should be constructed as: &#x60;[url]?token&#x3D;[token]&#x60;  |  |



