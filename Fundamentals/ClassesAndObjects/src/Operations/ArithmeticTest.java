package Operations;

public class ArithmeticTest {
    public static void main(String[] args) {
        Arithmetic values01 = new Arithmetic();
        values01.a = 4;
        values01.b = 9;
        //Testing the Method with Void.
        System.out.println("Method with void");
        values01.addition();
        //Testing the Method with return.
        System.out.println("Method with return");
        int result = values01.addWithReturn();
        System.out.println("result with return = " + result);
        //Testing the Method with Args and Return.
        System.out.println("Method with arguments and return");
        result = values01.addWithArgs(15, 20);
        System.out.println("result with args and return = " + result);
        //Testing the empty constructor.
        Arithmetic const01 = new Arithmetic();
        System.out.println("const01 a: " + const01.a);
        System.out.println("const01 b: " + const01.b);
        //Testing the constructor with args.
        Arithmetic const02 = new Arithmetic(10, 7);
        System.out.println("const02 a: " + const02.a);
        System.out.println("const02 b: " + const02.b);
    }
}
