/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.milenyumcodeacademy.primerservlet.servlets.persistencia;

import com.milenyumcodeacademy.primerservlet.servlets.logica.Usuario;
import com.milenyumcodeacademy.primerservlet.servlets.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JEFFERSON ALQUINGA
 */
public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();
   //Operación CREATE 
   public void crearUsuario(Usuario usu){ 
       usuJpa.create(usu);
   }
   
   
   //Operación eliminar
   
   public void eliminarUsuario(int id){ 
    
        try {
            usuJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }
   
   //operacion editar
   public void editarUsuario(Usuario usu){ 
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   //Operación Leer
   
   public Usuario traerUsuario(int id){ 
       
       return  usuJpa.findUsuario(id);
   }
   //Operación Leer todod
 
   public List<Usuario> traerUsuarios(){
      
       return usuJpa.findUsuarioEntities();
        
   }
   
   
   
}
