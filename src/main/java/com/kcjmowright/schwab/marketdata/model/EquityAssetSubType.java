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
 * Asset Sub Type (only there if applicable)
 */
public enum EquityAssetSubType {
  COE("COE"),
  PRF("PRF"),
  ADR("ADR"),
  GDR("GDR"),
  CEF("CEF"),
  ETF("ETF"),
  ETN("ETN"),
  UIT("UIT"),
  WAR("WAR"),
  RGT("RGT"),
  NULL(null);

  private String value;

  EquityAssetSubType(String value) {
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
  public static EquityAssetSubType fromValue(String input) {
    for (EquityAssetSubType b : EquityAssetSubType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }
}
