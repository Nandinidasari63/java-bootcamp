package com.tw.bootcamp.p3;

import java.util.Comparator;
import java.util.Objects;

public class Feet {
    private final float value;

    public Feet(float value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Float.compare(value, feet.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
