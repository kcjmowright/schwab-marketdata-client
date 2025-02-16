package com.kcjmowright.schwab.marketdata.api;

import com.kcjmowright.schwab.marketdata.invoker.ApiClient;

import com.kcjmowright.schwab.marketdata.model.ErrorResponse;
import com.kcjmowright.schwab.marketdata.model.InlineResponse2001;
import com.kcjmowright.schwab.marketdata.model.InstrumentResponse;

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


@Component("com.kcjmowright.schwab.marketdata.api.InstrumentsApi")
public class InstrumentsApi {
    private ApiClient apiClient;

    public InstrumentsApi() {
        this(new ApiClient());
    }

    @Autowired
    public InstrumentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Instruments by symbols and projections.
     * Get Instruments details by using different projections.  Get more specific fundamental instrument data by using fundamental as the projection.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbol symbol of a security (required)
     * @param projection search by (required)
     * @return InlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2001 getInstruments(String symbol, String projection) throws RestClientException {
        return getInstrumentsWithHttpInfo(symbol, projection).getBody();
    }

    /**
     * Get Instruments by symbols and projections.
     * Get Instruments details by using different projections.  Get more specific fundamental instrument data by using fundamental as the projection.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbol symbol of a security (required)
     * @param projection search by (required)
     * @return ResponseEntity&lt;InlineResponse2001&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse2001> getInstrumentsWithHttpInfo(String symbol, String projection) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling getInstruments");
        }
        // verify the required parameter 'projection' is set
        if (projection == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projection' when calling getInstruments");
        }
        String path = UriComponentsBuilder.fromPath("/instruments").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projection", projection));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<InlineResponse2001> returnType = new ParameterizedTypeReference<InlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Instrument by specific cusip
     * Get basic instrument details by cusip
     * <p><b>200</b> - OK
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param cusipId cusip of a security (required)
     * @return InstrumentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InstrumentResponse getInstrumentsByCusip(String cusipId) throws RestClientException {
        return getInstrumentsByCusipWithHttpInfo(cusipId).getBody();
    }

    /**
     * Get Instrument by specific cusip
     * Get basic instrument details by cusip
     * <p><b>200</b> - OK
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param cusipId cusip of a security (required)
     * @return ResponseEntity&lt;InstrumentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InstrumentResponse> getInstrumentsByCusipWithHttpInfo(String cusipId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'cusipId' is set
        if (cusipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cusipId' when calling getInstrumentsByCusip");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cusip_id", cusipId);
        String path = UriComponentsBuilder.fromPath("/instruments/{cusip_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<InstrumentResponse> returnType = new ParameterizedTypeReference<InstrumentResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
