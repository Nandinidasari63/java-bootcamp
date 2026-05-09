package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    void shouldCreateAParkingLotOfSize1() throws SlotsFullException {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park();
        assertTrue(parkingLot.isFull());
    }

    @Test
    void shouldReturnFalseWhenParkingLotIsNoFull() throws SlotsFullException {
        ParkingLot parkingLot = new ParkingLot(12);
        parkingLot.park();
        assertFalse(parkingLot.isFull());
    }

    @Test
    void shouldNotBeAbleToParkWhenSlotIsFull() throws SlotsFullException {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park();
        SlotsFullException slotsFullException = assertThrows(SlotsFullException.class, parkingLot::park);
        assertEquals(slotsFullException.getMessage(), "No slots available");
    }
}