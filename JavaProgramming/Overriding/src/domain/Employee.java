package domain;
//Overriding means that a method used in the daughter class modifies the properties of the father class.
//Here we create a Father class which will be modified.
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
}
