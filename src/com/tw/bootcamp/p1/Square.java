package com.tw.bootcamp.p1;

public class Square implements Polygon {
    private final float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float calculateArea() {
        return side * side;
    }

    @Override
    public float calculatePerimeter() {
        return 4 * side;
    }
}
