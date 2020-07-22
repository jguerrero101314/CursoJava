<!-- header -->  
<jsp:include page="/WEB-INF/paginas/comunes/headers.jsp" />
<!--Cabecero-->
<jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"/>

<form action="${pageContext.request.contextPath}/ServletControlador?accion=modificar&idCliente=${cliente.idCliente}"
      method="POST" class="was-validated">
    <!--Botones de navegacion-->
    <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacionEdicion.jsp"/>
    <section id="details">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="card">
                        <div class="card-header">
                            <h4>Editar Cliente</h4>
                        </div>
                        <div class="card-body">
                            <div class="form-group">
                                <label for="nombre">Nombre:</label>
                                <input type="text" class="form-control" name="nombre" required value="${cliente.nombre}"> 
                            </div>
                            <div class="form-group">
                                <label for="apellido">Apellido:</label>
                                <input type="text" class="form-control" name="apellido" required value="${cliente.apellido}">
                            </div>
                            <div class="form-group">
                                <label for="email">Correo Electronico:</label>
                                <input type="email" class="form-control" name="email" required value="${cliente.email}">
                            </div>
                            <div class="form-group">
                                <label for="telefono">telefono:</label>
                                <input type="tel" class="form-control" name="telefono" required value="${cliente.telefono}">
                            </div>
                            <div class="form-group">
                                <label for="saldo">Saldo:</label>
                                <input type="number" class="form-control" name="saldo" required value="${cliente.saldo}" step="any">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</form>



<!--Pie de Pagina-->
<jsp:include page="/WEB-INF/paginas/comunes/footer.jsp"/>
