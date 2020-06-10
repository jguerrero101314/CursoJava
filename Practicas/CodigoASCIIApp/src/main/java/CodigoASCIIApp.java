
import java.util.Scanner;

public class CodigoASCIIApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // De numero a letra
        System.out.println("Ingrese el numero que desea convertir en letra");
        int letra = sc.nextInt();
        char letraAsci = (char) letra;
        System.out.println(letraAsci);

        // De letra a numero
        System.out.println("Ingrese la letra que desea convertir en numero");
        char letra2 = sc.next().trim().charAt(0);
        
        int letraAsci2 = (int) letra2;
        System.out.println("letraAsci2 = " + letraAsci2);

    }
}
