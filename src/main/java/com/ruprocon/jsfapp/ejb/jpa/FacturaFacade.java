package com.ruprocon.jsfapp.ejb.jpa;

import java.util.List;

import javax.ejb.Stateless;

import com.ruprocon.jsfapp.ejb.interfaz.FacturaDAO;
import com.ruprocon.jsfapp.modelo.Factura;

@Stateless
public class FacturaFacade extends BaseFacade implements FacturaDAO {
	@SuppressWarnings("unchecked")
	public List<Factura> getFacturas() {
        return getEntityManager().createQuery("select f from factura f order by f.idFactura").getResultList();
	}
	
	public Factura getFactura(int numFactura) {
        return (Factura) getEntityManager().createQuery("select f from factura f where f.idFactura='" + numFactura + "'").getResultList();
	}
	
	public void guardarFactura(Factura factura) {
        getEntityManager().merge(factura);
	}
    
	public void eliminarFactura(Factura factura) {
		getEntityManager().remove(factura);
	}
	
	public int obtenerNumUltimaFactura() {
        int numFactura = 0;

        // Consulta: busca el identificador de factura más alto (última factura expedida)
        if (getEntityManager().createQuery("SELECT MAX(idFactura) FROM Factura").getResultList() != null)
            return numFactura; 
        else // El usuario/clave no se encuentra en la BD
            return -1;
	}
}