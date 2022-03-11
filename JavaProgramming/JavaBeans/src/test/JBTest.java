package test;
/*
Why use JavaBean?
According to Java white paper, it is a reusable software component.
A bean encapsulates many objects into one object so that we can access this object from multiple places.
Moreover, it provides easy maintenance.
 */
import domain.Person;

public class JBTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setLastname("Doe");

        System.out.println("Person = " + person);
        System.out.println("Person name = " + person.getName());
        System.out.println("Person last name = " + person.getLastname());
    }

}
