package com.tw.bootcamp.p5;

import java.util.Objects;

public class Bag {

    private final int maxSize;
    private int noOfBalls;

    public Bag() {
        this.maxSize = 12;
        this.noOfBalls = 0;
    }

    public Bag(int maxSize){
        this.maxSize = maxSize;
    }

    public void addBall() throws BagSizeOverflowException {
        if(noOfBalls >= maxSize){
            throw new BagSizeOverflowException("Bag is full");
        }
        this.noOfBalls++;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bag bag = (Bag) o;
        return noOfBalls == bag.noOfBalls;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(noOfBalls);
    }
}
