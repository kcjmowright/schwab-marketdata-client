# OptionChain

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** |  |  [optional]
**status** | **String** |  |  [optional]
**underlying** | [**Underlying**](Underlying.md) |  |  [optional]
**strategy** | [**StrategyEnum**](#StrategyEnum) |  |  [optional]
**interval** | **Double** |  |  [optional]
**isDelayed** | **Boolean** |  |  [optional]
**isIndex** | **Boolean** |  |  [optional]
**daysToExpiration** | **Double** |  |  [optional]
**interestRate** | **Double** |  |  [optional]
**underlyingPrice** | **Double** |  |  [optional]
**volatility** | **Double** |  |  [optional]
**callExpDateMap** | [**Map&lt;String, OptionContractMap&gt;**](OptionContractMap.md) |  |  [optional]
**putExpDateMap** | [**Map&lt;String, OptionContractMap&gt;**](OptionContractMap.md) |  |  [optional]

<a name="StrategyEnum"></a>
## Enum: StrategyEnum
Name | Value
---- | -----
SINGLE | &quot;SINGLE&quot;
ANALYTICAL | &quot;ANALYTICAL&quot;
COVERED | &quot;COVERED&quot;
VERTICAL | &quot;VERTICAL&quot;
CALENDAR | &quot;CALENDAR&quot;
STRANGLE | &quot;STRANGLE&quot;
STRADDLE | &quot;STRADDLE&quot;
BUTTERFLY | &quot;BUTTERFLY&quot;
CONDOR | &quot;CONDOR&quot;
DIAGONAL | &quot;DIAGONAL&quot;
COLLAR | &quot;COLLAR&quot;
ROLL | &quot;ROLL&quot;
