
import java.util.Scanner;

public class Sales {



    public void salesProducts(int salesNumber) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int plusSales = 0;
        while (contador <= salesNumber) {
            System.out.println("Introduce el precio de la venta: " + (contador));
            int saleNumber = sc.nextInt();
            
            plusSales = plusSales + saleNumber;
            contador++;
        }
        System.out.println("La cantidad de ventas es de: " + salesNumber + 
                " \n el total de las ventas son de " + plusSales + "$");

    }
}
