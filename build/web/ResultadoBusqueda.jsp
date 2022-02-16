<%-- 
    Document   : ResultadoBusqueda
    Created on : 16-jul-2021, 15:00:06
    Author     : srtel
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Dao.DaoEvaluacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Datos Evaluacion</title>
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
        List<DaoEvaluacion> datosE = new ArrayList();
        datosE = (List<DaoEvaluacion>) request.getAttribute("datosE");
    %>
    <body>
        <main class="form-signin">
        <img class="mx-5" src="VaultBoyCalendar.jpg" alt="" width="213" height="278">
        <h3>Resultado de Búsqueda</h3>
        <table class="table table-bordered">

            <tr>
             <th scope="col">Peso</th>
             <th scope="col">Estatura</th>
             <th scope="col">IMC</th>
             <th scope="col">Estado</th>
             <th scope="col">Fecha</th>
            </tr>
            <%
                for(DaoEvaluacion daoEvaluacion : datosE){
            %>
            <tr>
             <td><%= daoEvaluacion.getPeso() %></td>
             <td><%= daoEvaluacion.getEstatura() %></td>
             <td><%= daoEvaluacion.getIMC() %></td>
             <td><%= daoEvaluacion.getEstado() %></td>
             <td><%= daoEvaluacion.getFecha() %></td>
            </tr>
            <%
                }
            %>
            </table>
        </main>
    </body>
</html>
