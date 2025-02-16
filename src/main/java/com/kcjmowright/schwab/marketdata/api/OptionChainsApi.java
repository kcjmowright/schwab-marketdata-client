package com.kcjmowright.schwab.marketdata.api;

import com.kcjmowright.schwab.marketdata.invoker.ApiClient;

import com.kcjmowright.schwab.marketdata.model.ErrorResponse;
import java.time.LocalDate;
import com.kcjmowright.schwab.marketdata.model.OptionChain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


@Component("com.kcjmowright.schwab.marketdata.api.OptionChainsApi")
public class OptionChainsApi {
    private ApiClient apiClient;

    public OptionChainsApi() {
        this(new ApiClient());
    }

    @Autowired
    public OptionChainsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get option chain for an optionable Symbol
     * Get Option Chain including information on options contracts associated with each expiration.
     * <p><b>200</b> - The Chain for the symbol was returned successfully.
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbol Enter one symbol (required)
     * @param contractType Contract Type (optional)
     * @param strikeCount The Number of strikes to return above or below the at-the-money price (optional)
     * @param includeUnderlyingQuote Underlying quotes to be included (optional)
     * @param strategy OptionChain strategy. Default is SINGLE. ANALYTICAL allows the use of volatility, underlyingPrice, interestRate, and daysToExpiration params to calculate theoretical values. (optional)
     * @param interval Strike interval for spread strategy chains (see strategy param) (optional)
     * @param strike Strike Price (optional)
     * @param range Range(ITM/NTM/OTM etc.) (optional)
     * @param fromDate From date(pattern: yyyy-MM-dd) (optional)
     * @param toDate To date (pattern: yyyy-MM-dd) (optional)
     * @param volatility Volatility to use in calculations.  Applies only to ANALYTICAL strategy chains (see strategy param) (optional)
     * @param underlyingPrice Underlying price to use in calculations. Applies only to ANALYTICAL strategy chains (see strategy param) (optional)
     * @param interestRate Interest rate to use in calculations. Applies only to ANALYTICAL strategy chains (see strategy param) (optional)
     * @param daysToExpiration Days to expiration to use in calculations. Applies only to ANALYTICAL strategy chains (see strategy param) (optional)
     * @param expMonth Expiration month (optional)
     * @param optionType Option Type (optional)
     * @param entitlement Applicable only if its retail token, entitlement of client PP-PayingPro, NP-NonPro and PN-NonPayingPro (optional)
     * @return OptionChain
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OptionChain getChain(String symbol, String contractType, Integer strikeCount, Boolean includeUnderlyingQuote, String strategy, Double interval, Double strike, String range, LocalDate fromDate, LocalDate toDate, Double volatility, Double underlyingPrice, Double interestRate, Integer daysToExpiration, String expMonth, String optionType, String entitlement) throws RestClientException {
        return getChainWithHttpInfo(symbol, contractType, strikeCount, includeUnderlyingQuote, strategy, interval, strike, range, fromDate, toDate, volatility, underlyingPrice, interestRate, daysToExpiration, expMonth, optionType, entitlement).getBody();
    }

    /**
     * Get option chain for an optionable Symbol
     * Get Option Chain including information on options contracts associated with each expiration.
     * <p><b>200</b> - The Chain for the symbol was returned successfully.
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbol Enter one symbol (required)
     * @param contractType Contract Type (optional)
     * @param strikeCount The Number of strikes to return above or below the at-the-money price (optional)
     * @param includeUnderlyingQuote Underlying quotes to be included (optional)
     * @param strategy OptionChain strategy. Default is SINGLE. ANALYTICAL allows the use of volatility, underlyingPrice, interestRate, and daysToExpiration params to calculate theoretical values. (optional)
     * @param interval Strike interval for spread strategy chains (see strategy param) (optional)
     * @param strike Strike Price (optional)
     * @param range Range(ITM/NTM/OTM etc.) (optional)
     * @param fromDate From date(pattern: yyyy-MM-dd) (optional)
     * @param toDate To date (pattern: yyyy-MM-dd) (optional)
     * @param volatility Volatility to use in calculations.  Applies only to ANALYTICAL strategy chains (see strategy param) (optional)
     * @param underlyingPrice Underlying price to use in calculations. Applies only to ANALYTICAL strategy chains (see strategy param) (optional)
     * @param interestRate Interest rate to use in calculations. Applies only to ANALYTICAL strategy chains (see strategy param) (optional)
     * @param daysToExpiration Days to expiration to use in calculations. Applies only to ANALYTICAL strategy chains (see strategy param) (optional)
     * @param expMonth Expiration month (optional)
     * @param optionType Option Type (optional)
     * @param entitlement Applicable only if its retail token, entitlement of client PP-PayingPro, NP-NonPro and PN-NonPayingPro (optional)
     * @return ResponseEntity&lt;OptionChain&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OptionChain> getChainWithHttpInfo(String symbol, String contractType, Integer strikeCount, Boolean includeUnderlyingQuote, String strategy, Double interval, Double strike, String range, LocalDate fromDate, LocalDate toDate, Double volatility, Double underlyingPrice, Double interestRate, Integer daysToExpiration, String expMonth, String optionType, String entitlement) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling getChain");
        }
        String path = UriComponentsBuilder.fromPath("/chains").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contractType", contractType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "strikeCount", strikeCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeUnderlyingQuote", includeUnderlyingQuote));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "strategy", strategy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "interval", interval));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "strike", strike));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "range", range));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromDate", fromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "toDate", toDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "volatility", volatility));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "underlyingPrice", underlyingPrice));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "interestRate", interestRate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "daysToExpiration", daysToExpiration));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expMonth", expMonth));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "optionType", optionType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entitlement", entitlement));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<OptionChain> returnType = new ParameterizedTypeReference<OptionChain>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
