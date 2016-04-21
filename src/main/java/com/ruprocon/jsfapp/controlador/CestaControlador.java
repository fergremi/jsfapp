package com.ruprocon.jsfapp.controlador;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import com.ruprocon.jsfapp.modelo.Pedido;

//@RequestMapping(value= {"/productos/addCesta.htm", "/addCesta.htm"})
@ManagedBean
@ViewScoped
public class CestaControlador implements Serializable {
    private static Logger log = Logger.getLogger(CestaControlador.class);
    private List<Pedido> cesta;
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
    public ModelAndView submit(@ModelAttribute("producto") Producto producto, @RequestParam("cantidad")String cantidad) {
		Pedido p = new Pedido();
		p.setProducto(producto);
		p.setPrecio(producto.getPrecio());
		p.setCantidad(cantidad);
		cesta.add(p);
        return new ModelAndView("productosVenta");
    }
*/
}