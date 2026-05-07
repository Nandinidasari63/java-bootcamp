package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RectangleTest {
    @Test
    void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(3,4);
        assertEquals(12,rectangle.calculateArea());
    }
    
}