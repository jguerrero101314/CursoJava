
import java.util.Scanner;

public class TituloLibro {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titulo del libro: ");
        String libro = sc.nextLine();
        System.out.print("Ingrese el nombre del titulo del autor: ");
        String autor = sc.nextLine();
        System.out.println("********************************");
        System.out.println(libro + " fue escrito por: " + autor);
        System.out.println("********************************");

    }
}
