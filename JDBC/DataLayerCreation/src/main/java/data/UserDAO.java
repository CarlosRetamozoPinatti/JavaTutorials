package data;

import domain.UsersDTO;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    public List<UsersDTO> select() throws SQLException;

    public int insert(UsersDTO user) throws SQLException;

    public int update(UsersDTO user) throws SQLException;

    public int delete(UsersDTO user) throws SQLException;
}
