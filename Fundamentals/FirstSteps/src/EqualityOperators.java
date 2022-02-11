//These operators will compare two values and return a boolean result

public class EqualityOperators {
    public static void main(String[] args){
        var a = 3;
        var b = 5;
        //Equals
        var c = (a == b);
        System.out.println("c = " + c);
        //Differs
        var d = (a != b);
        System.out.println("d = " + d);
        //Compare object references
        var string1 = "Hello";
        var string2 = "Goodbye";
        var e = string1 == string2;
        System.out.println("e = " + e);
        //Compare string content
        var f = string1.equals(string2);
        System.out.println("f = " + f);

    }
}
