//Boolean types only have two values. True or False.

public class PrimitiveBooleanType {
    public static void main(String args[]){
        boolean varBool = false;
        System.out.println("varBool = " + varBool);

        if(varBool){
            System.out.println("Its True!");
        }
        else{
            System.out.println("Its False!");
        }

        //Example
        var age = 10;
        if(age >= 18){
            System.out.println("It's an adult!");
        }
        else {
            System.out.println("It's a child!");
        }
    }
}
