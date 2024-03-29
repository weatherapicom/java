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
import io.swagger.client.model.ForecastCondition;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * MarineHour
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-08T07:58:56.667Z")
public class MarineHour {
  @SerializedName("time_epoch")
  private Integer timeEpoch = null;

  @SerializedName("time")
  private String time = null;

  @SerializedName("temp_c")
  private BigDecimal tempC = null;

  @SerializedName("temp_f")
  private BigDecimal tempF = null;

  @SerializedName("is_day")
  private Integer isDay = null;

  @SerializedName("condition")
  private ForecastCondition condition = null;

  @SerializedName("wind_mph")
  private BigDecimal windMph = null;

  @SerializedName("wind_kph")
  private BigDecimal windKph = null;

  @SerializedName("wind_degree")
  private BigDecimal windDegree = null;

  @SerializedName("wind_dir")
  private String windDir = null;

  @SerializedName("pressure_mb")
  private BigDecimal pressureMb = null;

  @SerializedName("pressure_in")
  private BigDecimal pressureIn = null;

  @SerializedName("precip_mm")
  private BigDecimal precipMm = null;

  @SerializedName("precip_in")
  private BigDecimal precipIn = null;

  @SerializedName("humidity")
  private BigDecimal humidity = null;

  @SerializedName("cloud")
  private BigDecimal cloud = null;

  @SerializedName("feelslike_c")
  private BigDecimal feelslikeC = null;

  @SerializedName("feelslike_f")
  private BigDecimal feelslikeF = null;

  @SerializedName("windchill_c")
  private BigDecimal windchillC = null;

  @SerializedName("windchill_f")
  private BigDecimal windchillF = null;

  @SerializedName("heatindex_c")
  private BigDecimal heatindexC = null;

  @SerializedName("heatindex_f")
  private BigDecimal heatindexF = null;

  @SerializedName("dewpoint_c")
  private BigDecimal dewpointC = null;

  @SerializedName("dewpoint_f")
  private BigDecimal dewpointF = null;

  @SerializedName("will_it_rain")
  private Integer willItRain = null;

  @SerializedName("chance_of_rain")
  private BigDecimal chanceOfRain = null;

  @SerializedName("will_it_snow")
  private Integer willItSnow = null;

  @SerializedName("chance_of_snow")
  private BigDecimal chanceOfSnow = null;

  @SerializedName("vis_km")
  private BigDecimal visKm = null;

  @SerializedName("vis_miles")
  private BigDecimal visMiles = null;

  @SerializedName("gust_mph")
  private BigDecimal gustMph = null;

  @SerializedName("gust_kph")
  private BigDecimal gustKph = null;

  @SerializedName("sig_ht_mt")
  private BigDecimal sigHtMt = null;

  @SerializedName("swell_ht_mt")
  private BigDecimal swellHtMt = null;

  @SerializedName("swell_ht_ft")
  private BigDecimal swellHtFt = null;

  @SerializedName("swell_dir")
  private BigDecimal swellDir = null;

  @SerializedName("swell_dir_16_point")
  private BigDecimal swellDir16Point = null;

  @SerializedName("swell_period_secs")
  private BigDecimal swellPeriodSecs = null;

  @SerializedName("uv")
  private Integer uv = null;

  public MarineHour timeEpoch(Integer timeEpoch) {
    this.timeEpoch = timeEpoch;
    return this;
  }

   /**
   * Get timeEpoch
   * @return timeEpoch
  **/
  @ApiModelProperty(example = "1658462400", value = "")
  public Integer getTimeEpoch() {
    return timeEpoch;
  }

  public void setTimeEpoch(Integer timeEpoch) {
    this.timeEpoch = timeEpoch;
  }

