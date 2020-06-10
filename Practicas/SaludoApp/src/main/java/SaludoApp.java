import javax.swing.JOptionPane;
public class SaludoApp {

    public static void main(String[] args) {

        // OPCION 1
        /*
        String nombre = " Joel Guerrero";
        System.out.println("Bienvenido: " + nombre);
         */
        
        // OPCION 2
       String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
       JOptionPane.showMessageDialog(null,"Bienvenido: "+ nombre);
        
    }

}