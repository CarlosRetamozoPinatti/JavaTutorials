package data;

/*
THIS CLASS WORKS AS INTERFACE, HERE WE DEFINE THE METHODS WE WILL USE LATER.
 */

import domain.Users;
import java.sql.*;
import java.util.*;
import static data.Connec.*;

public class UserJDBC {
    private static final String SQL_SELECT = "SELECT id_user, username, password FROM users";
    private static final String SQL_INSERT = "INSERT INTO users(username, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE users SET username = ?, password = ? WHERE id_user = ?";
    private static final String SQL_DELETE = "DELETE FROM users WHERE id_user = ?";

    public List<Users> select(){
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Users user = null;
        List<Users> users = new ArrayList<>();

        try {
            connection = getConnection();
            stmt = connection.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()){
                int idUser = rs.getInt("id_user");
                String username = rs.getString("username");
                String password = rs.getString("password");

                user = new Users();
                user.setUser_id(idUser);
                user.setUsername(username);
                user.setPassword(password);

                users.add(user);
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
        return users;
    }

    public int insert(Users user) {
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = getConnection();
            stmt = connection.prepareStatement(SQL_INSERT);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());

            System.out.println("Executing Query: " + SQL_INSERT);

            logs = stmt.executeUpdate();

            System.out.println("Affected Logs: " + logs);

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

    public int update(Users user){
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = getConnection();
            stmt = connection.prepareStatement(SQL_UPDATE);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setInt(3, user.getUser_id());

            System.out.println("Executing Query: " + SQL_UPDATE);

            logs = stmt.executeUpdate();

            System.out.println("Updated Logs: " + logs);

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

    public int delete(Users user){
        Connection connection = null;
        PreparedStatement stmt = null;
        int logs = 0;
        try {
            connection = getConnection();
            stmt = connection.prepareStatement(SQL_DELETE);
            stmt.setInt(1, user.getUser_id());

            System.out.println("Executing Query: " + SQL_DELETE);

            logs = stmt.executeUpdate();

            System.out.println("Remaining Logs: " + logs);

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
