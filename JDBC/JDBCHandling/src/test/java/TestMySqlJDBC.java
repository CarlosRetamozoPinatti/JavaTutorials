/*
To use JDBC, we need to create a Maven Project.

First, we configure the Maven pom.xml, adding the MySQL dependencies.

    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.28</version>
        </dependency>
    </dependencies>

Then, we configure the next parameters to start a connection.
 */


import java.sql.*;


public class TestMySqlJDBC {
    public static void main(String[] args) {
        String url = "JDBC:mysql://127.0.0.1:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver"); this line is not always required.
            Connection connection = DriverManager.getConnection(url, "root", "admin01"); //Here are the sentences needed to connect to the database
            Statement instruction = connection.createStatement(); //Here are the sentences needed to connect to the database
            var sql = "SELECT id_person, name, lastname, email, phone FROM person"; //This is the query we will send to the db.
            ResultSet resultSet = instruction.executeQuery(sql); //This is the command to execute the query via java.
            //The next cycle will take the results of the previous query and print them on console.
            while (resultSet.next()) {
                System.out.print("Person ID: " + resultSet.getInt("id_person") + ",");
                System.out.print(" Name: " + resultSet.getString("name") + ",");
                System.out.print(" Last Name: " + resultSet.getString("lastname") + ",");
                System.out.print(" Email: " + resultSet.getString("email") + ",");
                System.out.print(" Phone: " + resultSet.getString("phone"));
                System.out.println(" ");
            }
            //Finally, we close the connections.
            resultSet.close();
            instruction.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
    }
}
