# QuoteRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cusips** | **List&lt;String&gt;** | List of cusip, max of 500 of symbols+cusip+ssids |  [optional]
**fields** | **String** | comma separated list of nodes in each quote&lt;br/&gt; possible values are quote,fundamental,reference,extended,regular. Dont send this attribute for full response. |  [optional]
**ssids** | **List&lt;Long&gt;** | List of Schwab securityid[SSID], max of 500 of symbols+cusip+ssids |  [optional]
**symbols** | **List&lt;String&gt;** | List of symbols, max of 500 of symbols+cusip+ssids |  [optional]
**realtime** | **Boolean** | Get realtime quotes and skip entitlement check |  [optional]
**indicative** | **Boolean** | Include indicative symbol quotes for all ETF symbols in request. If ETF symbol ABC is in request and indicative&#x3D;true API will return quotes for ABC and its corresponding indicative quote for $ABC.IV |  [optional]
