
package utilerias;

import java.text.SimpleDateFormat;
import java.util.*;


public class Conversiones {
    private static final String FORMATO_FECHA = "dd-MM";
    public static String format(Date fecha){
        SimpleDateFormat formateador = new SimpleDateFormat();
        return formateador.format(fecha);
    } 
    public static String format(String fecha){
        SimpleDateFormat formateador = new SimpleDateFormat();
        return formateador.format(fecha);
    }
    
}
