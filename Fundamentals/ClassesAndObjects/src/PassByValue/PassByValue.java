package PassByValue;
//Pass by Value copies the value of the variable used by the method.
public class PassByValue {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        valueChange(x);
    }
    public static void valueChange(int arg1){
        System.out.println("arg1 = " + arg1);
    }
}
