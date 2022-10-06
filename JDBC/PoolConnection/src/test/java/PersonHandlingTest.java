import data.PersonDAO;
import domain.Person;

import java.util.List;

public class PersonHandlingTest {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
/*
        //Insert a new person object
        Person newPerson = new Person("Charlie", "Hebdo", "chddd@mail.net", "4443312");
        personDAO.insert(newPerson);

        //Update a person object
        Person personUpdate = new Person(4, "Ramon", "Valdez", "RM@mail.net", "4443332");
        personDAO.update(personUpdate);

        //Delete a person object
        Person personDelete = new Person(4);
        personDAO.delete(personDelete);
*/
        //List all person in database
        List<Person> people = personDAO.select();
        for (Person person: people){
            System.out.println("person = " + person);
        }
    }
}
