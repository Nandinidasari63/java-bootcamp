package com.tw.bootcamp.p1;


public class Rectangle implements Polygon {
    private final float length;
    private final float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
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
