/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.milenyumcodeacademy.primerservlet.servlets;

import com.milenyumcodeacademy.primerservlet.servlets.logica.Controladora;
import com.milenyumcodeacademy.primerservlet.servlets.logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JEFFERSON ALQUINGA
 */
@WebServlet(name = "SvEliminar", urlPatterns = {"/SvEliminar"})
public class SvEliminar extends HttpServlet {

    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String id = request.getParameter("id");
        
        int idU = Integer.parseInt(id);
        
        List<Usuario> listaUsuarios = control.traerUsuarios();
        
        for(Usuario usu1: listaUsuarios){ 
            
            if(usu1.getId() == idU){ 
                
                control.eliminarUsuario(usu1.getId());
                
                 System.out.println("EL USUARIO ES : " + idU + "Nombre : "+  usu1.getNombre());
                break;
            }
            
        }
        
        
        response.sendRedirect("index.jsp");
        
    }
    
    

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
