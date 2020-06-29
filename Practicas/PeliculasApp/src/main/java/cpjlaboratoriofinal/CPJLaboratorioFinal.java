
package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;


public class CPJLaboratorioFinal {
    
    private static final Scanner sc = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "c:\\catalogoPeliculas\\peliculas.txt";
    private static final CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();
    
    public static void main(String[] args) {
        while( opcion != 0){
            try{
                System.out.println("Elije opcion:\n1.- Iniciar catalogo peliculas"
                        + "\n2.- Agregar Pelicula\n"
                        + "\n3.- Listar Pelicula\n"
                        + "\n4.- Buscar Pelicula\n"
                        + "\n5.- salir");
                opcion = Integer.parseInt(sc.nextLine());
                
                switch(opcion){
                    case 1: catalogoPeli.iniciarArchivo(nombreArchivo);
                        break;
                    case 2: catalogoPeli.agregarPelicula(nombreArchivo, nombreArchivo);
                        break;
                    case 3: catalogoPeli.listarPeliculas(nombreArchivo);
                        break;
                    case 4: catalogoPeli.buscarPelicula(nombreArchivo, nombreArchivo);
                        break;
                    case 0: System.out.println("!Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;                            
                }
                System.out.println("\n");
            }catch(Exception ex){
                System.out.println("Error!");
            }
            
        }
    }
    
}
