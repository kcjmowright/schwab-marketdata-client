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
import com.kcjmowright.schwab.marketdata.model.Interval;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Hours
 */



public class Hours {
  @JsonProperty("date")
  private String date = null;

  /**
   * Gets or Sets marketType
   */
  public enum MarketTypeEnum {
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

    MarketTypeEnum(String value) {
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
    public static MarketTypeEnum fromValue(String input) {
      for (MarketTypeEnum b : MarketTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("marketType")
  private MarketTypeEnum marketType = null;

  @JsonProperty("exchange")
  private String exchange = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("product")
  private String product = null;

  @JsonProperty("productName")
  private String productName = null;

  @JsonProperty("isOpen")
  private Boolean isOpen = null;

  @JsonProperty("sessionHours")
  private Map<String, List<Interval>> sessionHours = null;

  public Hours date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Hours marketType(MarketTypeEnum marketType) {
    this.marketType = marketType;
    return this;
  }

   /**
   * Get marketType
   * @return marketType
  **/
  @Schema(description = "")
  public MarketTypeEnum getMarketType() {
    return marketType;
  }

  public void setMarketType(MarketTypeEnum marketType) {
    this.marketType = marketType;
  }

  public Hours exchange(String exchange) {
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

  public Hours category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Hours product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @Schema(description = "")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public Hours productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @Schema(description = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Hours isOpen(Boolean isOpen) {
    this.isOpen = isOpen;
    return this;
  }

   /**
   * Get isOpen
   * @return isOpen
  **/
  @Schema(description = "")
  public Boolean isIsOpen() {
    return isOpen;
  }

  public void setIsOpen(Boolean isOpen) {
    this.isOpen = isOpen;
  }

  public Hours sessionHours(Map<String, List<Interval>> sessionHours) {
    this.sessionHours = sessionHours;
    return this;
  }

  public Hours putSessionHoursItem(String key, List<Interval> sessionHoursItem) {
    if (this.sessionHours == null) {
      this.sessionHours = new HashMap<>();
    }
    this.sessionHours.put(key, sessionHoursItem);
    return this;
  }

   /**
   * Get sessionHours
   * @return sessionHours
  **/
  @Schema(description = "")
  public Map<String, List<Interval>> getSessionHours() {
    return sessionHours;
  }

  public void setSessionHours(Map<String, List<Interval>> sessionHours) {
    this.sessionHours = sessionHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hours hours = (Hours) o;
    return Objects.equals(this.date, hours.date) &&
        Objects.equals(this.marketType, hours.marketType) &&
        Objects.equals(this.exchange, hours.exchange) &&
        Objects.equals(this.category, hours.category) &&
        Objects.equals(this.product, hours.product) &&
        Objects.equals(this.productName, hours.productName) &&
        Objects.equals(this.isOpen, hours.isOpen) &&
        Objects.equals(this.sessionHours, hours.sessionHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, marketType, exchange, category, product, productName, isOpen, sessionHours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hours {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    marketType: ").append(toIndentedString(marketType)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
    sb.append("    sessionHours: ").append(toIndentedString(sessionHours)).append("\n");
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
