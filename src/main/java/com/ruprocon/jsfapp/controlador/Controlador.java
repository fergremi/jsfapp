package com.ruprocon.jsfapp.controlador;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

@ManagedBean
@ViewScoped
public class Controlador implements Serializable {
    private static Logger log = Logger.getLogger(Controlador.class);
/*
    @RequestMapping(value= {"/", "/inicial.htm"}, method = RequestMethod.GET)
    public ModelAndView inicial() {
        logger.info("Devolviendo vista <inicial>");

        return new ModelAndView("inicial");
    }
        
    @RequestMapping(value= "/empresa.htm", method = RequestMethod.GET)
    public ModelAndView empresa() {
        logger.info("Devolviendo vista <empresa>");

        return new ModelAndView("empresa");
    }
    
    @RequestMapping(value= "/contacto.htm", method = RequestMethod.GET)
    public ModelAndView contacto() {
        logger.info("Devolviendo vista <contacto>");

        return new ModelAndView("contacto");
    }
    
    @RequestMapping(value= {"/productos", "/productos.htm"}, method = RequestMethod.GET)
    public ModelAndView productos() {
        logger.info("Devolviendo vista <productos>");

        return new ModelAndView("productos");
    }

    @RequestMapping(value= {"/productos/productosAlquiler.htm", "productosAlquiler.htm"}, method = RequestMethod.GET)
    public ModelAndView productosAlquiler() {
        logger.info("Devolviendo vista <productosAlquiler>");

        return new ModelAndView("productosAlquiler");
    }
    
    @RequestMapping(value= {"/intranet", "/intranet.htm"}, method = RequestMethod.GET)
    public ModelAndView intranet() {
        logger.info("Devolviendo vista <intranet>");

        return new ModelAndView("intranet");
    }
        
    @RequestMapping(value= {"intranet/empleados.htm", "empleados.htm"}, method = RequestMethod.GET)
    public ModelAndView empleados() {
        logger.info("Devolviendo vista <empleados>");

        return new ModelAndView("empleados");
    }
    
    @RequestMapping(value= {"intranet/admin.htm", "admin.htm"}, method = RequestMethod.GET)
    public ModelAndView admin() {
        logger.info("Devolviendo vista <admin>");

        return new ModelAndView("admin");
    }
*/
}