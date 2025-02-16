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
 * Quote data of Mutual Fund security
 */
@Schema(description = "Quote data of Mutual Fund security")


public class QuoteMutualFund {
  @JsonProperty("52WeekHigh")
  private Double _52WeekHigh = null;

  @JsonProperty("52WeekLow")
  private Double _52WeekLow = null;

  @JsonProperty("closePrice")
  private Double closePrice = null;

  @JsonProperty("nAV")
  private Double nAV = null;

  @JsonProperty("netChange")
  private Double netChange = null;

  @JsonProperty("netPercentChange")
  private Double netPercentChange = null;

  @JsonProperty("securityStatus")
  private String securityStatus = null;

  @JsonProperty("totalVolume")
  private Long totalVolume = null;

  @JsonProperty("tradeTime")
  private Long tradeTime = null;

  public QuoteMutualFund _52WeekHigh(Double _52WeekHigh) {
    this._52WeekHigh = _52WeekHigh;
    return this;
  }

   /**
   * Higest price traded in the past 12 months, or 52 weeks
   * @return _52WeekHigh
  **/
  @Schema(example = "145.09", description = "Higest price traded in the past 12 months, or 52 weeks")
  public Double get52WeekHigh() {
    return _52WeekHigh;
  }

  public void set52WeekHigh(Double _52WeekHigh) {
    this._52WeekHigh = _52WeekHigh;
  }

  public QuoteMutualFund _52WeekLow(Double _52WeekLow) {
    this._52WeekLow = _52WeekLow;
    return this;
  }

   /**
   * Lowest price traded in the past 12 months, or 52 weeks
   * @return _52WeekLow
  **/
  @Schema(example = "77.581", description = "Lowest price traded in the past 12 months, or 52 weeks")
  public Double get52WeekLow() {
    return _52WeekLow;
  }

  public void set52WeekLow(Double _52WeekLow) {
    this._52WeekLow = _52WeekLow;
  }

  public QuoteMutualFund closePrice(Double closePrice) {
    this.closePrice = closePrice;
    return this;
  }

   /**
   * Previous day&#x27;s closing price
   * @return closePrice
  **/
  @Schema(example = "126.27", description = "Previous day's closing price")
  public Double getClosePrice() {
    return closePrice;
  }

  public void setClosePrice(Double closePrice) {
    this.closePrice = closePrice;
  }

  public QuoteMutualFund nAV(Double nAV) {
    this.nAV = nAV;
    return this;
  }

   /**
   * Net Asset Value
   * @return nAV
  **/
  @Schema(example = "126.99", description = "Net Asset Value")
  public Double getNAV() {
    return nAV;
  }

  public void setNAV(Double nAV) {
    this.nAV = nAV;
  }

  public QuoteMutualFund netChange(Double netChange) {
    this.netChange = netChange;
    return this;
  }

   /**
   * Current Last-Prev Close
   * @return netChange
  **/
  @Schema(example = "-0.04", description = "Current Last-Prev Close")
  public Double getNetChange() {
    return netChange;
  }

  public void setNetChange(Double netChange) {
    this.netChange = netChange;
  }

  public QuoteMutualFund netPercentChange(Double netPercentChange) {
    this.netPercentChange = netPercentChange;
    return this;
  }

   /**
   * Net Percentage Change
   * @return netPercentChange
  **/
  @Schema(example = "-0.0756", description = "Net Percentage Change")
  public Double getNetPercentChange() {
    return netPercentChange;
  }

  public void setNetPercentChange(Double netPercentChange) {
    this.netPercentChange = netPercentChange;
  }

  public QuoteMutualFund securityStatus(String securityStatus) {
    this.securityStatus = securityStatus;
    return this;
  }

   /**
   * Status of security
   * @return securityStatus
  **/
  @Schema(example = "Normal", description = "Status of security")
  public String getSecurityStatus() {
    return securityStatus;
  }

  public void setSecurityStatus(String securityStatus) {
    this.securityStatus = securityStatus;
  }

  public QuoteMutualFund totalVolume(Long totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

   /**
   * Aggregated shares traded throughout the day, including pre/post market hours.
   * @return totalVolume
  **/
  @Schema(example = "20171188", description = "Aggregated shares traded throughout the day, including pre/post market hours.")
  public Long getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(Long totalVolume) {
    this.totalVolume = totalVolume;
  }

  public QuoteMutualFund tradeTime(Long tradeTime) {
    this.tradeTime = tradeTime;
    return this;
  }

   /**
   * Last trade time in milliseconds since Epoch
   * @return tradeTime
  **/
  @Schema(example = "1621376731304", description = "Last trade time in milliseconds since Epoch")
  public Long getTradeTime() {
    return tradeTime;
  }

  public void setTradeTime(Long tradeTime) {
    this.tradeTime = tradeTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteMutualFund quoteMutualFund = (QuoteMutualFund) o;
    return Objects.equals(this._52WeekHigh, quoteMutualFund._52WeekHigh) &&
        Objects.equals(this._52WeekLow, quoteMutualFund._52WeekLow) &&
        Objects.equals(this.closePrice, quoteMutualFund.closePrice) &&
        Objects.equals(this.nAV, quoteMutualFund.nAV) &&
        Objects.equals(this.netChange, quoteMutualFund.netChange) &&
        Objects.equals(this.netPercentChange, quoteMutualFund.netPercentChange) &&
        Objects.equals(this.securityStatus, quoteMutualFund.securityStatus) &&
        Objects.equals(this.totalVolume, quoteMutualFund.totalVolume) &&
        Objects.equals(this.tradeTime, quoteMutualFund.tradeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_52WeekHigh, _52WeekLow, closePrice, nAV, netChange, netPercentChange, securityStatus, totalVolume, tradeTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteMutualFund {\n");
    
    sb.append("    _52WeekHigh: ").append(toIndentedString(_52WeekHigh)).append("\n");
    sb.append("    _52WeekLow: ").append(toIndentedString(_52WeekLow)).append("\n");
    sb.append("    closePrice: ").append(toIndentedString(closePrice)).append("\n");
    sb.append("    nAV: ").append(toIndentedString(nAV)).append("\n");
    sb.append("    netChange: ").append(toIndentedString(netChange)).append("\n");
    sb.append("    netPercentChange: ").append(toIndentedString(netPercentChange)).append("\n");
    sb.append("    securityStatus: ").append(toIndentedString(securityStatus)).append("\n");
    sb.append("    totalVolume: ").append(toIndentedString(totalVolume)).append("\n");
    sb.append("    tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
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
