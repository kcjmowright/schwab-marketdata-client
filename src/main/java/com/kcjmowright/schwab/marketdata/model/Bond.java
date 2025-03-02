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
import java.math.BigDecimal;
/**
 * Bond
 */



public class Bond {
  @JsonProperty("cusip")
  private String cusip = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("exchange")
  private String exchange = null;

  /**
   * Gets or Sets assetType
   */
  public enum AssetTypeEnum {
    BOND("BOND"),
    EQUITY("EQUITY"),
    ETF("ETF"),
    EXTENDED("EXTENDED"),
    FOREX("FOREX"),
    FUTURE("FUTURE"),
    FUTURE_OPTION("FUTURE_OPTION"),
    FUNDAMENTAL("FUNDAMENTAL"),
    INDEX("INDEX"),
    INDICATOR("INDICATOR"),
    MUTUAL_FUND("MUTUAL_FUND"),
    OPTION("OPTION"),
    UNKNOWN("UNKNOWN");

    private String value;

    AssetTypeEnum(String value) {
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
    public static AssetTypeEnum fromValue(String input) {
      for (AssetTypeEnum b : AssetTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("assetType")
  private AssetTypeEnum assetType = null;

  @JsonProperty("bondFactor")
  private String bondFactor = null;

  @JsonProperty("bondMultiplier")
  private String bondMultiplier = null;

  @JsonProperty("bondPrice")
  private BigDecimal bondPrice = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    BOND("BOND"),
    EQUITY("EQUITY"),
    ETF("ETF"),
    EXTENDED("EXTENDED"),
    FOREX("FOREX"),
    FUTURE("FUTURE"),
    FUTURE_OPTION("FUTURE_OPTION"),
    FUNDAMENTAL("FUNDAMENTAL"),
    INDEX("INDEX"),
    INDICATOR("INDICATOR"),
    MUTUAL_FUND("MUTUAL_FUND"),
    OPTION("OPTION"),
    UNKNOWN("UNKNOWN");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  public Bond cusip(String cusip) {
    this.cusip = cusip;
    return this;
  }

   /**
   * Get cusip
   * @return cusip
  **/
  @Schema(description = "")
  public String getCusip() {
    return cusip;
  }

  public void setCusip(String cusip) {
    this.cusip = cusip;
  }

  public Bond symbol(String symbol) {
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

  public Bond description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Bond exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  @Schema(description = "")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public Bond assetType(AssetTypeEnum assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @Schema(description = "")
  public AssetTypeEnum getAssetType() {
    return assetType;
  }

  public void setAssetType(AssetTypeEnum assetType) {
    this.assetType = assetType;
  }

  public Bond bondFactor(String bondFactor) {
    this.bondFactor = bondFactor;
    return this;
  }

   /**
   * Get bondFactor
   * @return bondFactor
  **/
  @Schema(description = "")
  public String getBondFactor() {
    return bondFactor;
  }

  public void setBondFactor(String bondFactor) {
    this.bondFactor = bondFactor;
  }

  public Bond bondMultiplier(String bondMultiplier) {
    this.bondMultiplier = bondMultiplier;
    return this;
  }

   /**
   * Get bondMultiplier
   * @return bondMultiplier
  **/
  @Schema(description = "")
  public String getBondMultiplier() {
    return bondMultiplier;
  }

  public void setBondMultiplier(String bondMultiplier) {
    this.bondMultiplier = bondMultiplier;
  }

  public Bond bondPrice(BigDecimal bondPrice) {
    this.bondPrice = bondPrice;
    return this;
  }

   /**
   * Get bondPrice
   * @return bondPrice
  **/
  @Schema(description = "")
  public BigDecimal getBondPrice() {
    return bondPrice;
  }

  public void setBondPrice(BigDecimal bondPrice) {
    this.bondPrice = bondPrice;
  }

  public Bond type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bond bond = (Bond) o;
    return Objects.equals(this.cusip, bond.cusip) &&
        Objects.equals(this.symbol, bond.symbol) &&
        Objects.equals(this.description, bond.description) &&
        Objects.equals(this.exchange, bond.exchange) &&
        Objects.equals(this.assetType, bond.assetType) &&
        Objects.equals(this.bondFactor, bond.bondFactor) &&
        Objects.equals(this.bondMultiplier, bond.bondMultiplier) &&
        Objects.equals(this.bondPrice, bond.bondPrice) &&
        Objects.equals(this.type, bond.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cusip, symbol, description, exchange, assetType, bondFactor, bondMultiplier, bondPrice, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bond {\n");
    
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    bondFactor: ").append(toIndentedString(bondFactor)).append("\n");
    sb.append("    bondMultiplier: ").append(toIndentedString(bondMultiplier)).append("\n");
    sb.append("    bondPrice: ").append(toIndentedString(bondPrice)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
