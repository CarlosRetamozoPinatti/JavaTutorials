package test;

/*
To work with Polymorphism we need:
    -   A Father class and a Daughter class.
    -   Understand the concept of Overriding.
    -   Override a Method in the Daughter Class.
 */

import domain.Employee;
import domain.Manager;
//Polymorphism is the reference of multiple behaviors.
//We only see Polymorphism in action in the run-time execution, not in the compiler.
public class PolymorphismTest {
    public static void main(String[] args) {
        Employee emp01 = new Employee("Jake", 5000);
        print(emp01);

        Manager manager = new Manager("Maria", 10000, "HR");
        //Here is where we see Polymorphism. The method defined in the Father class, is used in the modified method of the daughter class.
        //The names are the same but the functions are different, and with polymorphism we can name it once and use it differently.
        print(manager);


    }

    public static void print(Employee employee){
        System.out.println("employee = " + employee.getDetails());

    }

}
