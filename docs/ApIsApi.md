# ApIsApi

All URIs are relative to *https://api.weatherapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**astronomy**](ApIsApi.md#astronomy) | **GET** /astronomy.json | Astronomy API
[**forecastWeather**](ApIsApi.md#forecastWeather) | **GET** /forecast.json | Forecast API
[**futureWeather**](ApIsApi.md#futureWeather) | **GET** /future.json | Future API
[**historyWeather**](ApIsApi.md#historyWeather) | **GET** /history.json | History API
[**ipLookup**](ApIsApi.md#ipLookup) | **GET** /ip.json | IP Lookup API
[**realtimeWeather**](ApIsApi.md#realtimeWeather) | **GET** /current.json | Realtime API
[**searchAutocompleteWeather**](ApIsApi.md#searchAutocompleteWeather) | **GET** /search.json | Search/Autocomplete API
[**timeZone**](ApIsApi.md#timeZone) | **GET** /timezone.json | Time Zone API

<a name="astronomy"></a>
# **astronomy**
> InlineResponse2003 astronomy(q, dt)

Astronomy API

Return Location and Astronomy Object

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApIsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApIsApi apiInstance = new ApIsApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. 
LocalDate dt = new LocalDate(); // LocalDate | Date on or after 1st Jan, 2015 in yyyy-MM-dd format
try {
    InlineResponse2003 result = apiInstance.astronomy(q, dt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApIsApi#astronomy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.  |
 **dt** | **LocalDate**| Date on or after 1st Jan, 2015 in yyyy-MM-dd format |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="forecastWeather"></a>
# **forecastWeather**
> InlineResponse2001 forecastWeather(q, days, dt, unixdt, hour, lang)

Forecast API

Forecast weather API method returns upto next 10 day weather forecast and weather alert as json. The data is returned as a Forecast Object.   Forecast object contains astronomy data, day weather forecast and hourly interval weather information for a given city. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApIsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApIsApi apiInstance = new ApIsApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. 
Integer days = 56; // Integer | Number of days of weather forecast. Value ranges from 1 to 14
LocalDate dt = new LocalDate(); // LocalDate | Date should be between today and next 14 day in yyyy-MM-dd format. e.g. '2015-01-01' 
Integer unixdt = 56; // Integer | Please either pass 'dt' or 'unixdt' and not both in same request. unixdt should be between today and next 14 day in Unix format. e.g. 1490227200 
Integer hour = 56; // Integer | Must be in 24 hour. For example 5 pm should be hour=17, 6 am as hour=6 
String lang = "lang_example"; // String | Returns 'condition:text' field in API in the desired language.<br /> Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'. 
try {
    InlineResponse2001 result = apiInstance.forecastWeather(q, days, dt, unixdt, hour, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApIsApi#forecastWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.  |
 **days** | **Integer**| Number of days of weather forecast. Value ranges from 1 to 14 | [enum: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
 **dt** | **LocalDate**| Date should be between today and next 14 day in yyyy-MM-dd format. e.g. &#x27;2015-01-01&#x27;  | [optional]
 **unixdt** | **Integer**| Please either pass &#x27;dt&#x27; or &#x27;unixdt&#x27; and not both in same request. unixdt should be between today and next 14 day in Unix format. e.g. 1490227200  | [optional]
 **hour** | **Integer**| Must be in 24 hour. For example 5 pm should be hour&#x3D;17, 6 am as hour&#x3D;6  | [optional]
 **lang** | **String**| Returns &#x27;condition:text&#x27; field in API in the desired language.&lt;br /&gt; Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check &#x27;lang-code&#x27;.  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="futureWeather"></a>
# **futureWeather**
> InlineResponse2002 futureWeather(q, dt, lang)

Future API

Future weather API method returns weather in a 3 hourly interval in future for a date between 14 days and 300 days from today in the future. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApIsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApIsApi apiInstance = new ApIsApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. 
LocalDate dt = new LocalDate(); // LocalDate | Date should be between 14 days and 300 days from today in the future in yyyy-MM-dd format (i.e. dt=2023-01-01) 
String lang = "lang_example"; // String | Returns 'condition:text' field in API in the desired language.<br /> Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'. 
try {
    InlineResponse2002 result = apiInstance.futureWeather(q, dt, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApIsApi#futureWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.  |
 **dt** | **LocalDate**| Date should be between 14 days and 300 days from today in the future in yyyy-MM-dd format (i.e. dt&#x3D;2023-01-01)  | [optional]
 **lang** | **String**| Returns &#x27;condition:text&#x27; field in API in the desired language.&lt;br /&gt; Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check &#x27;lang-code&#x27;.  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="historyWeather"></a>
# **historyWeather**
> InlineResponse2002 historyWeather(q, dt, unixdt, endDt, unixendDt, hour, lang)

History API

History weather API method returns historical weather for a date on or after 1st Jan, 2010 as json. The data is returned as a Forecast Object. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApIsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApIsApi apiInstance = new ApIsApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. 
LocalDate dt = new LocalDate(); // LocalDate | Date on or after 1st Jan, 2015 in yyyy-MM-dd format
Integer unixdt = 56; // Integer | Please either pass 'dt' or 'unixdt' and not both in same request.<br />unixdt should be on or after 1st Jan, 2015 in Unix format 
LocalDate endDt = new LocalDate(); // LocalDate | Date on or after 1st Jan, 2015 in yyyy-MM-dd format<br />'end_dt' should be greater than 'dt' parameter and difference should not be more than 30 days between the two dates. 
Integer unixendDt = 56; // Integer | Date on or after 1st Jan, 2015 in Unix Timestamp format<br />unixend_dt has same restriction as 'end_dt' parameter. Please either pass 'end_dt' or 'unixend_dt' and not both in same request. e.g. unixend_dt=1490227200 
Integer hour = 56; // Integer | Must be in 24 hour. For example 5 pm should be hour=17, 6 am as hour=6 
String lang = "lang_example"; // String | Returns 'condition:text' field in API in the desired language.<br /> Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'. 
try {
    InlineResponse2002 result = apiInstance.historyWeather(q, dt, unixdt, endDt, unixendDt, hour, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApIsApi#historyWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.  |
 **dt** | **LocalDate**| Date on or after 1st Jan, 2015 in yyyy-MM-dd format |
 **unixdt** | **Integer**| Please either pass &#x27;dt&#x27; or &#x27;unixdt&#x27; and not both in same request.&lt;br /&gt;unixdt should be on or after 1st Jan, 2015 in Unix format  | [optional]
 **endDt** | **LocalDate**| Date on or after 1st Jan, 2015 in yyyy-MM-dd format&lt;br /&gt;&#x27;end_dt&#x27; should be greater than &#x27;dt&#x27; parameter and difference should not be more than 30 days between the two dates.  | [optional]
 **unixendDt** | **Integer**| Date on or after 1st Jan, 2015 in Unix Timestamp format&lt;br /&gt;unixend_dt has same restriction as &#x27;end_dt&#x27; parameter. Please either pass &#x27;end_dt&#x27; or &#x27;unixend_dt&#x27; and not both in same request. e.g. unixend_dt&#x3D;1490227200  | [optional]
 **hour** | **Integer**| Must be in 24 hour. For example 5 pm should be hour&#x3D;17, 6 am as hour&#x3D;6  | [optional]
 **lang** | **String**| Returns &#x27;condition:text&#x27; field in API in the desired language.&lt;br /&gt; Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check &#x27;lang-code&#x27;.  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="ipLookup"></a>
# **ipLookup**
> Ip ipLookup(q)

IP Lookup API

IP Lookup API method allows a user to get up to date information for an IP address. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApIsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApIsApi apiInstance = new ApIsApi();
String q = "q_example"; // String | Pass IP address.
try {
    Ip result = apiInstance.ipLookup(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApIsApi#ipLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass IP address. |

### Return type

[**Ip**](Ip.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="realtimeWeather"></a>
# **realtimeWeather**
> InlineResponse200 realtimeWeather(q, lang)

Realtime API

Current weather or realtime weather API method allows a user to get up to date current weather information in json and xml. The data is returned as a Current Object.&lt;br /&gt;&lt;br /&gt;Current object contains current or realtime weather information for a given city. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApIsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApIsApi apiInstance = new ApIsApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. 
String lang = "lang_example"; // String | Returns 'condition:text' field in API in the desired language.<br /> Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'. 
try {
    InlineResponse200 result = apiInstance.realtimeWeather(q, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApIsApi#realtimeWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.  |
 **lang** | **String**| Returns &#x27;condition:text&#x27; field in API in the desired language.&lt;br /&gt; Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check &#x27;lang-code&#x27;.  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="searchAutocompleteWeather"></a>
# **searchAutocompleteWeather**
> ArrayOfSearch searchAutocompleteWeather(q)

Search/Autocomplete API

WeatherAPI.com Search or Autocomplete API returns matching cities and towns as an array of Location object. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApIsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApIsApi apiInstance = new ApIsApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. 
try {
    ArrayOfSearch result = apiInstance.searchAutocompleteWeather(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApIsApi#searchAutocompleteWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.  |

### Return type

[**ArrayOfSearch**](ArrayOfSearch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="timeZone"></a>
# **timeZone**
> Location timeZone(q)

Time Zone API

Return Location Object

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApIsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApIsApi apiInstance = new ApIsApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. 
try {
    Location result = apiInstance.timeZone(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApIsApi#timeZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.  |

### Return type

[**Location**](Location.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

