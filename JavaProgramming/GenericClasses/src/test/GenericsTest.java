package test;

import generics.GenericClass;

public class GenericsTest {
    public static void main(String[] args) {
        GenericClass<Integer> objectInt = new GenericClass<>(15);
        objectInt.getType();

        GenericClass<String> objectStr = new GenericClass<>("Hi");
        objectStr.getType();

    }
}
