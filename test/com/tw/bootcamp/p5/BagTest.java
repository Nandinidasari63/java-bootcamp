package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void shouldAddABall() {
        Bag bag = new Bag();
        bag.addBall();

        Bag anotherBag = new Bag();
        anotherBag.addBall();

        assertEquals(bag, anotherBag);
    }
}