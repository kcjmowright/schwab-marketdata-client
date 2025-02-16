# InstrumentsApi

All URIs are relative to *https://api.schwabapi.com/marketdata/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInstruments**](InstrumentsApi.md#getInstruments) | **GET** /instruments | Get Instruments by symbols and projections.
[**getInstrumentsByCusip**](InstrumentsApi.md#getInstrumentsByCusip) | **GET** /instruments/{cusip_id} | Get Instrument by specific cusip

<a name="getInstruments"></a>
# **getInstruments**
> InlineResponse2001 getInstruments(symbol, projection)

Get Instruments by symbols and projections.

Get Instruments details by using different projections.  Get more specific fundamental instrument data by using fundamental as the projection.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.marketdata.invoker.ApiClient;
//import com.kcjmowright.schwab.marketdata.invoker.ApiException;
//import com.kcjmowright.schwab.marketdata.invoker.Configuration;
//import com.kcjmowright.schwab.marketdata.invoker.auth.*;
//import com.kcjmowright.schwab.marketdata.api.InstrumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

InstrumentsApi apiInstance = new InstrumentsApi();
String symbol = "symbol_example"; // String | symbol of a security
String projection = "projection_example"; // String | search by
try {
    InlineResponse2001 result = apiInstance.getInstruments(symbol, projection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#getInstruments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| symbol of a security |
 **projection** | **String**| search by | [enum: symbol-search, symbol-regex, desc-search, desc-regex, search, fundamental]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInstrumentsByCusip"></a>
# **getInstrumentsByCusip**
> InstrumentResponse getInstrumentsByCusip(cusipId)

Get Instrument by specific cusip

Get basic instrument details by cusip

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.marketdata.invoker.ApiClient;
//import com.kcjmowright.schwab.marketdata.invoker.ApiException;
//import com.kcjmowright.schwab.marketdata.invoker.Configuration;
//import com.kcjmowright.schwab.marketdata.invoker.auth.*;
//import com.kcjmowright.schwab.marketdata.api.InstrumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

InstrumentsApi apiInstance = new InstrumentsApi();
String cusipId = "cusipId_example"; // String | cusip of a security
try {
    InstrumentResponse result = apiInstance.getInstrumentsByCusip(cusipId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#getInstrumentsByCusip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cusipId** | **String**| cusip of a security |

### Return type

[**InstrumentResponse**](InstrumentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

