
import java.util.Scanner;


public class CajaMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );
        
        System.out.println("Ingrese el ancho de la caja: ");
        int ancho = sc.nextInt();
        
        System.out.println("Ingrese el alto de la caja: ");
        int alto = sc.nextInt();
        
        System.out.println("Ingrese lo profundo de la caja: ");
        int profundo = sc.nextInt();
        
        Caja caja = new Caja( ancho, alto, profundo );
        System.out.println("El resultado es: " + caja.calcularVolumenCaja());
        
    }
}
