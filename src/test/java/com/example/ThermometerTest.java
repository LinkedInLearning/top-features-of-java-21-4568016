package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThermometerTest {

    @Test
    void testGetTemperature() {
        var thermometer = new Thermometer();
        thermometer.getTemperature(25.75);

        assertEquals("The temperature is 25.75 degrees", thermometer.getTemperature(25.75));
    }

}
