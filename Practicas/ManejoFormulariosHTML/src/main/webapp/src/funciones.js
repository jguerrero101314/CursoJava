let validarForma = (forma) => {
    let usuario = forma.usuario;
    if (usuario.value === '' || usuario.value === 'Escribir usuario') {
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    let password = forma.password;
    if (password.value === '' || usuario.value.length < 3) {
        alert("Debe proporcionar un password al menos de 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    let tecnologias = forma.tecnologia;
    let checkSeleccionado = false;
    for (let i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }
    if (!checkSeleccionado) {
        alert("Debe seleccionar una tecnologia");
        return false;
    }
    let generos = forma.genero;
    let radioSeleccionado = false;

    for (let i = 0; i < generos.length; i++) {
        if (generos[i].checked) {
            radioSeleccionado = true;
        }
    }
    if (!radioSeleccionado) {
        alert("Debe seleccionar un genero");
        return false;
    }

    let ocupacion = forma.ocupacion;
    if (ocupacion.value === '') {
        alert("Debe proporcionar una ocupacion");
        return false;
    }
    
    // Formulario es valido
    alert('formulario valido');
    return true;
    
}


