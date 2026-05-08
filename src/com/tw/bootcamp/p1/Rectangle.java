package com.tw.bootcamp.p1;


public class Rectangle implements Polygon {
    private final float length;
    private final float breadth;

    private Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public static Rectangle createRectangle(float length, float breadth) throws InvalidDimensionsException {
        if (length < 1 || breadth < 1) {
            throw new InvalidDimensionsException("Invalid dimensions %.2f %.2f".formatted(length, breadth));
        }
        return getRectangle(length, breadth);
    }

    private static Rectangle getRectangle(float length, float breadth) {
        return new Rectangle(length, breadth);
    }

    public static Rectangle createSquare(float side) throws InvalidDimensionsException {
        return createRectangle(side, side);
    }

    @Override
    public float calculateArea() {
        return length * breadth;
    }

    @Override
    public float calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
