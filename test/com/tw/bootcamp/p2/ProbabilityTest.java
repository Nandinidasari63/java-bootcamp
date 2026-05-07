package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void shouldReturnProbability() {
        assertEquals(0.5,Probability.calculateProbability(1,2));
    }

    @Test
    void shouldReturnProbabilityOfGettingTailWhenFlippingACoin() {
        assertEquals(0.5,Probability.calculateProbability(1,2));
    }

    @Test
    void shouldReturnProbabilityOfGettingTailWhenFlipping2Coins() {
        assertEquals(0.75,Probability.calculateProbability(3,4));
    }

    @Test
    void shouldReturnProbabilityOfGetting3WhenRollingADice() {
        assertEquals(0.16,Probability.calculateProbability(1,6),0.1);
    }
}