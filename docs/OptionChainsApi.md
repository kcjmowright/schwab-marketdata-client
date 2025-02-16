# OptionChainsApi

All URIs are relative to *https://api.schwabapi.com/marketdata/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChain**](OptionChainsApi.md#getChain) | **GET** /chains | Get option chain for an optionable Symbol

<a name="getChain"></a>
# **getChain**
> OptionChain getChain(symbol, contractType, strikeCount, includeUnderlyingQuote, strategy, interval, strike, range, fromDate, toDate, volatility, underlyingPrice, interestRate, daysToExpiration, expMonth, optionType, entitlement)

Get option chain for an optionable Symbol

Get Option Chain including information on options contracts associated with each expiration.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.marketdata.invoker.ApiClient;
//import com.kcjmowright.schwab.marketdata.invoker.ApiException;
//import com.kcjmowright.schwab.marketdata.invoker.Configuration;
//import com.kcjmowright.schwab.marketdata.invoker.auth.*;
//import com.kcjmowright.schwab.marketdata.api.OptionChainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

OptionChainsApi apiInstance = new OptionChainsApi();
String symbol = "symbol_example"; // String | Enter one symbol
String contractType = "contractType_example"; // String | Contract Type
Integer strikeCount = 56; // Integer | The Number of strikes to return above or below the at-the-money price
Boolean includeUnderlyingQuote = true; // Boolean | Underlying quotes to be included
String strategy = "strategy_example"; // String | OptionChain strategy. Default is SINGLE. ANALYTICAL allows the use of volatility, underlyingPrice, interestRate, and daysToExpiration params to calculate theoretical values.
Double interval = 3.4D; // Double | Strike interval for spread strategy chains (see strategy param)
Double strike = 3.4D; // Double | Strike Price
String range = "range_example"; // String | Range(ITM/NTM/OTM etc.)
LocalDate fromDate = new LocalDate(); // LocalDate | From date(pattern: yyyy-MM-dd)
LocalDate toDate = new LocalDate(); // LocalDate | To date (pattern: yyyy-MM-dd)
Double volatility = 3.4D; // Double | Volatility to use in calculations.  Applies only to ANALYTICAL strategy chains (see strategy param)
Double underlyingPrice = 3.4D; // Double | Underlying price to use in calculations. Applies only to ANALYTICAL strategy chains (see strategy param)
Double interestRate = 3.4D; // Double | Interest rate to use in calculations. Applies only to ANALYTICAL strategy chains (see strategy param)
Integer daysToExpiration = 56; // Integer | Days to expiration to use in calculations. Applies only to ANALYTICAL strategy chains (see strategy param)
String expMonth = "expMonth_example"; // String | Expiration month
String optionType = "optionType_example"; // String | Option Type
String entitlement = "entitlement_example"; // String | Applicable only if its retail token, entitlement of client PP-PayingPro, NP-NonPro and PN-NonPayingPro
try {
    OptionChain result = apiInstance.getChain(symbol, contractType, strikeCount, includeUnderlyingQuote, strategy, interval, strike, range, fromDate, toDate, volatility, underlyingPrice, interestRate, daysToExpiration, expMonth, optionType, entitlement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OptionChainsApi#getChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Enter one symbol |
 **contractType** | **String**| Contract Type | [optional] [enum: CALL, PUT, ALL]
 **strikeCount** | **Integer**| The Number of strikes to return above or below the at-the-money price | [optional]
 **includeUnderlyingQuote** | **Boolean**| Underlying quotes to be included | [optional]
 **strategy** | **String**| OptionChain strategy. Default is SINGLE. ANALYTICAL allows the use of volatility, underlyingPrice, interestRate, and daysToExpiration params to calculate theoretical values. | [optional] [enum: SINGLE, ANALYTICAL, COVERED, VERTICAL, CALENDAR, STRANGLE, STRADDLE, BUTTERFLY, CONDOR, DIAGONAL, COLLAR, ROLL]
 **interval** | **Double**| Strike interval for spread strategy chains (see strategy param) | [optional]
 **strike** | **Double**| Strike Price | [optional]
 **range** | **String**| Range(ITM/NTM/OTM etc.) | [optional]
 **fromDate** | **LocalDate**| From date(pattern: yyyy-MM-dd) | [optional]
 **toDate** | **LocalDate**| To date (pattern: yyyy-MM-dd) | [optional]
 **volatility** | **Double**| Volatility to use in calculations.  Applies only to ANALYTICAL strategy chains (see strategy param) | [optional]
 **underlyingPrice** | **Double**| Underlying price to use in calculations. Applies only to ANALYTICAL strategy chains (see strategy param) | [optional]
 **interestRate** | **Double**| Interest rate to use in calculations. Applies only to ANALYTICAL strategy chains (see strategy param) | [optional]
 **daysToExpiration** | **Integer**| Days to expiration to use in calculations. Applies only to ANALYTICAL strategy chains (see strategy param) | [optional]
 **expMonth** | **String**| Expiration month | [optional] [enum: JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC, ALL]
 **optionType** | **String**| Option Type | [optional]
 **entitlement** | **String**| Applicable only if its retail token, entitlement of client PP-PayingPro, NP-NonPro and PN-NonPayingPro | [optional] [enum: PN, NP, PP]

### Return type

[**OptionChain**](OptionChain.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

