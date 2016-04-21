package com.ruprocon.jsfapp.servicio.interfaz;

import java.io.Serializable;
import java.util.List;

import com.ruprocon.jsfapp.modelo.Usuario;

public interface UsuarioGestor extends Serializable {
	public List<Usuario> getUsuarios();
	public void actualizarUsuario(Usuario usuario);
	public Usuario comprobarUsuario(String usuario, String clave, String rol);
}
