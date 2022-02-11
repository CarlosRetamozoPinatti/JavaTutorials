//These operators will compare two values and return a boolean result

public class RelationalOperators {
    public static void main(String[] args){
        var a = 10;
        var b = 2;
        //Greater than or equal
        var c = b>=a;
        System.out.println("c = " + c);
        //Smaller than or equal
        c = b<=a;
        System.out.println("c = " + c);
        //even or odd
        if(a%2==0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

    }
}
