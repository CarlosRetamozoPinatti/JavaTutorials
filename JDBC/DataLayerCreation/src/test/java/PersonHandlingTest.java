import data.Connec;
import data.PersonDAO;
import data.PersonDAOJDBC;
import domain.PersonDTO;

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

            PersonDAO personDAO = new PersonDAOJDBC(connection);

            List<PersonDTO> persons = personDAO.select();

            for (PersonDTO person: persons){
                System.out.println("Person DTO: " + person);
            }


            connection.commit();
            System.out.println("A commit has been made..");

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
