<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inclusion Dinamica</title>
    </head>
    <body>
        <h1>Inclusion Dinamica</h1>
        <br/>
        <jsp:include page="paginas/recusoPublicoJSP.jsp" />
        <br/>
        <jsp:include page="WEB-INF/recursoPrivado.jsp">
            <jsp:param name="colorFondo" value="yellow" />
        </jsp:include>
    </body>
</html>
