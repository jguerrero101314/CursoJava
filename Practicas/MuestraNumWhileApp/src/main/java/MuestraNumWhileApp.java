
import java.util.Scanner;


public class MuestraNumWhileApp {
    public static void main( String args[]){
        
        Scanner sc = new Scanner ( System.in );
        
        System.out.println("Ingrese el numero inicial a imprimir");
        int a = sc.nextInt();
        
        System.out.println("Ingrese el numero final a imprimir");
        int b = sc.nextInt();
        System.out.println("**********************************");
        
       int contador = a;
       
      /* while( contador <= b ){
           System.out.println(contador);
           contador++; 
     
       }
     */ 
      
        for (int i = contador; i <= b; i++) {
            System.out.println(i);
            
        }
    }
    
}
