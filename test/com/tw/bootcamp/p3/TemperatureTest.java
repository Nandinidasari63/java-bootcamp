package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    void shouldCreateCelsius() {
        Temperature hundredCelsius = Temperature.createCelsius(100);
        assertEquals(Temperature.createCelsius(100), hundredCelsius);
    }

    @Test
    void zeroCelsiusIsEqualToThirtyTwoFahrenheit() {
        Temperature zeroCelsius = Temperature.createCelsius(0);
        assertEquals(Temperature.createFahrenheit(32), zeroCelsius);
    }

    @Test
    void twoHundredTwelveFisEqualToHundredC(){
        Temperature twoHundredCelsius = Temperature.createFahrenheit(212);
        assertEquals(Temperature.createCelsius(100), twoHundredCelsius);

    }
}