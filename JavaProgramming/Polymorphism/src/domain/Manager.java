package domain;

public class Manager extends Employee{

    private String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    @Override
    public String getDetails(){
        return super.getDetails() + ", department: " + this.department;

    }


}
