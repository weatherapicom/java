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
import io.swagger.client.model.ForecastDayCondition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * ForecastDay
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-22T21:39:34.951Z[GMT]")
public class ForecastDay {
  @SerializedName("maxtemp_c")
  private BigDecimal maxtempC = null;

  @SerializedName("maxtemp_f")
  private BigDecimal maxtempF = null;

  @SerializedName("mintemp_c")
  private BigDecimal mintempC = null;

  @SerializedName("mintemp_f")
  private BigDecimal mintempF = null;

  @SerializedName("avgtemp_c")
  private BigDecimal avgtempC = null;

  @SerializedName("avgtemp_f")
  private BigDecimal avgtempF = null;

  @SerializedName("maxwind_mph")
  private BigDecimal maxwindMph = null;

  @SerializedName("maxwind_kph")
  private BigDecimal maxwindKph = null;

  @SerializedName("totalprecip_mm")
  private Integer totalprecipMm = null;

  @SerializedName("totalprecip_in")
  private Integer totalprecipIn = null;

  @SerializedName("avgvis_km")
  private Integer avgvisKm = null;

  @SerializedName("avgvis_miles")
  private Integer avgvisMiles = null;

  @SerializedName("avghumidity")
  private Integer avghumidity = null;

  @SerializedName("daily_will_it_rain")
  private Integer dailyWillItRain = null;

  @SerializedName("daily_chance_of_rain")
  private Integer dailyChanceOfRain = null;

  @SerializedName("daily_will_it_snow")
  private Integer dailyWillItSnow = null;

  @SerializedName("daily_chance_of_snow")
  private Integer dailyChanceOfSnow = null;

  @SerializedName("condition")
  private ForecastDayCondition condition = null;

  @SerializedName("uv")
  private Integer uv = null;

  public ForecastDay maxtempC(BigDecimal maxtempC) {
    this.maxtempC = maxtempC;
    return this;
  }

   /**
   * Get maxtempC
   * @return maxtempC
  **/
  @Schema(example = "35.9", description = "")
  public BigDecimal getMaxtempC() {
    return maxtempC;
  }

  public void setMaxtempC(BigDecimal maxtempC) {
    this.maxtempC = maxtempC;
  }

  public ForecastDay maxtempF(BigDecimal maxtempF) {
    this.maxtempF = maxtempF;
    return this;
  }

   /**
   * Get maxtempF
   * @return maxtempF
  **/
  @Schema(example = "96.6", description = "")
  public BigDecimal getMaxtempF() {
    return maxtempF;
  }

  public void setMaxtempF(BigDecimal maxtempF) {
    this.maxtempF = maxtempF;
  }

  public ForecastDay mintempC(BigDecimal mintempC) {
    this.mintempC = mintempC;
    return this;
  }

   /**
   * Get mintempC
   * @return mintempC
  **/
  @Schema(example = "26.3", description = "")
  public BigDecimal getMintempC() {
    return mintempC;
  }

  public void setMintempC(BigDecimal mintempC) {
    this.mintempC = mintempC;
  }

  public ForecastDay mintempF(BigDecimal mintempF) {
    this.mintempF = mintempF;
    return this;
  }

   /**
   * Get mintempF
   * @return mintempF
  **/
  @Schema(example = "79.3", description = "")
  public BigDecimal getMintempF() {
    return mintempF;
  }

  public void setMintempF(BigDecimal mintempF) {
    this.mintempF = mintempF;
  }

  public ForecastDay avgtempC(BigDecimal avgtempC) {
    this.avgtempC = avgtempC;
    return this;
  }

   /**
   * Get avgtempC
   * @return avgtempC
  **/
  @Schema(example = "30.7", description = "")
  public BigDecimal getAvgtempC() {
    return avgtempC;
  }

  public void setAvgtempC(BigDecimal avgtempC) {
    this.avgtempC = avgtempC;
  }

  public ForecastDay avgtempF(BigDecimal avgtempF) {
    this.avgtempF = avgtempF;
    return this;
  }

   /**
   * Get avgtempF
   * @return avgtempF
  **/
  @Schema(example = "87.3", description = "")
  public BigDecimal getAvgtempF() {
    return avgtempF;
  }

  public void setAvgtempF(BigDecimal avgtempF) {
    this.avgtempF = avgtempF;
  }

  public ForecastDay maxwindMph(BigDecimal maxwindMph) {
    this.maxwindMph = maxwindMph;
    return this;
  }

   /**
   * Get maxwindMph
   * @return maxwindMph
  **/
  @Schema(example = "12.8", description = "")
  public BigDecimal getMaxwindMph() {
    return maxwindMph;
  }

