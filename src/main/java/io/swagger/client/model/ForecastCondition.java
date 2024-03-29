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


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ForecastCondition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-08T07:58:56.667Z")
public class ForecastCondition {
  @SerializedName("text")
  private String text = null;

  @SerializedName("icon")
  private String icon = null;

  @SerializedName("code")
  private Integer code = null;

  public ForecastCondition text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(example = "Clear", value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ForecastCondition icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(example = "//cdn.weatherapi.com/weather/64x64/night/113.png", value = "")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public ForecastCondition code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "1000", value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastCondition forecastCondition = (ForecastCondition) o;
    return Objects.equals(this.text, forecastCondition.text) &&
        Objects.equals(this.icon, forecastCondition.icon) &&
        Objects.equals(this.code, forecastCondition.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, icon, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastCondition {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

