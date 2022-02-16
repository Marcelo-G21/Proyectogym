<%-- 
    Document   : BorrarUsuario
    Created on : 16-jul-2021, 17:49:50
    Author     : srtel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Borrar usuario</title>

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
        <h1>Borrar Usuario</h1>
        <form action="EliminarUsuario" method="POST">
            <input type="text" name="rut" required>
            <input type="submit" class="w-100 btn btn-lg btn-primary" name="sub" value="Borrar Usuario">
        </form>
    </main>
    </body>
</html>
