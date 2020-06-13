
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Practica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Practica de verntas
        System.out.println("Ingrese la cantidad de ventas:");
        int salesNumber = sc.nextInt();
        Sales sales = new Sales();
        sales.salesProducts(salesNumber);*/
 /* Ecuacion diferencial
        System.out.println("Ingre el valor de a: ");
        int a = sc.nextInt();
        System.out.println("Ingre el valor de b: ");
        int b = sc.nextInt();
        System.out.println("Ingre el valor de c: ");
        int c = sc.nextInt();
        
        EcuacionSegundoGrado e = new EcuacionSegundoGrado();   
        e.ecuacion(a, b, c);
         */
        BigDecimal bdFromString = new BigDecimal("0.1");
        System.out.println("bdFromString = " + bdFromString);
        
        BigDecimal bdFromCharArray = new BigDecimal(new char[]{'3', '.', '1', '6', '1', '5'});
        System.out.println("bdFromCharArray = " + bdFromCharArray);
        
        BigDecimal bdlFromInt = new BigDecimal(42);
        System.out.println("bdlFromInt = " + bdlFromInt);
        
        BigDecimal bdFromLong = new BigDecimal(123412345678901L);
        System.out.println("bdFromLong = " + bdFromLong);
        
        BigInteger bigInteger = BigInteger.probablePrime(100, new Random());
        System.out.println("bigInteger = " + bigInteger);
        
        BigDecimal bdFromBigInteger = new BigDecimal(bigInteger);
        System.out.println("bdFromBigInteger = " + bdFromBigInteger);

        
    }
}
