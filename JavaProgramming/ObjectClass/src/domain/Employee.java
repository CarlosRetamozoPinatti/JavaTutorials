package domain;

import java.util.Objects;

public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getDetails(){
        return "Name: " + this.name + ", Salary: " + this.salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", salary=" + salary +
                '}';
    }
    //These methods allow us to compare in a more specific way two objects.
    //Basically, Hashcode assigns a unique integer value to the object. Thus, it can be compared outside the memory allocation.
    //Equals compare the main class with the object class. If they are the same, in memory, it compares the content of the objects.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}
