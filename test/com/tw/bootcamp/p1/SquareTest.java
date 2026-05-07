package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldCalculateArea() {
        Rectangle square = Rectangle.createSquare(4);
        assertEquals(16, square.calculateArea());
    }

    @Test
    void shouldCalculatePerimeter() {
        Rectangle square = Rectangle.createSquare(3.5f);
        assertEquals(14, square.calculatePerimeter());
    }
}