package Domain;

//The static keyword in Java is used for memory management mainly.
//We can apply static keyword with variables, methods, blocks and nested classes.
//The static keyword belongs to the class than an instance of the class.
//Static methods are associated to Classes, non-static methods are associated to objects.

public class Person {
    private int idPerson;
    private String name;
    private static int personCounter;

    public Person(String name){
        this.name = name;
        //Use static method to increase the counter.
        Person.personCounter++;
        //Add the counter's value to the id.
        this.idPerson = Person.personCounter;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getPersonCounter() {
        return personCounter;
    }

    public static void setPersonCounter(int personCounter) {
        Person.personCounter = personCounter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                ", name='" + name + '\'' +
                '}';
    }
}
