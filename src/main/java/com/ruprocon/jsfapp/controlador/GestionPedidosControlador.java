package com.ruprocon.jsfapp.controlador;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ruprocon.jsfapp.modelo.Pedido;

//@RequestMapping(value= "/pedidos.htm")
public class GestionPedidosControlador {
    private static Logger log = Logger.getLogger(GestionPedidosControlador.class); 
/*    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView pedidosVenta() {
        logger.info("A�adiendo <pedidos> al modelo <model>");
        
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("pedidos", this.pedidoGestor.getPedidos());
        
        logger.info("Devolviendo vista <pedidosVenta>");
        return new ModelAndView("pedidos", "model", model);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView submit(@ModelAttribute("pedido") Pedido pedido) {
        return new ModelAndView("pedidos");
    }
*/
}