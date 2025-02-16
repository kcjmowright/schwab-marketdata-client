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
 * Underlying
 */



public class Underlying {
  @JsonProperty("ask")
  private Double ask = null;

  @JsonProperty("askSize")
  private Integer askSize = null;

  @JsonProperty("bid")
  private Double bid = null;

  @JsonProperty("bidSize")
  private Integer bidSize = null;

  @JsonProperty("change")
  private Double change = null;

  @JsonProperty("close")
  private Double close = null;

  @JsonProperty("delayed")
  private Boolean delayed = null;

  @JsonProperty("description")
  private String description = null;

  /**
   * Gets or Sets exchangeName
   */
  public enum ExchangeNameEnum {
    IND("IND"),
    ASE("ASE"),
    NYS("NYS"),
    NAS("NAS"),
    NAP("NAP"),
    PAC("PAC"),
    OPR("OPR"),
    BATS("BATS");

    private String value;

    ExchangeNameEnum(String value) {
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
    public static ExchangeNameEnum fromValue(String input) {
      for (ExchangeNameEnum b : ExchangeNameEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("exchangeName")
  private ExchangeNameEnum exchangeName = null;

  @JsonProperty("fiftyTwoWeekHigh")
  private Double fiftyTwoWeekHigh = null;

  @JsonProperty("fiftyTwoWeekLow")
  private Double fiftyTwoWeekLow = null;

  @JsonProperty("highPrice")
  private Double highPrice = null;

  @JsonProperty("last")
  private Double last = null;

  @JsonProperty("lowPrice")
  private Double lowPrice = null;

  @JsonProperty("mark")
  private Double mark = null;

  @JsonProperty("markChange")
  private Double markChange = null;

  @JsonProperty("markPercentChange")
  private Double markPercentChange = null;

  @JsonProperty("openPrice")
  private Double openPrice = null;

  @JsonProperty("percentChange")
  private Double percentChange = null;

  @JsonProperty("quoteTime")
  private Long quoteTime = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("totalVolume")
  private Long totalVolume = null;

  @JsonProperty("tradeTime")
  private Long tradeTime = null;

  public Underlying ask(Double ask) {
    this.ask = ask;
    return this;
  }

   /**
   * Get ask
   * @return ask
  **/
  @Schema(description = "")
  public Double getAsk() {
    return ask;
  }

  public void setAsk(Double ask) {
    this.ask = ask;
  }

  public Underlying askSize(Integer askSize) {
    this.askSize = askSize;
    return this;
  }

   /**
   * Get askSize
   * @return askSize
  **/
  @Schema(description = "")
  public Integer getAskSize() {
    return askSize;
  }

  public void setAskSize(Integer askSize) {
    this.askSize = askSize;
  }

  public Underlying bid(Double bid) {
    this.bid = bid;
    return this;
  }

   /**
   * Get bid
   * @return bid
  **/
  @Schema(description = "")
  public Double getBid() {
    return bid;
  }

  public void setBid(Double bid) {
    this.bid = bid;
  }

  public Underlying bidSize(Integer bidSize) {
    this.bidSize = bidSize;
    return this;
  }

   /**
   * Get bidSize
   * @return bidSize
  **/
  @Schema(description = "")
  public Integer getBidSize() {
    return bidSize;
  }

  public void setBidSize(Integer bidSize) {
    this.bidSize = bidSize;
  }

  public Underlying change(Double change) {
    this.change = change;
    return this;
  }

   /**
   * Get change
   * @return change
  **/
  @Schema(description = "")
  public Double getChange() {
    return change;
  }

  public void setChange(Double change) {
    this.change = change;
  }

  public Underlying close(Double close) {
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

  public Underlying delayed(Boolean delayed) {
    this.delayed = delayed;
    return this;
  }

   /**
   * Get delayed
   * @return delayed
  **/
  @Schema(description = "")
  public Boolean isDelayed() {
    return delayed;
  }

  public void setDelayed(Boolean delayed) {
    this.delayed = delayed;
  }

  public Underlying description(String description) {
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

  public Underlying exchangeName(ExchangeNameEnum exchangeName) {
    this.exchangeName = exchangeName;
    return this;
  }

   /**
   * Get exchangeName
   * @return exchangeName
  **/
  @Schema(description = "")
  public ExchangeNameEnum getExchangeName() {
    return exchangeName;
  }

  public void setExchangeName(ExchangeNameEnum exchangeName) {
    this.exchangeName = exchangeName;
  }

  public Underlying fiftyTwoWeekHigh(Double fiftyTwoWeekHigh) {
    this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    return this;
  }

   /**
   * Get fiftyTwoWeekHigh
   * @return fiftyTwoWeekHigh
  **/
  @Schema(description = "")
  public Double getFiftyTwoWeekHigh() {
    return fiftyTwoWeekHigh;
  }

  public void setFiftyTwoWeekHigh(Double fiftyTwoWeekHigh) {
    this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
  }

  public Underlying fiftyTwoWeekLow(Double fiftyTwoWeekLow) {
    this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    return this;
  }

   /**
   * Get fiftyTwoWeekLow
   * @return fiftyTwoWeekLow
  **/
  @Schema(description = "")
  public Double getFiftyTwoWeekLow() {
    return fiftyTwoWeekLow;
  }

  public void setFiftyTwoWeekLow(Double fiftyTwoWeekLow) {
    this.fiftyTwoWeekLow = fiftyTwoWeekLow;
  }

  public Underlying highPrice(Double highPrice) {
    this.highPrice = highPrice;
    return this;
  }

   /**
   * Get highPrice
   * @return highPrice
  **/
  @Schema(description = "")
  public Double getHighPrice() {
    return highPrice;
  }

  public void setHighPrice(Double highPrice) {
    this.highPrice = highPrice;
  }

  public Underlying last(Double last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @Schema(description = "")
  public Double getLast() {
    return last;
  }

  public void setLast(Double last) {
    this.last = last;
  }

  public Underlying lowPrice(Double lowPrice) {
    this.lowPrice = lowPrice;
    return this;
  }

   /**
   * Get lowPrice
   * @return lowPrice
  **/
  @Schema(description = "")
  public Double getLowPrice() {
    return lowPrice;
  }

  public void setLowPrice(Double lowPrice) {
    this.lowPrice = lowPrice;
  }

  public Underlying mark(Double mark) {
    this.mark = mark;
    return this;
  }

   /**
   * Get mark
   * @return mark
  **/
  @Schema(description = "")
  public Double getMark() {
    return mark;
  }

  public void setMark(Double mark) {
    this.mark = mark;
  }

  public Underlying markChange(Double markChange) {
    this.markChange = markChange;
    return this;
  }

   /**
   * Get markChange
   * @return markChange
  **/
  @Schema(description = "")
  public Double getMarkChange() {
    return markChange;
  }

  public void setMarkChange(Double markChange) {
    this.markChange = markChange;
  }

  public Underlying markPercentChange(Double markPercentChange) {
    this.markPercentChange = markPercentChange;
    return this;
  }

   /**
   * Get markPercentChange
   * @return markPercentChange
  **/
  @Schema(description = "")
  public Double getMarkPercentChange() {
    return markPercentChange;
  }

  public void setMarkPercentChange(Double markPercentChange) {
    this.markPercentChange = markPercentChange;
  }

  public Underlying openPrice(Double openPrice) {
    this.openPrice = openPrice;
    return this;
  }

   /**
   * Get openPrice
   * @return openPrice
  **/
  @Schema(description = "")
  public Double getOpenPrice() {
    return openPrice;
  }

  public void setOpenPrice(Double openPrice) {
    this.openPrice = openPrice;
  }

  public Underlying percentChange(Double percentChange) {
    this.percentChange = percentChange;
    return this;
  }

   /**
   * Get percentChange
   * @return percentChange
  **/
  @Schema(description = "")
  public Double getPercentChange() {
    return percentChange;
  }

  public void setPercentChange(Double percentChange) {
    this.percentChange = percentChange;
  }

  public Underlying quoteTime(Long quoteTime) {
    this.quoteTime = quoteTime;
    return this;
  }

   /**
   * Get quoteTime
   * @return quoteTime
  **/
  @Schema(description = "")
  public Long getQuoteTime() {
    return quoteTime;
  }

  public void setQuoteTime(Long quoteTime) {
    this.quoteTime = quoteTime;
  }

  public Underlying symbol(String symbol) {
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

  public Underlying totalVolume(Long totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

   /**
   * Get totalVolume
   * @return totalVolume
  **/
  @Schema(description = "")
  public Long getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(Long totalVolume) {
    this.totalVolume = totalVolume;
  }

  public Underlying tradeTime(Long tradeTime) {
    this.tradeTime = tradeTime;
    return this;
  }

   /**
   * Get tradeTime
   * @return tradeTime
  **/
  @Schema(description = "")
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
    Underlying underlying = (Underlying) o;
    return Objects.equals(this.ask, underlying.ask) &&
        Objects.equals(this.askSize, underlying.askSize) &&
        Objects.equals(this.bid, underlying.bid) &&
        Objects.equals(this.bidSize, underlying.bidSize) &&
        Objects.equals(this.change, underlying.change) &&
        Objects.equals(this.close, underlying.close) &&
        Objects.equals(this.delayed, underlying.delayed) &&
        Objects.equals(this.description, underlying.description) &&
        Objects.equals(this.exchangeName, underlying.exchangeName) &&
        Objects.equals(this.fiftyTwoWeekHigh, underlying.fiftyTwoWeekHigh) &&
        Objects.equals(this.fiftyTwoWeekLow, underlying.fiftyTwoWeekLow) &&
        Objects.equals(this.highPrice, underlying.highPrice) &&
        Objects.equals(this.last, underlying.last) &&
        Objects.equals(this.lowPrice, underlying.lowPrice) &&
        Objects.equals(this.mark, underlying.mark) &&
        Objects.equals(this.markChange, underlying.markChange) &&
        Objects.equals(this.markPercentChange, underlying.markPercentChange) &&
        Objects.equals(this.openPrice, underlying.openPrice) &&
        Objects.equals(this.percentChange, underlying.percentChange) &&
        Objects.equals(this.quoteTime, underlying.quoteTime) &&
        Objects.equals(this.symbol, underlying.symbol) &&
        Objects.equals(this.totalVolume, underlying.totalVolume) &&
        Objects.equals(this.tradeTime, underlying.tradeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ask, askSize, bid, bidSize, change, close, delayed, description, exchangeName, fiftyTwoWeekHigh, fiftyTwoWeekLow, highPrice, last, lowPrice, mark, markChange, markPercentChange, openPrice, percentChange, quoteTime, symbol, totalVolume, tradeTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Underlying {\n");
    
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    askSize: ").append(toIndentedString(askSize)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidSize: ").append(toIndentedString(bidSize)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    delayed: ").append(toIndentedString(delayed)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
    sb.append("    fiftyTwoWeekHigh: ").append(toIndentedString(fiftyTwoWeekHigh)).append("\n");
    sb.append("    fiftyTwoWeekLow: ").append(toIndentedString(fiftyTwoWeekLow)).append("\n");
    sb.append("    highPrice: ").append(toIndentedString(highPrice)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    lowPrice: ").append(toIndentedString(lowPrice)).append("\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    markChange: ").append(toIndentedString(markChange)).append("\n");
    sb.append("    markPercentChange: ").append(toIndentedString(markPercentChange)).append("\n");
    sb.append("    openPrice: ").append(toIndentedString(openPrice)).append("\n");
    sb.append("    percentChange: ").append(toIndentedString(percentChange)).append("\n");
    sb.append("    quoteTime: ").append(toIndentedString(quoteTime)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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
