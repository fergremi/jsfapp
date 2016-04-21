package com.ruprocon.jsfapp.ejb.jpa;

import java.util.List;

import javax.ejb.Stateless;

import com.ruprocon.jsfapp.ejb.interfaz.UsuarioDAO;
import com.ruprocon.jsfapp.modelo.Usuario;

@Stateless
public class UsuarioFacade extends BaseFacade implements UsuarioDAO {
    @SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios() {
        return getEntityManager().createQuery("select u from usuario u where u.activo=1 order by u.idUsuario").getResultList();
	}  
    
	public void guardarUsuario(Usuario usuario) {
        getEntityManager().merge(usuario);
	}
    
	public void eliminarUsuario(Usuario usuario) {
        getEntityManager().remove(usuario);
	}
    
	public Usuario comprobarUsuario(String usuario, String clave, String rol) {
    	if ((comprobarComentariosSQL(rol)) || (comprobarComentariosSQL(usuario)) || (comprobarComentariosSQL(clave))) {
            // Error: NO SE PERMITEN COMENTARIOS SQL
    		log.info("No se ha completado la petición: comprobarUsuario -> comentarios SQL bloqueados");
            return null;
        }
        if ((!rol.equals("user")) && (!rol.equals("worker")) && (!rol.equals("admin"))) {
            // Error: ROL NO VÁLIDO
        	log.info("No se ha completado la petición: comprobarUsuario -> rol de usuario no válido");
            return null;
        }
        if ((usuario.equals("")) || (clave.equals(""))) {
            // Error: CAMPO/S VACÍO/S
        	log.info("No se ha completado la petición: comprobarUsuario -> campo/s vacío/s");
            return null;
        }
 
        // Consulta: buscamos una correspondencia usuario/clave          
       return (Usuario) getEntityManager().createQuery("SELECT u FROM Usuario u WHERE u.usuario='" + usuario + "' and u.clave='" + clave + "' and u.rol='" + rol + "' and u.activo=1").getResultList();
	}
}
