package com.ruprocon.jsfapp.ejb.jpa;

import java.util.List;

import javax.ejb.Stateless;

import com.ruprocon.jsfapp.ejb.interfaz.PedidoDAO;
import com.ruprocon.jsfapp.modelo.Pedido;

@Stateless
public class PedidoFacade extends BaseFacade implements PedidoDAO {
	@SuppressWarnings("unchecked")
	public List<Pedido> getPedidos() {
        return getEntityManager().createQuery("select p from Pedido p order by p.idFactura").getResultList();
	}
	
	public Pedido getPedido(int numFactura) {
		if (numFactura <= 0) {
            // Error: IDENTIFICADOR DE FACTURA NO VÁLIDO
			log.info("No se ha completado la petición: getPedido -> identificador de factura no válido");
            return null;
        }

        // Consulta: busca el pedido
		return (Pedido) getEntityManager().createQuery("SELECT p FROM Pedido WHERE p.idFactura='" + numFactura + "'").getResultList();
	}
	
	public void guardarPedido(Pedido pedido) {
        getEntityManager().merge(pedido);
	}
	
	public void eliminarPedido(Pedido pedido) {
		getEntityManager().remove(pedido);
	}
}