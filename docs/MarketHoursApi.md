# MarketHoursApi

All URIs are relative to *https://api.schwabapi.com/marketdata/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMarketHour**](MarketHoursApi.md#getMarketHour) | **GET** /markets/{market_id} | Get Market Hours for a single market.
[**getMarketHours**](MarketHoursApi.md#getMarketHours) | **GET** /markets | Get Market Hours for different markets.

<a name="getMarketHour"></a>
# **getMarketHour**
> Map&lt;String, Map&lt;String, Hours&gt;&gt; getMarketHour(marketId, date)

Get Market Hours for a single market.

Get Market Hours for dates in the future for a single market.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.marketdata.invoker.ApiClient;
//import com.kcjmowright.schwab.marketdata.invoker.ApiException;
//import com.kcjmowright.schwab.marketdata.invoker.Configuration;
//import com.kcjmowright.schwab.marketdata.invoker.auth.*;
//import com.kcjmowright.schwab.marketdata.api.MarketHoursApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

MarketHoursApi apiInstance = new MarketHoursApi();
String marketId = "marketId_example"; // String | market id
LocalDate date = new LocalDate(); // LocalDate | Valid date range is from currentdate to 1 year from today. It will default to current day if not entered. Date format:YYYY-MM-DD
try {
    Map<String, Map<String, Hours>> result = apiInstance.getMarketHour(marketId, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketHoursApi#getMarketHour");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketId** | **String**| market id | [enum: equity, option, bond, future, forex]
 **date** | **LocalDate**| Valid date range is from currentdate to 1 year from today. It will default to current day if not entered. Date format:YYYY-MM-DD | [optional]

### Return type

[**Map&lt;String, Map&lt;String, Hours&gt;&gt;**](Map.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketHours"></a>
# **getMarketHours**
> Map&lt;String, Map&lt;String, Hours&gt;&gt; getMarketHours(markets, date)

Get Market Hours for different markets.

Get Market Hours for dates in the future across different markets.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.marketdata.invoker.ApiClient;
//import com.kcjmowright.schwab.marketdata.invoker.ApiException;
//import com.kcjmowright.schwab.marketdata.invoker.Configuration;
//import com.kcjmowright.schwab.marketdata.invoker.auth.*;
//import com.kcjmowright.schwab.marketdata.api.MarketHoursApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

MarketHoursApi apiInstance = new MarketHoursApi();
List<String> markets = Arrays.asList("markets_example"); // List<String> | List of markets
LocalDate date = new LocalDate(); // LocalDate | Valid date range is from currentdate to 1 year from today. It will default to current day if not entered. Date format:YYYY-MM-DD
try {
    Map<String, Map<String, Hours>> result = apiInstance.getMarketHours(markets, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketHoursApi#getMarketHours");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **markets** | [**List&lt;String&gt;**](String.md)| List of markets | [enum: equity, option, bond, future, forex]
 **date** | **LocalDate**| Valid date range is from currentdate to 1 year from today. It will default to current day if not entered. Date format:YYYY-MM-DD | [optional]

### Return type

[**Map&lt;String, Map&lt;String, Hours&gt;&gt;**](Map.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