  public MarineHour time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "2022-07-22 00:00", value = "")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public MarineHour tempC(BigDecimal tempC) {
    this.tempC = tempC;
    return this;
  }

   /**
   * Get tempC
   * @return tempC
  **/
  @ApiModelProperty(example = "28.7", value = "")
  public BigDecimal getTempC() {
    return tempC;
  }

  public void setTempC(BigDecimal tempC) {
    this.tempC = tempC;
  }

  public MarineHour tempF(BigDecimal tempF) {
    this.tempF = tempF;
    return this;
  }

   /**
   * Get tempF
   * @return tempF
  **/
  @ApiModelProperty(example = "83.7", value = "")
  public BigDecimal getTempF() {
    return tempF;
  }

  public void setTempF(BigDecimal tempF) {
    this.tempF = tempF;
  }

  public MarineHour isDay(Integer isDay) {
    this.isDay = isDay;
    return this;
  }

   /**
   * Get isDay
   * @return isDay
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getIsDay() {
    return isDay;
  }

  public void setIsDay(Integer isDay) {
    this.isDay = isDay;
  }

  public MarineHour condition(ForecastCondition condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @ApiModelProperty(value = "")
  public ForecastCondition getCondition() {
    return condition;
  }

  public void setCondition(ForecastCondition condition) {
    this.condition = condition;
  }

  public MarineHour windMph(BigDecimal windMph) {
    this.windMph = windMph;
    return this;
  }

   /**
   * Get windMph
   * @return windMph
  **/
  @ApiModelProperty(example = "9.4", value = "")
  public BigDecimal getWindMph() {
    return windMph;
  }

  public void setWindMph(BigDecimal windMph) {
    this.windMph = windMph;
  }

  public MarineHour windKph(BigDecimal windKph) {
    this.windKph = windKph;
    return this;
  }

   /**
   * Get windKph
   * @return windKph
  **/
  @ApiModelProperty(example = "15.1", value = "")
  public BigDecimal getWindKph() {
    return windKph;
  }

  public void setWindKph(BigDecimal windKph) {
    this.windKph = windKph;
  }

  public MarineHour windDegree(BigDecimal windDegree) {
    this.windDegree = windDegree;
    return this;
  }

   /**
   * Get windDegree
   * @return windDegree
  **/
  @ApiModelProperty(example = "265.0", value = "")
  public BigDecimal getWindDegree() {
    return windDegree;
  }

  public void setWindDegree(BigDecimal windDegree) {
    this.windDegree = windDegree;
  }

  public MarineHour windDir(String windDir) {
    this.windDir = windDir;
    return this;
  }

   /**
   * Get windDir
   * @return windDir
  **/
  @ApiModelProperty(example = "W", value = "")
  public String getWindDir() {
    return windDir;
  }

  public void setWindDir(String windDir) {
    this.windDir = windDir;
  }

  public MarineHour pressureMb(BigDecimal pressureMb) {
    this.pressureMb = pressureMb;
    return this;
  }

   /**
   * Get pressureMb
   * @return pressureMb
  **/
  @ApiModelProperty(example = "1007.0", value = "")
  public BigDecimal getPressureMb() {
    return pressureMb;
  }

  public void setPressureMb(BigDecimal pressureMb) {
    this.pressureMb = pressureMb;
  }

  public MarineHour pressureIn(BigDecimal pressureIn) {
    this.pressureIn = pressureIn;
    return this;
  }

   /**
   * Get pressureIn
   * @return pressureIn
  **/
  @ApiModelProperty(example = "29.73", value = "")
  public BigDecimal getPressureIn() {
    return pressureIn;
  }

  public void setPressureIn(BigDecimal pressureIn) {
    this.pressureIn = pressureIn;
  }

  public MarineHour precipMm(BigDecimal precipMm) {
    this.precipMm = precipMm;
    return this;
  }

   /**
   * Get precipMm
   * @return precipMm
  **/
  @ApiModelProperty(example = "0.0", value = "")
  public BigDecimal getPrecipMm() {
    return precipMm;
  }

  public void setPrecipMm(BigDecimal precipMm) {
    this.precipMm = precipMm;
  }

  public MarineHour precipIn(BigDecimal precipIn) {
    this.precipIn = precipIn;
    return this;
  }

   /**
   * Get precipIn
   * @return precipIn
  **/
  @ApiModelProperty(example = "0.0", value = "")
  public BigDecimal getPrecipIn() {
    return precipIn;
  }

  public void setPrecipIn(BigDecimal precipIn) {
    this.precipIn = precipIn;
  }

  public MarineHour humidity(BigDecimal humidity) {
    this.humidity = humidity;
    return this;
  }

   /**
   * Get humidity
   * @return humidity
  **/
  @ApiModelProperty(example = "58.0", value = "")
  public BigDecimal getHumidity() {
    return humidity;
  }

  public void setHumidity(BigDecimal humidity) {
    this.humidity = humidity;
  }

  public MarineHour cloud(BigDecimal cloud) {
    this.cloud = cloud;
    return this;
  }

   /**
   * Get cloud
   * @return cloud
  **/
  @ApiModelProperty(example = "19.0", value = "")
  public BigDecimal getCloud() {
    return cloud;
  }

  public void setCloud(BigDecimal cloud) {
    this.cloud = cloud;
  }

  public MarineHour feelslikeC(BigDecimal feelslikeC) {
    this.feelslikeC = feelslikeC;
    return this;
  }

   /**
   * Get feelslikeC
   * @return feelslikeC
  **/
  @ApiModelProperty(example = "30.5", value = "")
  public BigDecimal getFeelslikeC() {
    return feelslikeC;
  }

  public void setFeelslikeC(BigDecimal feelslikeC) {
    this.feelslikeC = feelslikeC;
  }

  public MarineHour feelslikeF(BigDecimal feelslikeF) {
    this.feelslikeF = feelslikeF;
    return this;
  }

   /**
   * Get feelslikeF
   * @return feelslikeF
  **/
  @ApiModelProperty(example = "86.9", value = "")
  public BigDecimal getFeelslikeF() {
    return feelslikeF;
  }

  public void setFeelslikeF(BigDecimal feelslikeF) {
    this.feelslikeF = feelslikeF;
  }

  public MarineHour windchillC(BigDecimal windchillC) {
    this.windchillC = windchillC;
    return this;
  }

   /**
   * Get windchillC
   * @return windchillC
  **/
  @ApiModelProperty(example = "28.7", value = "")
  public BigDecimal getWindchillC() {
    return windchillC;
  }

  public void setWindchillC(BigDecimal windchillC) {
    this.windchillC = windchillC;
  }

  public MarineHour windchillF(BigDecimal windchillF) {
    this.windchillF = windchillF;
    return this;
  }

   /**
   * Get windchillF
   * @return windchillF
  **/
  @ApiModelProperty(example = "83.7", value = "")
  public BigDecimal getWindchillF() {
    return windchillF;
  }

  public void setWindchillF(BigDecimal windchillF) {
    this.windchillF = windchillF;
  }

  public MarineHour heatindexC(BigDecimal heatindexC) {
    this.heatindexC = heatindexC;
    return this;
  }

   /**
   * Get heatindexC
   * @return heatindexC
  **/
  @ApiModelProperty(example = "30.5", value = "")
  public BigDecimal getHeatindexC() {
    return heatindexC;
  }

  public void setHeatindexC(BigDecimal heatindexC) {
    this.heatindexC = heatindexC;
  }

  public MarineHour heatindexF(BigDecimal heatindexF) {
    this.heatindexF = heatindexF;
    return this;
  }

   /**
   * Get heatindexF
   * @return heatindexF
  **/
  @ApiModelProperty(example = "86.9", value = "")
  public BigDecimal getHeatindexF() {
    return heatindexF;
  }

  public void setHeatindexF(BigDecimal heatindexF) {
    this.heatindexF = heatindexF;
  }

  public MarineHour dewpointC(BigDecimal dewpointC) {
    this.dewpointC = dewpointC;
    return this;
  }

   /**
   * Get dewpointC
   * @return dewpointC
  **/
  @ApiModelProperty(example = "19.6", value = "")
  public BigDecimal getDewpointC() {
    return dewpointC;
  }

  public void setDewpointC(BigDecimal dewpointC) {
    this.dewpointC = dewpointC;
  }

  public MarineHour dewpointF(BigDecimal dewpointF) {
    this.dewpointF = dewpointF;
    return this;
  }

   /**
   * Get dewpointF
   * @return dewpointF
  **/
  @ApiModelProperty(example = "67.3", value = "")
  public BigDecimal getDewpointF() {
    return dewpointF;
  }

  public void setDewpointF(BigDecimal dewpointF) {
    this.dewpointF = dewpointF;
  }

  public MarineHour willItRain(Integer willItRain) {
    this.willItRain = willItRain;
    return this;
  }

   /**
   * Get willItRain
   * @return willItRain
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getWillItRain() {
    return willItRain;
  }

  public void setWillItRain(Integer willItRain) {
    this.willItRain = willItRain;
  }

  public MarineHour chanceOfRain(BigDecimal chanceOfRain) {
    this.chanceOfRain = chanceOfRain;
    return this;
  }

   /**
   * Get chanceOfRain
   * @return chanceOfRain
  **/
  @ApiModelProperty(example = "0.0", value = "")
  public BigDecimal getChanceOfRain() {
    return chanceOfRain;
  }

  public void setChanceOfRain(BigDecimal chanceOfRain) {
    this.chanceOfRain = chanceOfRain;
  }

  public MarineHour willItSnow(Integer willItSnow) {
    this.willItSnow = willItSnow;
    return this;
  }

   /**
   * Get willItSnow
   * @return willItSnow
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getWillItSnow() {
    return willItSnow;
  }

  public void setWillItSnow(Integer willItSnow) {
    this.willItSnow = willItSnow;
  }

  public MarineHour chanceOfSnow(BigDecimal chanceOfSnow) {
    this.chanceOfSnow = chanceOfSnow;
    return this;
  }

   /**
   * Get chanceOfSnow
   * @return chanceOfSnow
  **/
  @ApiModelProperty(example = "0.0", value = "")
  public BigDecimal getChanceOfSnow() {
    return chanceOfSnow;
  }

  public void setChanceOfSnow(BigDecimal chanceOfSnow) {
    this.chanceOfSnow = chanceOfSnow;
  }

  public MarineHour visKm(BigDecimal visKm) {
    this.visKm = visKm;
    return this;
  }

   /**
   * Get visKm
   * @return visKm
  **/
  @ApiModelProperty(example = "10.0", value = "")
  public BigDecimal getVisKm() {
    return visKm;
  }

  public void setVisKm(BigDecimal visKm) {
    this.visKm = visKm;
  }

  public MarineHour visMiles(BigDecimal visMiles) {
    this.visMiles = visMiles;
    return this;
  }

   /**
   * Get visMiles
   * @return visMiles
  **/
  @ApiModelProperty(example = "6.0", value = "")
  public BigDecimal getVisMiles() {
    return visMiles;
  }

  public void setVisMiles(BigDecimal visMiles) {
    this.visMiles = visMiles;
  }

  public MarineHour gustMph(BigDecimal gustMph) {
    this.gustMph = gustMph;
    return this;
  }

   /**
   * Get gustMph
   * @return gustMph
  **/
  @ApiModelProperty(example = "15.0", value = "")
  public BigDecimal getGustMph() {
    return gustMph;
  }

  public void setGustMph(BigDecimal gustMph) {
    this.gustMph = gustMph;
  }

  public MarineHour gustKph(BigDecimal gustKph) {
    this.gustKph = gustKph;
    return this;
  }

   /**
   * Get gustKph
   * @return gustKph
  **/
  @ApiModelProperty(example = "24.1", value = "")
  public BigDecimal getGustKph() {
    return gustKph;
  }

  public void setGustKph(BigDecimal gustKph) {
    this.gustKph = gustKph;
  }

  public MarineHour sigHtMt(BigDecimal sigHtMt) {
    this.sigHtMt = sigHtMt;
    return this;
  }

   /**
   * Get sigHtMt
   * @return sigHtMt
  **/
  @ApiModelProperty(example = "24.1", value = "")
  public BigDecimal getSigHtMt() {
    return sigHtMt;
  }

  public void setSigHtMt(BigDecimal sigHtMt) {
    this.sigHtMt = sigHtMt;
  }

  public MarineHour swellHtMt(BigDecimal swellHtMt) {
    this.swellHtMt = swellHtMt;
    return this;
  }

   /**
   * Get swellHtMt
   * @return swellHtMt
  **/
  @ApiModelProperty(example = "24.1", value = "")
  public BigDecimal getSwellHtMt() {
    return swellHtMt;
  }

  public void setSwellHtMt(BigDecimal swellHtMt) {
    this.swellHtMt = swellHtMt;
  }

  public MarineHour swellHtFt(BigDecimal swellHtFt) {
    this.swellHtFt = swellHtFt;
    return this;
  }

   /**
   * Get swellHtFt
   * @return swellHtFt
  **/
  @ApiModelProperty(example = "24.1", value = "")
  public BigDecimal getSwellHtFt() {
    return swellHtFt;
  }

  public void setSwellHtFt(BigDecimal swellHtFt) {
    this.swellHtFt = swellHtFt;
  }

  public MarineHour swellDir(BigDecimal swellDir) {
    this.swellDir = swellDir;
    return this;
  }

   /**
   * Get swellDir
   * @return swellDir
  **/
  @ApiModelProperty(example = "24.1", value = "")
  public BigDecimal getSwellDir() {
    return swellDir;
  }

  public void setSwellDir(BigDecimal swellDir) {
    this.swellDir = swellDir;
  }

  public MarineHour swellDir16Point(BigDecimal swellDir16Point) {
    this.swellDir16Point = swellDir16Point;
    return this;
  }

   /**
   * Get swellDir16Point
   * @return swellDir16Point
  **/
  @ApiModelProperty(example = "24.1", value = "")
  public BigDecimal getSwellDir16Point() {
    return swellDir16Point;
  }

  public void setSwellDir16Point(BigDecimal swellDir16Point) {
    this.swellDir16Point = swellDir16Point;
  }

  public MarineHour swellPeriodSecs(BigDecimal swellPeriodSecs) {
    this.swellPeriodSecs = swellPeriodSecs;
    return this;
  }

   /**
   * Get swellPeriodSecs
   * @return swellPeriodSecs
  **/
  @ApiModelProperty(example = "24.1", value = "")
  public BigDecimal getSwellPeriodSecs() {
    return swellPeriodSecs;
  }

  public void setSwellPeriodSecs(BigDecimal swellPeriodSecs) {
    this.swellPeriodSecs = swellPeriodSecs;
  }

  public MarineHour uv(Integer uv) {
    this.uv = uv;
    return this;
  }

   /**
   * Get uv
   * @return uv
  **/
  @ApiModelProperty(example = "1", value = "")
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
    MarineHour marineHour = (MarineHour) o;
    return Objects.equals(this.timeEpoch, marineHour.timeEpoch) &&
        Objects.equals(this.time, marineHour.time) &&
        Objects.equals(this.tempC, marineHour.tempC) &&
        Objects.equals(this.tempF, marineHour.tempF) &&
        Objects.equals(this.isDay, marineHour.isDay) &&
        Objects.equals(this.condition, marineHour.condition) &&
        Objects.equals(this.windMph, marineHour.windMph) &&
        Objects.equals(this.windKph, marineHour.windKph) &&
        Objects.equals(this.windDegree, marineHour.windDegree) &&
        Objects.equals(this.windDir, marineHour.windDir) &&
        Objects.equals(this.pressureMb, marineHour.pressureMb) &&
        Objects.equals(this.pressureIn, marineHour.pressureIn) &&
        Objects.equals(this.precipMm, marineHour.precipMm) &&
        Objects.equals(this.precipIn, marineHour.precipIn) &&
        Objects.equals(this.humidity, marineHour.humidity) &&
        Objects.equals(this.cloud, marineHour.cloud) &&
        Objects.equals(this.feelslikeC, marineHour.feelslikeC) &&
        Objects.equals(this.feelslikeF, marineHour.feelslikeF) &&
        Objects.equals(this.windchillC, marineHour.windchillC) &&
        Objects.equals(this.windchillF, marineHour.windchillF) &&
        Objects.equals(this.heatindexC, marineHour.heatindexC) &&
        Objects.equals(this.heatindexF, marineHour.heatindexF) &&
        Objects.equals(this.dewpointC, marineHour.dewpointC) &&
        Objects.equals(this.dewpointF, marineHour.dewpointF) &&
        Objects.equals(this.willItRain, marineHour.willItRain) &&
        Objects.equals(this.chanceOfRain, marineHour.chanceOfRain) &&
        Objects.equals(this.willItSnow, marineHour.willItSnow) &&
        Objects.equals(this.chanceOfSnow, marineHour.chanceOfSnow) &&
        Objects.equals(this.visKm, marineHour.visKm) &&
        Objects.equals(this.visMiles, marineHour.visMiles) &&
        Objects.equals(this.gustMph, marineHour.gustMph) &&
        Objects.equals(this.gustKph, marineHour.gustKph) &&
        Objects.equals(this.sigHtMt, marineHour.sigHtMt) &&
        Objects.equals(this.swellHtMt, marineHour.swellHtMt) &&
        Objects.equals(this.swellHtFt, marineHour.swellHtFt) &&
        Objects.equals(this.swellDir, marineHour.swellDir) &&
        Objects.equals(this.swellDir16Point, marineHour.swellDir16Point) &&
        Objects.equals(this.swellPeriodSecs, marineHour.swellPeriodSecs) &&
        Objects.equals(this.uv, marineHour.uv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeEpoch, time, tempC, tempF, isDay, condition, windMph, windKph, windDegree, windDir, pressureMb, pressureIn, precipMm, precipIn, humidity, cloud, feelslikeC, feelslikeF, windchillC, windchillF, heatindexC, heatindexF, dewpointC, dewpointF, willItRain, chanceOfRain, willItSnow, chanceOfSnow, visKm, visMiles, gustMph, gustKph, sigHtMt, swellHtMt, swellHtFt, swellDir, swellDir16Point, swellPeriodSecs, uv);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarineHour {\n");
    
    sb.append("    timeEpoch: ").append(toIndentedString(timeEpoch)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    tempC: ").append(toIndentedString(tempC)).append("\n");
    sb.append("    tempF: ").append(toIndentedString(tempF)).append("\n");
    sb.append("    isDay: ").append(toIndentedString(isDay)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    windMph: ").append(toIndentedString(windMph)).append("\n");
    sb.append("    windKph: ").append(toIndentedString(windKph)).append("\n");
    sb.append("    windDegree: ").append(toIndentedString(windDegree)).append("\n");
    sb.append("    windDir: ").append(toIndentedString(windDir)).append("\n");
    sb.append("    pressureMb: ").append(toIndentedString(pressureMb)).append("\n");
    sb.append("    pressureIn: ").append(toIndentedString(pressureIn)).append("\n");
    sb.append("    precipMm: ").append(toIndentedString(precipMm)).append("\n");
    sb.append("    precipIn: ").append(toIndentedString(precipIn)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
    sb.append("    feelslikeC: ").append(toIndentedString(feelslikeC)).append("\n");
    sb.append("    feelslikeF: ").append(toIndentedString(feelslikeF)).append("\n");
    sb.append("    windchillC: ").append(toIndentedString(windchillC)).append("\n");
    sb.append("    windchillF: ").append(toIndentedString(windchillF)).append("\n");
    sb.append("    heatindexC: ").append(toIndentedString(heatindexC)).append("\n");
    sb.append("    heatindexF: ").append(toIndentedString(heatindexF)).append("\n");
    sb.append("    dewpointC: ").append(toIndentedString(dewpointC)).append("\n");
    sb.append("    dewpointF: ").append(toIndentedString(dewpointF)).append("\n");
    sb.append("    willItRain: ").append(toIndentedString(willItRain)).append("\n");
    sb.append("    chanceOfRain: ").append(toIndentedString(chanceOfRain)).append("\n");
    sb.append("    willItSnow: ").append(toIndentedString(willItSnow)).append("\n");
    sb.append("    chanceOfSnow: ").append(toIndentedString(chanceOfSnow)).append("\n");
    sb.append("    visKm: ").append(toIndentedString(visKm)).append("\n");
    sb.append("    visMiles: ").append(toIndentedString(visMiles)).append("\n");
    sb.append("    gustMph: ").append(toIndentedString(gustMph)).append("\n");
    sb.append("    gustKph: ").append(toIndentedString(gustKph)).append("\n");
    sb.append("    sigHtMt: ").append(toIndentedString(sigHtMt)).append("\n");
    sb.append("    swellHtMt: ").append(toIndentedString(swellHtMt)).append("\n");
    sb.append("    swellHtFt: ").append(toIndentedString(swellHtFt)).append("\n");
    sb.append("    swellDir: ").append(toIndentedString(swellDir)).append("\n");
    sb.append("    swellDir16Point: ").append(toIndentedString(swellDir16Point)).append("\n");
    sb.append("    swellPeriodSecs: ").append(toIndentedString(swellPeriodSecs)).append("\n");
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

