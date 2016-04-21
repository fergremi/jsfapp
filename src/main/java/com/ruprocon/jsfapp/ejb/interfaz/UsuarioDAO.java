package com.ruprocon.jsfapp.ejb.interfaz;

import java.util.List;

import javax.ejb.Remote;

import org.apache.log4j.Logger;
import org.hibernate.exception.DataException;

import com.ruprocon.jsfapp.modelo.Usuario;

@Remote
public interface UsuarioDAO {
	public static Logger log = Logger.getLogger(UsuarioDAO.class);
	
    public List<Usuario> getUsuarios() throws DataException;
    public void guardarUsuario(Usuario usuario) throws DataException;
    public void eliminarUsuario(Usuario usuario) throws DataException;
    public Usuario comprobarUsuario(String usuario, String clave, String rol) throws DataException;
}
