package datos;

import domain.*;
import java.sql.*;
import java.util.*;


public class UsuarioJDBC {

    private static final String SQL_SELECT = "Select * from usuario";
    private static final String SQL_INSERT = "Insert into usuario(usuario, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario=?, password=? WHERE id_usuario=?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=?";

    public List<Usuario> select() {
        Connection cn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            cn = ConexionBD.getConnection();
            stmt = cn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_usuario = rs.getInt("id_usuario");
                String user = rs.getString("usuario");
                String password = rs.getString("password");
                usuario = new Usuario();
                usuario.setId_usuario(id_usuario);
                usuario.setUsuario(user);
                usuario.setPassword(password);
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(rs);
            ConexionBD.close(stmt);
            ConexionBD.close(cn);
        }
        return usuarios;
    }

    public int insert(Usuario usuario) {

        Connection cn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            cn = ConexionBD.getConnection();
            stmt = cn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            System.out.println("Ejecutando query: " + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(stmt);
            ConexionBD.close(cn);
        }
        return rows;
    }

    public int update(Usuario usuario) {
        Connection cn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            cn = ConexionBD.getConnection();
            System.out.println("Ejecutando query " + SQL_UPDATE);
            stmt = cn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(stmt);
            ConexionBD.close(cn);
        }

        return rows;

    }

    public int delete(Usuario usuario) {

        Connection cn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            cn = ConexionBD.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = cn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);       
        }
        finally {
            ConexionBD.close(stmt);
            ConexionBD.close(cn);
        }
        return rows;
    }
}
