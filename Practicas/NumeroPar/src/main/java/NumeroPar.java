
import java.util.Scanner;


public class NumeroPar {
    public static void main( String[] args ){
        
        Scanner sc = new Scanner ( System.in );
        
        System.out.println("Ingrese el numero para saber si es par o impar:");
        int numero = sc.nextInt();
        
        if( numero % 2 == 0 ){
            System.out.println("Numero Par");
            
        }else{
            System.out.println("Numero Impar");
        }
        
    }  
}
