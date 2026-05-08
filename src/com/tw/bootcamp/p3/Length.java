package com.tw.bootcamp.p3;

import java.util.Objects;

public class Length {
    private final double value;

    private Length(double value) {
        this.value = value;
    }

    private static Length createLength(double value){
        return new Length(value);
    }

    public static Length createCm(double value) {
        return createLength(value);
    }

    public static Length createFeet(double value) {
        return  createLength(value * 30.48);
    }

    public static Length createInches(double value) {
        return  createLength(value * 2.54);
    }

    public  static  Length createMm(double value){
        return   createLength(0.1 * value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(value, length.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

}
