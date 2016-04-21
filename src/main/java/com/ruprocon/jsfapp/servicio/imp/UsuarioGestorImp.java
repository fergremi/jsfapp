package com.ruprocon.jsfapp.servicio.imp;

import java.util.List;

import com.ruprocon.jsfapp.facade.interfaz.UsuarioDAO;
import com.ruprocon.jsfapp.modelo.Usuario;
import com.ruprocon.jsfapp.servicio.interfaz.UsuarioGestor;

@Component
public class UsuarioGestorImp implements UsuarioGestor {
	private static final long serialVersionUID = 1L;

	@Autowired
    private UsuarioDAO usuarioDAO;
	
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
	public List<Usuario> getUsuarios() {
		return usuarioDAO.getUsuarios();
	}

	public void actualizarUsuario(Usuario usuario) {
		usuarioDAO.guardarUsuario(usuario);
    }
	
	public Usuario comprobarUsuario(String usuario, String clave, String rol) {
        return usuarioDAO.comprobarUsuario(usuario, clave, rol);
	}
}

