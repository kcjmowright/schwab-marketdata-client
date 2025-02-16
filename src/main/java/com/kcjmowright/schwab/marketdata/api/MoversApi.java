package com.kcjmowright.schwab.marketdata.api;

import com.kcjmowright.schwab.marketdata.invoker.ApiClient;

import com.kcjmowright.schwab.marketdata.model.ErrorResponse;
import com.kcjmowright.schwab.marketdata.model.InlineResponse200;

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


@Component("com.kcjmowright.schwab.marketdata.api.MoversApi")
public class MoversApi {
    private ApiClient apiClient;

    public MoversApi() {
        this(new ApiClient());
    }

    @Autowired
    public MoversApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Movers for a specific index.
     * Get a list of top 10 securities movement for a specific index.
     * <p><b>200</b> - Analytics for the symbol was returned successfully.
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbolId Index Symbol (required)
     * @param sort Sort by a particular attribute (optional)
     * @param frequency To return movers with the specified directions of up or down (optional, default to 0)
     * @return InlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse200 getMovers(String symbolId, String sort, Integer frequency) throws RestClientException {
        return getMoversWithHttpInfo(symbolId, sort, frequency).getBody();
    }

    /**
     * Get Movers for a specific index.
     * Get a list of top 10 securities movement for a specific index.
     * <p><b>200</b> - Analytics for the symbol was returned successfully.
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbolId Index Symbol (required)
     * @param sort Sort by a particular attribute (optional)
     * @param frequency To return movers with the specified directions of up or down (optional, default to 0)
     * @return ResponseEntity&lt;InlineResponse200&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse200> getMoversWithHttpInfo(String symbolId, String sort, Integer frequency) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'symbolId' is set
        if (symbolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbolId' when calling getMovers");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("symbol_id", symbolId);
        String path = UriComponentsBuilder.fromPath("/movers/{symbol_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "frequency", frequency));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<InlineResponse200> returnType = new ParameterizedTypeReference<InlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
