package com.ruprocon.jsfapp.controlador;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

//@RequestMapping(value= "/pedidos.htm")
@ManagedBean
@ViewScoped
public class GestionPedidosControlador implements Serializable {
    private static Logger log = Logger.getLogger(GestionPedidosControlador.class); 
/*    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView pedidosVenta() {
        logger.info("Añadiendo <pedidos> al modelo <model>");
        
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