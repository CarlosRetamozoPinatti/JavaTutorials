package arrays;

import domain.Person;
//Arrays with Objects works the same way it works with values.
public class ObjectArrayTest {
    public static void main(String[] args) {
        Person persons[] = new Person[3];
        persons[0] = new Person("Charlie");
        persons[1] = new Person("Bravo");
        persons[2] = new Person("Alpha");
        System.out.println("persons[0] = " + persons[0]);
        System.out.println("persons[1] = " + persons[1]);
        System.out.println("persons[2] = " + persons[2]);
//We use a For cycle to iterate through all items of the Array.

        for (int i = 0; i < persons.length; i++){
            System.out.println("persons = " + persons[i]);
        }
    }
}
