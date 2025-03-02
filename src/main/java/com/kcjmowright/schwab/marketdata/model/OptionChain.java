/*
 * Market Data
 * Trader API - Market data
 *
 * OpenAPI spec version: 1.0.0
 * Contact: TraderAPI@Schwab.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.kcjmowright.schwab.marketdata.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.kcjmowright.schwab.marketdata.model.OptionContractMap;
import com.kcjmowright.schwab.marketdata.model.Underlying;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * OptionChain
 */



public class OptionChain {
  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("underlying")
  private Underlying underlying = null;

  /**
   * Gets or Sets strategy
   */
  public enum StrategyEnum {
    SINGLE("SINGLE"),
    ANALYTICAL("ANALYTICAL"),
    COVERED("COVERED"),
    VERTICAL("VERTICAL"),
    CALENDAR("CALENDAR"),
    STRANGLE("STRANGLE"),
    STRADDLE("STRADDLE"),
    BUTTERFLY("BUTTERFLY"),
    CONDOR("CONDOR"),
    DIAGONAL("DIAGONAL"),
    COLLAR("COLLAR"),
    ROLL("ROLL");

    private String value;

    StrategyEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static StrategyEnum fromValue(String input) {
      for (StrategyEnum b : StrategyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("strategy")
  private StrategyEnum strategy = null;

  @JsonProperty("interval")
  private Double interval = null;

  @JsonProperty("isDelayed")
  private Boolean isDelayed = null;

  @JsonProperty("isIndex")
  private Boolean isIndex = null;

  @JsonProperty("daysToExpiration")
  private Double daysToExpiration = null;

  @JsonProperty("interestRate")
  private Double interestRate = null;

  @JsonProperty("underlyingPrice")
  private Double underlyingPrice = null;

  @JsonProperty("volatility")
  private Double volatility = null;

  @JsonProperty("callExpDateMap")
  private Map<String, OptionContractMap> callExpDateMap = null;

  @JsonProperty("putExpDateMap")
  private Map<String, OptionContractMap> putExpDateMap = null;

  public OptionChain symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @Schema(description = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public OptionChain status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OptionChain underlying(Underlying underlying) {
    this.underlying = underlying;
    return this;
  }

   /**
   * Get underlying
   * @return underlying
  **/
  @Schema(description = "")
  public Underlying getUnderlying() {
    return underlying;
  }

  public void setUnderlying(Underlying underlying) {
    this.underlying = underlying;
  }

  public OptionChain strategy(StrategyEnum strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @Schema(description = "")
  public StrategyEnum getStrategy() {
    return strategy;
  }

  public void setStrategy(StrategyEnum strategy) {
    this.strategy = strategy;
  }

  public OptionChain interval(Double interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @Schema(description = "")
  public Double getInterval() {
    return interval;
  }

  public void setInterval(Double interval) {
    this.interval = interval;
  }

  public OptionChain isDelayed(Boolean isDelayed) {
    this.isDelayed = isDelayed;
    return this;
  }

   /**
   * Get isDelayed
   * @return isDelayed
  **/
  @Schema(description = "")
  public Boolean isIsDelayed() {
    return isDelayed;
  }

  public void setIsDelayed(Boolean isDelayed) {
    this.isDelayed = isDelayed;
  }

  public OptionChain isIndex(Boolean isIndex) {
    this.isIndex = isIndex;
    return this;
  }

   /**
   * Get isIndex
   * @return isIndex
  **/
  @Schema(description = "")
  public Boolean isIsIndex() {
    return isIndex;
  }

  public void setIsIndex(Boolean isIndex) {
    this.isIndex = isIndex;
  }

  public OptionChain daysToExpiration(Double daysToExpiration) {
    this.daysToExpiration = daysToExpiration;
    return this;
  }

   /**
   * Get daysToExpiration
   * @return daysToExpiration
  **/
  @Schema(description = "")
  public Double getDaysToExpiration() {
    return daysToExpiration;
  }

  public void setDaysToExpiration(Double daysToExpiration) {
    this.daysToExpiration = daysToExpiration;
  }

  public OptionChain interestRate(Double interestRate) {
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @Schema(description = "")
  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public OptionChain underlyingPrice(Double underlyingPrice) {
    this.underlyingPrice = underlyingPrice;
    return this;
  }

   /**
   * Get underlyingPrice
   * @return underlyingPrice
  **/
  @Schema(description = "")
  public Double getUnderlyingPrice() {
    return underlyingPrice;
  }

  public void setUnderlyingPrice(Double underlyingPrice) {
    this.underlyingPrice = underlyingPrice;
  }

  public OptionChain volatility(Double volatility) {
    this.volatility = volatility;
    return this;
  }

   /**
   * Get volatility
   * @return volatility
  **/
  @Schema(description = "")
  public Double getVolatility() {
    return volatility;
  }

  public void setVolatility(Double volatility) {
    this.volatility = volatility;
  }

  public OptionChain callExpDateMap(Map<String, OptionContractMap> callExpDateMap) {
    this.callExpDateMap = callExpDateMap;
    return this;
  }

  public OptionChain putCallExpDateMapItem(String key, OptionContractMap callExpDateMapItem) {
    if (this.callExpDateMap == null) {
      this.callExpDateMap = new HashMap<>();
    }
    this.callExpDateMap.put(key, callExpDateMapItem);
    return this;
  }

   /**
   * Get callExpDateMap
   * @return callExpDateMap
  **/
  @Schema(description = "")
  public Map<String, OptionContractMap> getCallExpDateMap() {
    return callExpDateMap;
  }

  public void setCallExpDateMap(Map<String, OptionContractMap> callExpDateMap) {
    this.callExpDateMap = callExpDateMap;
  }

  public OptionChain putExpDateMap(Map<String, OptionContractMap> putExpDateMap) {
    this.putExpDateMap = putExpDateMap;
    return this;
  }

  public OptionChain putPutExpDateMapItem(String key, OptionContractMap putExpDateMapItem) {
    if (this.putExpDateMap == null) {
      this.putExpDateMap = new HashMap<>();
    }
    this.putExpDateMap.put(key, putExpDateMapItem);
    return this;
  }

   /**
   * Get putExpDateMap
   * @return putExpDateMap
  **/
  @Schema(description = "")
  public Map<String, OptionContractMap> getPutExpDateMap() {
    return putExpDateMap;
  }

  public void setPutExpDateMap(Map<String, OptionContractMap> putExpDateMap) {
    this.putExpDateMap = putExpDateMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionChain optionChain = (OptionChain) o;
    return Objects.equals(this.symbol, optionChain.symbol) &&
        Objects.equals(this.status, optionChain.status) &&
        Objects.equals(this.underlying, optionChain.underlying) &&
        Objects.equals(this.strategy, optionChain.strategy) &&
        Objects.equals(this.interval, optionChain.interval) &&
        Objects.equals(this.isDelayed, optionChain.isDelayed) &&
        Objects.equals(this.isIndex, optionChain.isIndex) &&
        Objects.equals(this.daysToExpiration, optionChain.daysToExpiration) &&
        Objects.equals(this.interestRate, optionChain.interestRate) &&
        Objects.equals(this.underlyingPrice, optionChain.underlyingPrice) &&
        Objects.equals(this.volatility, optionChain.volatility) &&
        Objects.equals(this.callExpDateMap, optionChain.callExpDateMap) &&
        Objects.equals(this.putExpDateMap, optionChain.putExpDateMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, status, underlying, strategy, interval, isDelayed, isIndex, daysToExpiration, interestRate, underlyingPrice, volatility, callExpDateMap, putExpDateMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionChain {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    underlying: ").append(toIndentedString(underlying)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    isDelayed: ").append(toIndentedString(isDelayed)).append("\n");
    sb.append("    isIndex: ").append(toIndentedString(isIndex)).append("\n");
    sb.append("    daysToExpiration: ").append(toIndentedString(daysToExpiration)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    underlyingPrice: ").append(toIndentedString(underlyingPrice)).append("\n");
    sb.append("    volatility: ").append(toIndentedString(volatility)).append("\n");
    sb.append("    callExpDateMap: ").append(toIndentedString(callExpDateMap)).append("\n");
    sb.append("    putExpDateMap: ").append(toIndentedString(putExpDateMap)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
