package datos;

import domain.*;
import java.sql.*;
import java.util.*;

public class PersonaJDBC {

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "Select * from persona";
    private static final String SQL_INSERT = "Insert into persona(nombre,apellido,email,telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=?, email=?, telefono=? WHERE idpersona=?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idpersona=?";

    public PersonaJDBC() {

    }

    public PersonaJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Persona> select() throws SQLException {
        Connection cn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<Persona>();

        try {
            cn = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionBD.getConnection();
            stmt = cn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idpersona = rs.getInt("idpersona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                persona = new Persona();
                persona.setId_persona(idpersona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                persona.setEmail(email);
                persona.setTelefono(telefono);
                personas.add(persona);
            }
        } finally {
            ConexionBD.close(rs);
            ConexionBD.close(stmt);
            if (this.conexionTransaccional == null) {
                ConexionBD.close(cn);
            }
        }
        return personas;
    }

    public int insert(Persona persona) throws SQLException {
        Connection cn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            cn = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionBD.getConnection();
            stmt = cn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            System.out.println("Ejecutando query: " + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        }  finally {
            ConexionBD.close(stmt);
            if (this.conexionTransaccional == null) {
                ConexionBD.close(cn);
            }
        }
        return rows;
    }

    public int update(Persona persona) throws SQLException {
        Connection cn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            cn = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionBD.getConnection();
            System.out.println("Ejecutando query " + SQL_UPDATE);
            stmt = cn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getId_persona());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + rows);
        }  finally {
            ConexionBD.close(stmt);
            if (this.conexionTransaccional == null) {
                ConexionBD.close(cn);
            }
        }
        return rows;
    }

    public int delete(Persona persona) throws SQLException {
        Connection cn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            cn = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionBD.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = cn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getId_persona());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + rows);
        }  finally {
            ConexionBD.close(stmt);
            if (this.conexionTransaccional == null) {
                ConexionBD.close(cn);
            }
        }

        return rows;
    }

}
