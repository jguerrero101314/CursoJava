
import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;

public class ManejoUsuarios {

    public static void main(String[] args) {
        UsuarioJDBC usuarioJdbc = new UsuarioJDBC();

        //Ejecutando el listado de usuarios
        List<Usuario> usuarios = usuarioJdbc.select();
        for (Usuario usuario : usuarios) {
            System.out.println("Usuario:" + usuario);
        }

        /**
         * Insertar usuarios
         */
//        Usuario usuario = new Usuario();
//        usuario.setUsuario("Laura");
//        usuario.setPassword("Lara123");
//
//        usuarioJdbc.insert(usuario);
        /**
         * Actualizar usuarios
         */
//        Usuario usuario = new Usuario();
//        usuario.setId_usuario(1);
//        usuario.setUsuario("Jose");
//        usuario.setPassword("admin");
//      
//        
//        usuarioJdbc.update(usuario);


        /**
         * Delete usuarios
         */
        
        Usuario usuario = new Usuario();
        usuario.setId_usuario(1);
        usuarioJdbc.delete(usuario);
    }

}
