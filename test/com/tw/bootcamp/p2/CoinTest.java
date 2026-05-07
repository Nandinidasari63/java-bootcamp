package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
    @Test
    void shouldReturnTheProbabilityOfGettingTail() {
        assertEquals(0.5, Coin.probabilityOfGettingTail());
    }
}