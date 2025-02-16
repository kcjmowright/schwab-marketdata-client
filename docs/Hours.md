# Hours

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **String** |  |  [optional]
**marketType** | [**MarketTypeEnum**](#MarketTypeEnum) |  |  [optional]
**exchange** | **String** |  |  [optional]
**category** | **String** |  |  [optional]
**product** | **String** |  |  [optional]
**productName** | **String** |  |  [optional]
**isOpen** | **Boolean** |  |  [optional]
**sessionHours** | [**Map&lt;String, List&lt;Interval&gt;&gt;**](List.md) |  |  [optional]

<a name="MarketTypeEnum"></a>
## Enum: MarketTypeEnum
Name | Value
---- | -----
BOND | &quot;BOND&quot;
EQUITY | &quot;EQUITY&quot;
ETF | &quot;ETF&quot;
EXTENDED | &quot;EXTENDED&quot;
FOREX | &quot;FOREX&quot;
FUTURE | &quot;FUTURE&quot;
FUTURE_OPTION | &quot;FUTURE_OPTION&quot;
FUNDAMENTAL | &quot;FUNDAMENTAL&quot;
INDEX | &quot;INDEX&quot;
INDICATOR | &quot;INDICATOR&quot;
MUTUAL_FUND | &quot;MUTUAL_FUND&quot;
OPTION | &quot;OPTION&quot;
UNKNOWN | &quot;UNKNOWN&quot;
