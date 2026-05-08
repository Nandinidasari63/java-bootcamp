package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldCreateInch() {
        Length inch = Length.createInches(1);
        assertEquals(Length.createInches(1),inch );
    }

    @Test
    void shouldCreateFeet() {
        Length feet = Length.createFeet(2);
        assertEquals(Length.createFeet(2),feet );
    }

    @Test
    void shouldCreateCm() {
        Length twoCentimeters = Length.createCm(2);
        assertEquals(Length.createCm(2),twoCentimeters );
    }

    @Test
    void onFeetIsEqualTo12Inches() {
        assertEquals(Length.createFeet(1), Length.createInches(12));
    }

    @Test
    void twoInchesIsEqualTo5Cm() {
        assertEquals(Length.createInches(2), Length.createCm(5.08));
    }

    @Test
    void shouldCreateMm() {
        Length oneMillimeter = Length.createMm(1);
        assertEquals(Length.createMm(1), oneMillimeter);
    }

    @Test
    void oneCentimeterIsEqualToTenMillimeters() {
        Length oneCentimeter = Length.createCm(1);
        assertEquals(Length.createMm(10), oneCentimeter);
    }
}