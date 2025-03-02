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
import com.kcjmowright.schwab.marketdata.model.AssetMainType;
import com.kcjmowright.schwab.marketdata.model.QuoteOption;
import com.kcjmowright.schwab.marketdata.model.ReferenceOption;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Quote info of Option security
 */
@Schema(description = "Quote info of Option security")


public class OptionResponse implements QuoteResponseObject {
  @JsonProperty("assetMainType")
  private AssetMainType assetMainType = null;

  @JsonProperty("ssid")
  private Long ssid = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("realtime")
  private Boolean realtime = null;

  @JsonProperty("quote")
  private QuoteOption quote = null;

  @JsonProperty("reference")
  private ReferenceOption reference = null;

  public OptionResponse assetMainType(AssetMainType assetMainType) {
    this.assetMainType = assetMainType;
    return this;
  }

   /**
   * Get assetMainType
   * @return assetMainType
  **/
  @Schema(description = "")
  public AssetMainType getAssetMainType() {
    return assetMainType;
  }

  public void setAssetMainType(AssetMainType assetMainType) {
    this.assetMainType = assetMainType;
  }

  public OptionResponse ssid(Long ssid) {
    this.ssid = ssid;
    return this;
  }

   /**
   * SSID of instrument
   * @return ssid
  **/
  @Schema(example = "1234567890", description = "SSID of instrument")
  public Long getSsid() {
    return ssid;
  }

  public void setSsid(Long ssid) {
    this.ssid = ssid;
  }

  public OptionResponse symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol of instrument
   * @return symbol
  **/
  @Schema(example = "AAPL", description = "Symbol of instrument")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public OptionResponse realtime(Boolean realtime) {
    this.realtime = realtime;
    return this;
  }

   /**
   * is quote realtime
   * @return realtime
  **/
  @Schema(example = "true", description = "is quote realtime")
  public Boolean isRealtime() {
    return realtime;
  }

  public void setRealtime(Boolean realtime) {
    this.realtime = realtime;
  }

  public OptionResponse quote(QuoteOption quote) {
    this.quote = quote;
    return this;
  }

   /**
   * Get quote
   * @return quote
  **/
  @Schema(description = "")
  public QuoteOption getQuote() {
    return quote;
  }

  public void setQuote(QuoteOption quote) {
    this.quote = quote;
  }

  public OptionResponse reference(ReferenceOption reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @Schema(description = "")
  public ReferenceOption getReference() {
    return reference;
  }

  public void setReference(ReferenceOption reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionResponse optionResponse = (OptionResponse) o;
    return Objects.equals(this.assetMainType, optionResponse.assetMainType) &&
        Objects.equals(this.ssid, optionResponse.ssid) &&
        Objects.equals(this.symbol, optionResponse.symbol) &&
        Objects.equals(this.realtime, optionResponse.realtime) &&
        Objects.equals(this.quote, optionResponse.quote) &&
        Objects.equals(this.reference, optionResponse.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetMainType, ssid, symbol, realtime, quote, reference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionResponse {\n");
    
    sb.append("    assetMainType: ").append(toIndentedString(assetMainType)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    realtime: ").append(toIndentedString(realtime)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
