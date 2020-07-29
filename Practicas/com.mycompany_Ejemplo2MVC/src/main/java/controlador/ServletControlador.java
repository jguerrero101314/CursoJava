package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. Procesamos parametros
        String accion = req.getParameter("accion");

        // 2. Creamos los JavaBeans
        Rectangulo recRequest = new Rectangulo(1, 2);
        Rectangulo recSesion = new Rectangulo(3, 4);
        Rectangulo recAplicacion = new Rectangulo(5, 6);

        // 3. Agregamos el javabean a algun alcance
        //revisamos la accion proporcionada
        if ("agregaVariables".equals(accion)) {
            // alcance de request
            req.setAttribute("rectanguloRequest", recRequest);
            //Alcance session
            HttpSession sesion = req.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);

            //Alcance application
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloAplicacion", recAplicacion);

            //agregamos un msj
            req.setAttribute("mensaje", "Las variables fueron agregadas");
            
            // 4.redireccionamos al jsp de index
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
        else if("listarVariables".equals(accion)){
            //4. redireccionamos al jsp que despliega las variables
            req.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(req, resp);
        }else{
            //4. redireccionamos a la pagina de inicio
            req.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            
            // esta linea no agregaria informacion al JSP, ya que no propaga los objetos request y response
            //resp.sendRedirect("index.jsp");
        }
    }
}
