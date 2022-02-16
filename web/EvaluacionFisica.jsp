<%-- 
    Document   : EvaluacionFisica
    Created on : 15-jul-2021, 21:01:03
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
        <script type="text/javascript" src="Funciones.js"></script>
        <title>Evaluacion Fisica</title>

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
        <form action="InsertEvaluacion" method="POST">
            <table>
                <thead>
                <tr>
                    <th colspan="4" >Evaluación Física</th>
                </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Seleccione usuario</td>
                        <td><select name="rut">
                <%
                    for (DaoUsuario daoUsusario : datosU){
                %>
                <option value="<%= daoUsusario.getRut() %>"> <%= daoUsusario.getNombre() %> <%= daoUsusario.getApellido() %></option>
                <%
                    }
                %>
                </select></td>
                    </tr>
                    <tr>
                        <td>Peso</td>
                        <td><input type="number" name="peso" id="peso" required></td>
                    </tr>
                    <tr>
                        <td>Estatura</td>
                        <td><input type="number" name="estatura" id="estatura" required></td>
                    </tr>
                    <tr>
                        <td>Fecha</td>
                        <td><input type="date" name="fecha" required></td>
                    </tr>
                    <tr>
                        <td>IMC</td>
                        <td><input type="number" name="imc" id="imc" readonly></td>
                        <td><input type="button" value="Calcular IMC" onclick="calculaIMC()"></td>
                    </tr>
                    <tr>
                        <td>Estado</td>
                        <td><input type="text" name="estado" id="estado" readonly></td>
                    </tr>
                    <tr>
                    <th><input type="submit" value="Registrar"></th>
                    </tr>
                    
                </tbody>
            </table>

             <br>
             <br>
             <br>
             
            <br>
             
            
            
        </form>
        </main>
    </body>
</html>
