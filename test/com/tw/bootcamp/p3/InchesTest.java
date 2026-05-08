package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchesTest {
    @Test
    void shouldCreateInches() {

      Inches inches = new Inches(12f);
      assertEquals(new Inches(12f), inches);
    }
}