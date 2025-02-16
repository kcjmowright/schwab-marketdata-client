# QuotesApi

All URIs are relative to *https://api.schwabapi.com/marketdata/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getQuote**](QuotesApi.md#getQuote) | **GET** /{symbol_id}/quotes | Get Quote by single symbol.
[**getQuotes**](QuotesApi.md#getQuotes) | **GET** /quotes | Get Quotes by list of symbols.

<a name="getQuote"></a>
# **getQuote**
> QuoteResponse getQuote(symbolId, fields)

Get Quote by single symbol.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.marketdata.invoker.ApiClient;
//import com.kcjmowright.schwab.marketdata.invoker.ApiException;
//import com.kcjmowright.schwab.marketdata.invoker.Configuration;
//import com.kcjmowright.schwab.marketdata.invoker.auth.*;
//import com.kcjmowright.schwab.marketdata.api.QuotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

QuotesApi apiInstance = new QuotesApi();
String symbolId = "symbolId_example"; // String | Symbol of instrument
String fields = "all"; // String | Request for subset of data by passing coma separated list of root nodes, possible root nodes are quote, fundamental, extended, reference, regular. Sending `quote, fundamental` in request will return quote and fundamental data in response. Dont send this attribute for full response.
try {
    QuoteResponse result = apiInstance.getQuote(symbolId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#getQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbolId** | **String**| Symbol of instrument |
 **fields** | **String**| Request for subset of data by passing coma separated list of root nodes, possible root nodes are quote, fundamental, extended, reference, regular. Sending &#x60;quote, fundamental&#x60; in request will return quote and fundamental data in response. Dont send this attribute for full response. | [optional] [default to all]

### Return type

[**QuoteResponse**](QuoteResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuotes"></a>
# **getQuotes**
> QuoteResponse getQuotes(symbols, fields, indicative)

Get Quotes by list of symbols.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.marketdata.invoker.ApiClient;
//import com.kcjmowright.schwab.marketdata.invoker.ApiException;
//import com.kcjmowright.schwab.marketdata.invoker.Configuration;
//import com.kcjmowright.schwab.marketdata.invoker.auth.*;
//import com.kcjmowright.schwab.marketdata.api.QuotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

QuotesApi apiInstance = new QuotesApi();
String symbols = "symbols_example"; // String | Comma separated list of symbol(s) to look up a quote
String fields = "all"; // String | Request for subset of data by passing coma separated list of root nodes, possible root nodes are quote, fundamental, extended, reference, regular. Sending `quote, fundamental` in request will return quote and fundamental data in response. Dont send this attribute for full response.
Boolean indicative = true; // Boolean | Include indicative symbol quotes for all ETF symbols in request. If ETF symbol ABC is in request and indicative=true API will return quotes for ABC and its corresponding indicative quote for $ABC.IV
try {
    QuoteResponse result = apiInstance.getQuotes(symbols, fields, indicative);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#getQuotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbols** | **String**| Comma separated list of symbol(s) to look up a quote | [optional]
 **fields** | **String**| Request for subset of data by passing coma separated list of root nodes, possible root nodes are quote, fundamental, extended, reference, regular. Sending &#x60;quote, fundamental&#x60; in request will return quote and fundamental data in response. Dont send this attribute for full response. | [optional] [default to all]
 **indicative** | **Boolean**| Include indicative symbol quotes for all ETF symbols in request. If ETF symbol ABC is in request and indicative&#x3D;true API will return quotes for ABC and its corresponding indicative quote for $ABC.IV | [optional]

### Return type

[**QuoteResponse**](QuoteResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

