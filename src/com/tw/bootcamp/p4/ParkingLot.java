package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class ParkingLot {
    private final int noOfSlots;
    private int noOfSlotsOccupied;

    public ParkingLot(int noOfSlots) {
        this.noOfSlotsOccupied = 0;
        this.noOfSlots = noOfSlots;
    }

    public void park() {
        noOfSlotsOccupied++;
    }

    public boolean isFull() {
        return noOfSlotsOccupied >= noOfSlots;
    }


}
