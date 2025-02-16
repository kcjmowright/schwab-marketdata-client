# OptionContract

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**putCall** | [**PutCallEnum**](#PutCallEnum) |  |  [optional]
**symbol** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**exchangeName** | **String** |  |  [optional]
**bidPrice** | **Double** |  |  [optional]
**askPrice** | **Double** |  |  [optional]
**lastPrice** | **Double** |  |  [optional]
**markPrice** | **Double** |  |  [optional]
**bidSize** | **Integer** |  |  [optional]
**askSize** | **Integer** |  |  [optional]
**lastSize** | **Integer** |  |  [optional]
**highPrice** | **Double** |  |  [optional]
**lowPrice** | **Double** |  |  [optional]
**openPrice** | **Double** |  |  [optional]
**closePrice** | **Double** |  |  [optional]
**totalVolume** | **Integer** |  |  [optional]
**tradeDate** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**quoteTimeInLong** | **Integer** |  |  [optional]
**tradeTimeInLong** | **Integer** |  |  [optional]
**netChange** | **Double** |  |  [optional]
**volatility** | **Double** |  |  [optional]
**delta** | **Double** |  |  [optional]
**gamma** | **Double** |  |  [optional]
**theta** | **Double** |  |  [optional]
**vega** | **Double** |  |  [optional]
**rho** | **Double** |  |  [optional]
**timeValue** | **Double** |  |  [optional]
**openInterest** | **Double** |  |  [optional]
**isInTheMoney** | **Boolean** |  |  [optional]
**theoreticalOptionValue** | **Double** |  |  [optional]
**theoreticalVolatility** | **Double** |  |  [optional]
**isMini** | **Boolean** |  |  [optional]
**isNonStandard** | **Boolean** |  |  [optional]
**optionDeliverablesList** | [**List&lt;OptionDeliverables&gt;**](OptionDeliverables.md) |  |  [optional]
**strikePrice** | **Double** |  |  [optional]
**expirationDate** | **String** |  |  [optional]
**daysToExpiration** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**expirationType** | [**ExpirationType**](ExpirationType.md) |  |  [optional]
**lastTradingDay** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**multiplier** | **Double** |  |  [optional]
**settlementType** | [**SettlementType**](SettlementType.md) |  |  [optional]
**deliverableNote** | **String** |  |  [optional]
**isIndexOption** | **Boolean** |  |  [optional]
**percentChange** | **Double** |  |  [optional]
**markChange** | **Double** |  |  [optional]
**markPercentChange** | **Double** |  |  [optional]
**isPennyPilot** | **Boolean** |  |  [optional]
**intrinsicValue** | **Double** |  |  [optional]
**optionRoot** | **String** |  |  [optional]

<a name="PutCallEnum"></a>
## Enum: PutCallEnum
Name | Value
---- | -----
PUT | &quot;PUT&quot;
CALL | &quot;CALL&quot;
