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

import com.kcjmowright.schwab.marketdata.model.ErrorResponse;
import java.time.LocalDate;
import com.kcjmowright.schwab.marketdata.model.OptionChain;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OptionChainsApi
 */
@Ignore
public class OptionChainsApiTest {

    private final OptionChainsApi api = new OptionChainsApi();

    /**
     * Get option chain for an optionable Symbol
     *
     * Get Option Chain including information on options contracts associated with each expiration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChainTest() {
        String symbol = null;
        String contractType = null;
        Integer strikeCount = null;
        Boolean includeUnderlyingQuote = null;
        String strategy = null;
        Double interval = null;
        Double strike = null;
        String range = null;
        LocalDate fromDate = null;
        LocalDate toDate = null;
        Double volatility = null;
        Double underlyingPrice = null;
        Double interestRate = null;
        Integer daysToExpiration = null;
        String expMonth = null;
        String optionType = null;
        String entitlement = null;
        OptionChain response = api.getChain(symbol, contractType, strikeCount, includeUnderlyingQuote, strategy, interval, strike, range, fromDate, toDate, volatility, underlyingPrice, interestRate, daysToExpiration, expMonth, optionType, entitlement);

        // TODO: test validations
    }
}
