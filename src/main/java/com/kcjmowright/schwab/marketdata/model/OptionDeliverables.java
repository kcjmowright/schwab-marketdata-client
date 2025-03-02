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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * OptionDeliverables
 */



public class OptionDeliverables {
  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("assetType")
  private String assetType = null;

  @JsonProperty("deliverableUnits")
  private String deliverableUnits = null;

  @JsonProperty("currencyType")
  private String currencyType = null;

  public OptionDeliverables symbol(String symbol) {
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

  public OptionDeliverables assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @Schema(description = "")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public OptionDeliverables deliverableUnits(String deliverableUnits) {
    this.deliverableUnits = deliverableUnits;
    return this;
  }

   /**
   * Get deliverableUnits
   * @return deliverableUnits
  **/
  @Schema(description = "")
  public String getDeliverableUnits() {
    return deliverableUnits;
  }

  public void setDeliverableUnits(String deliverableUnits) {
    this.deliverableUnits = deliverableUnits;
  }

  public OptionDeliverables currencyType(String currencyType) {
    this.currencyType = currencyType;
    return this;
  }

   /**
   * Get currencyType
   * @return currencyType
  **/
  @Schema(description = "")
  public String getCurrencyType() {
    return currencyType;
  }

  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionDeliverables optionDeliverables = (OptionDeliverables) o;
    return Objects.equals(this.symbol, optionDeliverables.symbol) &&
        Objects.equals(this.assetType, optionDeliverables.assetType) &&
        Objects.equals(this.deliverableUnits, optionDeliverables.deliverableUnits) &&
        Objects.equals(this.currencyType, optionDeliverables.currencyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, assetType, deliverableUnits, currencyType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionDeliverables {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    deliverableUnits: ").append(toIndentedString(deliverableUnits)).append("\n");
    sb.append("    currencyType: ").append(toIndentedString(currencyType)).append("\n");
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
