package com.kcjmowright.schwab.marketdata.api;

import com.kcjmowright.schwab.marketdata.invoker.ApiClient;

import com.kcjmowright.schwab.marketdata.model.ErrorResponse;
import com.kcjmowright.schwab.marketdata.model.ExpirationChain;

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


@Component("com.kcjmowright.schwab.marketdata.api.OptionExpirationChainApi")
public class OptionExpirationChainApi {
    private ApiClient apiClient;

    public OptionExpirationChainApi() {
        this(new ApiClient());
    }

    @Autowired
    public OptionExpirationChainApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get option expiration chain for an optionable symbol
     * Get Option Expiration (Series) information for an optionable symbol.  Does not include individual options contracts for the underlying.
     * <p><b>200</b> - The Expiration Chain for the symbol was returned successfully.
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbol Enter one symbol (required)
     * @return ExpirationChain
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExpirationChain getExpirationChain(String symbol) throws RestClientException {
        return getExpirationChainWithHttpInfo(symbol).getBody();
    }

    /**
     * Get option expiration chain for an optionable symbol
     * Get Option Expiration (Series) information for an optionable symbol.  Does not include individual options contracts for the underlying.
     * <p><b>200</b> - The Expiration Chain for the symbol was returned successfully.
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbol Enter one symbol (required)
     * @return ResponseEntity&lt;ExpirationChain&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExpirationChain> getExpirationChainWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling getExpirationChain");
        }
        String path = UriComponentsBuilder.fromPath("/expirationchain").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<ExpirationChain> returnType = new ParameterizedTypeReference<ExpirationChain>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
