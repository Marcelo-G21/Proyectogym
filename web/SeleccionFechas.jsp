<%-- 
    Document   : SeleccionFechas
    Created on : 16-jul-2021, 14:25:21
    Author     : srtel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Selecciona tu evaluacion</title>
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
            <img class="mx-5" src="VaultBoyCalendar.jpg" alt="" width="213" height="278">
        <h3>Busqueda Evaluaciones</h3>
        <form action="BusquedaEvaluaciones" method="POST">
            Seleccione fecha desde <input type="date" name="fdesde" required><br>
            Seleccione fecha hasta <input type="date" name="fhasta" required><br>
            <input type="hidden" name="rut" value="<%= request.getAttribute("rut") %>">
            <input type="submit" value="Buscar">
        </form>
    </main>
    </body>
</html>
