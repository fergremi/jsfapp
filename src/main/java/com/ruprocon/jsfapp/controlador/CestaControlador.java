package com.ruprocon.jsfapp.controlador;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import com.ruprocon.jsfapp.ejb.jpa.PedidoFacade;
import com.ruprocon.jsfapp.ejb.jpa.ProductoFacade;
import com.ruprocon.jsfapp.modelo.Pedido;
import com.ruprocon.jsfapp.modelo.Producto;

//@RequestMapping(value= {"/productos/addCesta.htm", "/addCesta.htm"})
@ManagedBean
@SessionScoped
public class CestaControlador {
	private static Logger log = Logger.getLogger(CestaControlador.class);
	
	@EJB
    PedidoFacade pedidoFacade;
	@EJB
    ProductoFacade productoFacade;
	
    private List<Pedido> cesta;
    private List<Producto> productos;

    /**
     * Obtiene los productos a la venta desde BD
     * 
     * @return path
     */
    public String getProductosVenta() {
        this.setProductos(productoFacade.getProductosVenta());
        log.info("<productosVenta> obtenidos");
        
        log.info("#productosVenta#");
        return "productosVenta";
    }
    
    /**
     * Añade el producto y la cantidad seleccionada a la cesta
     * (Crea un pedido)
     * 
     * @param producto
     * @param cantidad
     * @return
     */
    public String doPedido(Producto producto, int cantidad) {
    	Pedido pedido = new Pedido();
    	pedido.setProducto(producto);
    	pedido.setPrecio(producto.getPrecio());
    	pedido.setCantidad(cantidad);
		log.info("<pedido> creado: "
				+ "idProducto [" + producto.getIdProducto() + "], "
				+ "Precio [" + producto.getPrecio() + "], " 
				+ "Cantidad [" + cantidad + "]");
		
		cesta.add(pedido);
		log.info("<pedido> idPedido [" + pedido.getIdPedido() + "] añadido a <cesta>");
		
		log.info("#productosVenta#");
        return "productosVenta";
    }

	/**
	 * @return the productos
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
}