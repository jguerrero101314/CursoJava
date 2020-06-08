
import java.util.Scanner;

public class Libro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Proporciona el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Proporciona el id: ");
        int id = sc.nextInt();
        System.out.println("Proporciona el precio: ");
        double precio = sc.nextDouble();
        System.out.println("Proporciona el simbolo: ");
        char simbolo = sc.next().trim().charAt(0);
        System.out.println("Proporciona el envio gratuito: ");
        boolean envioGratuito = sc.nextBoolean();
        
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo  + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);

    }
}
