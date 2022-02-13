package test;
//Autoboxing consist in the conversion from a primitive type to an object type.
public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Wrapper classes of primitive types:
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
         */
        //These classes differs from their primitive types because they have attributes and methods that can be used.
        Integer number = 10;
        System.out.println("number = " + number);
        //The next print has a String type
        System.out.println("number = " + number.toString());
        //It also can be a byte
        System.out.println("number = " + number.byteValue());
        //Or a double
        System.out.println("number = " + number.doubleValue());

        //Unboxing is the inverse operation. Converts an object type to it's primitive type.
        int number2 = number;
        System.out.println("number2 = " + number2);
    }
}
