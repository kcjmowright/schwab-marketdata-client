# MoversApi

All URIs are relative to *https://api.schwabapi.com/marketdata/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMovers**](MoversApi.md#getMovers) | **GET** /movers/{symbol_id} | Get Movers for a specific index.

<a name="getMovers"></a>
# **getMovers**
> InlineResponse200 getMovers(symbolId, sort, frequency)

Get Movers for a specific index.

Get a list of top 10 securities movement for a specific index.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.marketdata.invoker.ApiClient;
//import com.kcjmowright.schwab.marketdata.invoker.ApiException;
//import com.kcjmowright.schwab.marketdata.invoker.Configuration;
//import com.kcjmowright.schwab.marketdata.invoker.auth.*;
//import com.kcjmowright.schwab.marketdata.api.MoversApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

MoversApi apiInstance = new MoversApi();
String symbolId = "symbolId_example"; // String | Index Symbol
String sort = "sort_example"; // String | Sort by a particular attribute
Integer frequency = 0; // Integer | To return movers with the specified directions of up or down
try {
    InlineResponse200 result = apiInstance.getMovers(symbolId, sort, frequency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoversApi#getMovers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbolId** | **String**| Index Symbol | [enum: $DJI, $COMPX, $SPX, NYSE, NASDAQ, OTCBB, INDEX_ALL, EQUITY_ALL, OPTION_ALL, OPTION_PUT, OPTION_CALL]
 **sort** | **String**| Sort by a particular attribute | [optional] [enum: VOLUME, TRADES, PERCENT_CHANGE_UP, PERCENT_CHANGE_DOWN]
 **frequency** | **Integer**| To return movers with the specified directions of up or down | [optional] [default to 0] [enum: 0, 1, 5, 10, 30, 60]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

