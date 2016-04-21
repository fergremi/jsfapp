package com.ruprocon.jsfapp.controlador;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import com.ruprocon.jsfapp.ejb.jpa.UsuarioFacade;
import com.ruprocon.jsfapp.modelo.Usuario;

//@RequestMapping(value= "/usuarios.htm")
@ManagedBean
@SessionScoped
@SuppressWarnings("unused")
public class GestionUsuariosControlador {
	private static Logger log = Logger.getLogger(GestionUsuariosControlador.class);
    
    @EJB
    UsuarioFacade usuarioFacade;
    
	private List<Usuario> usuarios;
    
    /**
     * Obtiene los usuarios existentes en BD
     * 
     * @return path
     */
    public String getUsuarios() {
    	this.usuarios = usuarioFacade.getUsuarios();
        log.info("<usuarios> obtenidos");
        
        log.info("#usuarios#");
        return "usuarios";
    }

	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}