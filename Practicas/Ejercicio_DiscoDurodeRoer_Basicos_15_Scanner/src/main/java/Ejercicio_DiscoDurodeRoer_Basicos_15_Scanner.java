
import java.util.Scanner;

public class Ejercicio_DiscoDurodeRoer_Basicos_15_Scanner {

    Scanner sc = new Scanner(System.in);
    private int numero;

    public Ejercicio_DiscoDurodeRoer_Basicos_15_Scanner(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int numero(int numero) {

        do {
            if (numero <= 0) {
                System.out.println("Ingrese un numero valido");
                numero = sc.nextInt();
            }
            
           System.out.println("El numero es: " + numero);

        } while (numero <= 0);

        return this.numero;
    }
}
