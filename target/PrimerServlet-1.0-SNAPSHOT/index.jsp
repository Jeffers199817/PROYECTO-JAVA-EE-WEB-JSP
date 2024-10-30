<%-- 
    Document   : index
    Created on : Oct 29, 2024, 7:24:07 PM
    Author     : JEFFERSON ALQUINGA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Prueba</title>
    </head>
    <body>
        <h1>Datos del usuario</h1>
        <form action="SvUsuarios" method ="POST">
            <fieldset>
            <p><label>Dni:      </label> <input type="text" name="dni"> </p>
            <p><label>Nombre:   </label> <input type ="text" name="nombre"></p>
            <p><label>Apellido: </label><input type="text" name="apellido"></p><!-- comment -->
            <p><label>Teléfono: </label><input type =" text" name="telefono"></p>
            <button type ="submit">Enviar</button>
            </fieldset>
        </form>
        
        <h1> Lista de usuario<h1> 
                <h1> Mostrar lista de usuario<h1> 
                        <fieldset>
                        <form action="SvUsuarios" method="GET" >
                            
                            <button type="submit" >Mostrar lista de Usuarios</button> 
                        </form>
                            </fieldset>
                        
         <!-- ELIMINAR USUARIO -->
         
         <h1> Eliminación de Usuarios</h1><!-- comment -->
         <h1> Eliminar usuario por ID</h1>
         <fieldset>
             <form action="SvEliminar" method="POST">
                 <p>
                     <label type="text" >Id: </label><input type="text" name = "id">
                 </p>
                 <button type ="submit"> Eliminar Usuario</button>
                 
                 
             </form>
         </fieldset>
    </body>
</html>
