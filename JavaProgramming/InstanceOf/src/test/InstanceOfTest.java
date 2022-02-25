package test;

import domain.Employee;
import domain.Manager;
//Instance Of let us determine the type created, in run-time execution.
public class InstanceOfTest {
    public static void main(String[] args) {
        Employee emp01 = new Employee("Jake", 5000);
        determinateType(emp01);

        Manager manager = new Manager("Maria", 10000, "HR");
        determinateType(manager);
    }
//To use the instanceof correctly, we must follow the hierarchy of classes. First daughters, then Father.
//We can call methods from the classes, or convert classes to access other methods.
//CONVERSION ONLY WORKS -- FATHER --> DAUGHTER. NOT BACKWARDS. IT WILL CRASH OTHERWISE.
    public static void determinateType(Employee employee){
        if (employee instanceof Manager){
            System.out.println("It's Manager Type.");
            //This syntax is a type conversion. So the Father class can use Daughter Class methods.
            Manager manager = (Manager)employee;
            System.out.println("Manager of: " + manager.getDepartment());
            //We can do it in one line using the next syntax: ((Manager) employee).getDepartment();
        }
        else if (employee instanceof Employee){
            System.out.println("It's Employee Type.");
            System.out.println("Employee name: " + employee.getName());
        }
        else if (employee instanceof Object){
            System.out.println("It's Object Type.");
            employee.toString();
        }

    }

}
