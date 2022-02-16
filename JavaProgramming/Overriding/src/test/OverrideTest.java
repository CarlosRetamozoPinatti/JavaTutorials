package test;

import domain.Manager;

public class OverrideTest {
    public static void main(String[] args) {
        Manager man01 = new Manager("John", 35000, "IT");
        //Here we test the method.
        System.out.println("man01.getDetails() = " + man01.getDetails());
    }

}
