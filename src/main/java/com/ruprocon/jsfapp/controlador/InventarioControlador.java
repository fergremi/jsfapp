package com.ruprocon.jsfapp.controlador;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

//@RequestMapping(value= {"/productos/productosVenta.htm", "/productosVenta.htm"})
@ManagedBean
@ViewScoped
public class InventarioControlador implements Serializable {
    private static Logger log = Logger.getLogger(InventarioControlador.class);
/*
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView productosVenta() {
        logger.info("Añadiendo <productos> al modelo <model>");
        
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("productos", this.productoGestor.getProductos());
        
        logger.info("Devolviendo vista <productosVenta>");
        return new ModelAndView("productosVenta", "model", model);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView submit(@ModelAttribute("producto") Producto producto) {
        return new ModelAndView("empresa");
    }
*/
}