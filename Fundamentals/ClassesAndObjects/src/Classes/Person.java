package Classes;
//Person is a class, it's like a blueprint that we will use to create Objects.
public class Person {
    //Class Atributes.
    public String name;
    public String surname;

    //Class Methods
    public void ShowInfo(){
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
    }
}
