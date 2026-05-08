package com.tw.bootcamp.p3;

import java.util.Objects;

public class Length {
    private final double value;

    private Length(double value) {
        this.value = value;
    }

    private static Length createLength(double value) throws InvalidLengthException {
        if (value < 0) {
            throw new InvalidLengthException("Invalid Length");
        }
        return new Length(value);
    }

    public static Length createCm(double value) throws InvalidLengthException {
        return createLength(value);
    }

    public static Length createFeet(double value) throws InvalidLengthException {
        return createLength(value * 30.48);
    }

    public static Length createInches(double value) throws InvalidLengthException {
        return createLength(value * 2.54);
    }

    public static Length createMm(double value) throws InvalidLengthException {
        return createLength(value * 0.1);
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

    public Length add(Length length) throws InvalidLengthException {
        return createLength(value + length.value);
    }

    @Override
    public String toString() {
        return "Length{" +
                "value=" + value +
                '}';
    }
}
