package com.ruprocon.jsfapp.facade.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ruprocon.jsfapp.controlador.CestaControlador;
import com.ruprocon.jsfapp.facade.interfaz.FacturaDAO;
import com.ruprocon.jsfapp.modelo.Factura;

@Repository(value = "facturaDAO")
public class JPAFacturaDAO implements FacturaDAO {
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
	public List<Factura> getFacturas() {
        return em.createQuery("select f from factura f order by f.idFactura").getResultList();
	}
	
	@Transactional(readOnly = true)
	public Factura getFactura(int numFactura) {
        return (Factura) em.createQuery("select f from factura f where f.idFactura='" + numFactura + "'").getResultList();
	}
	
    @Transactional(readOnly = false)
	public void guardarFactura(Factura factura) {
        em.merge(factura);
	}
    
    @Transactional(readOnly = false)
	public void eliminarFactura(Factura factura) {
		em.remove(factura);
	}
	
	@Transactional(readOnly = true)
	public int obtenerNumUltimaFactura() {
        int numFactura = 0;

        // Consulta: busca el identificador de factura más alto (última factura expedida)
        if (em.createQuery("SELECT MAX(idFactura) FROM Factura").getResultList() != null)
            return numFactura; 
        else // El usuario/clave no se encuentra en la BD
            return -1;
	}
}
