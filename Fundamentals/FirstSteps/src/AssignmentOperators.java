public class AssignmentOperators {
    public static void main(String args[]){
        int a = 4, b = 5;
        int c = (a + b) * 2; //We assign an operation to a variable, and its result will be the final value.
        System.out.println("c = " + c);

        a += 4; //Equals a = a + 4.
        System.out.println("a = " + a);

        b -= 3; //Equals b = b - 3.
        System.out.println("b = " + b);

        b *= 4; //Equals b = b * 4.
        System.out.println("b = " + b);

        a /= 2; //Equals a = a / 2.
        System.out.println("a = " + a);

        b %= 2; //Equals b = b % 2.
        System.out.println("b = " + b);
    }
}
