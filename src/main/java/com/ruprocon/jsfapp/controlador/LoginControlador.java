package com.ruprocon.jsfapp.controlador;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.Valid;

import org.apache.log4j.Logger;

import com.ruprocon.jsfapp.ejb.jpa.UsuarioFacade;
import com.ruprocon.jsfapp.modelo.Usuario;

//@RequestMapping(value= "/loginTienda.htm")
@ManagedBean
@SessionScoped
@SuppressWarnings("unused")
public class LoginControlador {
	private static Logger log = Logger.getLogger(LoginControlador.class);
    
    @EJB
    UsuarioFacade usuarioFacade;
    
    private final String ROLE_USER = "ROLE_USER";
	private final String ROLE_ADMIN = "ROLE_ADMIN";

    public String registrarUsuario(String usuario, String clave) {
        Usuario user = new Usuario(usuario, clave, ROLE_USER, true);
        log.info("<usuario> creado: "
				+ "idUsuario [" + user.getIdUsuario() + "], "
				+ "Usuario [" + user.getUsuario() + "], " 
				+ "Clave [" + user.getClave() + "]");
        
        log.info("#loginTienda#");
        return "loginTienda";
    }
    
    public String doLogin(@Valid Usuario user) {
        String usuario = user.getUsuario();
        String clave = user.getClave();
        
        log.info("Buscando usuario: <" + usuario + ", " + clave + ">");
        if(usuarioFacade.comprobarUsuario(usuario, clave, "ROLE_USER") != null) {
        	log.info("#tienda#");
        	return "tienda";
        }
        else {
        	log.info("#loginTienda#");        	
        	return "loginTienda";
        }
    }
}