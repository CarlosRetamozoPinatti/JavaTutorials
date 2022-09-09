package data;


import domain.PersonDTO;
import domain.UsersDTO;
import java.sql.*;
import java.util.*;
import static data.Connec.*;

public class UserDAOJDBC implements UserDAO {

    private Connection tranConn;

    public UserDAOJDBC() {
    }

    public UserDAOJDBC(Connection tranConn) {
        this.tranConn = tranConn;
    }

    private static final String SQL_SELECT = "SELECT id_user, username, password FROM users";
    private static final String SQL_INSERT = "INSERT INTO users(username, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE users SET username = ?, password = ? WHERE id_user = ?";
    private static final String SQL_DELETE = "DELETE FROM users WHERE id_user = ?";

    public List<UsersDTO> select() throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        UsersDTO user = null;
        List<UsersDTO> users = new ArrayList<>();

        try {
            //Here we try the transactional connection.
            //If there's no transaction, it will execute the connection from the predefined block.
            connection = this.tranConn != null ? this.tranConn : getConnection();
            stmt = connection.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int user_id = rs.getInt("id_user");
                String username = rs.getString("username");
                String password = rs.getString("password");

                user = new UsersDTO(user_id, username, password);

                users.add(user);

            }
        } finally {
            try {
                close(rs);
                close(stmt);
                //Here, if there's no transaction, the next sentence will close the local connection.
                if (this.tranConn == null) {
                    close(connection);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return users;
    }

    public int insert(UsersDTO usersDTO) throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = this.tranConn != null ? this.tranConn : getConnection();
            stmt = connection.prepareStatement(SQL_INSERT);
            stmt.setString(1, usersDTO.getUsername());
            stmt.setString(2, usersDTO.getPassword());

            System.out.println("Executing Query:" + SQL_INSERT);
            logs = stmt.executeUpdate();
            System.out.println("Modified logs:" + logs);
        } finally {
            try {
                close(stmt);
                if (this.tranConn == null) {
                    close(connection);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return logs;
    }

    public int update(UsersDTO usersDTO) throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = this.tranConn != null ? this.tranConn : getConnection();
            System.out.println("Executing Query: " + SQL_UPDATE);
            stmt = connection.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usersDTO.getUsername());
            stmt.setString(2, usersDTO.getPassword());
            stmt.setInt(3, usersDTO.getUser_id());

            logs = stmt.executeUpdate();
            System.out.println("Updated Logs:" + logs);
        } finally {
            try {
                close(stmt);
                if (this.tranConn == null) {
                    close(connection);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return logs;
    }

    public int delete(UsersDTO usersDTO) throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = this.tranConn != null ? this.tranConn : getConnection();
            System.out.println("Executing Query: " + SQL_DELETE);
            stmt = connection.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usersDTO.getUser_id());
            logs = stmt.executeUpdate();
            System.out.println("Deleted logs: " + logs);
        } finally {
            try {
                close(stmt);
                if (this.tranConn == null) {
                    close(connection);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return logs;
    }
}
