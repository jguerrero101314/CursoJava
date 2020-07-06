
import datos.*;

import domain.*;
import java.sql.*;
import java.util.List;



public class ManejoUsuarios {

    public static void main(String[] args) {
       
        Connection conexion = null;
        
        try {
            conexion = ConexionBD.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
           UsuarioDao personaDao = new UsuarioDaoJDBC(conexion);

            List<UsuarioDTO> personas = personaDao.select();

            for (UsuarioDTO persona : personas) {
                System.out.println("Persona DTO:" + persona);
            }
            
            conexion.commit();
            
           
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
             System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }

}
