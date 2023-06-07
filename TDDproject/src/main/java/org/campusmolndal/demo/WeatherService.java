package org.campusmolndal.demo;
public class WeatherService {

    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;


    public WeatherService(WeatherAPI api) {
        api = new WeatherAPI();


    }


    public double getTemp() {
        return temp;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public double getTemp_min() {
        return temp_min;
    }


    public double getTemp_max() {
        return temp_max;
    }

}