  public void setMaxwindMph(BigDecimal maxwindMph) {
    this.maxwindMph = maxwindMph;
  }

  public ForecastDay maxwindKph(BigDecimal maxwindKph) {
    this.maxwindKph = maxwindKph;
    return this;
  }

   /**
   * Get maxwindKph
   * @return maxwindKph
  **/
  @Schema(example = "20.5", description = "")
  public BigDecimal getMaxwindKph() {
    return maxwindKph;
  }

  public void setMaxwindKph(BigDecimal maxwindKph) {
    this.maxwindKph = maxwindKph;
  }

  public ForecastDay totalprecipMm(Integer totalprecipMm) {
    this.totalprecipMm = totalprecipMm;
    return this;
  }

   /**
   * Get totalprecipMm
   * @return totalprecipMm
  **/
  @Schema(example = "0", description = "")
  public Integer getTotalprecipMm() {
    return totalprecipMm;
  }

  public void setTotalprecipMm(Integer totalprecipMm) {
    this.totalprecipMm = totalprecipMm;
  }

  public ForecastDay totalprecipIn(Integer totalprecipIn) {
    this.totalprecipIn = totalprecipIn;
    return this;
  }

   /**
   * Get totalprecipIn
   * @return totalprecipIn
  **/
  @Schema(example = "0", description = "")
  public Integer getTotalprecipIn() {
    return totalprecipIn;
  }

  public void setTotalprecipIn(Integer totalprecipIn) {
    this.totalprecipIn = totalprecipIn;
  }

  public ForecastDay avgvisKm(Integer avgvisKm) {
    this.avgvisKm = avgvisKm;
    return this;
  }

   /**
   * Get avgvisKm
   * @return avgvisKm
  **/
  @Schema(example = "10", description = "")
  public Integer getAvgvisKm() {
    return avgvisKm;
  }

  public void setAvgvisKm(Integer avgvisKm) {
    this.avgvisKm = avgvisKm;
  }

  public ForecastDay avgvisMiles(Integer avgvisMiles) {
    this.avgvisMiles = avgvisMiles;
    return this;
  }

   /**
   * Get avgvisMiles
   * @return avgvisMiles
  **/
  @Schema(example = "6", description = "")
  public Integer getAvgvisMiles() {
    return avgvisMiles;
  }

  public void setAvgvisMiles(Integer avgvisMiles) {
    this.avgvisMiles = avgvisMiles;
  }

  public ForecastDay avghumidity(Integer avghumidity) {
    this.avghumidity = avghumidity;
    return this;
  }

   /**
   * Get avghumidity
   * @return avghumidity
  **/
  @Schema(example = "53", description = "")
  public Integer getAvghumidity() {
    return avghumidity;
  }

  public void setAvghumidity(Integer avghumidity) {
    this.avghumidity = avghumidity;
  }

  public ForecastDay dailyWillItRain(Integer dailyWillItRain) {
    this.dailyWillItRain = dailyWillItRain;
    return this;
  }

   /**
   * Get dailyWillItRain
   * @return dailyWillItRain
  **/
  @Schema(example = "0", description = "")
  public Integer getDailyWillItRain() {
    return dailyWillItRain;
  }

  public void setDailyWillItRain(Integer dailyWillItRain) {
    this.dailyWillItRain = dailyWillItRain;
  }

  public ForecastDay dailyChanceOfRain(Integer dailyChanceOfRain) {
    this.dailyChanceOfRain = dailyChanceOfRain;
    return this;
  }

   /**
   * Get dailyChanceOfRain
   * @return dailyChanceOfRain
  **/
  @Schema(example = "0", description = "")
  public Integer getDailyChanceOfRain() {
    return dailyChanceOfRain;
  }

  public void setDailyChanceOfRain(Integer dailyChanceOfRain) {
    this.dailyChanceOfRain = dailyChanceOfRain;
  }

  public ForecastDay dailyWillItSnow(Integer dailyWillItSnow) {
    this.dailyWillItSnow = dailyWillItSnow;
    return this;
  }

   /**
   * Get dailyWillItSnow
   * @return dailyWillItSnow
  **/
  @Schema(example = "0", description = "")
  public Integer getDailyWillItSnow() {
    return dailyWillItSnow;
  }

  public void setDailyWillItSnow(Integer dailyWillItSnow) {
    this.dailyWillItSnow = dailyWillItSnow;
  }

  public ForecastDay dailyChanceOfSnow(Integer dailyChanceOfSnow) {
    this.dailyChanceOfSnow = dailyChanceOfSnow;
    return this;
  }

