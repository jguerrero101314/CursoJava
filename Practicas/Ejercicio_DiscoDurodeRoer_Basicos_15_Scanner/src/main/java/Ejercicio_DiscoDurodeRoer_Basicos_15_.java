
import java.util.Scanner;

public class Ejercicio_DiscoDurodeRoer_Basicos_15_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        
        Ejercicio_DiscoDurodeRoer_Basicos_15_Scanner numero1 = new Ejercicio_DiscoDurodeRoer_Basicos_15_Scanner(numero);
        numero1.numero(numero);
        System.out.println(numero1);
    }

}
