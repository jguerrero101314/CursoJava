
import datos.*;
import domain.*;
import java.sql.*;



public class ManejoPersonas {

    public static void main(String[] args) {
            
         Connection conexion = null;
        try {
            conexion = ConexionBD.getConnection();
            if( conexion.getAutoCommit()){
                 conexion.setAutoCommit(false);
            }
             PersonaJDBC personaJdbc = new PersonaJDBC(conexion);
             Persona cambioPersona = new Persona();
             cambioPersona.setId_persona(2);
             cambioPersona.setNombre("Jose2");
             cambioPersona.setApellido("Gomez");
             cambioPersona.setEmail("j@hotmail.com");
             cambioPersona.setTelefono("345-3453");
             personaJdbc.update(cambioPersona);
             
             Persona nuevaPersona = new Persona();
             nuevaPersona.setNombre("Ruth");
             nuevaPersona.setApellido("Lara");         
             personaJdbc.insert(nuevaPersona);
             
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
