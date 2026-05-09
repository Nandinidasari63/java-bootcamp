package com.tw.bootcamp.p5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Bag {

    private final int maxSize;
    private final HashMap<BallColor, Integer> ballCounts;

    public Bag() {
        this.maxSize = 12;
        this.ballCounts = new HashMap<>();
    }

    public Bag(int maxSize) {
        this.maxSize = maxSize;
        this.ballCounts = new HashMap<>();
    }

    private int totalNoOfBalls() {
        return this.ballCounts.values().stream().mapToInt(Integer::intValue).sum();
    }


    public void addBall(BallColor color) throws BagSizeOverflowException, GreenBallLimitException {
        if (totalNoOfBalls() >= maxSize) {
            throw new BagSizeOverflowException("Bag is full");
        }

        if (color == BallColor.GREEN && hasGreenLimitReached()) {
            throw new GreenBallLimitException("Green balls can only be 3");
        }

        if (ballCounts.get(color) == null) {
            this.ballCounts.put(color, 1);
            return;
        }

        ballCounts.computeIfPresent(color, (key, value) -> value + 1);

    }

    private boolean hasGreenLimitReached() {
        return ballCounts.getOrDefault(BallColor.GREEN, 0) >= 3;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bag bag = (Bag) o;
        return maxSize == bag.maxSize && Objects.equals(ballCounts, bag.ballCounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSize, ballCounts);
    }
}
