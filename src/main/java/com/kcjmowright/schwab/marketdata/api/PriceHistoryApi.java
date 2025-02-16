package com.kcjmowright.schwab.marketdata.api;

import com.kcjmowright.schwab.marketdata.invoker.ApiClient;

import com.kcjmowright.schwab.marketdata.model.CandleList;
import com.kcjmowright.schwab.marketdata.model.ErrorResponse;

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


@Component("com.kcjmowright.schwab.marketdata.api.PriceHistoryApi")
public class PriceHistoryApi {
    private ApiClient apiClient;

    public PriceHistoryApi() {
        this(new ApiClient());
    }

    @Autowired
    public PriceHistoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get PriceHistory for a single symbol and date ranges.
     * Get historical Open, High, Low, Close, and Volume for a given frequency (i.e. aggregation).  Frequency available is dependent on periodType selected.  The datetime format is in EPOCH milliseconds.
     * <p><b>200</b> - Get all candles for given date range
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbol The Equity symbol used to look up price history (required)
     * @param periodType The chart period being requested. (optional)
     * @param period The number of chart period types.&lt;br&gt;&lt;br&gt; If the periodType is &lt;br&gt; &amp;#8226; &lt;b&gt;day&lt;/b&gt; - valid values are 1, 2, 3, 4, 5, 10&lt;br&gt; &amp;#8226; &lt;b&gt;month&lt;/b&gt; - valid values are 1, 2, 3, 6&lt;br&gt; &amp;#8226; &lt;b&gt;year&lt;/b&gt; - valid values are 1, 2, 3, 5, 10, 15, 20&lt;br&gt; &amp;#8226; &lt;b&gt;ytd&lt;/b&gt; - valid values are 1&lt;br&gt;&lt;br&gt; If   the period is not specified and the periodType is&lt;br&gt; &amp;#8226; &lt;b&gt;day&lt;/b&gt; - default period is 10.&lt;br&gt; &amp;#8226; &lt;b&gt;month&lt;/b&gt; - default period is 1.&lt;br&gt; &amp;#8226; &lt;b&gt;year&lt;/b&gt; - default period is 1.&lt;br&gt; &amp;#8226; &lt;b&gt;ytd&lt;/b&gt; - default period is 1.&lt;br&gt; (optional)
     * @param frequencyType The time frequencyType&lt;br&gt;&lt;br&gt; If the periodType is &lt;br&gt; &amp;#8226; &lt;b&gt;day&lt;/b&gt; - valid value is minute&lt;br&gt; &amp;#8226; &lt;b&gt;month&lt;/b&gt; - valid values are daily, weekly&lt;br&gt; &amp;#8226; &lt;b&gt;year&lt;/b&gt; - valid values are daily, weekly, monthly&lt;br&gt; &amp;#8226; &lt;b&gt;ytd&lt;/b&gt; - valid values are daily, weekly&lt;br&gt;&lt;br&gt; If frequencyType  is not specified, default value depends on the periodType&lt;br&gt; &amp;#8226; &lt;b&gt;day&lt;/b&gt; - defaulted to minute.&lt;br&gt; &amp;#8226; &lt;b&gt;month&lt;/b&gt; - defaulted to weekly.&lt;br&gt; &amp;#8226; &lt;b&gt;year&lt;/b&gt; - defaulted to monthly.&lt;br&gt; &amp;#8226; &lt;b&gt;ytd&lt;/b&gt; - defaulted to weekly.&lt;br&gt; (optional)
     * @param frequency The time frequency duration&lt;br&gt;&lt;br&gt; If the frequencyType is &lt;br&gt; &amp;#8226; &lt;b&gt;minute&lt;/b&gt; - valid values are 1, 5, 10, 15, 30&lt;br&gt; &amp;#8226; &lt;b&gt;daily&lt;/b&gt; - valid value is 1&lt;br&gt; &amp;#8226; &lt;b&gt;weekly&lt;/b&gt; - valid value is 1&lt;br&gt; &amp;#8226; &lt;b&gt;monthly&lt;/b&gt; - valid value is 1&lt;br&gt;&lt;br&gt; If frequency  is not specified, default value is &lt;b&gt;1&lt;/b&gt;&lt;br&gt; (optional)
     * @param startDate The start date, Time   in milliseconds since the UNIX epoch eg 1451624400000&lt;br&gt;If not   specified startDate will be (endDate - period) excluding weekends and holidays. (optional)
     * @param endDate The end date, Time   in milliseconds since the UNIX epoch eg 1451624400000&lt;br&gt; If not   specified, the endDate will default to the market close of previous business day. (optional)
     * @param needExtendedHoursData Need extended hours data (optional)
     * @param needPreviousClose Need previous close price/date (optional)
     * @return CandleList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CandleList getPriceHistory(String symbol, String periodType, Integer period, String frequencyType, Integer frequency, Long startDate, Long endDate, Boolean needExtendedHoursData, Boolean needPreviousClose) throws RestClientException {
        return getPriceHistoryWithHttpInfo(symbol, periodType, period, frequencyType, frequency, startDate, endDate, needExtendedHoursData, needPreviousClose).getBody();
    }

