package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    void shouldCreateAParkingLotOfSize1() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park();
        assertTrue(parkingLot.isFull());
    }

    @Test
    void shouldReturnFalseWhenParkingLotIsNoFull() {
        ParkingLot parkingLot = new ParkingLot(12);
        parkingLot.park();
        assertFalse(parkingLot.isFull());
    }
}