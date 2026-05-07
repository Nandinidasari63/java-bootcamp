package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RectangleTest {
    @Test
    void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(3,4);
        assertEquals(12,rectangle.calculateArea());
    }

    @Test
    void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(3,4);
        assertEquals(14,rectangle.calculatePerimeter());

    }
}