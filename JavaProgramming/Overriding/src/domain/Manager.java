package domain;
//Overriding means that a method used in the daughter class modifies the properties of the father class.
//Here we create the daughter class which will modify the father class.
public class Manager extends Employee{

    private String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }
    //Here we override the father class method, adding the department attribute.
    @Override
    public String getDetails(){
        return super.getDetails() + ", department: " + this.department;

    }


}
