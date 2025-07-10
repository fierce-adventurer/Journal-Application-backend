package com.fierce.adventurer.journalApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class WeatherResponse{

    private Current current;


    @Data
    public class Current{
        @JsonProperty("observation_time")
        private String observationTime;
        private int temperature;

        @JsonProperty("weather_descriptions")
        private ArrayList<String> weatherDescriptions;


        @JsonProperty("feelslike")
        private int feelsLike;

    }




}


// public class AirQuality{
//    public String co;
//    public String no2;
//    public String o3;
//    public String so2;
//    public String pm2_5;
//    public String pm10;
//    public String us-epa-index;
//    public String gb-defra-index;
//}
//
//public class Astro{
//    public String sunrise;
//    public String sunset;
//    public String moonrise;
//    public String moonset;
//    public String moon_phase;
//    public int moon_illumination;
//}


