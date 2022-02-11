package com.computerproperties.components;

import com.computerproperties.commons.ComponentCommons;

public class Psu extends ComponentCommons {
    private final int psuId;
    private static int psuCount;
    private int watts;

    public Psu(String brand, int watts){
        super(brand);
        this.psuId = ++Psu.psuCount;
        this.watts = watts;
    }

    public int getPsuId() {
        return psuId;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    @Override
    public String toString() {
        return "Psu{" +
                "psuId=" + psuId +
                ", watts=" + watts +
                ", " + super.toString() +
                '}';
    }
}
