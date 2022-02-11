import java.util.Scanner;

//Scanner function let the user put values into the variables.
public class ScannerFunction {
    public static void main(String args[]) {
        System.out.println("What is your name?");
        //Here, with the Scanner function, we ask the user to put in the values.
        Scanner keyboard = new Scanner(System.in);
        //nextLine puts the last string written on the console as variable value.
        var name = keyboard.nextLine();
        System.out.println("Hello "+ name);
        System.out.println("How old are you?");
        //We use the same function to scan again.
        keyboard = new Scanner(System.in);
        //And put the new value to another variable.
        var age = keyboard.nextLine();
        System.out.println("Ahh.. you're " + age + " years old...");

    }
}
