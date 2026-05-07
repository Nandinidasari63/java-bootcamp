package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RectangleTest {
    @Test
    void shouldCalculateArea() throws InvalidDimensionsException {
        Rectangle rectangle = Rectangle.createRectangle(3, 4);
        assertEquals(12, rectangle.calculateArea());
    }

    @Test
    void shouldCalculatePerimeter() throws InvalidDimensionsException {
        Rectangle rectangle = Rectangle.createRectangle(3, 4);
        assertEquals(14, rectangle.calculatePerimeter());

    }

    @Test
    void shouldThrowWhenInvalidDimensionsAreProvided() {
        InvalidDimensionsException invalidDimensionsException = assertThrows(InvalidDimensionsException.class, () -> Rectangle.createRectangle(-1, 0));
        assertEquals("Invalid dimensions -1.00 0.00", invalidDimensionsException.getMessage());
    }
}