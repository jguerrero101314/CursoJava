package datos;

import domain.*;
import java.sql.*;
import java.util.*;

public interface PersonaDao {
    
    public List<PersonaDTO> select() throws SQLException;
    
    public int insert(PersonaDTO persona) throws SQLException;
    
    public int update(PersonaDTO persona) throws SQLException;
    
    public int delete(PersonaDTO persona) throws SQLException;
}
