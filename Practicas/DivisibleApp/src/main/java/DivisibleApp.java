
import java.util.Scanner;


public class DivisibleApp {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        
        System.out.println("Ingre un numero: ");
        int a = sc.nextInt();
        
        int resultado = a % 2;
        
        if( resultado == 0){
            System.out.println("Es divisible por 2");
        }else{
            System.out.println("No es divisible");
        }
        
    }
    
}
