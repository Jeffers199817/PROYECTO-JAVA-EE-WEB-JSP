<%-- 
    Document   : editarUsuario
    Created on : Oct 30, 2024, 4:38:56 PM
    Author     : JEFFERSON ALQUINGA
--%>

<%@page import="com.milenyumcodeacademy.primerservlet.servlets.logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        <h1>Editar Usuario</h1>
        
        <% Usuario usu1 = (Usuario)request.getSession().getAttribute("usu"); 
        
        if(usu1 != null){ 
        
        %>
        
        <fieldset>
            <form action ="SvEditar" method="POST">
                <p><label>id: </label><input type="text" name="id" value="<%=usu1.getId()%>"  readonly>
                        <p><label>Dni: </label><input type="text" name="dni" value="<%=usu1.getDni()%>" >
                                <p><label>Nombre: </label><input type="text" name="nombre" value="<%=usu1.getNombre()%> ">
                                        <p><label>Apellido: </label><input type="text" name="apellido" value="<%=usu1.getApellido()%> ">
                                                <p><label>Teléfono: </label><input type="text" name="telefono" value="<%=usu1.getTelefono()%> ">
                                                    
                                                    
                                                    <button type="submit"> Guardar Cambios </button>
            </form>
        </fieldset>
        
        

        <% }; %>
        
                 

    </body>
</html>
