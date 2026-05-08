package com.tw.bootcamp.p3;

import java.util.Objects;

public class Centimeter {
    private final double value;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Centimeter that = (Centimeter) o;
        return Double.compare(value, that.value) == 0;
    }

    public Centimeter toBase(){
        return new Centimeter(value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Centimeter(double value) {
        this.value = value;
    }
}
