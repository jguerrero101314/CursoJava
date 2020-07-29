
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = {"/SesionesServlet"})
public class SesionesServlet extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
       resp.setContentType("text/html;charset=UTF-8");
       
       HttpSession sesion = req.getSession();
       String titulo = null;
       // Pedir el atributo contadorVisitas a la sesion
       Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
       // si es nulo es la primera vez que accedemos a la aplicacion
       if(contadorVisitas == null){
           contadorVisitas  = 1;
           titulo = "Bienvenido por primera vez";
       }else{
           contadorVisitas++;
           titulo = "Bienvenido nuevamente";
       }
       // agregamos el nuevo valor a la sesion
       sesion.setAttribute("contadorVisitas", contadorVisitas);
       // mandamos la respuesta al cliente
       PrintWriter out = resp.getWriter();
       out.print(titulo);   
       out.print("<br/>");  
       out.print("No. accesos al recurso: " + contadorVisitas);
       out.print("<br/>");
       out.print("ID de la sesion: " + sesion.getId());
       out.close();
   }
}
