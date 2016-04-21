package com.ruprocon.jsfapp.servicio.imp;

import java.util.List;

import com.ruprocon.jsfapp.servicio.interfaz.FacturaGestor;
import com.ruprocon.jsfapp.modelo.Factura;
import com.ruprocon.jsfapp.facade.interfaz.FacturaDAO;

@Component
public class FacturaGestorImp implements FacturaGestor {
	private static final long serialVersionUID = 1L;

	@Autowired
    private FacturaDAO facturaDAO;
    
	public void setFacturaDAO(FacturaDAO facturaDAO) {
		this.facturaDAO = facturaDAO;
	}

	public List<Factura> getFacturas() {
		return facturaDAO.getFacturas();
	}

	public void actualizarFactura(Factura factura) {
		facturaDAO.guardarFactura(factura);
	}

	public void eliminarFactura(Factura factura) {
		facturaDAO.eliminarFactura(factura);
	}
}
