package com.tw.bootcamp.p3;

import java.util.Objects;

public class Inches {
    private final float value;

    public Inches(float value) {
        this.value = value;
    }

    public Centimeter toBase(){
            return new Centimeter(value * 2.54);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inches inches = (Inches) o;
        return Float.compare(value, inches.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
