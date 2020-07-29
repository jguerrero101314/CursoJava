/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.sga.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.services.PersonaService;

@WebServlet("/personas")
public class PersonaSevlet extends HttpServlet {

   @Inject
   PersonaService personasServices;
   
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
      List<Persona> personas = personasServices.listarPersonas();
       System.out.println("personas = " + personas);
       req.setAttribute("personas", personas);
       req.getRequestDispatcher("/listadoPersonas.jsp").forward(req, resp);
   }
   
   
}
