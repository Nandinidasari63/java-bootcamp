package com.tw.bootcamp.p3;

import java.util.Objects;

public class Volume {

    private final double value;

    private Volume(double value) {
        this.value = value;
    }

    private static Volume createVolume(double value) {
        return new Volume(value);
    }

    public static Volume createGallon(double value) {
        return createVolume(value * 3.78);
    }

    public static Volume createLitre(double value) {
        return createVolume(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(value, volume.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "Volume{" +
                "value=" + value +
                '}';
    }
}
