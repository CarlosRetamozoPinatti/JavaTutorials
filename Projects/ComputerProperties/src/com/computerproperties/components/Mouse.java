package com.computerproperties.components;

import com.computerproperties.commons.PeriphCommons;

public class Mouse extends PeriphCommons {
    private final int idMouse;
    private static int mouseCounter;

    public Mouse(String entryType, String brand){
        super(entryType, brand);
        this.idMouse = ++Mouse.mouseCounter;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "idMouse=" + idMouse + ", " + super.toString() +
                '}';
    }
}
