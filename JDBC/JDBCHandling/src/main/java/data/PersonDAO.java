package data;

/*
THIS CLASS WORKS AS INTERFACE, HERE WE DEFINE THE METHODS WE WILL USE LATER.
 */

import domain.Person;
import java.sql.*;
import java.util.*;
import static data.Connec.*;

public class PersonDAO {
    private static final String SQL_SELECT = "SELECT id_person, name, lastname, email, phone FROM person";
    private static final String SQL_INSERT = "INSERT INTO person(name, lastname, email, phone) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE person SET name = ?, lastname = ?, email = ?, phone = ? WHERE id_person = ?";
    private static final String SQL_DELETE = "DELETE FROM person WHERE id_person = ?";

    public List<Person> select(){
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Person person = null;
        List<Person> persons = new ArrayList<>();

        try {
            connection = getConnection();
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
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        finally {
            try {
                close(rs);
                close(stmt);
                close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return persons;
    }

    public int insert(Person person) {
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = getConnection();
            stmt = connection.prepareStatement(SQL_INSERT);
            stmt.setString(1, person.getName());
            stmt.setString(2, person.getLastName());
            stmt.setString(3, person.getEmail());
            stmt.setString(4, person.getPhone());
            logs = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(connection);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return logs;
    }

    public int update(Person person){
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = getConnection();
            stmt = connection.prepareStatement(SQL_UPDATE);
            stmt.setString(1, person.getName());
            stmt.setString(2, person.getLastName());
            stmt.setString(3, person.getEmail());
            stmt.setString(4, person.getPhone());
            stmt.setInt(5, person.getIdPerson());
            logs = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        finally {
            try {
                close(stmt);
                close(connection);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return logs;
    }

    public int delete(Person person){
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = getConnection();
            stmt = connection.prepareStatement(SQL_DELETE);
            stmt.setInt(1, person.getIdPerson());
            logs = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        finally {
            try {
                close(stmt);
                close(connection);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return logs;
    }
}

