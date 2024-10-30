/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.milenyumcodeacademy.primerservlet.servlets;

import com.milenyumcodeacademy.primerservlet.servlets.logica.Controladora;
import com.milenyumcodeacademy.primerservlet.servlets.logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JEFFERSON ALQUINGA
 */
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    Controladora control = new Controladora();
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Usuario> listaUsuarios = control.traerUsuarios();
        
        //Traemos la session de los jsp 
        HttpSession misesion = request.getSession();
        //Asignamos en esta sessión la variable listaUsuarios
        misesion.setAttribute("listaUsuarios", listaUsuarios);
        
        //redirecionamos a nuestro jsp 
        response.sendRedirect("mostrarUsuarios.jsp");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        Usuario usu = new Usuario();
        
        
        usu.setDni(dni);
        usu.setNombre(nombre);
        usu.setApellido(apellido);
        usu.setTelefono(telefono);
        
            
        control.crearUsuario(usu);
        
        response.sendRedirect("index.jsp");
        
            
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
