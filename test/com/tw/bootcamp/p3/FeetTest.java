package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {
    @Test
    void shouldCreateFeet() {
        Feet feet = new Feet(12f);
        assertEquals(new Feet(12f), feet);
    }
}