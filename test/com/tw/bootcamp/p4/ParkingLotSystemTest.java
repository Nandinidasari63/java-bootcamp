package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotSystemTest {
    @Test
    void shouldAddANewParkingLot() {
        ParkingLotSystem parkingLots = new ParkingLotSystem();
        int lotId = parkingLots.addParkingLot(3);
       assertFalse( parkingLots.isFull(lotId));
    }

    @Test
    void shouldParkACar() {
        ParkingLotSystem parkingLots = new ParkingLotSystem();
        int lotId = parkingLots.addParkingLot(1);
        parkingLots.park(lotId);
        assertTrue(parkingLots.isFull(1));
    }
}