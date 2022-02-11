import java.util.Scanner;

public class TypeConversion {
    public static void main(String args[]){
        //String to Int/Double
        var age = Integer.parseInt("20");
        System.out.println("age = " + (age + 1));

        var piValue = Double.parseDouble("3.1416");
        System.out.println("piValue = " + (piValue*2));

        //Put a value
        var console = new Scanner(System.in);
        System.out.println("How old are you?:");
        age = Integer.parseInt(console.nextLine());
        System.out.println("age = " + age * 4);

        //Int/Double to String
        var ageText = String.valueOf(10);
        System.out.println("ageText = " + ageText + 3);

        //Return a Character
        var character = "hello".charAt(0);
        System.out.println("character = " + character);

        System.out.println("Write a sentence");
        console = new Scanner(System.in);
        character = console.nextLine().charAt(0);
        System.out.println("character = " + character);
    }
}
