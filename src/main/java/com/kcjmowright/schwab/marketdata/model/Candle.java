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
 * Candle
 */



public class Candle {
  @JsonProperty("close")
  private Double close = null;

  @JsonProperty("datetime")
  private Long datetime = null;

  @JsonProperty("datetimeISO8601")
  private String datetimeISO8601 = null;

  @JsonProperty("high")
  private Double high = null;

  @JsonProperty("low")
  private Double low = null;

  @JsonProperty("open")
  private Double open = null;

  @JsonProperty("volume")
  private Long volume = null;

  public Candle close(Double close) {
    this.close = close;
    return this;
  }

   /**
   * Get close
   * @return close
  **/
  @Schema(description = "")
  public Double getClose() {
    return close;
  }

  public void setClose(Double close) {
    this.close = close;
  }

  public Candle datetime(Long datetime) {
    this.datetime = datetime;
    return this;
  }

   /**
   * Get datetime
   * @return datetime
  **/
  @Schema(description = "")
  public Long getDatetime() {
    return datetime;
  }

  public void setDatetime(Long datetime) {
    this.datetime = datetime;
  }

  public Candle datetimeISO8601(String datetimeISO8601) {
    this.datetimeISO8601 = datetimeISO8601;
    return this;
  }

   /**
   * Get datetimeISO8601
   * @return datetimeISO8601
  **/
  @Schema(description = "")
  public String getDatetimeISO8601() {
    return datetimeISO8601;
  }

  public void setDatetimeISO8601(String datetimeISO8601) {
    this.datetimeISO8601 = datetimeISO8601;
  }

  public Candle high(Double high) {
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @Schema(description = "")
  public Double getHigh() {
    return high;
  }

  public void setHigh(Double high) {
    this.high = high;
  }

  public Candle low(Double low) {
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @Schema(description = "")
  public Double getLow() {
    return low;
  }

  public void setLow(Double low) {
    this.low = low;
  }

  public Candle open(Double open) {
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  @Schema(description = "")
  public Double getOpen() {
    return open;
  }

  public void setOpen(Double open) {
    this.open = open;
  }

  public Candle volume(Long volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @Schema(description = "")
  public Long getVolume() {
    return volume;
  }

  public void setVolume(Long volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Candle candle = (Candle) o;
    return Objects.equals(this.close, candle.close) &&
        Objects.equals(this.datetime, candle.datetime) &&
        Objects.equals(this.datetimeISO8601, candle.datetimeISO8601) &&
        Objects.equals(this.high, candle.high) &&
        Objects.equals(this.low, candle.low) &&
        Objects.equals(this.open, candle.open) &&
        Objects.equals(this.volume, candle.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(close, datetime, datetimeISO8601, high, low, open, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Candle {\n");
    
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    datetimeISO8601: ").append(toIndentedString(datetimeISO8601)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
