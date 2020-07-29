/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlets")
public class Servlets extends HttpServlet {
    
    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp) throws IOException{
        // Simular los valores correctos
        String usuarioOK = "Joel";
        String psswordOK = "123";
        
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        
        PrintWriter out = resp.getWriter();
        if( usuarioOK.equals(usuario) && psswordOK.equals(password)){
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("<br>Usuario: " + usuario);
            out.print("<br>Password: " + password);
            out.print("</h1>");
        }
        else{
            resp.sendError(resp.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        out.close();
    }
    
}
