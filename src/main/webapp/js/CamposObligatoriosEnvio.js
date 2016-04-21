//Javascript

function CamposObligatoriosEnvio(){
	if (document.formEnvio.nombre.value == "") {
            document.getElementById('name').style.display='block'; return false;
        }
        if (document.formEnvio.apellidos.value == "") {
            document.getElementById('lastnames').style.display='block'; return false;
        }
        if (document.formEnvio.direccion.value == "") {
            document.getElementById('dir').style.display='block'; return false;
        }
        if (document.formEnvio.provincia.value == "") {
            document.getElementById('pro').style.display='block'; return false;
        }
        if (document.formEnvio.ciudad.value == "") {
            document.getElementById('city').style.display='block'; return false;
        }
        if (document.formEnvio.cp.value == "") {
            document.getElementById('cod').style.display='block'; return false;
        }
        if (document.formEnvio.telefono.value == "") {
            document.getElementById('tel').style.display='block'; return false;
        }
        if ((document.formEnvio.nombre.value != "")&&(document.formEnvio.apellidos.value != "")&&(document.formEnvio.direccion.value != "")&&(document.formEnvio.provincia.value != "")&&(document.formEnvio.ciudad.value != "")&&(document.formEnvio.cp.value != "")&&(document.formEnvio.telefono.value != "")) {
            ProcesarForm(document.formEnvio,'datosEnvio','capa1'); return true;
        }
}