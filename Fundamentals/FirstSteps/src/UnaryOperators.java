public class UnaryOperators {
    public static void main(String args[]){
        //Sign inversion
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //Boolean negation
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        //Pre increment
        var e = 4;
        var f = ++e; //e adds 1 and then puts its value to f
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //Post increment
        var g = 5;
        var h = g++; //h takes g's value and then g adds 1
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        //Pre decrease
        var i = 3;
        var j = --i; //Same as pre increment but subtracting
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //Post decrease
        var k = 3;
        var n = k--; //Same as post decrement but subtracting
        System.out.println("k = " + k);
        System.out.println("n = " + n);
    }
}
