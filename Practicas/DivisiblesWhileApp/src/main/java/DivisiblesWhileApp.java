
import java.util.Scanner;

public class DivisiblesWhileApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero inicial:");
        int a = sc.nextInt();

        System.out.println("Ingrese el numero final");
        int b = sc.nextInt();

        for (var i = a; i <= b; i++) {
           
            if (i % 2 == 0) {
                 System.out.println("Numero divisible entre 2");
                System.out.println(i);
            } else if (i % 3 == 0) {
                System.out.println("Numero divisible entre 3");
                System.out.println(i);
            }

        }
    }

}
