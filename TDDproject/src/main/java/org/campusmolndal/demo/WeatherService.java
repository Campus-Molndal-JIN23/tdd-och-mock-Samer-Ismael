package org.campusmolndal.demo;
public class WeatherService {

    private WeatherAPI weatherAPI;

    public WeatherService(WeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }

    public Double getTemperature() {
        return weatherAPI.getTemperature();
    }

    public Double getWindSpeed() {
        return weatherAPI.getWindSpeed();
    }

    public Double getCloudiness() {
        return weatherAPI.getCloudiness();
    }

}