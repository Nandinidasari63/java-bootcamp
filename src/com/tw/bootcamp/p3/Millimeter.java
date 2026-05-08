package com.tw.bootcamp.p3;

import java.util.Objects;

public class Millimeter {
    private final double value;

    public Millimeter(double value) {
        this.value = value;
    }

    public Centimeter toBase(){
        return new Centimeter(value * 0.1);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Millimeter that = (Millimeter) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
