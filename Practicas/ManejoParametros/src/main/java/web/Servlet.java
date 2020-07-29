
package web;

import java.io.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse res) throws IOException{
        // leer los parametros del formulario html
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);
        
        PrintWriter out = res.getWriter();
        out.print("<html>"); 
        out.print("<body>");
        out.print("El parametro de usuario es: " + usuario);
        out.print("<br/>");   
        out.print("El parametro de password es: " + password);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
