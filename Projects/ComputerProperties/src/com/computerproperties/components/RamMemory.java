package com.computerproperties.components;

import com.computerproperties.commons.ComponentCommons;

public class RamMemory extends ComponentCommons {
    private final int ramId;
    private static int ramCount;
    private int gigabytes;
    private int mhz;

    public RamMemory(String brand, int gigabytes, int mhz){
        super(brand);
        this.ramId = ++RamMemory.ramCount;
        this.gigabytes = gigabytes;
        this.mhz = mhz;
    }

    public int getRamId() {
        return ramId;
    }

    public int getGigabytes() {
        return gigabytes;
    }

    public void setGigabytes(int gigabytes) {
        this.gigabytes = gigabytes;
    }

    public int getMhz() {
        return mhz;
    }

    public void setMhz(int mhz) {
        this.mhz = mhz;
    }

    @Override
    public String toString() {
        return "RamMemory{" +
                "ramId=" + ramId +
                ", gigabytes=" + gigabytes +
                ", mhz=" + mhz +
                ", " + super.toString() +
                '}';
    }
}
