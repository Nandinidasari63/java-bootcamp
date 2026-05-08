package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchesTest {
    @Test
    void shouldCreateInches() {

      Inches inches = new Inches(12f);
      assertEquals(new Inches(12f), inches);
    }

    @Test
    void shouldConvertToBase() {
        Inches inches = new Inches(1);
        assertEquals(new Centimeter(2.54), inches.toBase());
    }

    @Test
    void twoInchesIsEqualTo5Cm() {
        Inches twoInches = new Inches(2);
        assertEquals(new Centimeter(5.08), twoInches.toBase());
    }
}