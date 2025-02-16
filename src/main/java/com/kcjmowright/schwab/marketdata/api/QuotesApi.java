package com.kcjmowright.schwab.marketdata.api;

import com.kcjmowright.schwab.marketdata.invoker.ApiClient;

import com.kcjmowright.schwab.marketdata.model.ErrorResponse;
import com.kcjmowright.schwab.marketdata.model.QuoteResponse;

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


@Component("com.kcjmowright.schwab.marketdata.api.QuotesApi")
public class QuotesApi {
    private ApiClient apiClient;

    public QuotesApi() {
        this(new ApiClient());
    }

    @Autowired
    public QuotesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Quote by single symbol.
     * 
     * <p><b>200</b> - Quote Response
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbolId Symbol of instrument (required)
     * @param fields Request for subset of data by passing coma separated list of root nodes, possible root nodes are quote, fundamental, extended, reference, regular. Sending &#x60;quote, fundamental&#x60; in request will return quote and fundamental data in response. Dont send this attribute for full response. (optional, default to all)
     * @return QuoteResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public QuoteResponse getQuote(String symbolId, String fields) throws RestClientException {
        return getQuoteWithHttpInfo(symbolId, fields).getBody();
    }

    /**
     * Get Quote by single symbol.
     * 
     * <p><b>200</b> - Quote Response
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbolId Symbol of instrument (required)
     * @param fields Request for subset of data by passing coma separated list of root nodes, possible root nodes are quote, fundamental, extended, reference, regular. Sending &#x60;quote, fundamental&#x60; in request will return quote and fundamental data in response. Dont send this attribute for full response. (optional, default to all)
     * @return ResponseEntity&lt;QuoteResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<QuoteResponse> getQuoteWithHttpInfo(String symbolId, String fields) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'symbolId' is set
        if (symbolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbolId' when calling getQuote");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("symbol_id", symbolId);
        String path = UriComponentsBuilder.fromPath("/{symbol_id}/quotes").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<QuoteResponse> returnType = new ParameterizedTypeReference<QuoteResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Quotes by list of symbols.
     * 
     * <p><b>200</b> - Quote Response
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbols Comma separated list of symbol(s) to look up a quote (optional)
     * @param fields Request for subset of data by passing coma separated list of root nodes, possible root nodes are quote, fundamental, extended, reference, regular. Sending &#x60;quote, fundamental&#x60; in request will return quote and fundamental data in response. Dont send this attribute for full response. (optional, default to all)
     * @param indicative Include indicative symbol quotes for all ETF symbols in request. If ETF symbol ABC is in request and indicative&#x3D;true API will return quotes for ABC and its corresponding indicative quote for $ABC.IV (optional)
     * @return QuoteResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public QuoteResponse getQuotes(String symbols, String fields, Boolean indicative) throws RestClientException {
        return getQuotesWithHttpInfo(symbols, fields, indicative).getBody();
    }

    /**
     * Get Quotes by list of symbols.
     * 
     * <p><b>200</b> - Quote Response
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbols Comma separated list of symbol(s) to look up a quote (optional)
     * @param fields Request for subset of data by passing coma separated list of root nodes, possible root nodes are quote, fundamental, extended, reference, regular. Sending &#x60;quote, fundamental&#x60; in request will return quote and fundamental data in response. Dont send this attribute for full response. (optional, default to all)
     * @param indicative Include indicative symbol quotes for all ETF symbols in request. If ETF symbol ABC is in request and indicative&#x3D;true API will return quotes for ABC and its corresponding indicative quote for $ABC.IV (optional)
     * @return ResponseEntity&lt;QuoteResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<QuoteResponse> getQuotesWithHttpInfo(String symbols, String fields, Boolean indicative) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/quotes").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbols", symbols));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "indicative", indicative));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<QuoteResponse> returnType = new ParameterizedTypeReference<QuoteResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
