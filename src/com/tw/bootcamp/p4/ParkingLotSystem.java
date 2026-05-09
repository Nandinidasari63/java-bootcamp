package com.tw.bootcamp.p4;

import java.util.HashMap;

public class ParkingLotSystem {
    private final HashMap<Integer, ParkingLot> parkingLots;
    private int parkingLotsId;

    public ParkingLotSystem() {
        this.parkingLots = new HashMap<>();
        this.parkingLotsId = 0;
    }

    public int addParkingLot(int noOfSlots) {
        ParkingLot parkingLot = new ParkingLot(noOfSlots);
        parkingLotsId++;
        parkingLots.put(parkingLotsId, parkingLot);
        return parkingLotsId;
    }

    public void park(int parkingLotId) {
        ParkingLot parkingLot = parkingLots.get(parkingLotId);
        parkingLot.park();
    }

    public boolean isFull(int parkingLotId) {
        ParkingLot parkingLot = parkingLots.get(parkingLotId);
        return parkingLot.isFull();
    }


}
