package data;

import domain.PersonDTO;

import java.sql.SQLException;
import java.util.List;

public interface PersonDAO {

    public List<PersonDTO> select() throws SQLException;

    public int insert(PersonDTO person) throws SQLException;

    public int update(PersonDTO person) throws SQLException;

    public int delete(PersonDTO person) throws SQLException;
}
