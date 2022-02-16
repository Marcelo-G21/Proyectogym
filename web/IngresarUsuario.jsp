<%-- 
    Document   : IngresarUsuario
    Created on : 16-jul-2021, 17:13:29
    Author     : srtel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Registrar usuario</title>
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
    <body>
        <main class="form-signin">
            <form action="InsertarUsuario" method="POST">
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th colspan="2">Ingresar Usuario</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Rut</td>
                        <td><input type="text" name="rut" required></td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="nombre" required></td>
                    </tr>
                    <tr>
                        <td>Apellido</td>
                        <td><input type="text" name="apellido" required></td>
                    </tr>
                    <tr>
                        <td>Correo</td>
                        <td><input type="email" name="correo" required></td>
                    </tr>
                    <tr>
                        <td>Teléfono +569</td>
                        <td><input type="number" name="fono" max="99999999" required></td>
                    </tr>
                    <tr>
                        <td>Dirección</td>
                        <td><input type="text" name="direccion" required></td>
                    </tr>
                    <tr>
                        <td>Nombre de usuario</td>
                        <td><input type="text" name="username" required></td>
                    </tr>
                    <tr>
                        <td>Contraseña</td>
                        <td><input type="text" name="password" required></td>
                    </tr>
                    <tr>                                        
                        <th colspan="2"><input type="submit" name="sub" value="Ingresar Usuario"></th>
                    </tr>
                </tbody>
            </table>
        </form>
        </main>
    </body>
</html>
