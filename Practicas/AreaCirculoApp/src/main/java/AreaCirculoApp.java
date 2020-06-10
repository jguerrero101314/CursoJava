
import java.util.Scanner;
 
public class AreaCirculoApp {
    public static void main(String[] args ){
        
        Scanner sc = new Scanner( System.in );
        
       
        
        System.out.println("Ingrese el radio de un ciculo: ");
        int radio = sc.nextInt();
        
        
        double resultado = Math.PI*Math.pow(radio, 2);
        System.out.println("resultado = " + resultado);
        
        
    }
    
}
