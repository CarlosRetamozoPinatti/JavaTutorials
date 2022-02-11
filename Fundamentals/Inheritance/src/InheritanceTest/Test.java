package InheritanceTest;

import Client.Client;
import Employee.Employee;

import java.util.Date;

//We use this to verify the attributes and methods inherited.
public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Charlie", 4000.00);
        System.out.println("employee1 = " + employee1);

        Client client1 = new Client("Marcus", 'M', 28, "B. Zorrilla 23", new Date(), true);
        System.out.println("client1 = " + client1);
    }
}
