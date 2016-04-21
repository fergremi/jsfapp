//Javascript

function CamposObligatorios(){
	if ((document.formTvReg.user.value != "")&&(document.formTvReg.pswd.value != ""))
		return 'tienda.jsp';
	else
		{alert("Debe rellenar todos los campos"); return 'tienda.jsp';}
}