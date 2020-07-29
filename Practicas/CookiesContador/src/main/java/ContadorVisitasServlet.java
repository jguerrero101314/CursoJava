
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = {"/ContadorVisitasServlet"})
public class ContadorVisitasServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        // declaramos una variable contador
        int contador = 0;
        //Revisamos si existe la cookie contadorVisitas
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(Cookie c : cookies){
                if(c.getName().equals("contadorVisitas")){
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        // incrementar el contador en 1
        contador++;
        // agregamos la respuesta al nevegador
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador) );
        // la cookie se almacenara en el cliente por 1 hora (3600 segundos)
        c.setMaxAge(3600);
        resp.addCookie(c);
        
        //mandamos el mensaje al navegador
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("Contador de visitas de cada cliente: " + contador);
    }

}
