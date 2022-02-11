package operations;

public class TestOperations {
    public static void main(String[] args) {
        //Here we can select between the args the method should use.
        var result = Operations.add(100.5 , 200.75);
        System.out.println("Method with Double");
        System.out.println("result = " + result);
        var result2 = Operations.add(5, 7);
        System.out.println("Method with Int");
        System.out.println("result2 = " + result2);
        var result3 = Operations.add(50, 3L);
        System.out.println("Method Guessing");
        System.out.println("result3 = " + result3);
    }
}
