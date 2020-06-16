/* global numeros */

function validarForma(forma){
    var nombre = forma.nombre;
    
    if(nombre.value === "" || !isNaN(nombre.value)){
        alert("El nombre no debe contener Números y no puede ser vacio");
        nombre.focus();
        nombre.select;
        return false;
    }
    
    var apellido = forma.apellido;
    if(apellido.value === "" || !isNaN(apellido.value)){
        alert("El apellido no debe contener Números y no puede ser vacio");
        apellido.focus();
        apellido.select;
        return false;
    }

    var email = forma.email;
    if (email.value === "" || !(/\S+@\S+\.\S+/.test(email.value))){
        alert("El e-mail no es correcto");
        email.focus();
        email.select;
        return false;
    }
    
    alert("Enviando datos...");
    return true;
}
