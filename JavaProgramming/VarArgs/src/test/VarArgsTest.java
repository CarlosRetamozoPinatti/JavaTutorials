package test;

//Variable Arguments works the same way as Array, but we dont have to define early how many args we are going to use.

public class VarArgsTest {
    public static void main(String[] args) {
        //As we can see, its not necessary to define a fixed number of elements
        printNumbers(3, 4, 5);
        printNumbers(1, 2);
        someParameters("John", 3, 5, 7, 9);

    }
//Variable Arguments are stated with the three dots. It means we dont know how many args we gonna use.

    private static void printNumbers(int... numbers){
        for (int i = 0; i <numbers.length; i++){
            System.out.println("Element: " + numbers[i]);
        }
    }
//If we have various args defined in a method, the variable args MUST go last.
    private static void someParameters(String name, int... numbers){
        System.out.println("name : " + name);
        printNumbers(numbers);
    }



}
