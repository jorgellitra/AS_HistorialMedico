<%-- 
    Document   : Buscador
    Created on : 20-mar-2017, 9:26:01
    Author     : entrar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Historial Médico</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Css/style.css" type="text/css">

    </head>
    <body>
        <div class="contenido-body">
            <div class="header"><img alt="" src='images/hist.png'><form action="login.jsp" style="text-align: right"><input type="submit" value="LogOut"></form></div>
        <form action="Buscador.jsp" style="text-align: center">
        Búsqueda: <input type="text" name="Search" value="Buscador"><input type="submit" value="Buscar">
        </form><br>
        <div style="text-align: center">
        <a href="Seleccionado.jsp" >Ana morgade</a>
        <br>
        <a href="Seleccionado.jsp" >Jorge quintana</a>
        <br>
        <a href="Seleccionado.jsp" >Arcangel Tyrael</a>
        </div>
        
        </div>
        
        <div class="footer">
            <ul class="footer-ul">
                <li>Aviso Legal</li>
                <li>Cookies</li>
                <li>Política de privacidad</li>
                <li>Contacto</li>
            </ul>
        </div>
    </body>
</html>
