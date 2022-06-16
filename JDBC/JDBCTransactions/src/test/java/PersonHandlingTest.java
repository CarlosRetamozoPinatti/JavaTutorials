import data.Connec;
import data.PersonJDBC;
import domain.Person;

import java.sql.*;
import java.util.List;
//Here we create from scratch the test class.
public class PersonHandlingTest {
    public static void main(String[] args) {

        Connection connection = null;
//Here we give multiple orders to execute in a single action, using the transaction.
        try {
            connection = Connec.getConnection();
            //The next sentence disables the Auto-Commit, and letting perform the save manually.
            if (connection.getAutoCommit()){
                connection.setAutoCommit(false);
            }

            PersonJDBC personJDBC = new PersonJDBC(connection);

            Person updatePerson = new Person();
            updatePerson.setIdPerson(2);
            updatePerson.setName("Janie");
            updatePerson.setLastName("Jones");
            updatePerson.setEmail("janiejones@mail.com");
            updatePerson.setPhone("333221");

            personJDBC.update(updatePerson);

            Person newPerson = new Person();
            newPerson.setName("Howie");
            newPerson.setLastName("Randall");
            newPerson.setEmail("HRdall@mail.com");
            newPerson.setPhone("7778811");

            personJDBC.insert(newPerson);

            connection.commit();

        }
        catch (SQLException e) {
            e.printStackTrace(System.out);
            System.out.println("Rollback..");
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }


    }
}
