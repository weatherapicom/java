# ApisApi

All URIs are relative to *https://api.weatherapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**astronomy**](ApisApi.md#astronomy) | **GET** /astronomy.json | Astronomy API
[**forecastWeather**](ApisApi.md#forecastWeather) | **GET** /forecast.json | Forecast API
[**futureWeather**](ApisApi.md#futureWeather) | **GET** /future.json | Future API
[**historyWeather**](ApisApi.md#historyWeather) | **GET** /history.json | History API
[**ipLookup**](ApisApi.md#ipLookup) | **GET** /ip.json | IP Lookup API
[**marineWeather**](ApisApi.md#marineWeather) | **GET** /marine.json | Marine Weather API
[**realtimeWeather**](ApisApi.md#realtimeWeather) | **GET** /current.json | Realtime API
[**searchAutocompleteWeather**](ApisApi.md#searchAutocompleteWeather) | **GET** /search.json | Search/Autocomplete API
[**timeZone**](ApisApi.md#timeZone) | **GET** /timezone.json | Time Zone API


<a name="astronomy"></a>
# **astronomy**
> Object astronomy(q, dt)

Astronomy API

Return Location and Astronomy Object

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApisApi apiInstance = new ApisApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.
LocalDate dt = LocalDate.now(); // LocalDate | Date on or after 1st Jan, 2015 in yyyy-MM-dd format
try {
    Object result = apiInstance.astronomy(q, dt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApisApi#astronomy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
 **dt** | **LocalDate**| Date on or after 1st Jan, 2015 in yyyy-MM-dd format |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="forecastWeather"></a>
# **forecastWeather**
> Object forecastWeather(q, days, dt, unixdt, hour, lang, alerts, aqi, tp)

Forecast API

Forecast weather API method returns, depending upon your price plan level, upto next 14 day weather forecast and weather alert as json or xml. The data is returned as a Forecast Object.&lt;br /&gt;&lt;br /&gt;Forecast object contains astronomy data, day weather forecast and hourly interval weather information for a given city.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApisApi apiInstance = new ApisApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.
Integer days = 56; // Integer | Number of days of weather forecast. Value ranges from 1 to 14
LocalDate dt = LocalDate.now(); // LocalDate | Date should be between today and next 14 day in yyyy-MM-dd format. e.g. '2015-01-01'
Integer unixdt = 56; // Integer | Please either pass 'dt' or 'unixdt' and not both in same request. unixdt should be between today and next 14 day in Unix format. e.g. 1490227200
Integer hour = 56; // Integer | Must be in 24 hour. For example 5 pm should be hour=17, 6 am as hour=6
String lang = "lang_example"; // String | Returns 'condition:text' field in API in the desired language.<br /> Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'.
String alerts = "alerts_example"; // String | Enable/Disable alerts in forecast API output. Example, alerts=yes or alerts=no.
String aqi = "aqi_example"; // String | Enable/Disable Air Quality data in forecast API output. Example, aqi=yes or aqi=no.
Integer tp = 56; // Integer | Get 15 min interval or 24 hour average data for Forecast and History API. Available for Enterprise clients only. E.g:- tp=15
try {
    Object result = apiInstance.forecastWeather(q, days, dt, unixdt, hour, lang, alerts, aqi, tp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApisApi#forecastWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
 **days** | **Integer**| Number of days of weather forecast. Value ranges from 1 to 14 |
 **dt** | **LocalDate**| Date should be between today and next 14 day in yyyy-MM-dd format. e.g. &#39;2015-01-01&#39; | [optional]
 **unixdt** | **Integer**| Please either pass &#39;dt&#39; or &#39;unixdt&#39; and not both in same request. unixdt should be between today and next 14 day in Unix format. e.g. 1490227200 | [optional]
 **hour** | **Integer**| Must be in 24 hour. For example 5 pm should be hour&#x3D;17, 6 am as hour&#x3D;6 | [optional]
 **lang** | **String**| Returns &#39;condition:text&#39; field in API in the desired language.&lt;br /&gt; Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check &#39;lang-code&#39;. | [optional]
 **alerts** | **String**| Enable/Disable alerts in forecast API output. Example, alerts&#x3D;yes or alerts&#x3D;no. | [optional]
 **aqi** | **String**| Enable/Disable Air Quality data in forecast API output. Example, aqi&#x3D;yes or aqi&#x3D;no. | [optional]
 **tp** | **Integer**| Get 15 min interval or 24 hour average data for Forecast and History API. Available for Enterprise clients only. E.g:- tp&#x3D;15 | [optional]

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="futureWeather"></a>
# **futureWeather**
> Object futureWeather(q, dt, lang)

Future API

Future weather API method returns weather in a 3 hourly interval in future for a date between 14 days and 365 days from today in the future.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApisApi apiInstance = new ApisApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.
LocalDate dt = LocalDate.now(); // LocalDate | Date should be between 14 days and 300 days from today in the future in yyyy-MM-dd format (i.e. dt=2023-01-01)
String lang = "lang_example"; // String | Returns 'condition:text' field in API in the desired language.<br /> Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'.
try {
    Object result = apiInstance.futureWeather(q, dt, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApisApi#futureWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
 **dt** | **LocalDate**| Date should be between 14 days and 300 days from today in the future in yyyy-MM-dd format (i.e. dt&#x3D;2023-01-01) | [optional]
 **lang** | **String**| Returns &#39;condition:text&#39; field in API in the desired language.&lt;br /&gt; Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check &#39;lang-code&#39;. | [optional]

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="historyWeather"></a>
# **historyWeather**
> Object historyWeather(q, dt, unixdt, endDt, unixendDt, hour, lang)

History API

History weather API method returns historical weather for a date on or after 1st Jan, 2010 as json. The data is returned as a Forecast Object.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApisApi apiInstance = new ApisApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.
LocalDate dt = LocalDate.now(); // LocalDate | Date on or after 1st Jan, 2015 in yyyy-MM-dd format
Integer unixdt = 56; // Integer | Please either pass 'dt' or 'unixdt' and not both in same request.<br />unixdt should be on or after 1st Jan, 2015 in Unix format
LocalDate endDt = LocalDate.now(); // LocalDate | Date on or after 1st Jan, 2015 in yyyy-MM-dd format<br />'end_dt' should be greater than 'dt' parameter and difference should not be more than 30 days between the two dates.
Integer unixendDt = 56; // Integer | Date on or after 1st Jan, 2015 in Unix Timestamp format<br />unixend_dt has same restriction as 'end_dt' parameter. Please either pass 'end_dt' or 'unixend_dt' and not both in same request. e.g. unixend_dt=1490227200
Integer hour = 56; // Integer | Must be in 24 hour. For example 5 pm should be hour=17, 6 am as hour=6
String lang = "lang_example"; // String | Returns 'condition:text' field in API in the desired language.<br /> Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'.
try {
    Object result = apiInstance.historyWeather(q, dt, unixdt, endDt, unixendDt, hour, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApisApi#historyWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
 **dt** | **LocalDate**| Date on or after 1st Jan, 2015 in yyyy-MM-dd format |
 **unixdt** | **Integer**| Please either pass &#39;dt&#39; or &#39;unixdt&#39; and not both in same request.&lt;br /&gt;unixdt should be on or after 1st Jan, 2015 in Unix format | [optional]
 **endDt** | **LocalDate**| Date on or after 1st Jan, 2015 in yyyy-MM-dd format&lt;br /&gt;&#39;end_dt&#39; should be greater than &#39;dt&#39; parameter and difference should not be more than 30 days between the two dates. | [optional]
 **unixendDt** | **Integer**| Date on or after 1st Jan, 2015 in Unix Timestamp format&lt;br /&gt;unixend_dt has same restriction as &#39;end_dt&#39; parameter. Please either pass &#39;end_dt&#39; or &#39;unixend_dt&#39; and not both in same request. e.g. unixend_dt&#x3D;1490227200 | [optional]
 **hour** | **Integer**| Must be in 24 hour. For example 5 pm should be hour&#x3D;17, 6 am as hour&#x3D;6 | [optional]
 **lang** | **String**| Returns &#39;condition:text&#39; field in API in the desired language.&lt;br /&gt; Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check &#39;lang-code&#39;. | [optional]

### Return type

**Object**

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
//import io.swagger.client.api.ApisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApisApi apiInstance = new ApisApi();
String q = "q_example"; // String | Pass IP address.
try {
    Ip result = apiInstance.ipLookup(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApisApi#ipLookup");
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

<a name="marineWeather"></a>
# **marineWeather**
> Object marineWeather(q, days, dt, unixdt, hour, lang)

Marine Weather API

Marine weather API method returns upto next 7 day (depending upon your price plan level) marine and sailing weather forecast and tide data (depending upon your price plan level) as json or xml. The data is returned as a Marine Object.&lt;br /&gt;&lt;br /&gt;Marine object, depending upon your price plan level, contains astronomy data, day weather forecast and hourly interval weather information and tide data for a given sea/ocean point.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApisApi apiInstance = new ApisApi();
String q = "q_example"; // String | Pass Latitude/Longitude (decimal degree) which is on a sea/ocean. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.
Integer days = 56; // Integer | Number of days of weather forecast. Value ranges from 1 to 7
LocalDate dt = LocalDate.now(); // LocalDate | Date should be between today and next 7 day in yyyy-MM-dd format. e.g. '2023-05-20'
Integer unixdt = 56; // Integer | Please either pass 'dt' or 'unixdt' and not both in same request. unixdt should be between today and next 7 day in Unix format. e.g. 1490227200
Integer hour = 56; // Integer | Must be in 24 hour. For example 5 pm should be hour=17, 6 am as hour=6
String lang = "lang_example"; // String | Returns 'condition:text' field in API in the desired language.<br /> Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'.
try {
    Object result = apiInstance.marineWeather(q, days, dt, unixdt, hour, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApisApi#marineWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass Latitude/Longitude (decimal degree) which is on a sea/ocean. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
 **days** | **Integer**| Number of days of weather forecast. Value ranges from 1 to 7 |
 **dt** | **LocalDate**| Date should be between today and next 7 day in yyyy-MM-dd format. e.g. &#39;2023-05-20&#39; | [optional]
 **unixdt** | **Integer**| Please either pass &#39;dt&#39; or &#39;unixdt&#39; and not both in same request. unixdt should be between today and next 7 day in Unix format. e.g. 1490227200 | [optional]
 **hour** | **Integer**| Must be in 24 hour. For example 5 pm should be hour&#x3D;17, 6 am as hour&#x3D;6 | [optional]
 **lang** | **String**| Returns &#39;condition:text&#39; field in API in the desired language.&lt;br /&gt; Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check &#39;lang-code&#39;. | [optional]

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="realtimeWeather"></a>
# **realtimeWeather**
> Object realtimeWeather(q, lang)

Realtime API

Current weather or realtime weather API method allows a user to get up to date current weather information in json and xml. The data is returned as a Current Object.&lt;br /&gt;&lt;br /&gt;Current object contains current or realtime weather information for a given city.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApisApi apiInstance = new ApisApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.
String lang = "lang_example"; // String | Returns 'condition:text' field in API in the desired language.<br /> Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'.
try {
    Object result = apiInstance.realtimeWeather(q, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApisApi#realtimeWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
 **lang** | **String**| Returns &#39;condition:text&#39; field in API in the desired language.&lt;br /&gt; Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check &#39;lang-code&#39;. | [optional]

### Return type

**Object**

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
//import io.swagger.client.api.ApisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApisApi apiInstance = new ApisApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.
try {
    ArrayOfSearch result = apiInstance.searchAutocompleteWeather(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApisApi#searchAutocompleteWeather");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |

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
//import io.swagger.client.api.ApisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApisApi apiInstance = new ApisApi();
String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.
try {
    Location result = apiInstance.timeZone(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApisApi#timeZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |

### Return type

[**Location**](Location.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

