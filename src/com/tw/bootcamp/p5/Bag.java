package com.tw.bootcamp.p5;

import java.util.Objects;

public class Bag {

    private int ballsCount;

    public Bag() {
    this.ballsCount = 0;
    }

    public void addBall() {
        this.ballsCount++;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bag bag = (Bag) o;
        return ballsCount == bag.ballsCount;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ballsCount);
    }
}
