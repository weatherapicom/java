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
import java.math.BigDecimal;

/**
 * CurrentAirQuality
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-08T07:58:56.667Z")
public class CurrentAirQuality {
  @SerializedName("co")
  private BigDecimal co = null;

  @SerializedName("no2")
  private BigDecimal no2 = null;

  @SerializedName("o3")
  private BigDecimal o3 = null;

  @SerializedName("so2")
  private BigDecimal so2 = null;

  @SerializedName("pm2_5")
  private BigDecimal pm25 = null;

  @SerializedName("pm10")
  private BigDecimal pm10 = null;

  @SerializedName("us-epa-index")
  private Integer usEpaIndex = null;

  @SerializedName("gb-defra-index")
  private Integer gbDefraIndex = null;

  public CurrentAirQuality co(BigDecimal co) {
    this.co = co;
    return this;
  }

   /**
   * Get co
   * @return co
  **/
  @ApiModelProperty(example = "293.70001220703125", value = "")
  public BigDecimal getCo() {
    return co;
  }

  public void setCo(BigDecimal co) {
    this.co = co;
  }

  public CurrentAirQuality no2(BigDecimal no2) {
    this.no2 = no2;
    return this;
  }

   /**
   * Get no2
   * @return no2
  **/
  @ApiModelProperty(example = "18.5", value = "")
  public BigDecimal getNo2() {
    return no2;
  }

  public void setNo2(BigDecimal no2) {
    this.no2 = no2;
  }

  public CurrentAirQuality o3(BigDecimal o3) {
    this.o3 = o3;
    return this;
  }

   /**
   * Get o3
   * @return o3
  **/
  @ApiModelProperty(example = "234.60000610351562", value = "")
  public BigDecimal getO3() {
    return o3;
  }

  public void setO3(BigDecimal o3) {
    this.o3 = o3;
  }

  public CurrentAirQuality so2(BigDecimal so2) {
    this.so2 = so2;
    return this;
  }

   /**
   * Get so2
   * @return so2
  **/
  @ApiModelProperty(example = "12.0", value = "")
  public BigDecimal getSo2() {
    return so2;
  }

  public void setSo2(BigDecimal so2) {
    this.so2 = so2;
  }

  public CurrentAirQuality pm25(BigDecimal pm25) {
    this.pm25 = pm25;
    return this;
  }

   /**
   * Get pm25
   * @return pm25
  **/
  @ApiModelProperty(example = "13.600000381469727", value = "")
  public BigDecimal getPm25() {
    return pm25;
  }

  public void setPm25(BigDecimal pm25) {
    this.pm25 = pm25;
  }

  public CurrentAirQuality pm10(BigDecimal pm10) {
    this.pm10 = pm10;
    return this;
  }

   /**
   * Get pm10
   * @return pm10
  **/
  @ApiModelProperty(example = "15.0", value = "")
  public BigDecimal getPm10() {
    return pm10;
  }

  public void setPm10(BigDecimal pm10) {
    this.pm10 = pm10;
  }

  public CurrentAirQuality usEpaIndex(Integer usEpaIndex) {
    this.usEpaIndex = usEpaIndex;
    return this;
  }

   /**
   * Get usEpaIndex
   * @return usEpaIndex
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getUsEpaIndex() {
    return usEpaIndex;
  }

  public void setUsEpaIndex(Integer usEpaIndex) {
    this.usEpaIndex = usEpaIndex;
  }

  public CurrentAirQuality gbDefraIndex(Integer gbDefraIndex) {
    this.gbDefraIndex = gbDefraIndex;
    return this;
  }

   /**
   * Get gbDefraIndex
   * @return gbDefraIndex
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getGbDefraIndex() {
    return gbDefraIndex;
  }

  public void setGbDefraIndex(Integer gbDefraIndex) {
    this.gbDefraIndex = gbDefraIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentAirQuality currentAirQuality = (CurrentAirQuality) o;
    return Objects.equals(this.co, currentAirQuality.co) &&
        Objects.equals(this.no2, currentAirQuality.no2) &&
        Objects.equals(this.o3, currentAirQuality.o3) &&
        Objects.equals(this.so2, currentAirQuality.so2) &&
        Objects.equals(this.pm25, currentAirQuality.pm25) &&
        Objects.equals(this.pm10, currentAirQuality.pm10) &&
        Objects.equals(this.usEpaIndex, currentAirQuality.usEpaIndex) &&
        Objects.equals(this.gbDefraIndex, currentAirQuality.gbDefraIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(co, no2, o3, so2, pm25, pm10, usEpaIndex, gbDefraIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAirQuality {\n");
    
    sb.append("    co: ").append(toIndentedString(co)).append("\n");
    sb.append("    no2: ").append(toIndentedString(no2)).append("\n");
    sb.append("    o3: ").append(toIndentedString(o3)).append("\n");
    sb.append("    so2: ").append(toIndentedString(so2)).append("\n");
    sb.append("    pm25: ").append(toIndentedString(pm25)).append("\n");
    sb.append("    pm10: ").append(toIndentedString(pm10)).append("\n");
    sb.append("    usEpaIndex: ").append(toIndentedString(usEpaIndex)).append("\n");
    sb.append("    gbDefraIndex: ").append(toIndentedString(gbDefraIndex)).append("\n");
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

