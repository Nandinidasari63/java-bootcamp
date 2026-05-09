package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class ParkingLot {
    private final int noOfSlots;
    private int noOfSlotsOccupied;

    public ParkingLot(int noOfSlots) {
        this.noOfSlotsOccupied = 0;
        this.noOfSlots = noOfSlots;
    }

    public void park() throws SlotsFullException {
        if (isFull()) {
            throw new SlotsFullException("No slots available");
        }
        noOfSlotsOccupied++;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "noOfSlots=" + noOfSlots +
                ", noOfSlotsOccupied=" + noOfSlotsOccupied +
                '}';
    }

    public boolean isFull() {
        return noOfSlotsOccupied >= noOfSlots;
    }


}
