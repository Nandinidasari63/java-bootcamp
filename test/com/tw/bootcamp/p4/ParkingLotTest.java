package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    void shouldCreateAParkingLotOfSize1() {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park(car);
        assertTrue(parkingLot.isFull());
    }

    @Test
    void shouldReturnFalseWhenParkingLotIsNoFull() {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot(12);
        parkingLot.park(car);
        assertFalse(parkingLot.isFull());
    }
}