package test;
//In the Object Class, we have methods to verify if two objects are the same.
//One is Equals(), which works as a boolean.
//The other is Hashcode(), which assigns an integer and then compares the values of these numbers.
import domain.Employee;

public class ObjectClassTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 5000);
        Employee employee2 = new Employee("John", 5000);

        if (employee1 == employee2){
            System.out.println("They are the same thing..");
        }
        else {
            System.out.println("They are not the same thing...");
        }
        //Running the code, we see that they are not the same, despite having the same values.
        //That happens because they are allocated in different memory spaces.

        //Here we compare the objects with equals and hashcode.
        if (employee1.equals(employee2)){
            System.out.println("The objects contains the same args");
        }
        else {
            System.out.println("The objects NOT contains the same args");
        }

        if (employee1.hashCode() == employee2.hashCode()){
            System.out.println("Hashcodes are the same");

        }
        else {
            System.out.println("Hashcodes are not the same");
        }
    }
}
