package Classes;
//We use the Person Template to create Objects, like a Blueprint.
public class PersonTest01 {
    public static void main(String[] args) {
        //Create and fill the data of the Class to create the person01 Object. This is an Instance of the Person Class.
        Person person01 = new Person();
        person01.name = "Charlie";
        person01.surname = "Brown";
        person01.ShowInfo();
        //Not putting any info will return Null values.
        Person person02 = new Person();
        person02.ShowInfo();
        //Calling out the object itself, it shows the RAM memory block where it is allocated.
        System.out.println("person01 = " + person01);
        System.out.println("person02 = " + person02);

    }
}
