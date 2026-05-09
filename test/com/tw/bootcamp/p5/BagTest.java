package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

    @Test
    void shouldAddABall() throws BagSizeOverflowException, GreenBallLimitException {
        Bag bag = new Bag();
        bag.addBall(BallColor.BLUE);

        Bag anotherBag = new Bag();
        anotherBag.addBall(BallColor.BLUE);

        assertEquals(bag, anotherBag);
    }

    @Test
    void shouldNotAddWhenBagIsFull() throws BagSizeOverflowException, GreenBallLimitException {
        Bag bag = new Bag(2);

        bag.addBall(BallColor.BLUE);
        bag.addBall(BallColor.YELLOW);

        assertThrows(BagSizeOverflowException.class, ()-> bag.addBall(BallColor.RED));

    }

    @Test
    void shouldNotAddMoreThanThreeGreenBalls() throws BagSizeOverflowException, GreenBallLimitException {
        Bag bag = new Bag();
        bag.addBall(BallColor.GREEN);
        bag.addBall(BallColor.GREEN);
        bag.addBall(BallColor.GREEN);

         assertThrows(GreenBallLimitException.class, () -> bag.addBall(BallColor.GREEN));


    }
}
