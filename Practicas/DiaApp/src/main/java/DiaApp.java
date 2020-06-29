
import java.util.Scanner;

public class DiaApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el dia de la semana");
        String dia = sc.nextLine();

        switch (dia) {

            case "Lunes":
                System.out.println("Dia de trabajo");
                break;
            case "Martes":
                System.out.println("Dia de trabajo");
                break;
            case "Miercoles":
                System.out.println("Dia de trabajo");
                break;
            case "Jueves":
                System.out.println("Dia de trabajo");
                break;
            case "Viernes":
                System.out.println("Dia de trabajo");
                break;
            case "Sabado":
                System.out.println("Dia de descanso");
                break;
            case "Domingo":
                System.out.println("Dia de descanso");
                break;
            default:
                System.out.println("No existe este dia" + dia);

        }
    }

}
