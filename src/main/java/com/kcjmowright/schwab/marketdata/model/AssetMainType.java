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
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Instrument&#x27;s asset type
 */
public enum AssetMainType {
  BOND("BOND"),
  EQUITY("EQUITY"),
  FOREX("FOREX"),
  FUTURE("FUTURE"),
  FUTURE_OPTION("FUTURE_OPTION"),
  INDEX("INDEX"),
  MUTUAL_FUND("MUTUAL_FUND"),
  OPTION("OPTION");

  private String value;

  AssetMainType(String value) {
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
  public static AssetMainType fromValue(String input) {
    for (AssetMainType b : AssetMainType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }
}
