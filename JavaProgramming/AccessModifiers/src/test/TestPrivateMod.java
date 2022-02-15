package test;


import privateModifier.Class04;

public class TestPrivateMod {
    public static void main(String[] args) {
        //To execute the private constructor, first we need to execute the public one.
        Class04 class04 = new Class04("Public");
        class04.setPrivateAttr("Set Private Attribute");
        System.out.println("Get Private Attribute = " + class04.getPrivateAttr());

    }

}
