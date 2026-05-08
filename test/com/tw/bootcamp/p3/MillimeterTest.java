package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MillimeterTest {
    @Test
    void shouldCreateMillimeter() {
        Millimeter oneMillimeter = new Millimeter(1);
        assertEquals(new Millimeter(1),oneMillimeter);

    }

    @Test
    void shouldConvertToBase() {
        Millimeter oneMillimeter = new Millimeter(1);
        assertEquals(new Centimeter(0.1),oneMillimeter.toBase());

    }


}