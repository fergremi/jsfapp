package com.ruprocon.jsfapp.controlador;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import com.ruprocon.jsfapp.ejb.jpa.PedidoFacade;
import com.ruprocon.jsfapp.modelo.Pedido;

//@RequestMapping(value= "/pedidos.htm")
@ManagedBean
@SessionScoped
@SuppressWarnings("unused")
public class GestionPedidosControlador  {
	private static Logger log = Logger.getLogger(GestionPedidosControlador.class); 
	
	@EJB
    PedidoFacade pedidoFacade;
	
	private List<Pedido> pedidos;
   
    /**
     * Obtiene los pedidos de ventas de BD
     * 
     * @return path
     */
    public String getPedidos() {
    	this.pedidos = pedidoFacade.getPedidos();
        log.info("<pedidos> obtenidos");
        
        log.info("#pedidos#");
        return "pedidos";
    }
    
    // TODO modPedidoVenta?

	/**
	 * @param pedidos the pedidos to set
	 */
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}