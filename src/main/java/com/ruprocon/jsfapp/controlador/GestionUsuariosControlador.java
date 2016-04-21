package com.ruprocon.jsfapp.controlador;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

//@RequestMapping(value= "/usuarios.htm")
@ManagedBean
@ViewScoped
public class GestionUsuariosControlador implements Serializable {
    private static Logger log = Logger.getLogger(GestionUsuariosControlador.class);
/*
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView usuarios() {
        logger.info("Añadiendo <usuarios> al modelo <model>");
        
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("usuarios", this.usuarioGestor.getUsuarios());
        
        logger.info("Devolviendo vista <usuarios>");
        return new ModelAndView("usuarios", "model", model);
    }
*/
}