<%-- 
    Document   : InfoPerfil
    Created on : 16-jul-2021, 15:41:47
    Author     : srtel
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Dao.DaoUsuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Información</title>

 <!-- Bootstrap core CSS -->
 <link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

 <style>
     .bd-placeholder-img {
         font-size: 1.125rem;
         text-anchor: middle;
         -webkit-user-select: none;
         -moz-user-select: none;
         user-select: none;
     }

     @media (min-width: 768px) {
         .bd-placeholder-img-lg {
             font-size: 3.5rem;
         }
     }
 </style>
 <link href="signin2.css" rel="stylesheet">

    </head>
    <%
        List<DaoUsuario> datosU = new ArrayList();
        datosU = (List<DaoUsuario>) request.getAttribute("datosU");
    %>
    <body>
        <main class="form-signin">
            <img class="mx-5" src="VaultBoyRead.png" alt="" width="250" height="250">
        <h3>Información Perfil</h3>
        <form action="ListarPorRut" method="POST">
        <table class="table table-bordered">
            <%
                for(DaoUsuario daoUsuario : datosU){
            %>
            <tr>
             <th scope="col">Nombre</th>
             <th><%= daoUsuario.getNombre() %></th>
            </tr>
           
            <tr>
             <th scope="col">Apellido</th>
             <th><%= daoUsuario.getApellido() %></th>
            </tr>
            
            <tr>
             <th scope="col">Correo</th>
             <th><%= daoUsuario.getCorreo() %></th>
            </tr>
            
            <tr>
             <th scope="col">Teléfono</th>
             <th>+569<%= daoUsuario.getFono() %></th>
            </tr>
            
            <tr>
             <th scope="col">Dirección</th>
             <th><%= daoUsuario.getDireccion() %></th>
            </tr>
            <input type="hidden" name="rut" value="<%= daoUsuario.getRut() %>">
            <td colspan="2"><input type="submit" name="sub" value="Editar Datos"></td>
            <%
                }
            %>
            
            </table>
            </form>
        </main>
    </body>
</html>
