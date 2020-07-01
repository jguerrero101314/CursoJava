
package ejemplo.jdbc;

import java.sql.*;

public class IntroduccionJDBC {
    public static void main(String[] args) {
        
        // Paso 1. Creamos nuestra cadena de conexion a mysql
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
        
        try {
            // Paso 2. Creamos el objeto de conexion a la base de datos
            Connection cn = DriverManager.getConnection(url, "root", "admin");
            // Paso 3. Creamos un objeto Statement
            Statement instruccion = cn.createStatement();
            //Paso 4. Creamos el query
            String sql = " select idpersona, nombre, apellido, email, telefono from persona";
            // Paso 5. Ejecucion del jquery
            ResultSet resultado = instruccion.executeQuery(sql);
            // Paso 6. Procesamos el resultado
            while(resultado.next()){
                System.out.print("Id persona: " + resultado.getInt(1) + "\t");
                System.out.print("Nombre: " + resultado.getString(2) + "\t");
                System.out.print("Apellido: " + resultado.getString(3)  + "\t");
                System.out.print("Email: " + resultado.getString(4) + "\t");
                System.out.println("Telefono: " + resultado.getString(5));                 
            }
            // Paso 7. Cerramos cada objeto que hemos utilizado
            resultado.close();
            instruccion.close();
            cn.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
        
    }
}
