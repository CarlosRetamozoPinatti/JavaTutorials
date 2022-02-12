package test;

import domain.Person;
//If we execute this, we can see the execution order of the blocks.
public class InitializerBlockTest {
    public static void main(String[] args) {
        Person person01 = new Person();
        System.out.println("person01 = " + person01);
        Person person02 = new Person();
        System.out.println("person02 = " + person02);
    }

}
