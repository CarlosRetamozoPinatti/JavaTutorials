package data;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;

/*
Connection pooling is a well-known data access pattern,
whose main purpose is to reduce the overhead involved in performing database connections and read/write database operations.

In a nutshell, a connection pool is, at the most basic level,
a database connection cache implementation,
which can be configured to suit specific requirements.

First, we need to download the proper dependencies:
- Apache Commons
- Dbcp2
We do this in the Pom.xml file
 */

public class Connec {
    private static final String JDBC_URL = "JDBC:mysql://127.0.0.1:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "admin01";

//Then, we create the pool connection initializing method
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASS);
        //Then, we define the initial amount of connections
        ds.setInitialSize(5);
        return ds;
    }
//Now, we use the getDataSource method
    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(Statement statement) throws SQLException {
        statement.close();
    }

    public static void close(PreparedStatement statement) throws SQLException {
        statement.close();
    }

    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}
