
import java.lang.Math;

public class EcuacionSegundoGrado {

    public void ecuacion(int a, int b, int c) {

        double resultado = Math.pow(b, 2) - (4 * a * c);
        System.out.println(">> = " + resultado);

        if (resultado > 0) {
            double x1 = ((b * (-1)) + Math.sqrt(resultado)) / (2 * a);
            double x2 = ((b * (-1)) - Math.sqrt(resultado)) / (2 * a);

            System.out.println("El valor de x1 es " + x1 + " y el valor de x2 es " + x2);
        } else {
            System.out.println("El resultado es negativo");
        }
    }

}
