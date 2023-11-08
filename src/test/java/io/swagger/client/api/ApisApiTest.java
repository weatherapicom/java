/*
 * Weather API
 * # Introduction WeatherAPI.com provides access to weather and geo data via a JSON/XML restful API. It allows developers to create desktop, web and mobile applications using this data very easy. We provide following data through our API:     - Real-time weather - 14 day weather forecast - Historical Weather - Marine Weather and Tide Data - Future Weather (Upto 365 days ahead) - Daily and hourly intervals - 15 min interval (Enterprise only) - Astronomy - Time zone - Location data - Sports - Search or Autocomplete API - Weather Alerts - Air Quality Data - Bulk Request  # Getting Started    You need to [signup](https://www.weatherapi.com/signup.aspx) and then you can find your API key under [your account](https://www.weatherapi.com/login.aspx), and start using API right away!  Try our weather API by using interactive [API Explorer](https://www.weatherapi.com/api-explorer.aspx).  We also have SDK for popular framework/languages available on [Github](https://github.com/weatherapicom/) for quick integrations.  If you find any features missing or have any suggestions, please [contact us](https://www.weatherapi.com/contact.aspx).    # Authentication    API access to the data is protected by an API key. If at anytime, you find the API key has become vulnerable, please regenerate the key using Regenerate button next to the API key.    Authentication to the WeatherAPI.com API is provided by passing your API key as request parameter through an API .      ##  key parameter  key=YOUR API KEY  
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.ArrayOfSearch;
import io.swagger.client.model.Error400;
import io.swagger.client.model.Error401;
import io.swagger.client.model.Error403;
import io.swagger.client.model.Ip;
import org.threeten.bp.LocalDate;
import io.swagger.client.model.Location;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApisApi
 */
@Ignore
public class ApisApiTest {

    private final ApisApi api = new ApisApi();

    
    /**
     * Astronomy API
     *
     * Return Location and Astronomy Object
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void astronomyTest() throws Exception {
        String q = null;
        LocalDate dt = null;
        Object response = api.astronomy(q, dt);

        // TODO: test validations
    }
    
    /**
     * Forecast API
     *
     * Forecast weather API method returns, depending upon your price plan level, upto next 14 day weather forecast and weather alert as json or xml. The data is returned as a Forecast Object.&lt;br /&gt;&lt;br /&gt;Forecast object contains astronomy data, day weather forecast and hourly interval weather information for a given city.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void forecastWeatherTest() throws Exception {
        String q = null;
        Integer days = null;
        LocalDate dt = null;
        Integer unixdt = null;
        Integer hour = null;
        String lang = null;
        String alerts = null;
        String aqi = null;
        Integer tp = null;
        Object response = api.forecastWeather(q, days, dt, unixdt, hour, lang, alerts, aqi, tp);

        // TODO: test validations
    }
    
    /**
     * Future API
     *
     * Future weather API method returns weather in a 3 hourly interval in future for a date between 14 days and 365 days from today in the future.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void futureWeatherTest() throws Exception {
        String q = null;
        LocalDate dt = null;
        String lang = null;
        Object response = api.futureWeather(q, dt, lang);

        // TODO: test validations
    }
    
    /**
     * History API
     *
     * History weather API method returns historical weather for a date on or after 1st Jan, 2010 as json. The data is returned as a Forecast Object.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void historyWeatherTest() throws Exception {
        String q = null;
        LocalDate dt = null;
        Integer unixdt = null;
        LocalDate endDt = null;
        Integer unixendDt = null;
        Integer hour = null;
        String lang = null;
        Object response = api.historyWeather(q, dt, unixdt, endDt, unixendDt, hour, lang);

        // TODO: test validations
    }
    
    /**
     * IP Lookup API
     *
     * IP Lookup API method allows a user to get up to date information for an IP address.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipLookupTest() throws Exception {
        String q = null;
        Ip response = api.ipLookup(q);

        // TODO: test validations
    }
    
    /**
     * Marine Weather API
     *
     * Marine weather API method returns upto next 7 day (depending upon your price plan level) marine and sailing weather forecast and tide data (depending upon your price plan level) as json or xml. The data is returned as a Marine Object.&lt;br /&gt;&lt;br /&gt;Marine object, depending upon your price plan level, contains astronomy data, day weather forecast and hourly interval weather information and tide data for a given sea/ocean point.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void marineWeatherTest() throws Exception {
        String q = null;
        Integer days = null;
        LocalDate dt = null;
        Integer unixdt = null;
        Integer hour = null;
        String lang = null;
        Object response = api.marineWeather(q, days, dt, unixdt, hour, lang);

        // TODO: test validations
    }
    
    /**
     * Realtime API
     *
     * Current weather or realtime weather API method allows a user to get up to date current weather information in json and xml. The data is returned as a Current Object.&lt;br /&gt;&lt;br /&gt;Current object contains current or realtime weather information for a given city.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void realtimeWeatherTest() throws Exception {
        String q = null;
        String lang = null;
        Object response = api.realtimeWeather(q, lang);

        // TODO: test validations
    }
    
    /**
     * Search/Autocomplete API
     *
     * WeatherAPI.com Search or Autocomplete API returns matching cities and towns as an array of Location object.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchAutocompleteWeatherTest() throws Exception {
        String q = null;
        ArrayOfSearch response = api.searchAutocompleteWeather(q);

        // TODO: test validations
    }
    
    /**
     * Time Zone API
     *
     * Return Location Object
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void timeZoneTest() throws Exception {
        String q = null;
        Location response = api.timeZone(q);

        // TODO: test validations
    }
    
}