package PassByReference;

import Classes.Person;
//Pass by Reference changes an object's attribute's value, by using another Method. Passing by the Memory Reference.
public class PassByReference {
    public static void main(String[] args) {
        Person person01 = new Person();
        person01.name = "Eric";
        System.out.println("person01 = " + person01.name);
        person01 = changeValue(person01);
        System.out.println("person01 = " + person01.name);
    }
    public static Person changeValue(Person person){
        person.name = "Wendy";
        return person;
    }

}
