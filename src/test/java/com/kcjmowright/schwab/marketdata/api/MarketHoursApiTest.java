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

package com.kcjmowright.schwab.marketdata.api;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

import com.kcjmowright.schwab.marketdata.model.Hours;

/**
 * API tests for MarketHoursApi
 */
@Ignore
public class MarketHoursApiTest {

    private final MarketHoursApi api = new MarketHoursApi();

    /**
     * Get Market Hours for a single market.
     *
     * Get Market Hours for dates in the future for a single market.
     */
    @Test
    public void getMarketHourTest() {
        String marketId = null;
        LocalDate date = null;
        Map<String, Map<String, Hours>> response = api.getMarketHour(marketId, date);

        // TODO: test validations
    }
    /**
     * Get Market Hours for different markets.
     *
     * Get Market Hours for dates in the future across different markets.
     *
     */
    @Test
    public void getMarketHoursTest() {
        List<String> markets = null;
        LocalDate date = null;
        Map<String, Map<String, Hours>> response = api.getMarketHours(markets, date);

        // TODO: test validations
    }
}
