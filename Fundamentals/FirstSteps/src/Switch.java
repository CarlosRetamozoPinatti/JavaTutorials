import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //Switch Structure evaluates a non-boolean value and according to this value, gives a result.
        //Following the If-Else example for Seasons of the year.
        System.out.println("Which month is it?");
        Scanner data = new Scanner(System.in);
        var month = Integer.parseInt(data.nextLine());
        switch (month){
            case 1: case 2: case 12:
                System.out.println("It's Winter!!");
                break;
            case 3: case 4: case 5:
                System.out.println("It's Spring!!");
                break;
            case 6: case 7: case 8:
                System.out.println("It's Summer!!");
                break;
            case 9: case 10: case 11:
                System.out.println("It's Autumn!!");
                break;
            default:
                System.out.println("That's not a valid month..");
        }
    }
}
