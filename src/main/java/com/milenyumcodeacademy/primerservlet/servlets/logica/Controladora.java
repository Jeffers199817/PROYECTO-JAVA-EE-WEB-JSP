/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.milenyumcodeacademy.primerservlet.servlets.logica;

import com.milenyumcodeacademy.primerservlet.servlets.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author JEFFERSON ALQUINGA
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    
    public void crearUsuario(Usuario usu){ 
        
        controlPersis.crearUsuario(usu);
    }
    
    public List<Usuario> traerUsuarios(){ 
        
       return controlPersis.traerUsuarios();
    }
}
