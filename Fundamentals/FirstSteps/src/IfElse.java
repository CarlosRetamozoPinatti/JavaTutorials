import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        var condition = true;
        //Control Sentence If-Else evaluates the variable's value with a boolean. If it's true, Executes one line. If it's not, executes the other one.
        if(condition){
            System.out.println("Condition is true");
        }
        //Else is optional in some cases
        else{
            System.out.println("Condition is false");
        }
        //Example Exercise
        System.out.println("Which month is?:");
        Scanner data = new Scanner(System.in);
        int month = Integer.parseInt(data.nextLine());
        if(month == 12 ||month == 1 ||month == 2){
            System.out.println("It's Winter!!");
        }
        else if(month == 3 || month == 4 || month == 5){
            System.out.println("It's Spring!!");
        }
        else if(month == 6 || month == 7 || month == 8){
            System.out.println("It's Summer!!");
        }
        else if(month == 9 || month == 10 || month == 11){
            System.out.println("It's Autumn!!");
        }
        else{
            System.out.println("That's not a month....");
        }
    }
}
