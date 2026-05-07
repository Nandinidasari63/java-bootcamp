package com.tw.bootcamp.p1;


public class Rectangle implements Polygon {
    private final float length;
    private final float breadth;

    private Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle createRectangle(float length, float breadth)  {
        return new Rectangle(length, breadth);
    }

    public static Rectangle createSquare(float side)  {
        return createRectangle(side,side);
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
