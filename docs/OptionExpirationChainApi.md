# OptionExpirationChainApi

All URIs are relative to *https://api.schwabapi.com/marketdata/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExpirationChain**](OptionExpirationChainApi.md#getExpirationChain) | **GET** /expirationchain | Get option expiration chain for an optionable symbol

<a name="getExpirationChain"></a>
# **getExpirationChain**
> ExpirationChain getExpirationChain(symbol)

Get option expiration chain for an optionable symbol

Get Option Expiration (Series) information for an optionable symbol.  Does not include individual options contracts for the underlying.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.marketdata.invoker.ApiClient;
//import com.kcjmowright.schwab.marketdata.invoker.ApiException;
//import com.kcjmowright.schwab.marketdata.invoker.Configuration;
//import com.kcjmowright.schwab.marketdata.invoker.auth.*;
//import com.kcjmowright.schwab.marketdata.api.OptionExpirationChainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

OptionExpirationChainApi apiInstance = new OptionExpirationChainApi();
String symbol = "symbol_example"; // String | Enter one symbol
try {
    ExpirationChain result = apiInstance.getExpirationChain(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OptionExpirationChainApi#getExpirationChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Enter one symbol |

### Return type

[**ExpirationChain**](ExpirationChain.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

