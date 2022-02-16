<%-- 
    Document   : Administracion
    Created on : 15-jul-2021, 20:50:38
    Author     : srtel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Administracion</title>

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
            <img class="mx-5" src="VaultBoyAdmin.png" alt="">
            <h1 class="h3 mb-3 fw-normal">Administracion</h1>
        <form action="IngresarUsuario.jsp">
            <input type="submit" class="w-100 btn btn-lg btn-primary" value="Ingresar Usuario">
        </form>
            <br>
        <form action="BorrarUsuario.jsp">
            <input class="w-100 btn btn-lg btn-primary" type="submit" value="Borrar Usuario">
        </form>
    </main>
    </body>
</html>
