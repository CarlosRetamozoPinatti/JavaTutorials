package data;


import domain.PersonDTO;
import java.sql.*;
import java.util.*;
import static data.Connec.*;

public class PersonDAOJDBC implements PersonDAO {
    //First, we create a new Connection attribute.
    private Connection tranConn;

    //Then, we create the constructors.
    public PersonDAOJDBC(){
    }

    public PersonDAOJDBC(Connection tranConn){
        this.tranConn = tranConn;
    }

    private static final String SQL_SELECT = "SELECT id_person, name, lastname, email, phone FROM person";
    private static final String SQL_INSERT = "INSERT INTO person(name, lastname, email, phone) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE person SET name = ?, lastname = ?, email = ?, phone = ? WHERE id_person = ?";
    private static final String SQL_DELETE = "DELETE FROM person WHERE id_person = ?";

    public List<PersonDTO> select() throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PersonDTO personDTO = null;
        List<PersonDTO> personDTOS = new ArrayList<>();

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

                personDTO = new PersonDTO(idPerson, name, lastname, email, phone);

                personDTOS.add(personDTO);

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
        return personDTOS;
    }

    public int insert(PersonDTO personDTO) throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = this.tranConn != null ? this.tranConn : getConnection();
            stmt = connection.prepareStatement(SQL_INSERT);
            stmt.setString(1, personDTO.getName());
            stmt.setString(2, personDTO.getLastName());
            stmt.setString(3, personDTO.getEmail());
            stmt.setString(4, personDTO.getPhone());
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

    public int update(PersonDTO personDTO) throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = this.tranConn != null ? this.tranConn : getConnection();
            stmt = connection.prepareStatement(SQL_UPDATE);
            stmt.setString(1, personDTO.getName());
            stmt.setString(2, personDTO.getLastName());
            stmt.setString(3, personDTO.getEmail());
            stmt.setString(4, personDTO.getPhone());
            stmt.setInt(5, personDTO.getIdPerson());
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

    public int delete(PersonDTO personDTO) throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = this.tranConn != null ? this.tranConn : getConnection();
            stmt = connection.prepareStatement(SQL_DELETE);
            stmt.setInt(1, personDTO.getIdPerson());
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

