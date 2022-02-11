package com.computerproperties.components;

import com.computerproperties.commons.PeriphCommons;

public class Keyboard extends PeriphCommons {
    private final int idKeyboard;
    private static int keyboardCount;

    public Keyboard(String entryType, String brand){
        super(entryType, brand);
        this.idKeyboard = ++Keyboard.keyboardCount;

    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "idKeyboard=" + idKeyboard + ", " + super.toString() +
                '}';
    }
}
