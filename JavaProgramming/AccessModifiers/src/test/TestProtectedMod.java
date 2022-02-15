package test;

import protectedModifier.DaughterClass;
//Here we can access the protected parameters of the father class, using the daughter class.
public class TestProtectedMod {
    public static void main(String[] args) {
        DaughterClass daughterClass = new DaughterClass();
        System.out.println("daughterClass = " + daughterClass);
    }
}
