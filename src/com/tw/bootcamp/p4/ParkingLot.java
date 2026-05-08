package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class ParkingLot {
    private final int noOfSlots;
    ArrayList<Car> slots;

    public ParkingLot(int noOfSlots) {
        slots = new ArrayList<>(noOfSlots);
        this.noOfSlots = noOfSlots;
    }

    public void park(Car car) {
        slots.add(car);
    }

    public boolean isFull() {
        return slots.size() >= noOfSlots;
    }


}
