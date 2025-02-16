# PriceHistoryApi

All URIs are relative to *https://api.schwabapi.com/marketdata/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPriceHistory**](PriceHistoryApi.md#getPriceHistory) | **GET** /pricehistory | Get PriceHistory for a single symbol and date ranges.

<a name="getPriceHistory"></a>
# **getPriceHistory**
> CandleList getPriceHistory(symbol, periodType, period, frequencyType, frequency, startDate, endDate, needExtendedHoursData, needPreviousClose)

Get PriceHistory for a single symbol and date ranges.

Get historical Open, High, Low, Close, and Volume for a given frequency (i.e. aggregation).  Frequency available is dependent on periodType selected.  The datetime format is in EPOCH milliseconds.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.marketdata.invoker.ApiClient;
//import com.kcjmowright.schwab.marketdata.invoker.ApiException;
//import com.kcjmowright.schwab.marketdata.invoker.Configuration;
//import com.kcjmowright.schwab.marketdata.invoker.auth.*;
//import com.kcjmowright.schwab.marketdata.api.PriceHistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

PriceHistoryApi apiInstance = new PriceHistoryApi();
String symbol = "symbol_example"; // String | The Equity symbol used to look up price history
String periodType = "periodType_example"; // String | The chart period being requested.
Integer period = 56; // Integer | The number of chart period types.<br><br> If the periodType is <br> &#8226; <b>day</b> - valid values are 1, 2, 3, 4, 5, 10<br> &#8226; <b>month</b> - valid values are 1, 2, 3, 6<br> &#8226; <b>year</b> - valid values are 1, 2, 3, 5, 10, 15, 20<br> &#8226; <b>ytd</b> - valid values are 1<br><br> If   the period is not specified and the periodType is<br> &#8226; <b>day</b> - default period is 10.<br> &#8226; <b>month</b> - default period is 1.<br> &#8226; <b>year</b> - default period is 1.<br> &#8226; <b>ytd</b> - default period is 1.<br>
String frequencyType = "frequencyType_example"; // String | The time frequencyType<br><br> If the periodType is <br> &#8226; <b>day</b> - valid value is minute<br> &#8226; <b>month</b> - valid values are daily, weekly<br> &#8226; <b>year</b> - valid values are daily, weekly, monthly<br> &#8226; <b>ytd</b> - valid values are daily, weekly<br><br> If frequencyType  is not specified, default value depends on the periodType<br> &#8226; <b>day</b> - defaulted to minute.<br> &#8226; <b>month</b> - defaulted to weekly.<br> &#8226; <b>year</b> - defaulted to monthly.<br> &#8226; <b>ytd</b> - defaulted to weekly.<br>
Integer frequency = 56; // Integer | The time frequency duration<br><br> If the frequencyType is <br> &#8226; <b>minute</b> - valid values are 1, 5, 10, 15, 30<br> &#8226; <b>daily</b> - valid value is 1<br> &#8226; <b>weekly</b> - valid value is 1<br> &#8226; <b>monthly</b> - valid value is 1<br><br> If frequency  is not specified, default value is <b>1</b><br>
Long startDate = 789L; // Long | The start date, Time   in milliseconds since the UNIX epoch eg 1451624400000<br>If not   specified startDate will be (endDate - period) excluding weekends and holidays.
Long endDate = 789L; // Long | The end date, Time   in milliseconds since the UNIX epoch eg 1451624400000<br> If not   specified, the endDate will default to the market close of previous business day.
Boolean needExtendedHoursData = true; // Boolean | Need extended hours data
Boolean needPreviousClose = true; // Boolean | Need previous close price/date
try {
    CandleList result = apiInstance.getPriceHistory(symbol, periodType, period, frequencyType, frequency, startDate, endDate, needExtendedHoursData, needPreviousClose);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceHistoryApi#getPriceHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The Equity symbol used to look up price history |
 **periodType** | **String**| The chart period being requested. | [optional] [enum: day, month, year, ytd]
 **period** | **Integer**| The number of chart period types.&lt;br&gt;&lt;br&gt; If the periodType is &lt;br&gt; &amp;#8226; &lt;b&gt;day&lt;/b&gt; - valid values are 1, 2, 3, 4, 5, 10&lt;br&gt; &amp;#8226; &lt;b&gt;month&lt;/b&gt; - valid values are 1, 2, 3, 6&lt;br&gt; &amp;#8226; &lt;b&gt;year&lt;/b&gt; - valid values are 1, 2, 3, 5, 10, 15, 20&lt;br&gt; &amp;#8226; &lt;b&gt;ytd&lt;/b&gt; - valid values are 1&lt;br&gt;&lt;br&gt; If   the period is not specified and the periodType is&lt;br&gt; &amp;#8226; &lt;b&gt;day&lt;/b&gt; - default period is 10.&lt;br&gt; &amp;#8226; &lt;b&gt;month&lt;/b&gt; - default period is 1.&lt;br&gt; &amp;#8226; &lt;b&gt;year&lt;/b&gt; - default period is 1.&lt;br&gt; &amp;#8226; &lt;b&gt;ytd&lt;/b&gt; - default period is 1.&lt;br&gt; | [optional]
 **frequencyType** | **String**| The time frequencyType&lt;br&gt;&lt;br&gt; If the periodType is &lt;br&gt; &amp;#8226; &lt;b&gt;day&lt;/b&gt; - valid value is minute&lt;br&gt; &amp;#8226; &lt;b&gt;month&lt;/b&gt; - valid values are daily, weekly&lt;br&gt; &amp;#8226; &lt;b&gt;year&lt;/b&gt; - valid values are daily, weekly, monthly&lt;br&gt; &amp;#8226; &lt;b&gt;ytd&lt;/b&gt; - valid values are daily, weekly&lt;br&gt;&lt;br&gt; If frequencyType  is not specified, default value depends on the periodType&lt;br&gt; &amp;#8226; &lt;b&gt;day&lt;/b&gt; - defaulted to minute.&lt;br&gt; &amp;#8226; &lt;b&gt;month&lt;/b&gt; - defaulted to weekly.&lt;br&gt; &amp;#8226; &lt;b&gt;year&lt;/b&gt; - defaulted to monthly.&lt;br&gt; &amp;#8226; &lt;b&gt;ytd&lt;/b&gt; - defaulted to weekly.&lt;br&gt; | [optional] [enum: minute, daily, weekly, monthly]
 **frequency** | **Integer**| The time frequency duration&lt;br&gt;&lt;br&gt; If the frequencyType is &lt;br&gt; &amp;#8226; &lt;b&gt;minute&lt;/b&gt; - valid values are 1, 5, 10, 15, 30&lt;br&gt; &amp;#8226; &lt;b&gt;daily&lt;/b&gt; - valid value is 1&lt;br&gt; &amp;#8226; &lt;b&gt;weekly&lt;/b&gt; - valid value is 1&lt;br&gt; &amp;#8226; &lt;b&gt;monthly&lt;/b&gt; - valid value is 1&lt;br&gt;&lt;br&gt; If frequency  is not specified, default value is &lt;b&gt;1&lt;/b&gt;&lt;br&gt; | [optional]
 **startDate** | **Long**| The start date, Time   in milliseconds since the UNIX epoch eg 1451624400000&lt;br&gt;If not   specified startDate will be (endDate - period) excluding weekends and holidays. | [optional]
 **endDate** | **Long**| The end date, Time   in milliseconds since the UNIX epoch eg 1451624400000&lt;br&gt; If not   specified, the endDate will default to the market close of previous business day. | [optional]
 **needExtendedHoursData** | **Boolean**| Need extended hours data | [optional]
 **needPreviousClose** | **Boolean**| Need previous close price/date | [optional]

### Return type

[**CandleList**](CandleList.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

