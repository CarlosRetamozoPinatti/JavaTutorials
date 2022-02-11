package PersonTest;

import Domain.Person;
//The object is created based on the Person Class, and the static method adds 1 to the counter.
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Jane");
        Person person3 = new Person("Bob");
        print(person1);
        print(person2);
        print(person3);

    }
    public static void print(Person person){
        System.out.println("person = " + person);
    }
}
