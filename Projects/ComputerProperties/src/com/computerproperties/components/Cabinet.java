package com.computerproperties.components;

import com.computerproperties.commons.ComponentCommons;

public class Cabinet extends ComponentCommons {
    private final int cabId;
    private static int cabCount;
    private String type;

    public Cabinet(String brand, String type){
        super(brand);
        this.cabId = ++Cabinet.cabCount;
        this.type = type;
    }

    public int getCabId() {
        return cabId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cabinet{" +
                "cabId=" + cabId +
                ", type='" + type +
                ", " + super.toString() +
                '}';
    }
}
