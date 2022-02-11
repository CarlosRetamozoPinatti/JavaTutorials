public class ArithmeticOperators {
    public static void main(String args[]){
        int a = 3, b = 6;
        //Add
        var addResult = a + b;
        System.out.println("addResult = " + addResult);
        //Subtract
        var subtractResult = a - b;
        System.out.println("subtractResult = " + subtractResult);
        //Multiply
        var multiplyResult = a * b;
        System.out.println("multiplyResult = " + multiplyResult);
        //Divide (Here the result will depend on type of the variables)
        var divideResult = (a / b); //the expected result is 0, because is an integer division
        System.out.println("divideResult = " + divideResult);
        var divideResult2 = (12.5 / b); // the expected result is 2.08, because is a float/double division
        System.out.println("divideResult2 = " + divideResult2);
        //Division Module
        var moduleResult = b % a;
        System.out.println("moduleResult = " + moduleResult);

        //Example - Is a number even?
        if(b%2 == 0){
            System.out.println("Is Even");
        }
        else {
            System.out.println("Is not Even");
        }
    }
}
