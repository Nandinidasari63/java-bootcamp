package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotSystemTest {
    @Test
    void shouldAddANewParkingLot() {
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem();
        int lotId = parkingLotSystem.createParkingLot(3);
        assertFalse(parkingLotSystem.isFull(lotId));
    }

    @Test
    void shouldParkACar() throws SlotsFullException {
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem();
        int lotId = parkingLotSystem.createParkingLot(1);
        parkingLotSystem.park(lotId);
        assertTrue(parkingLotSystem.isFull(1));
    }


}