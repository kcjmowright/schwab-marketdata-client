package com.kcjmowright.schwab.marketdata.api;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import com.kcjmowright.schwab.marketdata.invoker.ApiClient;
import com.kcjmowright.schwab.marketdata.model.Hours;


@Component("com.kcjmowright.schwab.marketdata.api.MarketHoursApi")
public class MarketHoursApi {
    private ApiClient apiClient;

    public MarketHoursApi() {
        this(new ApiClient());
    }

    @Autowired
    public MarketHoursApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Market Hours for a single market.
     * Get Market Hours for dates in the future for a single market.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param marketId market id (required)
     * @param date Valid date range is from currentdate to 1 year from today. It will default to current day if not entered. Date format:YYYY-MM-DD (optional)
     * @return Map&lt;String, Map&lt;String, Hours&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Map<String, Map<String, Hours>> getMarketHour(String marketId, LocalDate date) throws RestClientException {
        return getMarketHourWithHttpInfo(marketId, date).getBody();
    }

    /**
     * Get Market Hours for a single market.
     * Get Market Hours for dates in the future for a single market.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param marketId market id (required)
     * @param date Valid date range is from currentdate to 1 year from today. It will default to current day if not entered. Date format:YYYY-MM-DD (optional)
     * @return ResponseEntity&lt;Map&lt;String, Map&lt;String, Hours&gt;&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Map<String, Map<String, Hours>>> getMarketHourWithHttpInfo(String marketId, LocalDate date) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'marketId' is set
        if (marketId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'marketId' when calling getMarketHour");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("market_id", marketId);
        String path = UriComponentsBuilder.fromPath("/markets/{market_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));

        final String[] accepts = {
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<Map<String, Map<String, Hours>>> returnType = new ParameterizedTypeReference<Map<String, Map<String, Hours>>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Market Hours for different markets.
     * Get Market Hours for dates in the future across different markets.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param markets List of markets (required)
     * @param date Valid date range is from currentdate to 1 year from today. It will default to current day if not entered. Date format:YYYY-MM-DD (optional)
     * @return Map&lt;String, Map&lt;String, Hours&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Map<String, Map<String, Hours>> getMarketHours(List<String> markets, LocalDate date) throws RestClientException {
        return getMarketHoursWithHttpInfo(markets, date).getBody();
    }

    /**
     * Get Market Hours for different markets.
     * Get Market Hours for dates in the future across different markets.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param markets List of markets (required)
     * @param date Valid date range is from currentdate to 1 year from today. It will default to current day if not entered. Date format:YYYY-MM-DD (optional)
     * @return ResponseEntity&lt;Map&lt;String, Map&lt;String, Hours&gt;&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Map<String, Map<String, Hours>>> getMarketHoursWithHttpInfo(List<String> markets, LocalDate date) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'markets' is set
        if (markets == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'markets' when calling getMarketHours");
        }
        String path = UriComponentsBuilder.fromPath("/markets").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "markets", markets));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));

        final String[] accepts = {
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<Map<String, Map<String, Hours>>> returnType = new ParameterizedTypeReference<Map<String, Map<String, Hours>>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
