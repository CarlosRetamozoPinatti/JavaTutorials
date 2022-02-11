package Domain;
//Encapsulation is making the variables of one class private/restricted to access from other classes.
public class Person {
    private String name;
    private Double salary;
    private boolean eliminated;

    public Person(String name, Double salary, boolean eliminated){
        this.name = name;
        this.salary = salary;
        this.eliminated = eliminated;
    }
//The Only way to see/use the values is through Getters and Setters.
//Getters are used to retrieve private values of attributes from the object.
//Setters are used to modify the values from private attributes.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public boolean isEliminated() {
        return eliminated;
    }

    public void setEliminated(boolean eliminated) {
        this.eliminated = eliminated;
    }
//The ToString method allows us to call all the attributes at once.
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", eliminated=" + eliminated +
                '}';
    }
}
