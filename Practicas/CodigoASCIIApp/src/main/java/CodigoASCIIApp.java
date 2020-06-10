
import java.util.Scanner;


public class CodigoASCIIApp {
    public static void main( String[] args){
        Scanner sc = new Scanner( System.in);
        
        System.out.println("Ingrese el numero que desea convertir en letra");
        int letra = sc.nextInt();
        
        char letraAsci = (char) letra;
        
        System.out.println(letraAsci);
        
        
        
    }
}
