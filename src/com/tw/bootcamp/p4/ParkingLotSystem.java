package com.tw.bootcamp.p4;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotSystem {
    private final HashMap<Integer, ParkingLot> parkingLots;
    private int parkingLotsId;

    public ParkingLotSystem() {
        this.parkingLots = new HashMap<>();
        this.parkingLotsId = 0;
    }

    public int createParkingLot(int noOfSlots) {
        ParkingLot parkingLot = new ParkingLot(noOfSlots);
        parkingLotsId++;
        parkingLots.put(parkingLotsId, parkingLot);
        return parkingLotsId;
    }

    public void park(int parkingLotId) throws SlotsFullException {
        ParkingLot parkingLot = parkingLots.get(parkingLotId);
        parkingLot.park();
    }

    public boolean isFull(int parkingLotId) {
        ParkingLot parkingLot = parkingLots.get(parkingLotId);
        return parkingLot.isFull();
    }

    public String display(){
        StringBuilder view = new StringBuilder();
        for (Map.Entry<Integer, ParkingLot> parkingLotEntry: parkingLots.entrySet()){
            view.append("%d : %s".formatted(parkingLotEntry.getKey(), parkingLotEntry.getValue()));

        }

        return view.toString();
    }


}
