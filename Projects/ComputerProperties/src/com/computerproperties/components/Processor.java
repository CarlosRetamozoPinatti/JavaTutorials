package com.computerproperties.components;

import com.computerproperties.commons.ComponentCommons;

public class Processor extends ComponentCommons {
    private final int procId;
    private static int processorCount;
    private int speedMhz;
    private String energyConsump;

    public Processor(String brand, int speedMhz, String energyConsump){
        super(brand);
        this.procId = ++Processor.processorCount;
        this.speedMhz = speedMhz;
        this.energyConsump = energyConsump;

    }

    public int getProcId() {
        return procId;
    }

    public int getSpeedMhz() {
        return speedMhz;
    }

    public void setSpeedMhz(int speedMhz) {
        this.speedMhz = speedMhz;
    }

    public String getEnergyConsump() {
        return energyConsump;
    }

    public void setEnergyConsump(String energyConsump) {
        this.energyConsump = energyConsump;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "procId=" + procId +
                ", speedMhz=" + speedMhz +
                ", energyConsump='" + energyConsump +
                ", " + super.toString() +
                '}';
    }
}
