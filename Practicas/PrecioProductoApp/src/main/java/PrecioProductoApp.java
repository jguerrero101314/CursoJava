
import java.text.DecimalFormat;
import java.util.Scanner;

public class PrecioProductoApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaramos la constante
        final double IVA = 0.21;

        System.out.println("Ingrese el precio del producto");
        double costo = sc.nextDouble();
        double precio = costo / (1 - IVA);
        DecimalFormat df = new DecimalFormat(".00");
        
        System.out.println("precio = " +df.format(precio) + "$");
    }

}
