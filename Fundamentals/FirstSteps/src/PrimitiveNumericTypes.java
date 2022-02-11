//Numeric types got different ranges of values. Depending on the type.

public class PrimitiveNumericTypes {
    public static void main(String args []){
        //Integer Primitive Types - byte, short, int, long.
        //"byte" goes from -128 to 127 - 8 bits size.
        System.out.println("byte min value: " + Byte.MIN_VALUE + " ,byte max value: " + Byte.MAX_VALUE);
        //"short" goes from -32768 to 32767 - 16 bits size.
        System.out.println("short min value: " + Short.MIN_VALUE + " ,short max value: " + Short.MAX_VALUE);
        //"int" goes from -2^31 to 2^31 -1 - 32 bits size.
        System.out.println("int min value: " + Integer.MIN_VALUE + " ,int max value: " + Integer.MAX_VALUE);
        //"long" goes from -2^63 to 2^63 -1 - 64 bits size.
        System.out.println("long min value: " + Long.MIN_VALUE + " ,long max value: " + Long.MAX_VALUE);

        //Forcing a variable to accept a value.
        byte numberByte = (byte) 129; //Force a variable to take values out of range, despite the lossy conversion.
        System.out.println("numberByte = " + numberByte);
        short numberShort = (short) 32769;
        System.out.println("numberShort = " + numberShort);
        int numberInt = (int) 2147483697L; //The number exceeds the int literal. We use L to format it to a Long type.
        System.out.println("numberInt = " + numberInt);
        long numberLong = (long) 9223372036854775809D; ////The number exceeds the long literal. We use D to format it to a Double type. (It can be F for a Float type too.)
        System.out.println("numberLong = " + numberLong);

        //Floating Primitive Types - float, double.
        System.out.println("float min value: " + Float.MIN_VALUE + " ,float max value: " + Float.MAX_VALUE);
        System.out.println("double min value: " +Double.MIN_VALUE + " ,double max value: " + Double.MAX_VALUE);

        //Forcing a variable to accept a value.
        float numberFloat = (float) 4.4028235E39;
        System.out.println("numberFloat = " + numberFloat);
        double numberDouble = 1.7976931348623157E308;
        System.out.println("numberDouble = " + numberDouble);

        //Inference in primitive types.
        var numInt = 10;
        System.out.println("numInt = " + numInt);
        var numDoubl = 10.0;
        System.out.println("numDoubl = " + numDoubl);

    }
}