   /**
   * Get dailyChanceOfSnow
   * @return dailyChanceOfSnow
  **/
  @Schema(example = "0", description = "")
  public Integer getDailyChanceOfSnow() {
    return dailyChanceOfSnow;
  }

  public void setDailyChanceOfSnow(Integer dailyChanceOfSnow) {
    this.dailyChanceOfSnow = dailyChanceOfSnow;
  }

  public ForecastDay condition(ForecastDayCondition condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Schema(description = "")
  public ForecastDayCondition getCondition() {
    return condition;
  }

  public void setCondition(ForecastDayCondition condition) {
    this.condition = condition;
  }

  public ForecastDay uv(Integer uv) {
    this.uv = uv;
    return this;
  }

   /**
   * Get uv
   * @return uv
  **/
  @Schema(example = "8", description = "")
  public Integer getUv() {
    return uv;
  }

  public void setUv(Integer uv) {
    this.uv = uv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastDay forecastDay = (ForecastDay) o;
    return Objects.equals(this.maxtempC, forecastDay.maxtempC) &&
        Objects.equals(this.maxtempF, forecastDay.maxtempF) &&
        Objects.equals(this.mintempC, forecastDay.mintempC) &&
        Objects.equals(this.mintempF, forecastDay.mintempF) &&
        Objects.equals(this.avgtempC, forecastDay.avgtempC) &&
        Objects.equals(this.avgtempF, forecastDay.avgtempF) &&
        Objects.equals(this.maxwindMph, forecastDay.maxwindMph) &&
        Objects.equals(this.maxwindKph, forecastDay.maxwindKph) &&
        Objects.equals(this.totalprecipMm, forecastDay.totalprecipMm) &&
        Objects.equals(this.totalprecipIn, forecastDay.totalprecipIn) &&
        Objects.equals(this.avgvisKm, forecastDay.avgvisKm) &&
        Objects.equals(this.avgvisMiles, forecastDay.avgvisMiles) &&
        Objects.equals(this.avghumidity, forecastDay.avghumidity) &&
        Objects.equals(this.dailyWillItRain, forecastDay.dailyWillItRain) &&
        Objects.equals(this.dailyChanceOfRain, forecastDay.dailyChanceOfRain) &&
        Objects.equals(this.dailyWillItSnow, forecastDay.dailyWillItSnow) &&
        Objects.equals(this.dailyChanceOfSnow, forecastDay.dailyChanceOfSnow) &&
        Objects.equals(this.condition, forecastDay.condition) &&
        Objects.equals(this.uv, forecastDay.uv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxtempC, maxtempF, mintempC, mintempF, avgtempC, avgtempF, maxwindMph, maxwindKph, totalprecipMm, totalprecipIn, avgvisKm, avgvisMiles, avghumidity, dailyWillItRain, dailyChanceOfRain, dailyWillItSnow, dailyChanceOfSnow, condition, uv);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastDay {\n");
    
    sb.append("    maxtempC: ").append(toIndentedString(maxtempC)).append("\n");
    sb.append("    maxtempF: ").append(toIndentedString(maxtempF)).append("\n");
    sb.append("    mintempC: ").append(toIndentedString(mintempC)).append("\n");
    sb.append("    mintempF: ").append(toIndentedString(mintempF)).append("\n");
    sb.append("    avgtempC: ").append(toIndentedString(avgtempC)).append("\n");
    sb.append("    avgtempF: ").append(toIndentedString(avgtempF)).append("\n");
    sb.append("    maxwindMph: ").append(toIndentedString(maxwindMph)).append("\n");
    sb.append("    maxwindKph: ").append(toIndentedString(maxwindKph)).append("\n");
    sb.append("    totalprecipMm: ").append(toIndentedString(totalprecipMm)).append("\n");
    sb.append("    totalprecipIn: ").append(toIndentedString(totalprecipIn)).append("\n");
    sb.append("    avgvisKm: ").append(toIndentedString(avgvisKm)).append("\n");
    sb.append("    avgvisMiles: ").append(toIndentedString(avgvisMiles)).append("\n");
    sb.append("    avghumidity: ").append(toIndentedString(avghumidity)).append("\n");
    sb.append("    dailyWillItRain: ").append(toIndentedString(dailyWillItRain)).append("\n");
    sb.append("    dailyChanceOfRain: ").append(toIndentedString(dailyChanceOfRain)).append("\n");
    sb.append("    dailyWillItSnow: ").append(toIndentedString(dailyWillItSnow)).append("\n");
    sb.append("    dailyChanceOfSnow: ").append(toIndentedString(dailyChanceOfSnow)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    uv: ").append(toIndentedString(uv)).append("\n");
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
