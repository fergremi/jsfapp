package com.ruprocon.jsfapp.controlador;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

//@RequestMapping(value= "/loginTienda.htm")
@ManagedBean
@ViewScoped
public class LoginControlador implements Serializable {
    private static Logger log = Logger.getLogger(LoginControlador.class);
/*
    @RequestMapping(method = RequestMethod.GET)
    public String productosVenta(Model model) {
        logger.info("Añadiendo <login> al modelo <model>");    	
        model.addAttribute("user", new Usuario());
        
        logger.info("Devolviendo vista <loginTienda>");
        return "loginTienda";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid Usuario user, BindingResult result)
    {
        if (result.hasErrors()) {
            return "loginTienda";
        }
		
        String usuario = user.getUsuario();
        String clave = user.getClave();
        logger.info("Buscando usuario: <" + usuario + ", " + clave + ">");

        if(usuarioGestor.comprobarUsuario(usuario, clave, "ROLE_USER") != null)
    		return "redirect:/tienda.htm";
        else
        	return "loginTienda";
    }
*/
}