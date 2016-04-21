package com.ruprocon.jsfapp.controlador;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ruprocon.jsfapp.modelo.Producto;

//@RequestMapping(value= {"/productos/productosVenta.htm", "/productosVenta.htm"})
public class InventarioControlador {
    private static Logger log = Logger.getLogger(CestaControlador.class);
/*
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView productosVenta() {
        logger.info("A�adiendo <productos> al modelo <model>");
        
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