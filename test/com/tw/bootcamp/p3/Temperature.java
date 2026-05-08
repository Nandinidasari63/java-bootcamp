package com.tw.bootcamp.p3;

import java.util.Objects;

public class Temperature {
    private final double value;

    private Temperature(double value) {
        this.value = value;
    }

    private static Temperature createTemperature(double value) {
        return new Temperature(value);
    }

    public static Temperature createCelsius(double value) {
        return createTemperature(value);
    }

    public static Temperature createFahrenheit(double value) {
        return createTemperature((value - 32) * 5 / 9);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