    /**
     * Get PriceHistory for a single symbol and date ranges.
     * Get historical Open, High, Low, Close, and Volume for a given frequency (i.e. aggregation).  Frequency available is dependent on periodType selected.  The datetime format is in EPOCH milliseconds.
     * <p><b>200</b> - Get all candles for given date range
     * <p><b>400</b> - Error response for generic client error 400
     * <p><b>401</b> - Error response for 401 Unauthorized
     * <p><b>404</b> - Error response for 404 Not Found
     * <p><b>500</b> - Error response for 500 Internal Server Error
     * @param symbol The Equity symbol used to look up price history (required)
     * @param periodType The chart period being requested. (optional)
     * @param period The number of chart period types.&lt;br&gt;&lt;br&gt; If the periodType is &lt;br&gt; &amp;#8226; &lt;b&gt;day&lt;/b&gt; - valid values are 1, 2, 3, 4, 5, 10&lt;br&gt; &amp;#8226; &lt;b&gt;month&lt;/b&gt; - valid values are 1, 2, 3, 6&lt;br&gt; &amp;#8226; &lt;b&gt;year&lt;/b&gt; - valid values are 1, 2, 3, 5, 10, 15, 20&lt;br&gt; &amp;#8226; &lt;b&gt;ytd&lt;/b&gt; - valid values are 1&lt;br&gt;&lt;br&gt; If   the period is not specified and the periodType is&lt;br&gt; &amp;#8226; &lt;b&gt;day&lt;/b&gt; - default period is 10.&lt;br&gt; &amp;#8226; &lt;b&gt;month&lt;/b&gt; - default period is 1.&lt;br&gt; &amp;#8226; &lt;b&gt;year&lt;/b&gt; - default period is 1.&lt;br&gt; &amp;#8226; &lt;b&gt;ytd&lt;/b&gt; - default period is 1.&lt;br&gt; (optional)
     * @param frequencyType The time frequencyType&lt;br&gt;&lt;br&gt; If the periodType is &lt;br&gt; &amp;#8226; &lt;b&gt;day&lt;/b&gt; - valid value is minute&lt;br&gt; &amp;#8226; &lt;b&gt;month&lt;/b&gt; - valid values are daily, weekly&lt;br&gt; &amp;#8226; &lt;b&gt;year&lt;/b&gt; - valid values are daily, weekly, monthly&lt;br&gt; &amp;#8226; &lt;b&gt;ytd&lt;/b&gt; - valid values are daily, weekly&lt;br&gt;&lt;br&gt; If frequencyType  is not specified, default value depends on the periodType&lt;br&gt; &amp;#8226; &lt;b&gt;day&lt;/b&gt; - defaulted to minute.&lt;br&gt; &amp;#8226; &lt;b&gt;month&lt;/b&gt; - defaulted to weekly.&lt;br&gt; &amp;#8226; &lt;b&gt;year&lt;/b&gt; - defaulted to monthly.&lt;br&gt; &amp;#8226; &lt;b&gt;ytd&lt;/b&gt; - defaulted to weekly.&lt;br&gt; (optional)
     * @param frequency The time frequency duration&lt;br&gt;&lt;br&gt; If the frequencyType is &lt;br&gt; &amp;#8226; &lt;b&gt;minute&lt;/b&gt; - valid values are 1, 5, 10, 15, 30&lt;br&gt; &amp;#8226; &lt;b&gt;daily&lt;/b&gt; - valid value is 1&lt;br&gt; &amp;#8226; &lt;b&gt;weekly&lt;/b&gt; - valid value is 1&lt;br&gt; &amp;#8226; &lt;b&gt;monthly&lt;/b&gt; - valid value is 1&lt;br&gt;&lt;br&gt; If frequency  is not specified, default value is &lt;b&gt;1&lt;/b&gt;&lt;br&gt; (optional)
     * @param startDate The start date, Time   in milliseconds since the UNIX epoch eg 1451624400000&lt;br&gt;If not   specified startDate will be (endDate - period) excluding weekends and holidays. (optional)
     * @param endDate The end date, Time   in milliseconds since the UNIX epoch eg 1451624400000&lt;br&gt; If not   specified, the endDate will default to the market close of previous business day. (optional)
     * @param needExtendedHoursData Need extended hours data (optional)
     * @param needPreviousClose Need previous close price/date (optional)
     * @return ResponseEntity&lt;CandleList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CandleList> getPriceHistoryWithHttpInfo(String symbol, String periodType, Integer period, String frequencyType, Integer frequency, Long startDate, Long endDate, Boolean needExtendedHoursData, Boolean needPreviousClose) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling getPriceHistory");
        }
        String path = UriComponentsBuilder.fromPath("/pricehistory").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "periodType", periodType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "period", period));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "frequencyType", frequencyType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "frequency", frequency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "needExtendedHoursData", needExtendedHoursData));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "needPreviousClose", needPreviousClose));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<CandleList> returnType = new ParameterizedTypeReference<CandleList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
