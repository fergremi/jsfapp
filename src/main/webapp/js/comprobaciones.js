//Javascript

function isNumeric(n) {
    return !jQuery.isArray(n) && (n - parseFloat(n) + 1) >= 0;
}

function comprobarLoginTienda() {
    if (document.formLoginTienda.usuario.value === "") {
        alert("Rellene el campo: Usuario");
        return -1;
    }
    else {
        if (document.formLoginTienda.usuario.value.indexOf("--") > -1) {
            alert("Comentarios SQL bloqueados (--)");
            return -2;
        }
        else if (document.formLoginTienda.usuario.value.indexOf("#") > -1) {
            alert("Comentarios SQL bloqueados (#)");
            return -3;
        }
        else if (document.formLoginTienda.usuario.value.indexOf("/*") > -1) {
            alert("Comentarios SQL bloqueados (/*)");
            return -4;
        }
        
        if (document.formLoginTienda.clave.value === "") {
            alert("Rellene el campo: Contraseña");
            return -5;
        }
        else {
            if (document.formLoginTienda.clave.value.indexOf("--") > -1) {
                alert("Comentarios SQL bloqueados (--)");
                return -6;
            }
            else if (document.formLoginTienda.clave.value.indexOf("#") > -1) {
                alert("Comentarios SQL bloqueados (#)");
                return -7;
            }
            else if (document.formLoginTienda.clave.value.indexOf("/*") > -1) {
                alert("Comentarios SQL bloqueados (/*)");
                return -8;
            }
        }
    }
    return 0;
}
function comprobarLogin() {
    if (document.formLogin.usuario.value === "") {
        alert("Rellene el campo: Usuario");
        return -1;
    }
    else {
        if (document.formLogin.usuario.value.indexOf("--") > -1) {
            alert("Comentarios SQL bloqueados (--)");
            return -2;
        }
        else if (document.formLogin.usuario.value.indexOf("#") > -1) {
            alert("Comentarios SQL bloqueados (#)");
            return -3;
        }
        else if (document.formLogin.usuario.value.indexOf("/*") > -1) {
            alert("Comentarios SQL bloqueados (/*)");
            return -4;
        }
        
        if (document.formLogin.clave.value === "") {
            alert("Rellene el campo: Contraseña");
            return -5;
        }
        else {
            if (document.formLogin.clave.value.indexOf("--") > -1) {
                alert("Comentarios SQL bloqueados (--)");
                return -6;
            }
            else if (document.formLogin.clave.value.indexOf("#") > -1) {
                alert("Comentarios SQL bloqueados (#)");
                return -7;
            }
            else if (document.formLogin.clave.value.indexOf("/*") > -1) {
                alert("Comentarios SQL bloqueados (/*)");
                return -8;
            }
        }
    }
    return 0;
}
function comprobarAddProd() {
    if (!isNumeric(document.formAddProd.idProducto.value)) {
        alert("idProducto no válido");
        return -1;
    }
    else {
        if (document.formAddProd.nombre.value === "") {
            alert("Nombre vacío");
            return -2;
        }
        else {
            if (document.formAddProd.nombre.value.indexOf("--") > -1) {
            alert("Comentarios SQL bloqueados (--)");
            return -3;
            }
            else if (document.formAddProd.nombre.value.indexOf("#") > -1) {
                alert("Comentarios SQL bloqueados (#)");
                return -4;
            }
            else if (document.formAddProd.nombre.value.indexOf("/*") > -1) {
                alert("Comentarios SQL bloqueados (/*)");
                return -5;
            }

            if (!isNumeric(document.formAddProd.precio.value)) {
                alert("Precio no válido");
                return -6;
            }
        }
    }
    return 0;
}
function comprobarRemoveProd() {
    if (!isNumeric(document.formRemoveProd.idProducto.value)) {
        alert("idProducto no válido");
        return -1;
    }
    return 0;
}
function comprobarEnvio() {
    if (document.formEnvio.nombre.value === "") {
        alert("Rellene el campo: Nombre");
        return -1; 
    }
    else {
        if (document.formEnvio.nombre.value.indexOf("--") > -1) {
            alert("Comentarios SQL bloqueados (--)");
            return -2;
        }
        else if (document.formEnvio.nombre.value.indexOf("#") > -1) {
            alert("Comentarios SQL bloqueados (#)");
            return -3;
        }
        else if (document.formEnvio.nombre.value.indexOf("/*") > -1) {
            alert("Comentarios SQL bloqueados (/*)");
            return -4;
        }

        if (document.formEnvio.apellidos.value === "") {
            alert("Rellene el campo: Apellidos");
            return -5;
        }
        else {
            if (document.formEnvio.apellidos.value.indexOf("--") > -1) {
                alert("Comentarios SQL bloqueados (--)");
                return -6;
            }
            else if (document.formEnvio.apellidos.value.indexOf("#") > -1) {
                alert("Comentarios SQL bloqueados (#)");
                return -7;
            }
            else if (document.formEnvio.apellidos.value.indexOf("/*") > -1) {
                alert("Comentarios SQL bloqueados (/*)");
                return -8;
            }

            if (document.formEnvio.direccion.value === "") {
                alert("Rellene el campo: Dirección");
                return -9;
            }
            else {
                if (document.formEnvio.direccion.value.indexOf("--") > -1) {
                    alert("Comentarios SQL bloqueados (--)");
                    return -10;
                }
                else if (document.formEnvio.direccion.value.indexOf("#") > -1) {
                    alert("Comentarios SQL bloqueados (#)");
                    return -11;
                }
                else if (document.formEnvio.direccion.value.indexOf("/*") > -1) {
                    alert("Comentarios SQL bloqueados (/*)");
                    return -12;
                }

                if (document.formEnvio.provincia.value === "") {
                    alert("Rellene el campo: Provincia");
                    return -13;
                }
                else {
                    if (document.formEnvio.provincia.value.indexOf("--") > -1) {
                        alert("Comentarios SQL bloqueados (--)");
                        return -14;
                    }
                    else if (document.formEnvio.provincia.value.indexOf("#") > -1) {
                        alert("Comentarios SQL bloqueados (#)");
                        return -15;
                    }
                    else if (document.formEnvio.provincia.value.indexOf("/*") > -1) {
                        alert("Comentarios SQL bloqueados (/*)");
                        return -16;
                    }

                    if (document.formEnvio.ciudad.value === "") {
                        alert("Rellene el campo: Ciudad");
                        return -17;
                    }
                    else {
                        if (document.formEnvio.ciudad.value.indexOf("--") > -1) {
                            alert("Comentarios SQL bloqueados (--)");
                            return -18;
                        }
                        else if (document.formEnvio.ciudad.value.indexOf("#") > -1) {
                            alert("Comentarios SQL bloqueados (#)");
                            return -19;
                        }
                        else if (document.formEnvio.ciudad.value.indexOf("/*") > -1) {
                            alert("Comentarios SQL bloqueados (/*)");
                            return -20;
                        }

                        if (document.formEnvio.cp.value === "") {
                            alert("Rellene el campo: Código postal");
                            return -21;
                        }
                        else {
                            if (document.formEnvio.cp.value.indexOf("--") > -1) {
                                alert("Comentarios SQL bloqueados (--)");
                                return -22;
                            }
                            else if (document.formEnvio.cp.value.indexOf("#") > -1) {
                                alert("Comentarios SQL bloqueados (#)");
                                return -23;
                            }
                            else if (document.formEnvio.cp.value.indexOf("/*") > -1) {
                                alert("Comentarios SQL bloqueados (/*)");
                                return -24;
                            }
                        
                            if (document.formEnvio.telefono.value === "") {
                                alert("Rellene el campo: Telefono");
                                return -25;
                            }
                            else {
                                if (document.formEnvio.telefono.value.indexOf("--") > -1) {
                                    alert("Comentarios SQL bloqueados (--)");
                                    return -26;
                                }
                                else if (document.formEnvio.telefono.value.indexOf("#") > -1) {
                                    alert("Comentarios SQL bloqueados (#)");
                                    return -27;
                                }
                                else if (document.formEnvio.telefono.value.indexOf("/*") > -1) {
                                    alert("Comentarios SQL bloqueados (/*)");
                                    return -28;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

function comprobarNombreProd() {
	if (document.formProd.nombre.value !== "")
            return true;
	else {
            alert("Rellene el campo: Nombre");
            return false;
        }
        if (document.formProd.nombre.length < 100)
            return true;
	else {
            alert("Campo demasiado largo: MAX(100)");
            return false;
        }
}
function comprobarDescripcionProd() {
	if (document.formProd.descripcion.value !== "")
            return true;
	else {
            alert("Rellene el campo: Nombre");
            return false;
        }
        if (document.formProd.descripcion.length < 500)
            return true;
	else {
            alert("Campo demasiado largo: MAX(500)");
            return false;
        }
}
function comprobarPrecio() {
	if (document.formProd.precio.value !== "")
            return true;
	else {
            alert("Rellene el campo: Precio");
            return false;
        }
}
function comprobarStock() {
	if (document.formProd.stock.value !== "")
            return true;
	else {
            alert("Rellene el campo: Stock");
            return false;
        }
}

function comprobarCantidad() {
	if (document.formProd.cantidad.value !== "")
            return true;
	else {
            alert("Rellene el campo: Cantidad");
            return false;
        }
        if (document.formProd.cantidad.value > 0)
            return true;
	else {
            alert("La cantidad debe ser mayor de 0");
            return false;
        }
}
function comprobarCantidad2() {
	if (document.formRemove.cantidad.value !== "")
            return true;
	else {
            alert("Rellene el campo: Cantidad");
            return false;
        }
        if (document.formRemove.cantidad.value > 0)
            return true;
	else {
            alert("La cantidad debe ser mayor de 0");
            return false;
        }
}