
import java.util.Scanner;

public class CalificacionesApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Proporciona un valor entre 0 y 10:");
        int calificacion = Integer.parseInt(sc.nextLine());

        var valorCalificacion = "";

        if (calificacion >= 9 && calificacion == 10) {
            valorCalificacion = "A";
        } else if (calificacion >= 8 && calificacion < 9) {
            valorCalificacion = "B";
        } else if (calificacion >= 7 && calificacion < 8) {
            valorCalificacion = "C";
        } else if (calificacion >= 6 && calificacion < 7) {
            valorCalificacion = "D";
        } else if (calificacion >= 0 && calificacion < 6) {
            valorCalificacion = "F";
        } else {
            valorCalificacion = "Valor desconocido";
        }

        System.out.println("valorCalificacion = " + valorCalificacion);
    }

}
