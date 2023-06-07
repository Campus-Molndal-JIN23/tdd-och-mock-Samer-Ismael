package org.campusmolndal.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherServiceTest {

    private WeatherService sut;
    private WeatherAPI mockAPI;

    @BeforeEach
    public void setup() {
        mockAPI = mock(WeatherAPI.class);
        sut = new WeatherService(mockAPI);
    }

    @Test
    void getTemperature() {
        when(mockAPI.getTemperature()).thenReturn(50.0);
        assertEquals(50.0, sut.getTemperature());
        assertNotEquals(0.0, sut.getTemperature());
        assertTrue(sut.getTemperature() == 50.0);
        assertFalse(sut.getTemperature() != 50.0);
    }

    @Test
    void getWindSpeed() {
        when(mockAPI.getWindSpeed()).thenReturn(5.0);
        assertEquals(5.0, sut.getWindSpeed());
        assertNotEquals(0.0, sut.getWindSpeed());
        assertTrue(sut.getWindSpeed() == 5.0);
        assertFalse(sut.getWindSpeed() != 5.0);

    }

    @Test
    void getCloudiness() {
        when(mockAPI.getCloudiness()).thenReturn(75.0);
        assertEquals(75.0, sut.getCloudiness());
        assertNotEquals(0.0, sut.getCloudiness());
        assertTrue(sut.getCloudiness() == 75.0);
        assertFalse(sut.getCloudiness() != 75.0);
    }
}