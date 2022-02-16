<%-- 
    Document   : PerfilUsuario
    Created on : 15-jul-2021, 20:51:14
    Author     : srtel
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Dao.DaoUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        List<DaoUsuario> datosLogin = new ArrayList();
        datosLogin = (List<DaoUsuario>) request.getAttribute("datosLogin");
    %>
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Usuario</title>
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
     <link href="signin.css" rel="stylesheet">
 </head>
 <body>
     <main class="form-signin"> 
         <img class="mx-5" src="VaultBoyEndurance.png" alt="">
        <h1>Usuario</h1>
        <form action="EnviaRut" method="POST">
            <%
                for (DaoUsuario daoUsuario : datosLogin){
            %>
            <input type="hidden" name="rut" value="<%= daoUsuario.getRut() %>">
            <input type="submit" class="w-100 btn btn-lg btn-primary" value="Consulta Evaluación">
            
            <%
                }
            %>
        </form>
                
        <br>
        
        <form action="ListarPorRut" method="POST">
            <%
                for (DaoUsuario daoUsuario : datosLogin){
            %>
            <input type="hidden" name="rut" value="<%= daoUsuario.getRut() %>">
            <input type="submit" class="w-100 btn btn-lg btn-primary" name="sub" value="InfoPerfil">
            
            <%
                }
            %>
        </form>
    </main>
    </body>
</html>
