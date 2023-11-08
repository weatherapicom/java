# JAVA client for WeatherAPI.com

# Introduction 
WeatherAPI.com provides access to weather and geo data via a JSON/XML restful API. It allows developers to create desktop, web and mobile applications using this data very easy. 

We provide following data through our API:     
- Real-time weather
- 14 day weather forecast
- Historical Weather
- Marine Weather and Tide Data
- Future Weather (Upto 365 days ahead)
- Daily and hourly intervals
- 15 min interval (Enterprise only)
- Astronomy
- Time zone
- Location data
- Sports
- Search or Autocomplete API
- Weather Alerts
- Air Quality Data
- Bulk Request

# Getting Started    
You need to [signup](https://www.weatherapi.com/signup.aspx) and then you can find your API key under [your account](https://www.weatherapi.com/login.aspx), and start using API right away!  

Try our weather API by using interactive [API Explorer](https://www.weatherapi.com/api-explorer.aspx).  

We also have SDK for popular framework/languages available on [Github](https://github.com/weatherapicom/) for quick integrations.  

If you find any features missing or have any suggestions, please [contact us](https://www.weatherapi.com/contact.aspx).    

# Authentication    
API access to the data is protected by an API key. If at anytime, you find the API key has become vulnerable, please regenerate the key using Regenerate button next to the API key.    

Authentication to the WeatherAPI.com API is provided by passing your API key as request parameter through an API .      

##  key parameter  
key=YOUR API KEY

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApisApi;

import java.io.File;
import java.util.*;

public class ApisApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.weatherapi.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApisApi* | [**astronomy**](docs/ApisApi.md#astronomy) | **GET** /astronomy.json | Astronomy API
*ApisApi* | [**forecastWeather**](docs/ApisApi.md#forecastWeather) | **GET** /forecast.json | Forecast API
*ApisApi* | [**futureWeather**](docs/ApisApi.md#futureWeather) | **GET** /future.json | Future API
*ApisApi* | [**historyWeather**](docs/ApisApi.md#historyWeather) | **GET** /history.json | History API
*ApisApi* | [**ipLookup**](docs/ApisApi.md#ipLookup) | **GET** /ip.json | IP Lookup API
*ApisApi* | [**marineWeather**](docs/ApisApi.md#marineWeather) | **GET** /marine.json | Marine Weather API
*ApisApi* | [**realtimeWeather**](docs/ApisApi.md#realtimeWeather) | **GET** /current.json | Realtime API
*ApisApi* | [**searchAutocompleteWeather**](docs/ApisApi.md#searchAutocompleteWeather) | **GET** /search.json | Search/Autocomplete API
*ApisApi* | [**timeZone**](docs/ApisApi.md#timeZone) | **GET** /timezone.json | Time Zone API


## Documentation for Models

 - [Alerts](docs/Alerts.md)
 - [AlertsAlert](docs/AlertsAlert.md)
 - [ArrayOfSearch](docs/ArrayOfSearch.md)
 - [Astronomy](docs/Astronomy.md)
 - [AstronomyAstro](docs/AstronomyAstro.md)
 - [Current](docs/Current.md)
 - [CurrentAirQuality](docs/CurrentAirQuality.md)
 - [CurrentCondition](docs/CurrentCondition.md)
 - [Error400](docs/Error400.md)
 - [Error401](docs/Error401.md)
 - [Error403](docs/Error403.md)
 - [Forecast](docs/Forecast.md)
 - [ForecastAstro](docs/ForecastAstro.md)
 - [ForecastCondition](docs/ForecastCondition.md)
 - [ForecastDay](docs/ForecastDay.md)
 - [ForecastDayCondition](docs/ForecastDayCondition.md)
 - [ForecastForecastday](docs/ForecastForecastday.md)
 - [ForecastHour](docs/ForecastHour.md)
 - [Ip](docs/Ip.md)
 - [Location](docs/Location.md)
 - [Marine](docs/Marine.md)
 - [MarineForecastday](docs/MarineForecastday.md)
 - [MarineHour](docs/MarineHour.md)
 - [Search](docs/Search.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



