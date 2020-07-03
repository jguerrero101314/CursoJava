package datos;

import domain.*;
import java.sql.*;
import java.util.*;

public class UsuarioDaoJDBC implements UsuarioDao {

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "Select * from usuario";
    private static final String SQL_INSERT = "Insert into usuario(usuario, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario=?, password=? WHERE id_usuario=?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=?";

    public UsuarioDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;

    }

    public List<UsuarioDTO> select() throws SQLException {
        Connection cn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        UsuarioDTO usuario = null;
        List<UsuarioDTO> usuarios = new ArrayList<UsuarioDTO>();

        try {
            cn = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionBD.getConnection();
            stmt = cn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_usuario = rs.getInt("id_usuario");
                String user = rs.getString("usuario");
                String password = rs.getString("password");
                usuario = new UsuarioDTO();
                usuario.setId_usuario(id_usuario);
                usuario.setUsuario(user);
                usuario.setPassword(password);
                usuarios.add(usuario);
            }
        } finally {
            ConexionBD.close(rs);
            ConexionBD.close(stmt);
            if (this.conexionTransaccional == null) {
                ConexionBD.close(cn);
            }
        }
        return usuarios;
    }

    public int insert(UsuarioDTO usuario) throws SQLException {

        Connection cn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            cn = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionBD.getConnection();
            stmt = cn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            System.out.println("Ejecutando query: " + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);

        }  finally {
            ConexionBD.close(stmt);
            if(this.conexionTransaccional == null){
                 ConexionBD.close(cn);
            }
           
        }
        return rows;
    }

    public int update(UsuarioDTO usuario) throws SQLException {
        Connection cn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            cn = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionBD.getConnection();
            System.out.println("Ejecutando query " + SQL_UPDATE);
            stmt = cn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + rows);
        } finally {
            ConexionBD.close(stmt);
            if( this.conexionTransaccional ==  null ){
                 ConexionBD.close(cn);
            }
           
        }

        return rows;

    }

    public int delete(UsuarioDTO usuario) throws SQLException {

        Connection cn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            cn = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionBD.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = cn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + rows);
        }  finally {
            ConexionBD.close(stmt);
            if( this.conexionTransaccional == null ){
                 ConexionBD.close(cn);
            }
           
        }
        return rows;
    }
}
