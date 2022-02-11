package Employee;

import Domain.*;
//The extends reserved word indicates that the class Employee is a daughter class of Person.
public class Employee extends Person {
    private int idEmployee;
    private double salary;
    private static int employeeCounter;
//The "super" reserved word indicates the Constructor inherited from the father class.
    public Employee(String name, double salary){
        super(name);
        this.idEmployee = ++Employee.employeeCounter;
        this.salary = salary;

    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", idEmployee=" + idEmployee +
                ", salary=" + salary +
                '}';
    }
}
