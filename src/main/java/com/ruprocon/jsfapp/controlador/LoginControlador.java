package com.ruprocon.jsfapp.controlador;

import org.apache.log4j.Logger;

import com.ruprocon.jsfapp.modelo.Usuario;

//@RequestMapping(value= "/loginTienda.htm")
public class LoginControlador {
    private static Logger log = Logger.getLogger(CestaControlador.class);
/*
    @RequestMapping(method = RequestMethod.GET)
    public String productosVenta(Model model) {
        logger.info("A�adiendo <login> al modelo <model>");    	
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