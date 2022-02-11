public class ConditionalOperators {
    public static void main(String[] args){
        // AND (&&) operator -- all conditions must be true.
        var a = 10;
        var minValue = 0;
        var maxValue = 10;
        var result1 = a >= minValue && a <= maxValue;
        System.out.println("result1 = " + result1);
        var result2 = a > minValue && a < maxValue;
        System.out.println("result2 = " + result2);
        //OR (||) operator -- one condition must be true.
        var vacations = false;
        var restDay = false;
        if(vacations||restDay){
            System.out.println("Today I can chill..");
        }
        else {
            System.out.println("Today I must work..");
        }
    }
}
