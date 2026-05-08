package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {
    @Test
    void shouldCreateFeet() {
        Feet feet = new Feet(12f);
        assertEquals(new Feet(12f), feet);
    }

    @Test
    void shouldConvertToBase() {
        Feet feet = new Feet(1f);
        assertEquals(new Centimeter(30.48), feet.toBase());
    }

}