package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {
    @Test
    void shouldCreateCm() {
        Centimeter oneCentimeter = new Centimeter(1);
        assertEquals(new Centimeter(1), oneCentimeter);

    }

    @Test
    void oneCentimeterToBase() {
        Centimeter oneCentimeter = new Centimeter(1);
        assertEquals(new Centimeter(1),oneCentimeter.toBase() );
    }


}