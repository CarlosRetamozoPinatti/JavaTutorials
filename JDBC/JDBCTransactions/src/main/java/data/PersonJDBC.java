package data;

/*
THIS CLASS WORKS AS INTERFACE, HERE WE DEFINE THE METHODS WE WILL USE LATER.
 */

/*
In database systems, transactions are designed to preserve data integrity by grouping multiple statements to be executed as a single unit.
In a transaction, either all of the statements are executed, or none of the statements is executed.
If any statement failed to execute, the whole transaction is aborted and the database is rolled back to the previous state.
This assures the data is kept consistence in the events of network problems, software errors, etc.
 */

import domain.Person;
import java.sql.*;
import java.util.*;
import static data.Connec.*;

public class PersonJDBC {
    //First, we create a new Connection attribute.
    private Connection tranConn;

    //Then, we create the constructors.
    public PersonJDBC(){
    }

    public PersonJDBC(Connection tranConn){
        this.tranConn = tranConn;
    }

    private static final String SQL_SELECT = "SELECT id_person, name, lastname, email, phone FROM person";
    private static final String SQL_INSERT = "INSERT INTO person(name, lastname, email, phone) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE person SET name = ?, lastname = ?, email = ?, phone = ? WHERE id_person = ?";
    private static final String SQL_DELETE = "DELETE FROM person WHERE id_person = ?";

    public List<Person> select() throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Person person = null;
        List<Person> persons = new ArrayList<>();

        try {
            //Here we try the transactional connection.
            //If there's no transaction, it will execute the connection from the predefined block.
            connection = this.tranConn != null ? this.tranConn : getConnection();
            stmt = connection.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()){
                int idPerson = rs.getInt("id_person");
                String name = rs.getString("name");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");
                String phone = rs.getString("phone");

                person = new Person(idPerson, name, lastname, email, phone);

                persons.add(person);

            }
        }
        finally {
            try {
                close(rs);
                close(stmt);
                //Here, if there's no transaction, the next sentence will close the local connection.
                if (this.tranConn == null){
                close(connection);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return persons;
    }

    public int insert(Person person) throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = this.tranConn != null ? this.tranConn : getConnection();
            stmt = connection.prepareStatement(SQL_INSERT);
            stmt.setString(1, person.getName());
            stmt.setString(2, person.getLastName());
            stmt.setString(3, person.getEmail());
            stmt.setString(4, person.getPhone());
            logs = stmt.executeUpdate();
        }  finally {
            try {
                close(stmt);
                if (this.tranConn == null){
                    close(connection);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return logs;
    }

    public int update(Person person) throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = this.tranConn != null ? this.tranConn : getConnection();
            stmt = connection.prepareStatement(SQL_UPDATE);
            stmt.setString(1, person.getName());
            stmt.setString(2, person.getLastName());
            stmt.setString(3, person.getEmail());
            stmt.setString(4, person.getPhone());
            stmt.setInt(5, person.getIdPerson());
            logs = stmt.executeUpdate();
        }
        finally {
            try {
                close(stmt);
                if (this.tranConn == null){
                    close(connection);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return logs;
    }

    public int delete(Person person) throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = this.tranConn != null ? this.tranConn : getConnection();
            stmt = connection.prepareStatement(SQL_DELETE);
            stmt.setInt(1, person.getIdPerson());
            logs = stmt.executeUpdate();
        }
        finally {
            try {
                close(stmt);
                if (this.tranConn == null){
                    close(connection);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return logs;
    }
}

