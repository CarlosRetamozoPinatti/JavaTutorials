import data.Connec;
import data.UserDAOJDBC;
import domain.UsersDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserHandlingTest {

    public static void main(String[] args) {

        Connection connection = null;
//Here we give multiple orders to execute in a single action, using the transaction.
        try {
            connection = Connec.getConnection();
            //The next sentence disables the Auto-Commit, and letting perform the save manually.
            if (connection.getAutoCommit()){
                connection.setAutoCommit(false);
            }

            UserDAOJDBC userDAOJDBC = new UserDAOJDBC(connection);

            List<UsersDTO> users = userDAOJDBC.select();

            for (UsersDTO user: users ){
            System.out.println("User: " + user);

        }
            connection.commit();
            System.out.println("A commit has been made");


    } catch (SQLException e) {
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

