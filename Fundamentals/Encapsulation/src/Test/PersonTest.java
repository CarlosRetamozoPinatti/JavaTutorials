package Test;

import Domain.Person;
//Once Encapsulated, attributes cannot be called or modified by the normal ways.
//To do that, we must use the Getters and Setters created in the root class.
public class PersonTest {
    public static void main(String[] args) {
        Person person01 = new Person("John", 5000.00, false);
        System.out.println("person01 name = " + person01.getName());
        person01.setName("Joseph");
        System.out.println("person01 new name = " + person01.getName());
//Using the ToString Method.
        System.out.println("person01 = " + person01);

    }
}
