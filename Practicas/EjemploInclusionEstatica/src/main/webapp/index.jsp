<%-- 
    Document   : index
    Created on : 07/14/2020, 8:36:02 a. m.
    Author     : JAGN
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo inclusion estatica</title>
    </head>
    <body>
        <h1>Ejemplo inclusion estatica</h1>
        <br/>
        <ul>
            <li> <%@include file="paginas/noticias1.html" %> </li>
            <li> <%@include file="paginas/noticias2.jsp" %> </li>
        </ul>
    </body>
</html>
