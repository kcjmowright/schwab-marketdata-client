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
import com.kcjmowright.schwab.marketdata.model.ExpirationChain;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OptionExpirationChainApi
 */
@Ignore
public class OptionExpirationChainApiTest {

    private final OptionExpirationChainApi api = new OptionExpirationChainApi();

    /**
     * Get option expiration chain for an optionable symbol
     *
     * Get Option Expiration (Series) information for an optionable symbol.  Does not include individual options contracts for the underlying.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExpirationChainTest() {
        String symbol = null;
        ExpirationChain response = api.getExpirationChain(symbol);

        // TODO: test validations
    }
}
