package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

    @Test
    void shouldAddABall() throws BagSizeOverflowException {
        Bag bag = new Bag();
        bag.addBall();

        Bag anotherBag = new Bag();
        anotherBag.addBall();

        assertEquals(bag, anotherBag);
    }

    @Test
    void shouldNotAddWhenBagIsFull() throws BagSizeOverflowException {
        Bag bag = new Bag(2);

        bag.addBall();
        bag.addBall();

        assertThrows(BagSizeOverflowException.class, bag::addBall);

    }
}
