/*
 * Weather API
 *  # Introduction  WeatherAPI.com provides access to weather and geo data via a JSON/XML restful API. It allows developers to create desktop, web and mobile applications using this data very easy.      We provide following data through our API:      - Real-time weather  - 14 day weather forecast  - Astronomy  - Time zone  - Location data  - Search or Autocomplete API  - NEW: Historical weather  - NEW: Future Weather (Upto 300 days ahead)  - Weather Alerts  - Air Quality Data    # Getting Started     You need to [signup](https://www.weatherapi.com/signup.aspx) and then you can find your API key under [your account](https://www.weatherapi.com/login.aspx), and start using API right away!      We have [code libraries](https://www.weatherapi.com/docs/code-libraries.aspx) for different programming languages like PHP, .net, JAVA, etc.  If you find any features missing or have any suggestions, please [contact us](https://www.weatherapi.com/contact.aspx).      # Authentication     API access to the data is protected by an API key. If at anytime, you find the API key has become vulnerable, please regenerate the key using Regenerate button next to the API key.  Authentication to the WeatherAPI.com API is provided by passing your API key as request parameter through an API .        ##  key parameter   key=YOUR_API_KEY 
 *
 * OpenAPI spec version: 1.0.0-oas3
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ForecastCondition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-22T21:39:34.951Z[GMT]")
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
  @Schema(example = "Clear", description = "")
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
  @Schema(example = "//cdn.weatherapi.com/weather/64x64/night/113.png", description = "")
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
  @Schema(example = "1000", description = "")
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
