package com.tw.bootcamp.p1;


public class Rectangle {
    private final float length;
    private final float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float calculateArea() {
        return length * breadth;
    }

    public float calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
