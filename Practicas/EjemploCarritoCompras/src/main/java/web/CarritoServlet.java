
package web;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(name = "CarritoServlet", urlPatterns = {"/CarritoServlet"})
public class CarritoServlet extends HttpServlet {

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
       resp.setContentType("text/html;charset=UTF-8");
       //Procesamos el nuevo articulo
       String articuloNuevo = req.getParameter("articulo");
       
       //Creamos o recuperamos el objeto http sesion
       HttpSession sesion = req.getSession();
       
       //Recuperamos la lista de articulos agregados previamente si existen
       List<String> articulos = (List<String>) sesion.getAttribute("articulos");
       
       //Verificamos si la lista de articulos existe
       if(articulos == null){
           // inicializamos la lista de articulos
           articulos = new ArrayList<>();  
           sesion.setAttribute("articulos", articulos);
       }
       // revisamos y agregamos el articulo nuevo
       if(articuloNuevo != null && ! articuloNuevo.trim().equals("")){
           articulos.add(articuloNuevo);          
       }
       try ( // imprimir la lista de articulos
               PrintWriter out = resp.getWriter()) {
           out.print("<h1>Lista de Articulos</h1>");
           out.print("<br/>");
           //iteramos todos los articulos
           for(String articulo: articulos){
               out.print("<li>" + articulo + "</li>");
           }
           // agregamos un link para regresar al inicio
           out.print("<br>");
           out.print("<a href='/EjemploCarritoCompras'> Regresar al inicio</a>");
       }
   }
}
