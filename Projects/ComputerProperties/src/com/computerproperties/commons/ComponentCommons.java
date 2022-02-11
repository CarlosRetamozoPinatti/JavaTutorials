package com.computerproperties.commons;

public class ComponentCommons {
    private String brand;

    public ComponentCommons(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "ComponentCommons{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
