package org.campusmolndal.demo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherAPI {
    private WeatherService weatherService;

    public WeatherAPI (){
        String json = "{\n" +
                "  \"temp\": 20.59,\n" +
                "  \"feels_like\": 20.13,\n" +
                "  \"temp_min\": 18.89,\n" +
                "  \"temp_max\": 21.74\n" +
                "}";
        try {
            ObjectMapper mapper = new ObjectMapper();
            this.weatherService = mapper.readValue(json, WeatherService.class);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
    }
    public WeatherService getData (){
        return weatherService;
    }
}
