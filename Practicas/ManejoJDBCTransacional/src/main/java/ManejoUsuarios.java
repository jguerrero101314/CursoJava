
import datos.ConexionBD;
import datos.UsuarioJDBC;
import domain.Usuario;
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
           UsuarioJDBC usuarioJdbc = new UsuarioJDBC(conexion);
           Usuario cambioUsuario = new Usuario();
           cambioUsuario.setId_usuario(3);
           cambioUsuario.setUsuario("Joel");
           cambioUsuario.setPassword("admin");
           usuarioJdbc.update(cambioUsuario);
           
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setUsuario("Ruth");
            nuevoUsuario.setPassword("12345");
            usuarioJdbc.insert(nuevoUsuario);
            
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
