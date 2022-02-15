package test;

import publicModifier.Class01;

public class TestPublicMod {
    public static void main(String[] args) {
        //With the public mod, we can create a class accessing the file from another package.
        Class01 class01 = new Class01();
        System.out.println("class01 = " + class01.publicAttribute);
        class01.publicMethod();
    }
}
