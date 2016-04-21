package com.ruprocon.jsfapp.facade.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ruprocon.jsfapp.controlador.CestaControlador;
import com.ruprocon.jsfapp.facade.interfaz.UsuarioDAO;
import com.ruprocon.jsfapp.modelo.Usuario;

@Repository(value = "usuarioDAO")
public class JPAUsuarioDAO implements UsuarioDAO {
	private EntityManager em = null;
	
    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
    
    // función especial para las consultas sql ejecutadas con variables
    private boolean comprobarComentariosSQL(String campo) {
        boolean comentario = false;
        
        if (campo.contains("--"))
            comentario = true;
        else if (campo.contains("#"))
            comentario = true;
        else if (campo.contains("/*"))
            comentario = true;
        
        return comentario;
    }
    
    @SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Usuario> getUsuarios() {
        return em.createQuery("select u from usuario u where u.activo=1 order by u.idUsuario").getResultList();
	}  
    
    @Transactional(readOnly = false)
	public void guardarUsuario(Usuario usuario) {
        em.merge(usuario);
	}
    
    @Transactional(readOnly = false)
	public void eliminarUsuario(Usuario usuario) {
        em.remove(usuario);
	}
    
    @Transactional(readOnly = true)
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
       return (Usuario) em.createQuery("SELECT u FROM Usuario u WHERE u.usuario='" + usuario + "' and u.clave='" + clave + "' and u.rol='" + rol + "' and u.activo=1").getResultList();
	}
}
