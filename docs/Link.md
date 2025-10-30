

# Link


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** | The base URL of the payment page. This URL should be combined with the &#x60;token&#x60; parameter to form the complete payment link.  |  |
|**token** | **String** | The unique payment token that should be appended to the URL as a query parameter. This token authenticates and identifies the specific payment session.  The complete payment link should be constructed as: &#x60;[url]?token&#x3D;[token]&#x60;  |  |



