package com.ruprocon.jsfapp.facade.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ruprocon.jsfapp.controlador.CestaControlador;
import com.ruprocon.jsfapp.facade.interfaz.PedidoDAO;
import com.ruprocon.jsfapp.modelo.Pedido;

@Repository(value = "pedidoDAO")
public class JPAPedidoDAO implements PedidoDAO {
	private EntityManager em = null;
	
    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
    
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Pedido> getPedidos() {
        return em.createQuery("select p from Pedido p order by p.idFactura").getResultList();
	}
	
	@Transactional(readOnly = true)
	public Pedido getPedido(int numFactura) {
		if (numFactura <= 0) {
            // Error: IDENTIFICADOR DE FACTURA NO VÁLIDO
			logger.info("No se ha completado la petici�n: getPedido -> identificador de factura no v�lido");
            return null;
        }

        // Consulta: busca el pedido
		return (Pedido) em.createQuery("SELECT p FROM Pedido WHERE p.idFactura='" + numFactura + "'").getResultList();
	}
	
	@Transactional(readOnly = false)
	public void guardarPedido(Pedido pedido) {
        em.merge(pedido);
	}
	
	@Transactional(readOnly = false)
	public void eliminarPedido(Pedido pedido) {
		em.remove(pedido);
	}
}
