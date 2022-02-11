package com.computerproperties.commons;

public class PeriphCommons {
    private String entryType;
    private String brand;

    public PeriphCommons(String entryType, String brand){
        this.entryType = entryType;
        this.brand = brand;
    }

    public String getEntryType() {
        return this.entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "PeriphCommons{" +
                "entryType='" + entryType + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
