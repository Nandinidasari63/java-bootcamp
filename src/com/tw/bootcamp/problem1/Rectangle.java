package com.tw.bootcamp.problem1;


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
}
