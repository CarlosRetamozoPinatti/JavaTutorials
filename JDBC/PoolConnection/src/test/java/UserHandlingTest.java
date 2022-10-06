import data.UserJDBC;
import domain.Users;

import java.util.List;

public class UserHandlingTest {
    public static void main(String[] args) {
        UserJDBC userJDBC = new UserJDBC();

        //Test Select
        List<Users> users = userJDBC.select();
        for (Users user: users ){
            System.out.println("User: " + user);
        }

        //Test Insert
        /*Users user = new Users("ILuvTeets", "3142");
        userJDBC.insert(user);*/

        //Test Update
        /*Users user = new Users(1, "john.doe", "456");
        userJDBC.update(user);*/

        //Test Delete
        //userJDBC.delete(new Users(2));
    }
}
