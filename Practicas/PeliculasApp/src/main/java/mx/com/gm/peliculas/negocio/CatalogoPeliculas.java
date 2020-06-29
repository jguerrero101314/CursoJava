
package mx.com.gm.peliculas.negocio;


public interface CatalogoPeliculas {
   public void agregarPelicula(String nombrePelicula, String nombreArhivo);
   public void listarPeliculas(String nombreArchivo);
   public void buscarPelicula(String nombreArchivo, String buscar);
   public void iniciarArchivo(String nombreArchivo);
    
}
